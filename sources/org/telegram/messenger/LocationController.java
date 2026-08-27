package org.telegram.messenger;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.pd0;

public class LocationController extends BaseController implements NotificationCenter.NotificationCenterDelegate, ILocationServiceProvider.IAPIConnectionCallbacks, ILocationServiceProvider.IAPIOnConnectionFailedListener {
    private static final int BACKGROUD_UPDATE_TIME = 30000;
    private static final long FASTEST_INTERVAL = 1000;
    private static final int FOREGROUND_UPDATE_TIME = 20000;
    private static final int LOCATION_ACQUIRE_TIME = 10000;
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private static final int SEND_NEW_LOCATION_TIME = 2000;
    public static final int TYPE_BIZ = 1;
    public static final int TYPE_STORY = 2;
    private static final long UPDATE_INTERVAL = 1000;
    private static final int WATCH_LOCATION_TIMEOUT = 65000;
    private ILocationServiceProvider.IMapApiClient apiClient;
    private a0.h cacheRequests;
    private FusedLocationListener fusedLocationListener;
    private GpsLocationListener gpsLocationListener;
    private Location lastKnownLocation;
    private boolean lastLocationByMaps;
    private long lastLocationSendTime;
    private long lastLocationStartTime;
    private a0.h lastReadLocationTime;
    private long locationEndWatchTime;
    private LocationManager locationManager;
    private ILocationServiceProvider.ILocationRequest locationRequest;
    private boolean locationSentSinceLastMapUpdate;
    public a0.h locationsCache;
    private GpsLocationListener networkLocationListener;
    private GpsLocationListener passiveLocationListener;
    private SparseIntArray requests;
    private Boolean servicesAvailable;
    private ArrayList<SharingLocationInfo> sharingLocations;
    private a0.h sharingLocationsMap;
    private a0.h sharingLocationsMapUI;
    public ArrayList<SharingLocationInfo> sharingLocationsUI;
    private boolean started;
    private boolean wasConnectedToPlayServices;
    private static volatile LocationController[] Instance = new LocationController[4];
    public static String[] unnamedRoads = {"Unnamed Road", "Вulicya bez nazvi", "Нeizvestnaya doroga", "İsimsiz Yol", "Ceļš bez nosaukuma", "Kelias be pavadinimo", "Droga bez nazwy", "Cesta bez názvu", "Silnice bez názvu", "Drum fără nume", "Route sans nom", "Vía sin nombre", "Estrada sem nome", "Οdos xoris onomasia", "Rrugë pa emër", "Пat bez ime", "Нeimenovani put", "Strada senza nome", "Straße ohne Straßennamen"};
    private static HashMap<LocationFetchCallback, Runnable> callbacks = new HashMap<>();

    public class FusedLocationListener implements ILocationServiceProvider.ILocationListener {
        private FusedLocationListener() {
        }

        @Override
        public void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }
            LocationController.this.setLastKnownLocation(location);
        }
    }

    public interface LocationFetchCallback {
        void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location);
    }

    public static class SharingLocationInfo {
        public int account;
        public long did;
        public int lastSentProximityMeters;
        public MessageObject messageObject;
        public int mid;
        public int period;
        public int proximityMeters;
        public int stopTime;
    }

    public LocationController(int i10) {
        super(i10);
        this.sharingLocationsMap = new a0.h();
        this.sharingLocations = new ArrayList<>();
        this.locationsCache = new a0.h();
        this.lastReadLocationTime = new a0.h();
        this.gpsLocationListener = new GpsLocationListener();
        this.networkLocationListener = new GpsLocationListener();
        this.passiveLocationListener = new GpsLocationListener();
        this.fusedLocationListener = new FusedLocationListener();
        this.locationSentSinceLastMapUpdate = true;
        this.requests = new SparseIntArray();
        this.cacheRequests = new a0.h();
        this.sharingLocationsUI = new ArrayList<>();
        this.sharingLocationsMapUI = new a0.h();
        this.locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        this.apiClient = ApplicationLoader.getLocationServiceProvider().onCreateLocationServicesAPI(ApplicationLoader.applicationContext, this, this);
        ILocationServiceProvider.ILocationRequest iLocationRequestOnCreateLocationRequest = ApplicationLoader.getLocationServiceProvider().onCreateLocationRequest();
        this.locationRequest = iLocationRequestOnCreateLocationRequest;
        iLocationRequestOnCreateLocationRequest.setPriority(0);
        this.locationRequest.setInterval(1000L);
        this.locationRequest.setFastestInterval(1000L);
        AndroidUtilities.runOnUIThread(new r5(this, 2));
        loadSharingLocations();
    }

    private void broadcastLastKnownLocation(boolean z10) {
        TLRPC.InputMedia inputMedia;
        TLRPC.InputGeoPoint inputGeoPoint;
        int i10;
        int i11;
        TLRPC.GeoPoint geoPoint;
        if (this.lastKnownLocation == null) {
            return;
        }
        if (this.requests.size() != 0) {
            if (z10) {
                for (int i12 = 0; i12 < this.requests.size(); i12++) {
                    getConnectionsManager().cancelRequest(this.requests.keyAt(i12), false);
                }
            }
            this.requests.clear();
        }
        if (!this.sharingLocations.isEmpty()) {
            int currentTime = getConnectionsManager().getCurrentTime();
            float[] fArr = new float[1];
            for (int i13 = 0; i13 < this.sharingLocations.size(); i13++) {
                SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i13);
                TLRPC.Message message = sharingLocationInfo.messageObject.messageOwner;
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia == null || (geoPoint = messageMedia.geo) == null || sharingLocationInfo.lastSentProximityMeters != sharingLocationInfo.proximityMeters) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
                    tL_messages_editMessage.f22463id = sharingLocationInfo.mid;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = false;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                    tL_messages_editMessage.media.geo_point.lat = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLatitude());
                    tL_messages_editMessage.media.geo_point._long = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLongitude());
                    tL_messages_editMessage.media.geo_point.accuracy_radius = (int) this.lastKnownLocation.getAccuracy();
                    inputMedia = tL_messages_editMessage.media;
                    inputGeoPoint = inputMedia.geo_point;
                    if (inputGeoPoint.accuracy_radius != 0) {
                        inputGeoPoint.flags |= 1;
                    }
                    i10 = sharingLocationInfo.lastSentProximityMeters;
                    i11 = sharingLocationInfo.proximityMeters;
                    if (i10 != i11) {
                        inputMedia.proximity_notification_radius = i11;
                        inputMedia.flags |= 8;
                    }
                    inputMedia.heading = getHeading(this.lastKnownLocation);
                    tL_messages_editMessage.media.flags |= 4;
                    int iSendRequest = getConnectionsManager().sendRequest(tL_messages_editMessage, new i2(this, sharingLocationInfo, iArr, tL_messages_editMessage, 1));
                    int[] iArr = {iSendRequest};
                    this.requests.put(iSendRequest, 0);
                } else {
                    int i14 = message.edit_date;
                    if (i14 == 0) {
                        i14 = message.date;
                    }
                    if (Math.abs(currentTime - i14) < 10) {
                        Location.distanceBetween(geoPoint.lat, geoPoint._long, this.lastKnownLocation.getLatitude(), this.lastKnownLocation.getLongitude(), fArr);
                        if (fArr[0] >= 1.0f) {
                            TLRPC.TL_messages_editMessage tL_messages_editMessage2 = new TLRPC.TL_messages_editMessage();
                            tL_messages_editMessage2.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
                            tL_messages_editMessage2.f22463id = sharingLocationInfo.mid;
                            tL_messages_editMessage2.flags |= 16384;
                            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive2 = new TLRPC.TL_inputMediaGeoLive();
                            tL_messages_editMessage2.media = tL_inputMediaGeoLive2;
                            tL_inputMediaGeoLive2.stopped = false;
                            tL_inputMediaGeoLive2.geo_point = new TLRPC.TL_inputGeoPoint();
                            tL_messages_editMessage2.media.geo_point.lat = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLatitude());
                            tL_messages_editMessage2.media.geo_point._long = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLongitude());
                            tL_messages_editMessage2.media.geo_point.accuracy_radius = (int) this.lastKnownLocation.getAccuracy();
                            inputMedia = tL_messages_editMessage2.media;
                            inputGeoPoint = inputMedia.geo_point;
                            if (inputGeoPoint.accuracy_radius != 0) {
                                inputGeoPoint.flags |= 1;
                            }
                            i10 = sharingLocationInfo.lastSentProximityMeters;
                            i11 = sharingLocationInfo.proximityMeters;
                            if (i10 != i11) {
                                inputMedia.proximity_notification_radius = i11;
                                inputMedia.flags |= 8;
                            }
                            inputMedia.heading = getHeading(this.lastKnownLocation);
                            tL_messages_editMessage2.media.flags |= 4;
                            int iSendRequest2 = getConnectionsManager().sendRequest(tL_messages_editMessage2, new i2(this, sharingLocationInfo, iArr, tL_messages_editMessage2, 1));
                            int[] iArr2 = {iSendRequest2};
                            this.requests.put(iSendRequest2, 0);
                        }
                    } else {
                        TLRPC.TL_messages_editMessage tL_messages_editMessage3 = new TLRPC.TL_messages_editMessage();
                        tL_messages_editMessage3.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
                        tL_messages_editMessage3.f22463id = sharingLocationInfo.mid;
                        tL_messages_editMessage3.flags |= 16384;
                        TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive3 = new TLRPC.TL_inputMediaGeoLive();
                        tL_messages_editMessage3.media = tL_inputMediaGeoLive3;
                        tL_inputMediaGeoLive3.stopped = false;
                        tL_inputMediaGeoLive3.geo_point = new TLRPC.TL_inputGeoPoint();
                        tL_messages_editMessage3.media.geo_point.lat = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLatitude());
                        tL_messages_editMessage3.media.geo_point._long = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLongitude());
                        tL_messages_editMessage3.media.geo_point.accuracy_radius = (int) this.lastKnownLocation.getAccuracy();
                        inputMedia = tL_messages_editMessage3.media;
                        inputGeoPoint = inputMedia.geo_point;
                        if (inputGeoPoint.accuracy_radius != 0) {
                            inputGeoPoint.flags |= 1;
                        }
                        i10 = sharingLocationInfo.lastSentProximityMeters;
                        i11 = sharingLocationInfo.proximityMeters;
                        if (i10 != i11) {
                            inputMedia.proximity_notification_radius = i11;
                            inputMedia.flags |= 8;
                        }
                        inputMedia.heading = getHeading(this.lastKnownLocation);
                        tL_messages_editMessage3.media.flags |= 4;
                        int iSendRequest3 = getConnectionsManager().sendRequest(tL_messages_editMessage3, new i2(this, sharingLocationInfo, iArr2, tL_messages_editMessage3, 1));
                        int[] iArr3 = {iSendRequest3};
                        this.requests.put(iSendRequest3, 0);
                    }
                }
            }
        }
        getConnectionsManager().resumeNetworkMaybe();
        if (shouldStopGps()) {
            stop(false);
        }
    }

    private boolean checkServices() {
        if (this.servicesAvailable == null) {
            this.servicesAvailable = Boolean.valueOf(ApplicationLoader.getLocationServiceProvider().checkServices());
        }
        return this.servicesAvailable.booleanValue();
    }

    public static String countryCodeToEmoji(String str) {
        if (str == null) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int iCodePointCount = upperCase.codePointCount(0, upperCase.length());
        if (iCodePointCount > 2) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < iCodePointCount; i10++) {
            sb2.append(Character.toChars(Character.codePointAt(upperCase, i10) - (-127397)));
        }
        return sb2.toString();
    }

    public static String detectOcean(double d, double d10) {
        if (d10 > 65.0d) {
            return "Arctic Ocean";
        }
        if (d > -88.0d && d < 40.0d && d10 > 0.0d) {
            return "Atlantic Ocean";
        }
        if (d > -60.0d && d < 20.0d && d10 <= 0.0d) {
            return "Atlantic Ocean";
        }
        if (d10 <= 30.0d && d >= 20.0d && d < 150.0d) {
            return "Indian Ocean";
        }
        if ((d > 106.0d || d < -60.0d) && d10 > 0.0d) {
            return "Pacific Ocean";
        }
        if ((d > 150.0d || d < -60.0d) && d10 <= 0.0d) {
            return "Pacific Ocean";
        }
        return null;
    }

    public static void fetchLocationAddress(Location location, LocationFetchCallback locationFetchCallback) {
        fetchLocationAddress(location, 0, locationFetchCallback);
    }

    public static int getHeading(Location location) {
        float bearing = location.getBearing();
        if (bearing <= 0.0f || bearing >= 1.0f) {
            return (int) bearing;
        }
        return bearing < 0.5f ? 360 : 1;
    }

    public static LocationController getInstance(int i10) {
        LocationController locationController;
        LocationController locationController2 = Instance[i10];
        if (locationController2 != null) {
            return locationController2;
        }
        synchronized (LocationController.class) {
            try {
                locationController = Instance[i10];
                if (locationController == null) {
                    LocationController[] locationControllerArr = Instance;
                    LocationController locationController3 = new LocationController(i10);
                    locationControllerArr[i10] = locationController3;
                    locationController = locationController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return locationController;
    }

    public static int getLocationsCount() {
        int size = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            size += getInstance(i10).sharingLocationsUI.size();
        }
        return size;
    }

    public void lambda$addSharingLocation$11(SharingLocationInfo sharingLocationInfo, SharingLocationInfo sharingLocationInfo2) {
        if (sharingLocationInfo != null) {
            this.sharingLocationsUI.remove(sharingLocationInfo);
        }
        this.sharingLocationsUI.add(sharingLocationInfo2);
        this.sharingLocationsMapUI.k(sharingLocationInfo2, sharingLocationInfo2.did);
        startService();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    public void lambda$broadcastLastKnownLocation$6(SharingLocationInfo sharingLocationInfo) {
        this.sharingLocationsUI.remove(sharingLocationInfo);
        this.sharingLocationsMapUI.l(sharingLocationInfo.did);
        if (this.sharingLocationsUI.isEmpty()) {
            stopService();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    public void lambda$broadcastLastKnownLocation$7(SharingLocationInfo sharingLocationInfo, int[] iArr, TLRPC.TL_messages_editMessage tL_messages_editMessage, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (tL_error.text.equals("MESSAGE_ID_INVALID")) {
                this.sharingLocations.remove(sharingLocationInfo);
                this.sharingLocationsMap.l(sharingLocationInfo.did);
                saveSharingLocation(sharingLocationInfo, 1);
                this.requests.delete(iArr[0]);
                AndroidUtilities.runOnUIThread(new p5(0, sharingLocationInfo, this));
                return;
            }
            return;
        }
        if ((tL_messages_editMessage.flags & 8) != 0) {
            sharingLocationInfo.lastSentProximityMeters = tL_messages_editMessage.media.proximity_notification_radius;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        boolean z10 = false;
        for (int i10 = 0; i10 < updates.updates.size(); i10++) {
            TLRPC.Update update = updates.updates.get(i10);
            if (update instanceof TL_update.TL_updateEditMessage) {
                sharingLocationInfo.messageObject.messageOwner = ((TL_update.TL_updateEditMessage) update).message;
            } else {
                if (update instanceof TL_update.TL_updateEditChannelMessage) {
                    sharingLocationInfo.messageObject.messageOwner = ((TL_update.TL_updateEditChannelMessage) update).message;
                }
            }
            z10 = true;
        }
        if (z10) {
            saveSharingLocation(sharingLocationInfo, 0);
        }
        getMessagesController().processUpdates(updates, false);
    }

    public void lambda$cleanup$9() {
        this.locationEndWatchTime = 0L;
        this.requests.clear();
        this.sharingLocationsMap.b();
        this.sharingLocations.clear();
        setLastKnownLocation(null);
        stop(true);
    }

    public static void lambda$fetchLocationAddress$28(LocationFetchCallback locationFetchCallback, String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        callbacks.remove(locationFetchCallback);
        locationFetchCallback.onLocationAddressAvailable(str, str2, tL_messageMediaVenue, tL_messageMediaVenue2, location);
    }

    public static void lambda$fetchLocationAddress$29(Locale locale, Location location, int i10, Locale locale2, LocationFetchCallback locationFetchCallback) {
        ?? longitude;
        ?? r10;
        ?? r11;
        ?? r12;
        String str;
        String str2;
        ?? r16;
        List<Address> fromLocation;
        String string;
        String string2;
        String string3;
        String string4;
        String str3;
        String str4;
        String adminArea;
        boolean z10;
        ?? tL_messageMediaVenue;
        ?? r13;
        boolean z11;
        String locality;
        String subLocality;
        String locality2;
        boolean z12;
        String subThoroughfare;
        boolean z13;
        String thoroughfare;
        String locality3;
        String countryCode;
        String countryName;
        StringBuilder sb2;
        String str5;
        String countryName2;
        String locality4;
        boolean z14;
        String adminArea2;
        String subAdminArea;
        String language;
        String[] strArrSplit;
        int i11;
        String adminArea3;
        String subAdminArea2;
        String thoroughfare2;
        String subLocality2;
        String locality5;
        int i12;
        String[] strArr;
        String addressLine;
        StringBuilder sb3 = new StringBuilder();
        TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
        TL_stories.TL_geoPointAddress tL_geoPointAddress2 = new TL_stories.TL_geoPointAddress();
        try {
            List<Address> fromLocation2 = new Geocoder(ApplicationLoader.applicationContext, locale).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (i10 != 2) {
                fromLocation = null;
            } else if (locale2 == locale) {
                fromLocation = fromLocation2;
            } else {
                try {
                    ?? geocoder = new Geocoder(ApplicationLoader.applicationContext, locale2);
                    double latitude = location.getLatitude();
                    longitude = location.getLongitude();
                    fromLocation = geocoder.getFromLocation(latitude, longitude, 1);
                } catch (Exception unused) {
                    r10 = 0;
                    r16 = 0;
                    str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                    str = str2;
                    r12 = r10;
                    r11 = r16;
                    AndroidUtilities.runOnUIThread(new b0(locationFetchCallback, str2, str, r12, r11, location, 1));
                }
            }
            try {
                if (fromLocation2.size() > 0) {
                    Address address = fromLocation2.get(0);
                    Address address2 = (fromLocation == null || fromLocation.size() < 1) ? null : fromLocation.get(0);
                    if (i10 == 1) {
                        ArrayList arrayList = new ArrayList();
                        try {
                            addressLine = address.getAddressLine(0);
                        } catch (Exception unused2) {
                            addressLine = null;
                        }
                        if (TextUtils.isEmpty(addressLine)) {
                            try {
                                arrayList.add(address.getSubThoroughfare());
                            } catch (Exception unused3) {
                            }
                            try {
                                arrayList.add(address.getThoroughfare());
                            } catch (Exception unused4) {
                            }
                            try {
                                arrayList.add(address.getAdminArea());
                            } catch (Exception unused5) {
                            }
                            try {
                                arrayList.add(address.getCountryName());
                            } catch (Exception unused6) {
                            }
                        } else {
                            arrayList.add(addressLine);
                        }
                        int i13 = 0;
                        while (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null) {
                                String[] strArrSplit2 = ((String) arrayList.get(i13)).split(", ");
                                if (strArrSplit2.length > 1) {
                                    arrayList.remove(i13);
                                    for (String str6 : strArrSplit2) {
                                        arrayList.add(i13, str6);
                                        i13++;
                                    }
                                }
                            }
                            i13++;
                        }
                        int i14 = 0;
                        while (i14 < arrayList.size()) {
                            if (TextUtils.isEmpty((CharSequence) arrayList.get(i14)) || arrayList.indexOf(arrayList.get(i14)) != i14 || ((String) arrayList.get(i14)).matches("^\\s*\\d{4,}\\s*$")) {
                                arrayList.remove(i14);
                                i14--;
                            }
                            i14++;
                        }
                        string = arrayList.isEmpty() ? null : TextUtils.join(", ", arrayList);
                        string2 = string;
                        string3 = null;
                        string4 = null;
                        str3 = null;
                        z14 = true;
                        adminArea = null;
                        z11 = false;
                        locality = null;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        StringBuilder sb5 = new StringBuilder();
                        StringBuilder sb6 = new StringBuilder();
                        z11 = false;
                        StringBuilder sb7 = new StringBuilder();
                        String locality6 = TextUtils.isEmpty(null) ? address.getLocality() : null;
                        if (TextUtils.isEmpty(locality6)) {
                            locality6 = address.getAdminArea();
                        }
                        if (TextUtils.isEmpty(locality6)) {
                            locality6 = address.getSubAdminArea();
                        }
                        String str7 = locality6;
                        if (address2 != null) {
                            locality = TextUtils.isEmpty(null) ? address2.getLocality() : null;
                            if (TextUtils.isEmpty(locality)) {
                                locality = address2.getAdminArea();
                            }
                            if (TextUtils.isEmpty(locality)) {
                                locality = address2.getSubAdminArea();
                            }
                            adminArea = address2.getAdminArea();
                        } else {
                            adminArea = null;
                            locality = null;
                        }
                        String thoroughfare3 = (!TextUtils.isEmpty(null) || TextUtils.equals(address.getThoroughfare(), str7) || TextUtils.equals(address.getThoroughfare(), address.getCountryName())) ? null : address.getThoroughfare();
                        if (TextUtils.isEmpty(thoroughfare3) && !TextUtils.equals(address.getSubLocality(), str7)) {
                            if (!TextUtils.equals(address.getSubLocality(), address.getCountryName())) {
                                subLocality = address.getSubLocality();
                            }
                            if (!TextUtils.isEmpty(subLocality) && !TextUtils.equals(address.getLocality(), str7)) {
                                if (!TextUtils.equals(address.getLocality(), address.getCountryName())) {
                                    locality2 = address.getLocality();
                                }
                                if (!TextUtils.isEmpty(locality2) || TextUtils.equals(locality2, str7) || TextUtils.equals(locality2, address.getCountryName())) {
                                    sb7 = null;
                                } else {
                                    if (sb7.length() > 0) {
                                        sb7.append(", ");
                                    }
                                    sb7.append(locality2);
                                }
                                if (address2 != null) {
                                    if (TextUtils.isEmpty(null) || TextUtils.equals(address2.getThoroughfare(), str7) || TextUtils.equals(address2.getThoroughfare(), address2.getCountryName())) {
                                        thoroughfare2 = null;
                                    } else {
                                        thoroughfare2 = address2.getThoroughfare();
                                    }
                                    if (!TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address2.getSubLocality(), str7)) {
                                        if (!TextUtils.equals(address2.getSubLocality(), address2.getCountryName())) {
                                            subLocality2 = address2.getSubLocality();
                                        }
                                        if (!TextUtils.isEmpty(subLocality2) && !TextUtils.equals(address2.getLocality(), str7)) {
                                            if (!TextUtils.equals(address2.getLocality(), address2.getCountryName())) {
                                                locality5 = address2.getLocality();
                                            }
                                            if (!TextUtils.isEmpty(locality5) || TextUtils.equals(locality5, adminArea) || TextUtils.equals(locality5, address2.getCountryName())) {
                                                sb3 = null;
                                            } else {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(locality5);
                                            }
                                            if (!TextUtils.isEmpty(sb3)) {
                                                i12 = 0;
                                                while (true) {
                                                    strArr = unnamedRoads;
                                                    if (i12 >= strArr.length) {
                                                        break;
                                                    }
                                                    if (strArr[i12].equalsIgnoreCase(sb3.toString())) {
                                                        sb3 = null;
                                                        sb7 = null;
                                                        break;
                                                    }
                                                    i12++;
                                                }
                                            }
                                        }
                                        if (TextUtils.isEmpty(locality5)) {
                                            sb3 = null;
                                        } else {
                                            sb3 = null;
                                        }
                                        if (!TextUtils.isEmpty(sb3)) {
                                            i12 = 0;
                                            while (true) {
                                                strArr = unnamedRoads;
                                                if (i12 >= strArr.length) {
                                                    break;
                                                    break;
                                                } else {
                                                    if (strArr[i12].equalsIgnoreCase(sb3.toString())) {
                                                        sb3 = null;
                                                        sb7 = null;
                                                        break;
                                                    }
                                                    i12++;
                                                }
                                            }
                                        }
                                    }
                                    locality5 = !TextUtils.isEmpty(subLocality2) ? subLocality2 : subLocality2;
                                    if (TextUtils.isEmpty(locality5)) {
                                        sb3 = null;
                                    } else {
                                        sb3 = null;
                                    }
                                    if (!TextUtils.isEmpty(sb3)) {
                                        i12 = 0;
                                        while (true) {
                                            strArr = unnamedRoads;
                                            if (i12 >= strArr.length) {
                                                break;
                                                break;
                                            } else {
                                                if (strArr[i12].equalsIgnoreCase(sb3.toString())) {
                                                    sb3 = null;
                                                    sb7 = null;
                                                    break;
                                                }
                                                i12++;
                                            }
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(str7)) {
                                    z12 = true;
                                } else {
                                    if (sb6.length() > 0) {
                                        sb6.append(", ");
                                    }
                                    sb6.append(str7);
                                    if (sb7 != null) {
                                        if (sb7.length() > 0) {
                                            sb7.append(", ");
                                        }
                                        sb7.append(str7);
                                    }
                                    z12 = false;
                                }
                                subThoroughfare = address.getSubThoroughfare();
                                if (TextUtils.isEmpty(subThoroughfare)) {
                                    z13 = false;
                                } else {
                                    sb4.append(subThoroughfare);
                                    z13 = true;
                                }
                                thoroughfare = address.getThoroughfare();
                                boolean z15 = z12;
                                if (!TextUtils.isEmpty(thoroughfare)) {
                                    if (sb4.length() > 0) {
                                        sb4.append(" ");
                                    }
                                    sb4.append(thoroughfare);
                                    z13 = true;
                                }
                                if (!z13) {
                                    adminArea3 = address.getAdminArea();
                                    if (!TextUtils.isEmpty(adminArea3)) {
                                        if (sb4.length() > 0) {
                                            sb4.append(", ");
                                        }
                                        sb4.append(adminArea3);
                                    }
                                    subAdminArea2 = address.getSubAdminArea();
                                    if (!TextUtils.isEmpty(subAdminArea2)) {
                                        if (sb4.length() > 0) {
                                            sb4.append(", ");
                                        }
                                        sb4.append(subAdminArea2);
                                    }
                                }
                                locality3 = address.getLocality();
                                if (!TextUtils.isEmpty(locality3)) {
                                    if (sb4.length() > 0) {
                                        sb4.append(", ");
                                    }
                                    sb4.append(locality3);
                                }
                                countryCode = address.getCountryCode();
                                countryName = address.getCountryName();
                                if (TextUtils.isEmpty(countryName)) {
                                    sb2 = sb3;
                                    str5 = countryCode;
                                } else {
                                    if (sb4.length() > 0) {
                                        sb4.append(", ");
                                    }
                                    sb4.append(countryName);
                                    language = locale.getLanguage();
                                    if ("US".equals(address.getCountryCode())) {
                                        sb2 = sb3;
                                        str5 = countryCode;
                                    } else {
                                        sb2 = sb3;
                                        str5 = countryCode;
                                        if (!"AE".equals(address.getCountryCode())) {
                                            if (!"GB".equals(address.getCountryCode()) && "en".equals(language)) {
                                                strArrSplit = countryName.split(" ");
                                                countryName = "";
                                                for (String str8 : strArrSplit) {
                                                    if (str8.length() > 0) {
                                                        countryName = countryName + str8.charAt(0);
                                                    }
                                                }
                                            } else if ("US".equals(address.getCountryCode())) {
                                                countryName = "USA";
                                            }
                                        }
                                        if (sb6.length() > 0) {
                                            sb6.append(", ");
                                        }
                                        sb6.append(countryName);
                                    }
                                    if (!"en".equals(language) || "uk".equals(language) || "ru".equals(language)) {
                                        strArrSplit = countryName.split(" ");
                                        countryName = "";
                                        while (i11 < r2) {
                                            if (str8.length() > 0) {
                                                countryName = countryName + str8.charAt(0);
                                            }
                                        }
                                    } else {
                                        if (!"GB".equals(address.getCountryCode())) {
                                        }
                                        if ("US".equals(address.getCountryCode())) {
                                            countryName = "USA";
                                        }
                                    }
                                    if (sb6.length() > 0) {
                                        sb6.append(", ");
                                    }
                                    sb6.append(countryName);
                                }
                                countryName2 = address.getCountryName();
                                if (!TextUtils.isEmpty(countryName2)) {
                                    if (sb5.length() > 0) {
                                        sb5.append(", ");
                                    }
                                    sb5.append(countryName2);
                                }
                                locality4 = address.getLocality();
                                if (!TextUtils.isEmpty(locality4)) {
                                    if (sb5.length() > 0) {
                                        sb5.append(", ");
                                    }
                                    sb5.append(locality4);
                                }
                                if (!z13) {
                                    adminArea2 = address.getAdminArea();
                                    if (!TextUtils.isEmpty(adminArea2)) {
                                        if (sb5.length() > 0) {
                                            sb5.append(", ");
                                        }
                                        sb5.append(adminArea2);
                                    }
                                    subAdminArea = address.getSubAdminArea();
                                    if (!TextUtils.isEmpty(subAdminArea)) {
                                        if (sb5.length() > 0) {
                                            sb5.append(", ");
                                        }
                                        sb5.append(subAdminArea);
                                    }
                                }
                                string = sb4.toString();
                                string2 = sb5.toString();
                                string3 = sb6.toString();
                                if (sb7 == null) {
                                    string4 = null;
                                } else {
                                    string4 = sb7.toString();
                                }
                                z14 = z15;
                                sb3 = sb2;
                                str3 = str5;
                            }
                            if (TextUtils.isEmpty(locality2)) {
                                sb7 = null;
                            } else {
                                sb7 = null;
                            }
                            if (address2 != null) {
                                if (TextUtils.isEmpty(null)) {
                                    thoroughfare2 = null;
                                } else {
                                    thoroughfare2 = null;
                                }
                                subLocality2 = !TextUtils.isEmpty(thoroughfare2) ? thoroughfare2 : thoroughfare2;
                                if (!TextUtils.isEmpty(subLocality2)) {
                                }
                                if (TextUtils.isEmpty(locality5)) {
                                    sb3 = null;
                                } else {
                                    sb3 = null;
                                }
                                if (!TextUtils.isEmpty(sb3)) {
                                    i12 = 0;
                                    while (true) {
                                        strArr = unnamedRoads;
                                        if (i12 >= strArr.length) {
                                            break;
                                            break;
                                        } else {
                                            if (strArr[i12].equalsIgnoreCase(sb3.toString())) {
                                                sb3 = null;
                                                sb7 = null;
                                                break;
                                            }
                                            i12++;
                                        }
                                    }
                                }
                            }
                            if (TextUtils.isEmpty(str7)) {
                                if (sb6.length() > 0) {
                                    sb6.append(", ");
                                }
                                sb6.append(str7);
                                if (sb7 != null) {
                                    if (sb7.length() > 0) {
                                        sb7.append(", ");
                                    }
                                    sb7.append(str7);
                                }
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            subThoroughfare = address.getSubThoroughfare();
                            if (TextUtils.isEmpty(subThoroughfare)) {
                                sb4.append(subThoroughfare);
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            thoroughfare = address.getThoroughfare();
                            boolean z16 = z12;
                            if (!TextUtils.isEmpty(thoroughfare)) {
                                if (sb4.length() > 0) {
                                    sb4.append(" ");
                                }
                                sb4.append(thoroughfare);
                                z13 = true;
                            }
                            if (!z13) {
                                adminArea3 = address.getAdminArea();
                                if (!TextUtils.isEmpty(adminArea3)) {
                                    if (sb4.length() > 0) {
                                        sb4.append(", ");
                                    }
                                    sb4.append(adminArea3);
                                }
                                subAdminArea2 = address.getSubAdminArea();
                                if (!TextUtils.isEmpty(subAdminArea2)) {
                                    if (sb4.length() > 0) {
                                        sb4.append(", ");
                                    }
                                    sb4.append(subAdminArea2);
                                }
                            }
                            locality3 = address.getLocality();
                            if (!TextUtils.isEmpty(locality3)) {
                                if (sb4.length() > 0) {
                                    sb4.append(", ");
                                }
                                sb4.append(locality3);
                            }
                            countryCode = address.getCountryCode();
                            countryName = address.getCountryName();
                            if (TextUtils.isEmpty(countryName)) {
                                if (sb4.length() > 0) {
                                    sb4.append(", ");
                                }
                                sb4.append(countryName);
                                language = locale.getLanguage();
                                if ("US".equals(address.getCountryCode())) {
                                    sb2 = sb3;
                                    str5 = countryCode;
                                    if (!"AE".equals(address.getCountryCode())) {
                                        if (!"GB".equals(address.getCountryCode())) {
                                        }
                                        if ("US".equals(address.getCountryCode())) {
                                            countryName = "USA";
                                        }
                                    }
                                    if (sb6.length() > 0) {
                                        sb6.append(", ");
                                    }
                                    sb6.append(countryName);
                                } else {
                                    sb2 = sb3;
                                    str5 = countryCode;
                                }
                                if ("en".equals(language)) {
                                }
                                strArrSplit = countryName.split(" ");
                                countryName = "";
                                while (i11 < r2) {
                                    if (str8.length() > 0) {
                                        countryName = countryName + str8.charAt(0);
                                    }
                                }
                                if (sb6.length() > 0) {
                                    sb6.append(", ");
                                }
                                sb6.append(countryName);
                            } else {
                                sb2 = sb3;
                                str5 = countryCode;
                            }
                            countryName2 = address.getCountryName();
                            if (!TextUtils.isEmpty(countryName2)) {
                                if (sb5.length() > 0) {
                                    sb5.append(", ");
                                }
                                sb5.append(countryName2);
                            }
                            locality4 = address.getLocality();
                            if (!TextUtils.isEmpty(locality4)) {
                                if (sb5.length() > 0) {
                                    sb5.append(", ");
                                }
                                sb5.append(locality4);
                            }
                            if (!z13) {
                                adminArea2 = address.getAdminArea();
                                if (!TextUtils.isEmpty(adminArea2)) {
                                    if (sb5.length() > 0) {
                                        sb5.append(", ");
                                    }
                                    sb5.append(adminArea2);
                                }
                                subAdminArea = address.getSubAdminArea();
                                if (!TextUtils.isEmpty(subAdminArea)) {
                                    if (sb5.length() > 0) {
                                        sb5.append(", ");
                                    }
                                    sb5.append(subAdminArea);
                                }
                            }
                            string = sb4.toString();
                            string2 = sb5.toString();
                            string3 = sb6.toString();
                            if (sb7 == null) {
                                string4 = null;
                            } else {
                                string4 = sb7.toString();
                            }
                            z14 = z16;
                            sb3 = sb2;
                            str3 = str5;
                        }
                        subLocality = thoroughfare3;
                        locality2 = !TextUtils.isEmpty(subLocality) ? subLocality : subLocality;
                        if (TextUtils.isEmpty(locality2)) {
                            sb7 = null;
                        } else {
                            sb7 = null;
                        }
                        if (address2 != null) {
                            if (TextUtils.isEmpty(null)) {
                                thoroughfare2 = null;
                            } else {
                                thoroughfare2 = null;
                            }
                            if (!TextUtils.isEmpty(thoroughfare2)) {
                            }
                            if (!TextUtils.isEmpty(subLocality2)) {
                            }
                            if (TextUtils.isEmpty(locality5)) {
                                sb3 = null;
                            } else {
                                sb3 = null;
                            }
                            if (!TextUtils.isEmpty(sb3)) {
                                i12 = 0;
                                while (true) {
                                    strArr = unnamedRoads;
                                    if (i12 >= strArr.length) {
                                        break;
                                        break;
                                    } else {
                                        if (strArr[i12].equalsIgnoreCase(sb3.toString())) {
                                            sb3 = null;
                                            sb7 = null;
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            }
                        }
                        if (TextUtils.isEmpty(str7)) {
                            if (sb6.length() > 0) {
                                sb6.append(", ");
                            }
                            sb6.append(str7);
                            if (sb7 != null) {
                                if (sb7.length() > 0) {
                                    sb7.append(", ");
                                }
                                sb7.append(str7);
                            }
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        subThoroughfare = address.getSubThoroughfare();
                        if (TextUtils.isEmpty(subThoroughfare)) {
                            sb4.append(subThoroughfare);
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        thoroughfare = address.getThoroughfare();
                        boolean z17 = z12;
                        if (!TextUtils.isEmpty(thoroughfare)) {
                            if (sb4.length() > 0) {
                                sb4.append(" ");
                            }
                            sb4.append(thoroughfare);
                            z13 = true;
                        }
                        if (!z13) {
                            adminArea3 = address.getAdminArea();
                            if (!TextUtils.isEmpty(adminArea3)) {
                                if (sb4.length() > 0) {
                                    sb4.append(", ");
                                }
                                sb4.append(adminArea3);
                            }
                            subAdminArea2 = address.getSubAdminArea();
                            if (!TextUtils.isEmpty(subAdminArea2)) {
                                if (sb4.length() > 0) {
                                    sb4.append(", ");
                                }
                                sb4.append(subAdminArea2);
                            }
                        }
                        locality3 = address.getLocality();
                        if (!TextUtils.isEmpty(locality3)) {
                            if (sb4.length() > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(locality3);
                        }
                        countryCode = address.getCountryCode();
                        countryName = address.getCountryName();
                        if (TextUtils.isEmpty(countryName)) {
                            if (sb4.length() > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(countryName);
                            language = locale.getLanguage();
                            if ("US".equals(address.getCountryCode())) {
                                sb2 = sb3;
                                str5 = countryCode;
                                if (!"AE".equals(address.getCountryCode())) {
                                    if (!"GB".equals(address.getCountryCode())) {
                                    }
                                    if ("US".equals(address.getCountryCode())) {
                                        countryName = "USA";
                                    }
                                }
                                if (sb6.length() > 0) {
                                    sb6.append(", ");
                                }
                                sb6.append(countryName);
                            } else {
                                sb2 = sb3;
                                str5 = countryCode;
                            }
                            if ("en".equals(language)) {
                            }
                            strArrSplit = countryName.split(" ");
                            countryName = "";
                            while (i11 < r2) {
                                if (str8.length() > 0) {
                                    countryName = countryName + str8.charAt(0);
                                }
                            }
                            if (sb6.length() > 0) {
                                sb6.append(", ");
                            }
                            sb6.append(countryName);
                        } else {
                            sb2 = sb3;
                            str5 = countryCode;
                        }
                        countryName2 = address.getCountryName();
                        if (!TextUtils.isEmpty(countryName2)) {
                            if (sb5.length() > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(countryName2);
                        }
                        locality4 = address.getLocality();
                        if (!TextUtils.isEmpty(locality4)) {
                            if (sb5.length() > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(locality4);
                        }
                        if (!z13) {
                            adminArea2 = address.getAdminArea();
                            if (!TextUtils.isEmpty(adminArea2)) {
                                if (sb5.length() > 0) {
                                    sb5.append(", ");
                                }
                                sb5.append(adminArea2);
                            }
                            subAdminArea = address.getSubAdminArea();
                            if (!TextUtils.isEmpty(subAdminArea)) {
                                if (sb5.length() > 0) {
                                    sb5.append(", ");
                                }
                                sb5.append(subAdminArea);
                            }
                        }
                        string = sb4.toString();
                        string2 = sb5.toString();
                        string3 = sb6.toString();
                        if (sb7 == null) {
                            string4 = null;
                        } else {
                            string4 = sb7.toString();
                        }
                        z14 = z17;
                        sb3 = sb2;
                        str3 = str5;
                    }
                    z10 = z14;
                    str4 = locality;
                    longitude = z11;
                } else {
                    longitude = 0;
                    string = i10 == 1 ? null : String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                    string2 = string;
                    string3 = null;
                    string4 = null;
                    str3 = null;
                    str4 = null;
                    adminArea = null;
                    z10 = true;
                }
                if (TextUtils.isEmpty(string3)) {
                    tL_messageMediaVenue = longitude;
                } else {
                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                    try {
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaVenue.geo = tL_geoPoint;
                        tL_geoPoint.lat = location.getLatitude();
                        tL_messageMediaVenue.geo._long = location.getLongitude();
                        tL_messageMediaVenue.query_id = -1L;
                        tL_messageMediaVenue.title = string3;
                        tL_messageMediaVenue.icon = z10 ? "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png" : "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                        tL_messageMediaVenue.emoji = countryCodeToEmoji(str3);
                        tL_messageMediaVenue.address = LocaleController.getString(z10 ? R.string.Country : R.string.PassportCity);
                        tL_messageMediaVenue.geoAddress = tL_geoPointAddress;
                        tL_geoPointAddress.country_iso2 = str3;
                        tL_messageMediaVenue = tL_messageMediaVenue;
                        if (!z10) {
                            if (!TextUtils.isEmpty(adminArea)) {
                                tL_geoPointAddress.flags |= 1;
                                tL_geoPointAddress.state = adminArea;
                            }
                            tL_messageMediaVenue = tL_messageMediaVenue;
                            if (!TextUtils.isEmpty(str4)) {
                                tL_geoPointAddress.flags |= 2;
                                tL_geoPointAddress.city = str4;
                                tL_messageMediaVenue = tL_messageMediaVenue;
                            }
                        }
                    } catch (Exception unused7) {
                        r10 = tL_messageMediaVenue;
                        r16 = longitude;
                        str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                        str = str2;
                        r12 = r10;
                        r11 = r16;
                        AndroidUtilities.runOnUIThread(new b0(locationFetchCallback, str2, str, r12, r11, location, 1));
                    }
                }
                if (TextUtils.isEmpty(string4)) {
                    r13 = longitude;
                } else {
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                    try {
                        TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                        tL_messageMediaVenue2.geo = tL_geoPoint2;
                        tL_geoPoint2.lat = location.getLatitude();
                        tL_messageMediaVenue2.geo._long = location.getLongitude();
                        tL_messageMediaVenue2.query_id = -1L;
                        tL_messageMediaVenue2.title = string4;
                        tL_messageMediaVenue2.icon = "pin";
                        tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportStreet1);
                        tL_messageMediaVenue2.geoAddress = tL_geoPointAddress2;
                        tL_geoPointAddress2.country_iso2 = str3;
                        if (!TextUtils.isEmpty(adminArea)) {
                            tL_geoPointAddress2.flags |= 1;
                            tL_geoPointAddress2.state = adminArea;
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            tL_geoPointAddress2.flags |= 2;
                            tL_geoPointAddress2.city = str4;
                        }
                        if (!TextUtils.isEmpty(sb3)) {
                            tL_geoPointAddress2.flags |= 4;
                            tL_geoPointAddress2.street = sb3.toString();
                        }
                        r13 = tL_messageMediaVenue2;
                    } catch (Exception unused8) {
                        longitude = tL_messageMediaVenue2;
                        r10 = tL_messageMediaVenue;
                        r16 = longitude;
                        str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                        str = str2;
                        r12 = r10;
                        r11 = r16;
                        AndroidUtilities.runOnUIThread(new b0(locationFetchCallback, str2, str, r12, r11, location, 1));
                    }
                }
                if (tL_messageMediaVenue == 0 && r13 == 0) {
                    try {
                        String strDetectOcean = detectOcean(location.getLongitude(), location.getLatitude());
                        if (strDetectOcean != null) {
                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                            try {
                                TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue3.geo = tL_geoPoint3;
                                tL_geoPoint3.lat = location.getLatitude();
                                tL_messageMediaVenue3.geo._long = location.getLongitude();
                                tL_messageMediaVenue3.query_id = -1L;
                                tL_messageMediaVenue3.title = strDetectOcean;
                                tL_messageMediaVenue3.icon = "pin";
                                tL_messageMediaVenue3.emoji = "🌊";
                                tL_messageMediaVenue3.address = "Ocean";
                                tL_messageMediaVenue = tL_messageMediaVenue3;
                            } catch (Exception unused9) {
                                r16 = r13;
                                r10 = tL_messageMediaVenue3;
                                str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                                str = str2;
                                r12 = r10;
                                r11 = r16;
                            }
                        }
                    } catch (Exception unused10) {
                        longitude = r13;
                        r10 = tL_messageMediaVenue;
                        r16 = longitude;
                        str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                        str = str2;
                        r12 = r10;
                        r11 = r16;
                        AndroidUtilities.runOnUIThread(new b0(locationFetchCallback, str2, str, r12, r11, location, 1));
                    }
                }
                str2 = string;
                str = string2;
                r11 = r13;
                r12 = tL_messageMediaVenue;
            } catch (Exception unused11) {
                r10 = longitude;
                r16 = longitude;
                str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                str = str2;
                r12 = r10;
                r11 = r16;
                AndroidUtilities.runOnUIThread(new b0(locationFetchCallback, str2, str, r12, r11, location, 1));
            }
        } catch (Exception unused12) {
            longitude = 0;
        }
        AndroidUtilities.runOnUIThread(new b0(locationFetchCallback, str2, str, r12, r11, location, 1));
    }

    public void lambda$loadLiveLocations$25(long j10, TLObject tLObject) {
        this.cacheRequests.e(j10);
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        int i10 = 0;
        while (i10 < messages_messages.messages.size()) {
            if (!(messages_messages.messages.get(i10).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                messages_messages.messages.remove(i10);
                i10--;
            }
            i10++;
        }
        getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
        getMessagesController().putUsers(messages_messages.users, false);
        getMessagesController().putChats(messages_messages.chats, false);
        this.locationsCache.k(messages_messages.messages, j10);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j10), Integer.valueOf(this.currentAccount));
    }

    public void lambda$loadLiveLocations$26(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new c4(this, j10, tLObject, 4));
    }

    public void lambda$loadSharingLocations$14(ArrayList arrayList) {
        this.sharingLocationsUI.addAll(arrayList);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            SharingLocationInfo sharingLocationInfo = (SharingLocationInfo) arrayList.get(i10);
            this.sharingLocationsMapUI.k(sharingLocationInfo, sharingLocationInfo.did);
        }
        startService();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    public void lambda$loadSharingLocations$15(ArrayList arrayList) {
        this.sharingLocations.addAll(arrayList);
        for (int i10 = 0; i10 < this.sharingLocations.size(); i10++) {
            SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i10);
            this.sharingLocationsMap.k(sharingLocationInfo, sharingLocationInfo.did);
        }
        AndroidUtilities.runOnUIThread(new t5(this, arrayList, 0));
    }

    public void lambda$loadSharingLocations$16(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        Utilities.stageQueue.postRunnable(new t5(this, arrayList3, 1));
    }

    public void lambda$loadSharingLocations$17() {
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        try {
            ArrayList<Long> arrayList4 = new ArrayList<>();
            ArrayList arrayList5 = new ArrayList();
            SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
            while (sQLiteCursorQueryFinalized.next()) {
                SharingLocationInfo sharingLocationInfo = new SharingLocationInfo();
                sharingLocationInfo.did = sQLiteCursorQueryFinalized.longValue(0);
                sharingLocationInfo.mid = sQLiteCursorQueryFinalized.intValue(1);
                sharingLocationInfo.stopTime = sQLiteCursorQueryFinalized.intValue(2);
                sharingLocationInfo.period = sQLiteCursorQueryFinalized.intValue(3);
                sharingLocationInfo.proximityMeters = sQLiteCursorQueryFinalized.intValue(5);
                sharingLocationInfo.account = this.currentAccount;
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(4);
                if (nativeByteBufferByteBufferValue != null) {
                    MessageObject messageObject = new MessageObject(this.currentAccount, TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false), false, false);
                    sharingLocationInfo.messageObject = messageObject;
                    MessagesStorage.addUsersAndChatsFromMessage(messageObject.messageOwner, arrayList4, arrayList5, null);
                    nativeByteBufferByteBufferValue.reuse();
                }
                arrayList.add(sharingLocationInfo);
                if (DialogObject.isChatDialog(sharingLocationInfo.did)) {
                    if (!arrayList5.contains(Long.valueOf(-sharingLocationInfo.did))) {
                        arrayList5.add(Long.valueOf(-sharingLocationInfo.did));
                    }
                } else if (DialogObject.isUserDialog(sharingLocationInfo.did) && !arrayList4.contains(Long.valueOf(sharingLocationInfo.did))) {
                    arrayList4.add(Long.valueOf(sharingLocationInfo.did));
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            if (!arrayList5.isEmpty()) {
                getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList5), arrayList3);
            }
            getMessagesStorage().getUsersInternal(arrayList4, arrayList2);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new lk(this, arrayList2, arrayList3, arrayList, 9));
    }

    public void lambda$markLiveLoactionsAsRead$27(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_affectedMessages) {
            TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
            getMessagesController().processNewDifferenceParams(-1, tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
        }
    }

    public void lambda$new$0() {
        LocationController locationController = getAccountInstance().getLocationController();
        getNotificationCenter().addObserver(locationController, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(locationController, NotificationCenter.messagesDeleted);
        getNotificationCenter().addObserver(locationController, NotificationCenter.replaceMessagesObjects);
    }

    public void lambda$onConnected$1(Integer num) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowPlayServicesAlert, num);
    }

    public void lambda$onConnected$2(Integer num) {
        if (this.sharingLocations.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new q5(this, num, 1));
    }

    public void lambda$onConnected$3() {
        this.servicesAvailable = Boolean.FALSE;
        try {
            this.apiClient.disconnect();
            start();
        } catch (Throwable unused) {
        }
    }

    public void lambda$onConnected$4(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            startFusedLocationRequest(true);
        } else if (iIntValue == 1) {
            Utilities.stageQueue.postRunnable(new q5(this, num, 0));
        } else {
            if (iIntValue != 2) {
                return;
            }
            Utilities.stageQueue.postRunnable(new r5(this, 0));
        }
    }

    public void lambda$removeAllLocationSharings$22(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            return;
        }
        getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
    }

    public void lambda$removeAllLocationSharings$23() {
        this.sharingLocationsUI.clear();
        this.sharingLocationsMapUI.b();
        stopService();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    public void lambda$removeAllLocationSharings$24() {
        for (int i10 = 0; i10 < this.sharingLocations.size(); i10++) {
            SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i10);
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
            tL_messages_editMessage.f22463id = sharingLocationInfo.mid;
            tL_messages_editMessage.flags |= 16384;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = true;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
            getConnectionsManager().sendRequest(tL_messages_editMessage, new s5(this, 1));
        }
        this.sharingLocations.clear();
        this.sharingLocationsMap.b();
        saveSharingLocation(null, 2);
        stop(true);
        AndroidUtilities.runOnUIThread(new r5(this, 3));
    }

    public void lambda$removeSharingLocation$19(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            return;
        }
        getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
    }

    public void lambda$removeSharingLocation$20(SharingLocationInfo sharingLocationInfo) {
        this.sharingLocationsUI.remove(sharingLocationInfo);
        this.sharingLocationsMapUI.l(sharingLocationInfo.did);
        if (this.sharingLocationsUI.isEmpty()) {
            stopService();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    public void lambda$removeSharingLocation$21(long j10) {
        SharingLocationInfo sharingLocationInfo = (SharingLocationInfo) this.sharingLocationsMap.f(j10);
        this.sharingLocationsMap.l(j10);
        if (sharingLocationInfo != null) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
            tL_messages_editMessage.f22463id = sharingLocationInfo.mid;
            tL_messages_editMessage.flags |= 16384;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = true;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
            getConnectionsManager().sendRequest(tL_messages_editMessage, new s5(this, 0));
            this.sharingLocations.remove(sharingLocationInfo);
            saveSharingLocation(sharingLocationInfo, 1);
            AndroidUtilities.runOnUIThread(new p5(1, sharingLocationInfo, this));
            if (this.sharingLocations.isEmpty()) {
                stop(true);
            }
        }
    }

    public void lambda$saveSharingLocation$18(int i10, SharingLocationInfo sharingLocationInfo) {
        try {
            if (i10 == 2) {
                getMessagesStorage().getDatabase().executeFast("DELETE FROM sharing_locations WHERE 1").stepThis().dispose();
                return;
            }
            if (i10 == 1) {
                if (sharingLocationInfo == null) {
                    return;
                }
                getMessagesStorage().getDatabase().executeFast("DELETE FROM sharing_locations WHERE uid = " + sharingLocationInfo.did).stepThis().dispose();
                return;
            }
            if (sharingLocationInfo == null) {
                return;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO sharing_locations VALUES(?, ?, ?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(sharingLocationInfo.messageObject.messageOwner.getObjectSize());
            sharingLocationInfo.messageObject.messageOwner.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindLong(1, sharingLocationInfo.did);
            sQLitePreparedStatementExecuteFast.bindInteger(2, sharingLocationInfo.mid);
            sQLitePreparedStatementExecuteFast.bindInteger(3, sharingLocationInfo.stopTime);
            sQLitePreparedStatementExecuteFast.bindInteger(4, sharingLocationInfo.period);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(5, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindInteger(6, sharingLocationInfo.proximityMeters);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
            nativeByteBuffer.reuse();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void lambda$setLastKnownLocation$10() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newLocationAvailable, new Object[0]);
    }

    public void lambda$setProximityLocation$12(int i10, long j10) {
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE sharing_locations SET proximity = ? WHERE uid = ?");
            sQLitePreparedStatementExecuteFast.requery();
            sQLitePreparedStatementExecuteFast.bindInteger(1, i10);
            sQLitePreparedStatementExecuteFast.bindLong(2, j10);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$setProximityLocation$13() {
        broadcastLastKnownLocation(true);
    }

    public void lambda$startFusedLocationRequest$5(boolean z10) {
        if (!z10) {
            this.servicesAvailable = Boolean.FALSE;
        }
        if (this.sharingLocations.isEmpty()) {
            return;
        }
        if (!z10) {
            start();
            return;
        }
        try {
            ApplicationLoader.getLocationServiceProvider().getLastLocation(new u5(this, 1));
            ApplicationLoader.getLocationServiceProvider().requestLocationUpdates(this.locationRequest, this.fusedLocationListener);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public void lambda$update$8(SharingLocationInfo sharingLocationInfo) {
        this.sharingLocationsUI.remove(sharingLocationInfo);
        this.sharingLocationsMapUI.l(sharingLocationInfo.did);
        if (this.sharingLocationsUI.isEmpty()) {
            stopService();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    private void loadSharingLocations() {
        getMessagesStorage().getStorageQueue().postRunnable(new r5(this, 6));
    }

    private void saveSharingLocation(SharingLocationInfo sharingLocationInfo, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new r4(this, i10, sharingLocationInfo, 5));
    }

    public void setLastKnownLocation(Location location) {
        if (location == null || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.lastKnownLocation = location;
            if (location != null) {
                AndroidUtilities.runOnUIThread(new w1(12));
            }
        }
    }

    private boolean shouldSendLocationNow() {
        return shouldStopGps() && Math.abs(this.lastLocationSendTime - SystemClock.elapsedRealtime()) >= 2000;
    }

    private boolean shouldStopGps() {
        return SystemClock.elapsedRealtime() > this.locationEndWatchTime;
    }

    private void start() {
        if (this.started) {
            return;
        }
        this.lastLocationStartTime = SystemClock.elapsedRealtime();
        this.started = true;
        if (checkServices()) {
            try {
                this.apiClient.connect();
                return;
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        try {
            this.locationManager.requestLocationUpdates("gps", 1L, 0.0f, this.gpsLocationListener);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        try {
            this.locationManager.requestLocationUpdates("network", 1L, 0.0f, this.networkLocationListener);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            this.locationManager.requestLocationUpdates("passive", 1L, 0.0f, this.passiveLocationListener);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        if (this.lastKnownLocation == null) {
            try {
                setLastKnownLocation(this.locationManager.getLastKnownLocation("gps"));
                if (this.lastKnownLocation == null) {
                    setLastKnownLocation(this.locationManager.getLastKnownLocation("network"));
                }
            } catch (Exception e12) {
                FileLog.e(e12);
            }
        }
    }

    private void startService() {
        try {
            if (!pd0.f("android.permission.ACCESS_COARSE_LOCATION") && !pd0.f("android.permission.ACCESS_FINE_LOCATION")) {
                return;
            }
            ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) LocationSharingService.class));
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    private void stop(boolean z10) {
        this.started = false;
        if (checkServices()) {
            try {
                ApplicationLoader.getLocationServiceProvider().removeLocationUpdates(this.fusedLocationListener);
                this.apiClient.disconnect();
            } catch (Throwable th) {
                FileLog.e(th, false);
            }
        }
        this.locationManager.removeUpdates(this.gpsLocationListener);
        if (z10) {
            this.locationManager.removeUpdates(this.networkLocationListener);
            this.locationManager.removeUpdates(this.passiveLocationListener);
        }
    }

    private void stopService() {
        ApplicationLoader.applicationContext.stopService(new Intent(ApplicationLoader.applicationContext, (Class<?>) LocationSharingService.class));
    }

    public void addSharingLocation(TLRPC.Message message) {
        SharingLocationInfo sharingLocationInfo = new SharingLocationInfo();
        sharingLocationInfo.did = message.dialog_id;
        sharingLocationInfo.mid = message.f22401id;
        TLRPC.MessageMedia messageMedia = message.media;
        sharingLocationInfo.period = messageMedia.period;
        int i10 = messageMedia.proximity_notification_radius;
        sharingLocationInfo.proximityMeters = i10;
        sharingLocationInfo.lastSentProximityMeters = i10;
        int i11 = this.currentAccount;
        sharingLocationInfo.account = i11;
        sharingLocationInfo.messageObject = new MessageObject(i11, message, false, false);
        if (sharingLocationInfo.period == Integer.MAX_VALUE) {
            sharingLocationInfo.stopTime = Integer.MAX_VALUE;
        } else {
            sharingLocationInfo.stopTime = getConnectionsManager().getCurrentTime() + sharingLocationInfo.period;
        }
        SharingLocationInfo sharingLocationInfo2 = (SharingLocationInfo) this.sharingLocationsMap.f(sharingLocationInfo.did);
        this.sharingLocationsMap.k(sharingLocationInfo, sharingLocationInfo.did);
        if (sharingLocationInfo2 != null) {
            this.sharingLocations.remove(sharingLocationInfo2);
        }
        this.sharingLocations.add(sharingLocationInfo);
        saveSharingLocation(sharingLocationInfo, 0);
        this.lastLocationSendTime = SystemClock.elapsedRealtime() - 25000;
        AndroidUtilities.runOnUIThread(new f0(this, sharingLocationInfo2, sharingLocationInfo, 25));
    }

    public void cleanup() {
        this.sharingLocationsUI.clear();
        this.sharingLocationsMapUI.b();
        this.locationsCache.b();
        this.cacheRequests.b();
        this.lastReadLocationTime.b();
        stopService();
        Utilities.stageQueue.postRunnable(new r5(this, 5));
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            Long l10 = (Long) objArr[0];
            long jLongValue = l10.longValue();
            if (isSharingLocation(jLongValue) && (arrayList2 = (ArrayList) this.locationsCache.f(jLongValue)) != null) {
                ArrayList arrayList3 = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList3.get(i12);
                    if (messageObject.isLiveLocation()) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                arrayList2.add(messageObject.messageOwner);
                                break;
                            } else {
                                if (MessageObject.getFromChatId((TLRPC.Message) arrayList2.get(i13)) == messageObject.getFromChatId()) {
                                    arrayList2.set(i13, messageObject.messageOwner);
                                    break;
                                }
                                i13++;
                            }
                        }
                        z10 = true;
                    } else if (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) {
                        long dialogId = messageObject.getDialogId();
                        if (DialogObject.isUserDialog(dialogId)) {
                            setProximityLocation(dialogId, 0, false);
                        }
                    }
                }
                if (z10) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, l10, Integer.valueOf(this.currentAccount));
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue() || this.sharingLocationsUI.isEmpty()) {
                return;
            }
            ArrayList arrayList4 = (ArrayList) objArr[0];
            long jLongValue2 = ((Long) objArr[1]).longValue();
            ArrayList arrayList5 = null;
            for (int i14 = 0; i14 < this.sharingLocationsUI.size(); i14++) {
                SharingLocationInfo sharingLocationInfo = this.sharingLocationsUI.get(i14);
                MessageObject messageObject2 = sharingLocationInfo.messageObject;
                if (jLongValue2 == (messageObject2 != null ? messageObject2.getChannelId() : 0L) && arrayList4.contains(Integer.valueOf(sharingLocationInfo.mid))) {
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                    }
                    arrayList5.add(Long.valueOf(sharingLocationInfo.did));
                }
            }
            if (arrayList5 != null) {
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    removeSharingLocation(((Long) arrayList5.get(i15)).longValue());
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.replaceMessagesObjects) {
            Long l11 = (Long) objArr[0];
            long jLongValue3 = l11.longValue();
            if (isSharingLocation(jLongValue3) && (arrayList = (ArrayList) this.locationsCache.f(jLongValue3)) != null) {
                ArrayList arrayList6 = (ArrayList) objArr[1];
                boolean z11 = false;
                for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                    MessageObject messageObject3 = (MessageObject) arrayList6.get(i16);
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        if (MessageObject.getFromChatId((TLRPC.Message) arrayList.get(i17)) == messageObject3.getFromChatId()) {
                            if (messageObject3.isLiveLocation()) {
                                arrayList.set(i17, messageObject3.messageOwner);
                            } else {
                                arrayList.remove(i17);
                            }
                            z11 = true;
                            break;
                        }
                    }
                }
                if (z11) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, l11, Integer.valueOf(this.currentAccount));
                }
            }
        }
    }

    public Location getLastKnownLocation() {
        return this.lastKnownLocation;
    }

    public SharingLocationInfo getSharingLocationInfo(long j10) {
        return (SharingLocationInfo) this.sharingLocationsMapUI.f(j10);
    }

    public boolean isSharingLocation(long j10) {
        return this.sharingLocationsMapUI.h(j10) >= 0;
    }

    public void loadLiveLocations(long j10) {
        if (this.cacheRequests.h(j10) >= 0) {
            return;
        }
        this.cacheRequests.k(Boolean.TRUE, j10);
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(j10);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new jh.r5(this, j10, 2));
    }

    public void markLiveLoactionsAsRead(long j10) {
        ArrayList arrayList;
        ?? tL_messages_readMessageContents;
        int size;
        if (DialogObject.isEncryptedDialog(j10) || (arrayList = (ArrayList) this.locationsCache.f(j10)) == null || arrayList.isEmpty()) {
            return;
        }
        Integer num = (Integer) this.lastReadLocationTime.f(j10);
        int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (num == null || num.intValue() + 60 <= iElapsedRealtime) {
            this.lastReadLocationTime.k(Integer.valueOf(iElapsedRealtime), j10);
            int iF = 0;
            if (DialogObject.isChatDialog(j10)) {
                long j11 = -j10;
                if (ChatObject.isChannel(j11, this.currentAccount)) {
                    tL_messages_readMessageContents = new TLRPC.TL_channels_readMessageContents();
                    int size2 = arrayList.size();
                    while (iF < size2) {
                        iF = i0.a.f(((TLRPC.Message) arrayList.get(iF)).f22401id, iF, 1, tL_messages_readMessageContents.f22419id);
                    }
                    tL_messages_readMessageContents.channel = getMessagesController().getInputChannel(j11);
                } else {
                    tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
                    size = arrayList.size();
                    while (iF < size) {
                        iF = i0.a.f(((TLRPC.Message) arrayList.get(iF)).f22401id, iF, 1, tL_messages_readMessageContents.f22483id);
                    }
                }
            } else {
                tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
                size = arrayList.size();
                while (iF < size) {
                    iF = i0.a.f(((TLRPC.Message) arrayList.get(iF)).f22401id, iF, 1, tL_messages_readMessageContents.f22483id);
                }
            }
            getConnectionsManager().sendRequest(tL_messages_readMessageContents, new s5(this, 2));
        }
    }

    @Override
    public void onConnected(Bundle bundle) {
        this.wasConnectedToPlayServices = true;
        try {
            ApplicationLoader.getLocationServiceProvider().checkLocationSettings(this.locationRequest, new u5(this, 0));
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public void onConnectionFailed() {
        if (this.wasConnectedToPlayServices) {
            return;
        }
        this.servicesAvailable = Boolean.FALSE;
        if (this.started) {
            this.started = false;
            start();
        }
    }

    public void removeAllLocationSharings() {
        Utilities.stageQueue.postRunnable(new r5(this, 4));
    }

    public void removeSharingLocation(long j10) {
        Utilities.stageQueue.postRunnable(new cg.b2(this, j10, 15));
    }

    public void setMapLocation(Location location, boolean z10) {
        Location location2;
        if (location == null) {
            return;
        }
        this.lastLocationByMaps = true;
        if (z10 || ((location2 = this.lastKnownLocation) != null && location2.distanceTo(location) >= 20.0f)) {
            this.lastLocationSendTime = SystemClock.elapsedRealtime() - 30000;
            this.locationSentSinceLastMapUpdate = false;
        } else if (this.locationSentSinceLastMapUpdate) {
            this.lastLocationSendTime = SystemClock.elapsedRealtime() - 10000;
            this.locationSentSinceLastMapUpdate = false;
        }
        setLastKnownLocation(location);
    }

    public void setNewLocationEndWatchTime() {
        if (this.sharingLocations.isEmpty()) {
            return;
        }
        this.locationEndWatchTime = SystemClock.elapsedRealtime() + 65000;
        start();
    }

    public boolean setProximityLocation(long j10, int i10, boolean z10) {
        SharingLocationInfo sharingLocationInfo = (SharingLocationInfo) this.sharingLocationsMapUI.f(j10);
        if (sharingLocationInfo != null) {
            sharingLocationInfo.proximityMeters = i10;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new hh.d9(this, i10, j10, 2));
        if (z10) {
            Utilities.stageQueue.postRunnable(new r5(this, 1));
        }
        return sharingLocationInfo != null;
    }

    public void startFusedLocationRequest(boolean z10) {
        Utilities.stageQueue.postRunnable(new fh.f(15, this, z10));
    }

    public void update() {
        getUserConfig();
        if (!this.sharingLocations.isEmpty()) {
            int i10 = 0;
            while (i10 < this.sharingLocations.size()) {
                SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i10);
                if (sharingLocationInfo.stopTime <= getConnectionsManager().getCurrentTime()) {
                    this.sharingLocations.remove(i10);
                    this.sharingLocationsMap.l(sharingLocationInfo.did);
                    saveSharingLocation(sharingLocationInfo, 1);
                    AndroidUtilities.runOnUIThread(new p5(2, sharingLocationInfo, this));
                    i10--;
                }
                i10++;
            }
        }
        if (!this.started) {
            if (this.sharingLocations.isEmpty() || Math.abs(this.lastLocationSendTime - SystemClock.elapsedRealtime()) <= 30000) {
                return;
            }
            this.lastLocationStartTime = SystemClock.elapsedRealtime();
            start();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.lastLocationByMaps || Math.abs(this.lastLocationStartTime - jElapsedRealtime) > 10000 || shouldSendLocationNow()) {
            this.lastLocationByMaps = false;
            this.locationSentSinceLastMapUpdate = true;
            boolean z10 = SystemClock.elapsedRealtime() - this.lastLocationSendTime > 2000;
            this.lastLocationStartTime = jElapsedRealtime;
            this.lastLocationSendTime = SystemClock.elapsedRealtime();
            broadcastLastKnownLocation(z10);
        }
    }

    public static void fetchLocationAddress(Location location, int i10, LocationFetchCallback locationFetchCallback) {
        Locale systemDefaultLocale;
        if (locationFetchCallback == null) {
            return;
        }
        Runnable runnable = callbacks.get(locationFetchCallback);
        if (runnable != null) {
            Utilities.globalQueue.cancelRunnable(runnable);
            callbacks.remove(locationFetchCallback);
        }
        if (location == null) {
            locationFetchCallback.onLocationAddressAvailable(null, null, null, null, null);
            return;
        }
        try {
            systemDefaultLocale = LocaleController.getInstance().getCurrentLocale();
        } catch (Exception unused) {
            systemDefaultLocale = LocaleController.getInstance().getSystemDefaultLocale();
        }
        Locale locale = systemDefaultLocale;
        Locale locale2 = locale.getLanguage().contains("en") ? locale : Locale.US;
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        gh.e1 e1Var = new gh.e1(locale, location, i10, locale2, locationFetchCallback, 4);
        dispatchQueue.postRunnable(e1Var, 300L);
        callbacks.put(locationFetchCallback, e1Var);
    }

    public class GpsLocationListener implements LocationListener {
        private GpsLocationListener() {
        }

        @Override
        public void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }
            if (LocationController.this.lastKnownLocation == null || !(this == LocationController.this.networkLocationListener || this == LocationController.this.passiveLocationListener)) {
                LocationController.this.setLastKnownLocation(location);
            } else {
                if (LocationController.this.started || location.distanceTo(LocationController.this.lastKnownLocation) <= 20.0f) {
                    return;
                }
                LocationController.this.setLastKnownLocation(location);
                LocationController.this.lastLocationSendTime = SystemClock.elapsedRealtime() - 25000;
            }
        }

        @Override
        public void onProviderDisabled(String str) {
        }

        @Override
        public void onProviderEnabled(String str) {
        }

        @Override
        public void onStatusChanged(String str, int i10, Bundle bundle) {
        }
    }

    @Override
    public void onConnectionSuspended(int i10) {
    }
}
