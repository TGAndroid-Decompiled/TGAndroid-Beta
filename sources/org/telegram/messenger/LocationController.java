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
import androidx.collection.LongSparseArray;
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
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda48;

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
    private LongSparseArray cacheRequests;
    private FusedLocationListener fusedLocationListener;
    private GpsLocationListener gpsLocationListener;
    private Location lastKnownLocation;
    private boolean lastLocationByMaps;
    private long lastLocationSendTime;
    private long lastLocationStartTime;
    private LongSparseArray lastReadLocationTime;
    private long locationEndWatchTime;
    private LocationManager locationManager;
    private ILocationServiceProvider.ILocationRequest locationRequest;
    private boolean locationSentSinceLastMapUpdate;
    public LongSparseArray locationsCache;
    private GpsLocationListener networkLocationListener;
    private GpsLocationListener passiveLocationListener;
    private SparseIntArray requests;
    private Boolean servicesAvailable;
    private ArrayList<SharingLocationInfo> sharingLocations;
    private LongSparseArray sharingLocationsMap;
    private LongSparseArray sharingLocationsMapUI;
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
        public void onStatusChanged(String str, int i, Bundle bundle) {
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

    public LocationController(int i) {
        super(i);
        this.sharingLocationsMap = new LongSparseArray();
        this.sharingLocations = new ArrayList<>();
        this.locationsCache = new LongSparseArray();
        this.lastReadLocationTime = new LongSparseArray();
        this.gpsLocationListener = new GpsLocationListener();
        this.networkLocationListener = new GpsLocationListener();
        this.passiveLocationListener = new GpsLocationListener();
        this.fusedLocationListener = new FusedLocationListener();
        this.locationSentSinceLastMapUpdate = true;
        this.requests = new SparseIntArray();
        this.cacheRequests = new LongSparseArray();
        this.sharingLocationsUI = new ArrayList<>();
        this.sharingLocationsMapUI = new LongSparseArray();
        this.locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        this.apiClient = ApplicationLoader.getLocationServiceProvider().onCreateLocationServicesAPI(ApplicationLoader.applicationContext, this, this);
        ILocationServiceProvider.ILocationRequest iLocationRequestOnCreateLocationRequest = ApplicationLoader.getLocationServiceProvider().onCreateLocationRequest();
        this.locationRequest = iLocationRequestOnCreateLocationRequest;
        iLocationRequestOnCreateLocationRequest.setPriority(0);
        this.locationRequest.setInterval(1000L);
        this.locationRequest.setFastestInterval(1000L);
        AndroidUtilities.runOnUIThread(new LocationController$$ExternalSyntheticLambda1(this, 2));
        loadSharingLocations();
    }

    private void broadcastLastKnownLocation(boolean z) {
        TLRPC.InputMedia inputMedia;
        TLRPC.InputGeoPoint inputGeoPoint;
        int i;
        int i2;
        TLRPC.GeoPoint geoPoint;
        if (this.lastKnownLocation == null) {
            return;
        }
        if (this.requests.size() != 0) {
            if (z) {
                for (int i3 = 0; i3 < this.requests.size(); i3++) {
                    getConnectionsManager().cancelRequest(this.requests.keyAt(i3), false);
                }
            }
            this.requests.clear();
        }
        if (!this.sharingLocations.isEmpty()) {
            int currentTime = getConnectionsManager().getCurrentTime();
            float[] fArr = new float[1];
            for (int i4 = 0; i4 < this.sharingLocations.size(); i4++) {
                SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i4);
                TLRPC.Message message = sharingLocationInfo.messageObject.messageOwner;
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia == null || (geoPoint = messageMedia.geo) == null || sharingLocationInfo.lastSentProximityMeters != sharingLocationInfo.proximityMeters) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
                    tL_messages_editMessage.id = sharingLocationInfo.mid;
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
                    i = sharingLocationInfo.lastSentProximityMeters;
                    i2 = sharingLocationInfo.proximityMeters;
                    if (i != i2) {
                        inputMedia.proximity_notification_radius = i2;
                        inputMedia.flags |= 8;
                    }
                    inputMedia.heading = getHeading(this.lastKnownLocation);
                    tL_messages_editMessage.media.flags |= 4;
                    int iSendRequest = getConnectionsManager().sendRequest(tL_messages_editMessage, new SecretChatHelper$$ExternalSyntheticLambda9(2, this, sharingLocationInfo, iArr, tL_messages_editMessage));
                    int[] iArr = {iSendRequest};
                    this.requests.put(iSendRequest, 0);
                } else {
                    int i5 = message.edit_date;
                    if (i5 == 0) {
                        i5 = message.date;
                    }
                    if (Math.abs(currentTime - i5) < 10) {
                        Location.distanceBetween(geoPoint.lat, geoPoint._long, this.lastKnownLocation.getLatitude(), this.lastKnownLocation.getLongitude(), fArr);
                        if (fArr[0] >= 1.0f) {
                            TLRPC.TL_messages_editMessage tL_messages_editMessage2 = new TLRPC.TL_messages_editMessage();
                            tL_messages_editMessage2.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
                            tL_messages_editMessage2.id = sharingLocationInfo.mid;
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
                            i = sharingLocationInfo.lastSentProximityMeters;
                            i2 = sharingLocationInfo.proximityMeters;
                            if (i != i2) {
                                inputMedia.proximity_notification_radius = i2;
                                inputMedia.flags |= 8;
                            }
                            inputMedia.heading = getHeading(this.lastKnownLocation);
                            tL_messages_editMessage2.media.flags |= 4;
                            int iSendRequest2 = getConnectionsManager().sendRequest(tL_messages_editMessage2, new SecretChatHelper$$ExternalSyntheticLambda9(2, this, sharingLocationInfo, iArr, tL_messages_editMessage2));
                            int[] iArr2 = {iSendRequest2};
                            this.requests.put(iSendRequest2, 0);
                        }
                    } else {
                        TLRPC.TL_messages_editMessage tL_messages_editMessage3 = new TLRPC.TL_messages_editMessage();
                        tL_messages_editMessage3.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
                        tL_messages_editMessage3.id = sharingLocationInfo.mid;
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
                        i = sharingLocationInfo.lastSentProximityMeters;
                        i2 = sharingLocationInfo.proximityMeters;
                        if (i != i2) {
                            inputMedia.proximity_notification_radius = i2;
                            inputMedia.flags |= 8;
                        }
                        inputMedia.heading = getHeading(this.lastKnownLocation);
                        tL_messages_editMessage3.media.flags |= 4;
                        int iSendRequest3 = getConnectionsManager().sendRequest(tL_messages_editMessage3, new SecretChatHelper$$ExternalSyntheticLambda9(2, this, sharingLocationInfo, iArr2, tL_messages_editMessage3));
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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iCodePointCount; i++) {
            sb.append(Character.toChars(Character.codePointAt(upperCase, i) - (-127397)));
        }
        return sb.toString();
    }

    public static String detectOcean(double d, double d2) {
        if (d2 > 65.0d) {
            return "Arctic Ocean";
        }
        if (d > -88.0d && d < 40.0d && d2 > 0.0d) {
            return "Atlantic Ocean";
        }
        if (d > -60.0d && d < 20.0d && d2 <= 0.0d) {
            return "Atlantic Ocean";
        }
        if (d2 <= 30.0d && d >= 20.0d && d < 150.0d) {
            return "Indian Ocean";
        }
        if ((d > 106.0d || d < -60.0d) && d2 > 0.0d) {
            return "Pacific Ocean";
        }
        if ((d > 150.0d || d < -60.0d) && d2 <= 0.0d) {
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

    public static LocationController getInstance(int i) {
        LocationController locationController;
        LocationController locationController2 = Instance[i];
        if (locationController2 != null) {
            return locationController2;
        }
        synchronized (LocationController.class) {
            try {
                locationController = Instance[i];
                if (locationController == null) {
                    LocationController[] locationControllerArr = Instance;
                    LocationController locationController3 = new LocationController(i);
                    locationControllerArr[i] = locationController3;
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
        for (int i = 0; i < 4; i++) {
            size += getInstance(i).sharingLocationsUI.size();
        }
        return size;
    }

    public void lambda$addSharingLocation$11(SharingLocationInfo sharingLocationInfo, SharingLocationInfo sharingLocationInfo2) {
        if (sharingLocationInfo != null) {
            this.sharingLocationsUI.remove(sharingLocationInfo);
        }
        this.sharingLocationsUI.add(sharingLocationInfo2);
        this.sharingLocationsMapUI.put(sharingLocationInfo2, sharingLocationInfo2.did);
        startService();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    public void lambda$broadcastLastKnownLocation$6(SharingLocationInfo sharingLocationInfo) {
        this.sharingLocationsUI.remove(sharingLocationInfo);
        this.sharingLocationsMapUI.remove(sharingLocationInfo.did);
        if (this.sharingLocationsUI.isEmpty()) {
            stopService();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    public void lambda$broadcastLastKnownLocation$7(SharingLocationInfo sharingLocationInfo, int[] iArr, TLRPC.TL_messages_editMessage tL_messages_editMessage, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (tL_error.text.equals("MESSAGE_ID_INVALID")) {
                this.sharingLocations.remove(sharingLocationInfo);
                this.sharingLocationsMap.remove(sharingLocationInfo.did);
                saveSharingLocation(sharingLocationInfo, 1);
                this.requests.delete(iArr[0]);
                AndroidUtilities.runOnUIThread(new LocationController$$ExternalSyntheticLambda3(1, sharingLocationInfo, this));
                return;
            }
            return;
        }
        if ((tL_messages_editMessage.flags & 8) != 0) {
            sharingLocationInfo.lastSentProximityMeters = tL_messages_editMessage.media.proximity_notification_radius;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        boolean z = false;
        for (int i = 0; i < updates.updates.size(); i++) {
            TLRPC.Update update = updates.updates.get(i);
            if (update instanceof TL_update.TL_updateEditMessage) {
                sharingLocationInfo.messageObject.messageOwner = ((TL_update.TL_updateEditMessage) update).message;
            } else {
                if (update instanceof TL_update.TL_updateEditChannelMessage) {
                    sharingLocationInfo.messageObject.messageOwner = ((TL_update.TL_updateEditChannelMessage) update).message;
                }
            }
            z = true;
        }
        if (z) {
            saveSharingLocation(sharingLocationInfo, 0);
        }
        getMessagesController().processUpdates(updates, false);
    }

    public void lambda$cleanup$9() {
        this.locationEndWatchTime = 0L;
        this.requests.clear();
        this.sharingLocationsMap.clear();
        this.sharingLocations.clear();
        setLastKnownLocation(null);
        stop(true);
    }

    public static void lambda$fetchLocationAddress$28(LocationFetchCallback locationFetchCallback, String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        callbacks.remove(locationFetchCallback);
        locationFetchCallback.onLocationAddressAvailable(str, str2, tL_messageMediaVenue, tL_messageMediaVenue2, location);
    }

    public static void lambda$fetchLocationAddress$29(Locale locale, Location location, int i, Locale locale2, LocationFetchCallback locationFetchCallback) {
        ?? longitude;
        ?? r11;
        ?? tL_messageMediaVenue;
        ?? r12;
        ?? r13;
        ?? r14;
        String str;
        String str2;
        ?? r6;
        ?? r5;
        ?? r15;
        List<Address> fromLocation;
        String string;
        String string2;
        String string3;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        ?? r16;
        ?? r17;
        boolean z2;
        String adminArea;
        String locality;
        String subLocality;
        String locality2;
        boolean z3;
        String subThoroughfare;
        boolean z4;
        String thoroughfare;
        String locality3;
        String countryCode;
        String countryName;
        String str7;
        String str8;
        String countryName2;
        String locality4;
        String string4;
        boolean z5;
        String adminArea2;
        String subAdminArea;
        String language;
        String[] strArrSplit;
        int i2;
        String adminArea3;
        String subAdminArea2;
        String thoroughfare2;
        String subLocality2;
        String locality5;
        int i3;
        String[] strArr;
        String addressLine;
        StringBuilder sb = new StringBuilder();
        TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
        TL_stories.TL_geoPointAddress tL_geoPointAddress2 = new TL_stories.TL_geoPointAddress();
        try {
            List<Address> fromLocation2 = new Geocoder(ApplicationLoader.applicationContext, locale).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (i != 2) {
                fromLocation = null;
            } else if (locale2 == locale) {
                fromLocation = fromLocation2;
            } else {
                ?? geocoder = new Geocoder(ApplicationLoader.applicationContext, locale2);
                double latitude = location.getLatitude();
                longitude = location.getLongitude();
                fromLocation = geocoder.getFromLocation(latitude, longitude, 1);
            }
            try {
                if (fromLocation2.size() > 0) {
                    Address address = fromLocation2.get(0);
                    Address address2 = (fromLocation == null || fromLocation.size() < 1) ? null : fromLocation.get(0);
                    if (i == 1) {
                        ArrayList arrayList = new ArrayList();
                        try {
                            addressLine = address.getAddressLine(0);
                        } catch (Exception unused) {
                            addressLine = null;
                        }
                        if (TextUtils.isEmpty(addressLine)) {
                            try {
                                arrayList.add(address.getSubThoroughfare());
                            } catch (Exception unused2) {
                            }
                            try {
                                arrayList.add(address.getThoroughfare());
                            } catch (Exception unused3) {
                            }
                            try {
                                arrayList.add(address.getAdminArea());
                            } catch (Exception unused4) {
                            }
                            try {
                                arrayList.add(address.getCountryName());
                            } catch (Exception unused5) {
                            }
                        } else {
                            arrayList.add(addressLine);
                        }
                        int i4 = 0;
                        while (i4 < arrayList.size()) {
                            if (arrayList.get(i4) != null) {
                                String[] strArrSplit2 = ((String) arrayList.get(i4)).split(", ");
                                if (strArrSplit2.length > 1) {
                                    arrayList.remove(i4);
                                    for (String str9 : strArrSplit2) {
                                        arrayList.add(i4, str9);
                                        i4++;
                                    }
                                }
                            }
                            i4++;
                        }
                        int i5 = 0;
                        while (i5 < arrayList.size()) {
                            if (TextUtils.isEmpty((CharSequence) arrayList.get(i5)) || arrayList.indexOf(arrayList.get(i5)) != i5 || ((String) arrayList.get(i5)).matches("^\\s*\\d{4,}\\s*$")) {
                                arrayList.remove(i5);
                                i5--;
                            }
                            i5++;
                        }
                        string = arrayList.isEmpty() ? null : TextUtils.join(", ", arrayList);
                        string2 = string;
                        string3 = null;
                        str3 = null;
                        z5 = true;
                        str5 = null;
                        str6 = null;
                        z2 = false;
                        locality = null;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        StringBuilder sb3 = new StringBuilder();
                        StringBuilder sb4 = new StringBuilder();
                        z2 = false;
                        StringBuilder sb5 = new StringBuilder();
                        String locality6 = TextUtils.isEmpty(null) ? address.getLocality() : null;
                        if (TextUtils.isEmpty(locality6)) {
                            locality6 = address.getAdminArea();
                        }
                        if (TextUtils.isEmpty(locality6)) {
                            locality6 = address.getSubAdminArea();
                        }
                        String str10 = locality6;
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
                        String thoroughfare3 = (!TextUtils.isEmpty(null) || TextUtils.equals(address.getThoroughfare(), str10) || TextUtils.equals(address.getThoroughfare(), address.getCountryName())) ? null : address.getThoroughfare();
                        if (TextUtils.isEmpty(thoroughfare3) && !TextUtils.equals(address.getSubLocality(), str10)) {
                            if (!TextUtils.equals(address.getSubLocality(), address.getCountryName())) {
                                subLocality = address.getSubLocality();
                            }
                            if (!TextUtils.isEmpty(subLocality) && !TextUtils.equals(address.getLocality(), str10)) {
                                if (!TextUtils.equals(address.getLocality(), address.getCountryName())) {
                                    locality2 = address.getLocality();
                                }
                                if (!TextUtils.isEmpty(locality2) || TextUtils.equals(locality2, str10) || TextUtils.equals(locality2, address.getCountryName())) {
                                    sb5 = null;
                                } else {
                                    if (sb5.length() > 0) {
                                        sb5.append(", ");
                                    }
                                    sb5.append(locality2);
                                }
                                if (address2 != null) {
                                    if (TextUtils.isEmpty(null) || TextUtils.equals(address2.getThoroughfare(), str10) || TextUtils.equals(address2.getThoroughfare(), address2.getCountryName())) {
                                        thoroughfare2 = null;
                                    } else {
                                        thoroughfare2 = address2.getThoroughfare();
                                    }
                                    if (!TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address2.getSubLocality(), str10)) {
                                        if (!TextUtils.equals(address2.getSubLocality(), address2.getCountryName())) {
                                            subLocality2 = address2.getSubLocality();
                                        }
                                        if (!TextUtils.isEmpty(subLocality2) && !TextUtils.equals(address2.getLocality(), str10)) {
                                            if (!TextUtils.equals(address2.getLocality(), address2.getCountryName())) {
                                                locality5 = address2.getLocality();
                                            }
                                            if (!TextUtils.isEmpty(locality5) || TextUtils.equals(locality5, adminArea) || TextUtils.equals(locality5, address2.getCountryName())) {
                                                sb = null;
                                            } else {
                                                if (sb.length() > 0) {
                                                    sb.append(", ");
                                                }
                                                sb.append(locality5);
                                            }
                                            if (!TextUtils.isEmpty(sb)) {
                                                i3 = 0;
                                                while (true) {
                                                    strArr = unnamedRoads;
                                                    if (i3 >= strArr.length) {
                                                        break;
                                                    }
                                                    if (strArr[i3].equalsIgnoreCase(sb.toString())) {
                                                        sb = null;
                                                        sb5 = null;
                                                        break;
                                                    }
                                                    i3++;
                                                }
                                            }
                                        }
                                        if (TextUtils.isEmpty(locality5)) {
                                            sb = null;
                                        } else {
                                            sb = null;
                                        }
                                        if (!TextUtils.isEmpty(sb)) {
                                            i3 = 0;
                                            while (true) {
                                                strArr = unnamedRoads;
                                                if (i3 >= strArr.length) {
                                                    break;
                                                    break;
                                                } else {
                                                    if (strArr[i3].equalsIgnoreCase(sb.toString())) {
                                                        sb = null;
                                                        sb5 = null;
                                                        break;
                                                    }
                                                    i3++;
                                                }
                                            }
                                        }
                                    }
                                    locality5 = !TextUtils.isEmpty(subLocality2) ? subLocality2 : subLocality2;
                                    if (TextUtils.isEmpty(locality5)) {
                                        sb = null;
                                    } else {
                                        sb = null;
                                    }
                                    if (!TextUtils.isEmpty(sb)) {
                                        i3 = 0;
                                        while (true) {
                                            strArr = unnamedRoads;
                                            if (i3 >= strArr.length) {
                                                break;
                                                break;
                                            } else {
                                                if (strArr[i3].equalsIgnoreCase(sb.toString())) {
                                                    sb = null;
                                                    sb5 = null;
                                                    break;
                                                }
                                                i3++;
                                            }
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(str10)) {
                                    z3 = true;
                                } else {
                                    if (sb4.length() > 0) {
                                        sb4.append(", ");
                                    }
                                    sb4.append(str10);
                                    if (sb5 != null) {
                                        if (sb5.length() > 0) {
                                            sb5.append(", ");
                                        }
                                        sb5.append(str10);
                                    }
                                    z3 = false;
                                }
                                subThoroughfare = address.getSubThoroughfare();
                                if (TextUtils.isEmpty(subThoroughfare)) {
                                    z4 = false;
                                } else {
                                    sb2.append(subThoroughfare);
                                    z4 = true;
                                }
                                thoroughfare = address.getThoroughfare();
                                boolean z6 = z3;
                                if (!TextUtils.isEmpty(thoroughfare)) {
                                    if (sb2.length() > 0) {
                                        sb2.append(" ");
                                    }
                                    sb2.append(thoroughfare);
                                    z4 = true;
                                }
                                if (!z4) {
                                    adminArea3 = address.getAdminArea();
                                    if (!TextUtils.isEmpty(adminArea3)) {
                                        if (sb2.length() > 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(adminArea3);
                                    }
                                    subAdminArea2 = address.getSubAdminArea();
                                    if (!TextUtils.isEmpty(subAdminArea2)) {
                                        if (sb2.length() > 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(subAdminArea2);
                                    }
                                }
                                locality3 = address.getLocality();
                                if (!TextUtils.isEmpty(locality3)) {
                                    if (sb2.length() > 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(locality3);
                                }
                                countryCode = address.getCountryCode();
                                countryName = address.getCountryName();
                                if (TextUtils.isEmpty(countryName)) {
                                    str7 = countryCode;
                                    str8 = adminArea;
                                } else {
                                    if (sb2.length() > 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(countryName);
                                    language = locale.getLanguage();
                                    if ("US".equals(address.getCountryCode())) {
                                        str7 = countryCode;
                                        str8 = adminArea;
                                    } else {
                                        str7 = countryCode;
                                        str8 = adminArea;
                                        if (!"AE".equals(address.getCountryCode())) {
                                            if (!"GB".equals(address.getCountryCode()) && "en".equals(language)) {
                                                strArrSplit = countryName.split(" ");
                                                countryName = "";
                                                for (String str11 : strArrSplit) {
                                                    if (str11.length() > 0) {
                                                        countryName = countryName + str11.charAt(0);
                                                    }
                                                }
                                            } else if ("US".equals(address.getCountryCode())) {
                                                countryName = "USA";
                                            }
                                        }
                                        if (sb4.length() > 0) {
                                            sb4.append(", ");
                                        }
                                        sb4.append(countryName);
                                    }
                                    if (!"en".equals(language) || "uk".equals(language) || "ru".equals(language)) {
                                        strArrSplit = countryName.split(" ");
                                        countryName = "";
                                        while (i2 < r2) {
                                            if (str11.length() > 0) {
                                                countryName = countryName + str11.charAt(0);
                                            }
                                        }
                                    } else {
                                        if (!"GB".equals(address.getCountryCode())) {
                                        }
                                        if ("US".equals(address.getCountryCode())) {
                                            countryName = "USA";
                                        }
                                    }
                                    if (sb4.length() > 0) {
                                        sb4.append(", ");
                                    }
                                    sb4.append(countryName);
                                }
                                countryName2 = address.getCountryName();
                                if (!TextUtils.isEmpty(countryName2)) {
                                    if (sb3.length() > 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(countryName2);
                                }
                                locality4 = address.getLocality();
                                if (!TextUtils.isEmpty(locality4)) {
                                    if (sb3.length() > 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(locality4);
                                }
                                if (!z4) {
                                    adminArea2 = address.getAdminArea();
                                    if (!TextUtils.isEmpty(adminArea2)) {
                                        if (sb3.length() > 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(adminArea2);
                                    }
                                    subAdminArea = address.getSubAdminArea();
                                    if (!TextUtils.isEmpty(subAdminArea)) {
                                        if (sb3.length() > 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(subAdminArea);
                                    }
                                }
                                string = sb2.toString();
                                string2 = sb3.toString();
                                string3 = sb4.toString();
                                if (sb5 == null) {
                                    string4 = null;
                                } else {
                                    string4 = sb5.toString();
                                }
                                z5 = z6;
                                str6 = string4;
                                str3 = str7;
                                str5 = str8;
                            }
                            if (TextUtils.isEmpty(locality2)) {
                                sb5 = null;
                            } else {
                                sb5 = null;
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
                                    sb = null;
                                } else {
                                    sb = null;
                                }
                                if (!TextUtils.isEmpty(sb)) {
                                    i3 = 0;
                                    while (true) {
                                        strArr = unnamedRoads;
                                        if (i3 >= strArr.length) {
                                            break;
                                            break;
                                        } else {
                                            if (strArr[i3].equalsIgnoreCase(sb.toString())) {
                                                sb = null;
                                                sb5 = null;
                                                break;
                                            }
                                            i3++;
                                        }
                                    }
                                }
                            }
                            if (TextUtils.isEmpty(str10)) {
                                if (sb4.length() > 0) {
                                    sb4.append(", ");
                                }
                                sb4.append(str10);
                                if (sb5 != null) {
                                    if (sb5.length() > 0) {
                                        sb5.append(", ");
                                    }
                                    sb5.append(str10);
                                }
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            subThoroughfare = address.getSubThoroughfare();
                            if (TextUtils.isEmpty(subThoroughfare)) {
                                sb2.append(subThoroughfare);
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            thoroughfare = address.getThoroughfare();
                            boolean z7 = z3;
                            if (!TextUtils.isEmpty(thoroughfare)) {
                                if (sb2.length() > 0) {
                                    sb2.append(" ");
                                }
                                sb2.append(thoroughfare);
                                z4 = true;
                            }
                            if (!z4) {
                                adminArea3 = address.getAdminArea();
                                if (!TextUtils.isEmpty(adminArea3)) {
                                    if (sb2.length() > 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(adminArea3);
                                }
                                subAdminArea2 = address.getSubAdminArea();
                                if (!TextUtils.isEmpty(subAdminArea2)) {
                                    if (sb2.length() > 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(subAdminArea2);
                                }
                            }
                            locality3 = address.getLocality();
                            if (!TextUtils.isEmpty(locality3)) {
                                if (sb2.length() > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(locality3);
                            }
                            countryCode = address.getCountryCode();
                            countryName = address.getCountryName();
                            if (TextUtils.isEmpty(countryName)) {
                                if (sb2.length() > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(countryName);
                                language = locale.getLanguage();
                                if ("US".equals(address.getCountryCode())) {
                                    str7 = countryCode;
                                    str8 = adminArea;
                                    if (!"AE".equals(address.getCountryCode())) {
                                        if (!"GB".equals(address.getCountryCode())) {
                                        }
                                        if ("US".equals(address.getCountryCode())) {
                                            countryName = "USA";
                                        }
                                    }
                                    if (sb4.length() > 0) {
                                        sb4.append(", ");
                                    }
                                    sb4.append(countryName);
                                } else {
                                    str7 = countryCode;
                                    str8 = adminArea;
                                }
                                if ("en".equals(language)) {
                                }
                                strArrSplit = countryName.split(" ");
                                countryName = "";
                                while (i2 < r2) {
                                    if (str11.length() > 0) {
                                        countryName = countryName + str11.charAt(0);
                                    }
                                }
                                if (sb4.length() > 0) {
                                    sb4.append(", ");
                                }
                                sb4.append(countryName);
                            } else {
                                str7 = countryCode;
                                str8 = adminArea;
                            }
                            countryName2 = address.getCountryName();
                            if (!TextUtils.isEmpty(countryName2)) {
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(countryName2);
                            }
                            locality4 = address.getLocality();
                            if (!TextUtils.isEmpty(locality4)) {
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(locality4);
                            }
                            if (!z4) {
                                adminArea2 = address.getAdminArea();
                                if (!TextUtils.isEmpty(adminArea2)) {
                                    if (sb3.length() > 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(adminArea2);
                                }
                                subAdminArea = address.getSubAdminArea();
                                if (!TextUtils.isEmpty(subAdminArea)) {
                                    if (sb3.length() > 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(subAdminArea);
                                }
                            }
                            string = sb2.toString();
                            string2 = sb3.toString();
                            string3 = sb4.toString();
                            if (sb5 == null) {
                                string4 = null;
                            } else {
                                string4 = sb5.toString();
                            }
                            z5 = z7;
                            str6 = string4;
                            str3 = str7;
                            str5 = str8;
                        }
                        subLocality = thoroughfare3;
                        locality2 = !TextUtils.isEmpty(subLocality) ? subLocality : subLocality;
                        if (TextUtils.isEmpty(locality2)) {
                            sb5 = null;
                        } else {
                            sb5 = null;
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
                                sb = null;
                            } else {
                                sb = null;
                            }
                            if (!TextUtils.isEmpty(sb)) {
                                i3 = 0;
                                while (true) {
                                    strArr = unnamedRoads;
                                    if (i3 >= strArr.length) {
                                        break;
                                        break;
                                    } else {
                                        if (strArr[i3].equalsIgnoreCase(sb.toString())) {
                                            sb = null;
                                            sb5 = null;
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            }
                        }
                        if (TextUtils.isEmpty(str10)) {
                            if (sb4.length() > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(str10);
                            if (sb5 != null) {
                                if (sb5.length() > 0) {
                                    sb5.append(", ");
                                }
                                sb5.append(str10);
                            }
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        subThoroughfare = address.getSubThoroughfare();
                        if (TextUtils.isEmpty(subThoroughfare)) {
                            sb2.append(subThoroughfare);
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        thoroughfare = address.getThoroughfare();
                        boolean z8 = z3;
                        if (!TextUtils.isEmpty(thoroughfare)) {
                            if (sb2.length() > 0) {
                                sb2.append(" ");
                            }
                            sb2.append(thoroughfare);
                            z4 = true;
                        }
                        if (!z4) {
                            adminArea3 = address.getAdminArea();
                            if (!TextUtils.isEmpty(adminArea3)) {
                                if (sb2.length() > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(adminArea3);
                            }
                            subAdminArea2 = address.getSubAdminArea();
                            if (!TextUtils.isEmpty(subAdminArea2)) {
                                if (sb2.length() > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(subAdminArea2);
                            }
                        }
                        locality3 = address.getLocality();
                        if (!TextUtils.isEmpty(locality3)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(locality3);
                        }
                        countryCode = address.getCountryCode();
                        countryName = address.getCountryName();
                        if (TextUtils.isEmpty(countryName)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(countryName);
                            language = locale.getLanguage();
                            if ("US".equals(address.getCountryCode())) {
                                str7 = countryCode;
                                str8 = adminArea;
                                if (!"AE".equals(address.getCountryCode())) {
                                    if (!"GB".equals(address.getCountryCode())) {
                                    }
                                    if ("US".equals(address.getCountryCode())) {
                                        countryName = "USA";
                                    }
                                }
                                if (sb4.length() > 0) {
                                    sb4.append(", ");
                                }
                                sb4.append(countryName);
                            } else {
                                str7 = countryCode;
                                str8 = adminArea;
                            }
                            if ("en".equals(language)) {
                            }
                            strArrSplit = countryName.split(" ");
                            countryName = "";
                            while (i2 < r2) {
                                if (str11.length() > 0) {
                                    countryName = countryName + str11.charAt(0);
                                }
                            }
                            if (sb4.length() > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(countryName);
                        } else {
                            str7 = countryCode;
                            str8 = adminArea;
                        }
                        countryName2 = address.getCountryName();
                        if (!TextUtils.isEmpty(countryName2)) {
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(countryName2);
                        }
                        locality4 = address.getLocality();
                        if (!TextUtils.isEmpty(locality4)) {
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(locality4);
                        }
                        if (!z4) {
                            adminArea2 = address.getAdminArea();
                            if (!TextUtils.isEmpty(adminArea2)) {
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(adminArea2);
                            }
                            subAdminArea = address.getSubAdminArea();
                            if (!TextUtils.isEmpty(subAdminArea)) {
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(subAdminArea);
                            }
                        }
                        string = sb2.toString();
                        string2 = sb3.toString();
                        string3 = sb4.toString();
                        if (sb5 == null) {
                            string4 = null;
                        } else {
                            string4 = sb5.toString();
                        }
                        z5 = z8;
                        str6 = string4;
                        str3 = str7;
                        str5 = str8;
                    }
                    z = z5;
                    str4 = locality;
                    longitude = z2;
                } else {
                    longitude = 0;
                    string = i == 1 ? null : String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                    string2 = string;
                    string3 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    z = true;
                }
                if (TextUtils.isEmpty(string3)) {
                    r16 = longitude;
                } else {
                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                    try {
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaVenue.geo = tL_geoPoint;
                        tL_geoPoint.lat = location.getLatitude();
                        tL_messageMediaVenue.geo._long = location.getLongitude();
                        tL_messageMediaVenue.query_id = -1L;
                        tL_messageMediaVenue.title = string3;
                        tL_messageMediaVenue.icon = z ? "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png" : "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                        tL_messageMediaVenue.emoji = countryCodeToEmoji(str3);
                        tL_messageMediaVenue.address = LocaleController.getString(z ? R.string.Country : R.string.PassportCity);
                        tL_messageMediaVenue.geoAddress = tL_geoPointAddress;
                        tL_geoPointAddress.country_iso2 = str3;
                        r16 = tL_messageMediaVenue;
                        if (!z) {
                            if (!TextUtils.isEmpty(str5)) {
                                tL_geoPointAddress.flags |= 1;
                                tL_geoPointAddress.state = str5;
                            }
                            r16 = tL_messageMediaVenue;
                            if (!TextUtils.isEmpty(str4)) {
                                tL_geoPointAddress.flags |= 2;
                                tL_geoPointAddress.city = str4;
                                r16 = tL_messageMediaVenue;
                            }
                        }
                    } catch (Exception unused6) {
                        r12 = longitude;
                        r15 = tL_messageMediaVenue;
                        str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                        str = str2;
                        r14 = r12;
                        r13 = r15;
                        r6 = r14;
                        r5 = r13;
                        AndroidUtilities.runOnUIThread(new MediaController$$ExternalSyntheticLambda44(locationFetchCallback, str2, str, r5, r6, location, 2));
                    }
                }
                try {
                    if (TextUtils.isEmpty(str6)) {
                        r17 = longitude;
                    } else {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                        try {
                            TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                            tL_messageMediaVenue2.geo = tL_geoPoint2;
                            tL_geoPoint2.lat = location.getLatitude();
                            tL_messageMediaVenue2.geo._long = location.getLongitude();
                            tL_messageMediaVenue2.query_id = -1L;
                            tL_messageMediaVenue2.title = str6;
                            tL_messageMediaVenue2.icon = "pin";
                            tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportStreet1);
                            tL_messageMediaVenue2.geoAddress = tL_geoPointAddress2;
                            tL_geoPointAddress2.country_iso2 = str3;
                            if (!TextUtils.isEmpty(str5)) {
                                tL_geoPointAddress2.flags |= 1;
                                tL_geoPointAddress2.state = str5;
                            }
                            if (!TextUtils.isEmpty(str4)) {
                                tL_geoPointAddress2.flags |= 2;
                                tL_geoPointAddress2.city = str4;
                            }
                            if (!TextUtils.isEmpty(sb)) {
                                tL_geoPointAddress2.flags |= 4;
                                tL_geoPointAddress2.street = sb.toString();
                            }
                            r17 = tL_messageMediaVenue2;
                        } catch (Exception unused7) {
                            r12 = tL_messageMediaVenue2;
                            r15 = r16;
                            str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                            str = str2;
                            r14 = r12;
                            r13 = r15;
                            r6 = r14;
                            r5 = r13;
                            AndroidUtilities.runOnUIThread(new MediaController$$ExternalSyntheticLambda44(locationFetchCallback, str2, str, r5, r6, location, 2));
                        }
                    }
                    if (r16 == 0 && r17 == 0) {
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
                                    str = string2;
                                    r5 = tL_messageMediaVenue3;
                                    r6 = r17;
                                    str2 = string;
                                } catch (Exception unused8) {
                                    r15 = tL_messageMediaVenue3;
                                    r12 = r17;
                                    str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                                    str = str2;
                                    r14 = r12;
                                    r13 = r15;
                                    r6 = r14;
                                    r5 = r13;
                                }
                            }
                        } catch (Exception unused9) {
                            longitude = r17;
                            r11 = r16;
                            longitude = longitude;
                            tL_messageMediaVenue = r11;
                            r12 = longitude;
                            r15 = tL_messageMediaVenue;
                            str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                            str = str2;
                            r14 = r12;
                            r13 = r15;
                            r6 = r14;
                            r5 = r13;
                            AndroidUtilities.runOnUIThread(new MediaController$$ExternalSyntheticLambda44(locationFetchCallback, str2, str, r5, r6, location, 2));
                        }
                        AndroidUtilities.runOnUIThread(new MediaController$$ExternalSyntheticLambda44(locationFetchCallback, str2, str, r5, r6, location, 2));
                    }
                    str2 = string;
                    str = string2;
                    r14 = r17;
                    r13 = r16;
                } catch (Exception unused10) {
                }
            } catch (Exception unused11) {
                r11 = longitude;
                longitude = longitude;
                tL_messageMediaVenue = r11;
                r12 = longitude;
                r15 = tL_messageMediaVenue;
                str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                str = str2;
                r14 = r12;
                r13 = r15;
                r6 = r14;
                r5 = r13;
                AndroidUtilities.runOnUIThread(new MediaController$$ExternalSyntheticLambda44(locationFetchCallback, str2, str, r5, r6, location, 2));
            }
        } catch (Exception unused12) {
            longitude = 0;
        }
        r6 = r14;
        r5 = r13;
        AndroidUtilities.runOnUIThread(new MediaController$$ExternalSyntheticLambda44(locationFetchCallback, str2, str, r5, r6, location, 2));
    }

    public void lambda$loadLiveLocations$25(long j, TLObject tLObject) {
        this.cacheRequests.delete(j);
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        int i = 0;
        while (i < messages_messages.messages.size()) {
            if (!(messages_messages.messages.get(i).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                messages_messages.messages.remove(i);
                i--;
            }
            i++;
        }
        getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
        getMessagesController().putUsers(messages_messages.users, false);
        getMessagesController().putChats(messages_messages.chats, false);
        this.locationsCache.put(messages_messages.messages, j);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j), Integer.valueOf(this.currentAccount));
    }

    public void lambda$loadLiveLocations$26(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new MessagesStorage$$ExternalSyntheticLambda11(this, j, tLObject, 5));
    }

    public void lambda$loadSharingLocations$14(ArrayList arrayList) {
        this.sharingLocationsUI.addAll(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            SharingLocationInfo sharingLocationInfo = (SharingLocationInfo) arrayList.get(i);
            this.sharingLocationsMapUI.put(sharingLocationInfo, sharingLocationInfo.did);
        }
        startService();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    public void lambda$loadSharingLocations$15(ArrayList arrayList) {
        this.sharingLocations.addAll(arrayList);
        for (int i = 0; i < this.sharingLocations.size(); i++) {
            SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i);
            this.sharingLocationsMap.put(sharingLocationInfo, sharingLocationInfo.did);
        }
        AndroidUtilities.runOnUIThread(new LocationController$$ExternalSyntheticLambda8(this, arrayList, 1));
    }

    public void lambda$loadSharingLocations$16(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        Utilities.stageQueue.postRunnable(new LocationController$$ExternalSyntheticLambda8(this, arrayList3, 0));
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda10(9, this, arrayList2, arrayList3, arrayList));
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
        AndroidUtilities.runOnUIThread(new LocationController$$ExternalSyntheticLambda9(this, num, 0));
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
            Utilities.stageQueue.postRunnable(new LocationController$$ExternalSyntheticLambda9(this, num, 1));
        } else {
            if (iIntValue != 2) {
                return;
            }
            Utilities.stageQueue.postRunnable(new LocationController$$ExternalSyntheticLambda1(this, 1));
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
        this.sharingLocationsMapUI.clear();
        stopService();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    public void lambda$removeAllLocationSharings$24() {
        for (int i = 0; i < this.sharingLocations.size(); i++) {
            SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i);
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
            tL_messages_editMessage.id = sharingLocationInfo.mid;
            tL_messages_editMessage.flags |= 16384;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = true;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
            getConnectionsManager().sendRequest(tL_messages_editMessage, new LocationController$$ExternalSyntheticLambda15(this, 1));
        }
        this.sharingLocations.clear();
        this.sharingLocationsMap.clear();
        saveSharingLocation(null, 2);
        stop(true);
        AndroidUtilities.runOnUIThread(new LocationController$$ExternalSyntheticLambda1(this, 3));
    }

    public void lambda$removeSharingLocation$19(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            return;
        }
        getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
    }

    public void lambda$removeSharingLocation$20(SharingLocationInfo sharingLocationInfo) {
        this.sharingLocationsUI.remove(sharingLocationInfo);
        this.sharingLocationsMapUI.remove(sharingLocationInfo.did);
        if (this.sharingLocationsUI.isEmpty()) {
            stopService();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    public void lambda$removeSharingLocation$21(long j) {
        SharingLocationInfo sharingLocationInfo = (SharingLocationInfo) this.sharingLocationsMap.get(j);
        this.sharingLocationsMap.remove(j);
        if (sharingLocationInfo != null) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
            tL_messages_editMessage.id = sharingLocationInfo.mid;
            tL_messages_editMessage.flags |= 16384;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = true;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
            getConnectionsManager().sendRequest(tL_messages_editMessage, new LocationController$$ExternalSyntheticLambda15(this, 0));
            this.sharingLocations.remove(sharingLocationInfo);
            saveSharingLocation(sharingLocationInfo, 1);
            AndroidUtilities.runOnUIThread(new LocationController$$ExternalSyntheticLambda3(2, sharingLocationInfo, this));
            if (this.sharingLocations.isEmpty()) {
                stop(true);
            }
        }
    }

    public void lambda$saveSharingLocation$18(int i, SharingLocationInfo sharingLocationInfo) {
        try {
            if (i == 2) {
                getMessagesStorage().getDatabase().executeFast("DELETE FROM sharing_locations WHERE 1").stepThis().dispose();
                return;
            }
            if (i == 1) {
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$setLastKnownLocation$10() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newLocationAvailable, new Object[0]);
    }

    public void lambda$setProximityLocation$12(int i, long j) {
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE sharing_locations SET proximity = ? WHERE uid = ?");
            sQLitePreparedStatementExecuteFast.requery();
            sQLitePreparedStatementExecuteFast.bindInteger(1, i);
            sQLitePreparedStatementExecuteFast.bindLong(2, j);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$setProximityLocation$13() {
        broadcastLastKnownLocation(true);
    }

    public void lambda$startFusedLocationRequest$5(boolean z) {
        if (!z) {
            this.servicesAvailable = Boolean.FALSE;
        }
        if (this.sharingLocations.isEmpty()) {
            return;
        }
        if (!z) {
            start();
            return;
        }
        try {
            ApplicationLoader.getLocationServiceProvider().getLastLocation(new LocationController$$ExternalSyntheticLambda5(this, 1));
            ApplicationLoader.getLocationServiceProvider().requestLocationUpdates(this.locationRequest, this.fusedLocationListener);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public void lambda$update$8(SharingLocationInfo sharingLocationInfo) {
        this.sharingLocationsUI.remove(sharingLocationInfo);
        this.sharingLocationsMapUI.remove(sharingLocationInfo.did);
        if (this.sharingLocationsUI.isEmpty()) {
            stopService();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    private void loadSharingLocations() {
        getMessagesStorage().getStorageQueue().postRunnable(new LocationController$$ExternalSyntheticLambda1(this, 6));
    }

    private void saveSharingLocation(SharingLocationInfo sharingLocationInfo, int i) {
        getMessagesStorage().getStorageQueue().postRunnable(new FileLoader$$ExternalSyntheticLambda5(this, i, sharingLocationInfo, 5));
    }

    public void setLastKnownLocation(Location location) {
        if (location == null || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.lastKnownLocation = location;
            if (location != null) {
                AndroidUtilities.runOnUIThread(new Emoji$$ExternalSyntheticLambda1(12));
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            this.locationManager.requestLocationUpdates("network", 1L, 0.0f, this.networkLocationListener);
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        try {
            this.locationManager.requestLocationUpdates("passive", 1L, 0.0f, this.passiveLocationListener);
        } catch (Exception e3) {
            FileLog.e(e3);
        }
        if (this.lastKnownLocation == null) {
            try {
                setLastKnownLocation(this.locationManager.getLastKnownLocation("gps"));
                if (this.lastKnownLocation == null) {
                    setLastKnownLocation(this.locationManager.getLastKnownLocation("network"));
                }
            } catch (Exception e4) {
                FileLog.e(e4);
            }
        }
    }

    private void startService() {
        try {
            if (!PermissionRequest.hasPermission("android.permission.ACCESS_COARSE_LOCATION") && !PermissionRequest.hasPermission("android.permission.ACCESS_FINE_LOCATION")) {
                return;
            }
            ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) LocationSharingService.class));
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    private void stop(boolean z) {
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
        if (z) {
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
        sharingLocationInfo.mid = message.id;
        TLRPC.MessageMedia messageMedia = message.media;
        sharingLocationInfo.period = messageMedia.period;
        int i = messageMedia.proximity_notification_radius;
        sharingLocationInfo.proximityMeters = i;
        sharingLocationInfo.lastSentProximityMeters = i;
        int i2 = this.currentAccount;
        sharingLocationInfo.account = i2;
        sharingLocationInfo.messageObject = new MessageObject(i2, message, false, false);
        if (sharingLocationInfo.period == Integer.MAX_VALUE) {
            sharingLocationInfo.stopTime = Integer.MAX_VALUE;
        } else {
            sharingLocationInfo.stopTime = getConnectionsManager().getCurrentTime() + sharingLocationInfo.period;
        }
        SharingLocationInfo sharingLocationInfo2 = (SharingLocationInfo) this.sharingLocationsMap.get(sharingLocationInfo.did);
        this.sharingLocationsMap.put(sharingLocationInfo, sharingLocationInfo.did);
        if (sharingLocationInfo2 != null) {
            this.sharingLocations.remove(sharingLocationInfo2);
        }
        this.sharingLocations.add(sharingLocationInfo);
        saveSharingLocation(sharingLocationInfo, 0);
        this.lastLocationSendTime = SystemClock.elapsedRealtime() - 25000;
        AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda0(this, sharingLocationInfo2, sharingLocationInfo, 25));
    }

    public void cleanup() {
        this.sharingLocationsUI.clear();
        this.sharingLocationsMapUI.clear();
        this.locationsCache.clear();
        this.cacheRequests.clear();
        this.lastReadLocationTime.clear();
        stopService();
        Utilities.stageQueue.postRunnable(new LocationController$$ExternalSyntheticLambda1(this, 5));
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (i == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            Long l = (Long) objArr[0];
            long jLongValue = l.longValue();
            if (isSharingLocation(jLongValue) && (arrayList2 = (ArrayList) this.locationsCache.get(jLongValue)) != null) {
                ArrayList arrayList3 = (ArrayList) objArr[1];
                boolean z = false;
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    MessageObject messageObject = (MessageObject) arrayList3.get(i3);
                    if (messageObject.isLiveLocation()) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList2.size()) {
                                arrayList2.add(messageObject.messageOwner);
                                break;
                            } else {
                                if (MessageObject.getFromChatId((TLRPC.Message) arrayList2.get(i4)) == messageObject.getFromChatId()) {
                                    arrayList2.set(i4, messageObject.messageOwner);
                                    break;
                                }
                                i4++;
                            }
                        }
                        z = true;
                    } else if (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) {
                        long dialogId = messageObject.getDialogId();
                        if (DialogObject.isUserDialog(dialogId)) {
                            setProximityLocation(dialogId, 0, false);
                        }
                    }
                }
                if (z) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, l, Integer.valueOf(this.currentAccount));
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue() || this.sharingLocationsUI.isEmpty()) {
                return;
            }
            ArrayList arrayList4 = (ArrayList) objArr[0];
            long jLongValue2 = ((Long) objArr[1]).longValue();
            ArrayList arrayList5 = null;
            for (int i5 = 0; i5 < this.sharingLocationsUI.size(); i5++) {
                SharingLocationInfo sharingLocationInfo = this.sharingLocationsUI.get(i5);
                MessageObject messageObject2 = sharingLocationInfo.messageObject;
                if (jLongValue2 == (messageObject2 != null ? messageObject2.getChannelId() : 0L) && arrayList4.contains(Integer.valueOf(sharingLocationInfo.mid))) {
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                    }
                    arrayList5.add(Long.valueOf(sharingLocationInfo.did));
                }
            }
            if (arrayList5 != null) {
                for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                    removeSharingLocation(((Long) arrayList5.get(i6)).longValue());
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.replaceMessagesObjects) {
            Long l2 = (Long) objArr[0];
            long jLongValue3 = l2.longValue();
            if (isSharingLocation(jLongValue3) && (arrayList = (ArrayList) this.locationsCache.get(jLongValue3)) != null) {
                ArrayList arrayList6 = (ArrayList) objArr[1];
                boolean z2 = false;
                for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                    MessageObject messageObject3 = (MessageObject) arrayList6.get(i7);
                    for (int i8 = 0; i8 < arrayList.size(); i8++) {
                        if (MessageObject.getFromChatId((TLRPC.Message) arrayList.get(i8)) == messageObject3.getFromChatId()) {
                            if (messageObject3.isLiveLocation()) {
                                arrayList.set(i8, messageObject3.messageOwner);
                            } else {
                                arrayList.remove(i8);
                            }
                            z2 = true;
                            break;
                        }
                    }
                }
                if (z2) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, l2, Integer.valueOf(this.currentAccount));
                }
            }
        }
    }

    public Location getLastKnownLocation() {
        return this.lastKnownLocation;
    }

    public SharingLocationInfo getSharingLocationInfo(long j) {
        return (SharingLocationInfo) this.sharingLocationsMapUI.get(j);
    }

    public boolean isSharingLocation(long j) {
        return this.sharingLocationsMapUI.indexOfKey(j) >= 0;
    }

    public void loadLiveLocations(long j) {
        if (this.cacheRequests.indexOfKey(j) >= 0) {
            return;
        }
        this.cacheRequests.put(Boolean.TRUE, j);
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(j);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new SecretChatHelper$$ExternalSyntheticLambda29(this, j, 2));
    }

    public void markLiveLoactionsAsRead(long j) {
        ArrayList arrayList;
        ?? tL_messages_readMessageContents;
        int size;
        if (DialogObject.isEncryptedDialog(j) || (arrayList = (ArrayList) this.locationsCache.get(j)) == null || arrayList.isEmpty()) {
            return;
        }
        Integer num = (Integer) this.lastReadLocationTime.get(j);
        int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (num == null || num.intValue() + 60 <= iElapsedRealtime) {
            this.lastReadLocationTime.put(Integer.valueOf(iElapsedRealtime), j);
            int iM = 0;
            if (DialogObject.isChatDialog(j)) {
                long j2 = -j;
                if (ChatObject.isChannel(j2, this.currentAccount)) {
                    tL_messages_readMessageContents = new TLRPC.TL_channels_readMessageContents();
                    int size2 = arrayList.size();
                    while (iM < size2) {
                        iM = LocationController$$ExternalSyntheticOutline0.m(((TLRPC.Message) arrayList.get(iM)).id, iM, 1, tL_messages_readMessageContents.id);
                    }
                    tL_messages_readMessageContents.channel = getMessagesController().getInputChannel(j2);
                } else {
                    tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
                    size = arrayList.size();
                    while (iM < size) {
                        iM = LocationController$$ExternalSyntheticOutline0.m(((TLRPC.Message) arrayList.get(iM)).id, iM, 1, tL_messages_readMessageContents.id);
                    }
                }
            } else {
                tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
                size = arrayList.size();
                while (iM < size) {
                    iM = LocationController$$ExternalSyntheticOutline0.m(((TLRPC.Message) arrayList.get(iM)).id, iM, 1, tL_messages_readMessageContents.id);
                }
            }
            getConnectionsManager().sendRequest(tL_messages_readMessageContents, new LocationController$$ExternalSyntheticLambda15(this, 2));
        }
    }

    @Override
    public void onConnected(Bundle bundle) {
        this.wasConnectedToPlayServices = true;
        try {
            ApplicationLoader.getLocationServiceProvider().checkLocationSettings(this.locationRequest, new LocationController$$ExternalSyntheticLambda5(this, 0));
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

    @Override
    public void onConnectionSuspended(int i) {
    }

    public void removeAllLocationSharings() {
        Utilities.stageQueue.postRunnable(new LocationController$$ExternalSyntheticLambda1(this, 4));
    }

    public void removeSharingLocation(long j) {
        Utilities.stageQueue.postRunnable(new RichEditor$$ExternalSyntheticLambda48(this, j, 3));
    }

    public void setMapLocation(Location location, boolean z) {
        Location location2;
        if (location == null) {
            return;
        }
        this.lastLocationByMaps = true;
        if (z || ((location2 = this.lastKnownLocation) != null && location2.distanceTo(location) >= 20.0f)) {
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

    public boolean setProximityLocation(long j, int i, boolean z) {
        SharingLocationInfo sharingLocationInfo = (SharingLocationInfo) this.sharingLocationsMapUI.get(j);
        if (sharingLocationInfo != null) {
            sharingLocationInfo.proximityMeters = i;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new ChatMessageCell$$ExternalSyntheticLambda7(this, i, j, 1));
        if (z) {
            Utilities.stageQueue.postRunnable(new LocationController$$ExternalSyntheticLambda1(this, 0));
        }
        return sharingLocationInfo != null;
    }

    public void startFusedLocationRequest(boolean z) {
        Utilities.stageQueue.postRunnable(new FileLoader$$ExternalSyntheticLambda1(this, z, 3));
    }

    public void update() {
        getUserConfig();
        if (!this.sharingLocations.isEmpty()) {
            int i = 0;
            while (i < this.sharingLocations.size()) {
                SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i);
                if (sharingLocationInfo.stopTime <= getConnectionsManager().getCurrentTime()) {
                    this.sharingLocations.remove(i);
                    this.sharingLocationsMap.remove(sharingLocationInfo.did);
                    saveSharingLocation(sharingLocationInfo, 1);
                    AndroidUtilities.runOnUIThread(new LocationController$$ExternalSyntheticLambda3(0, sharingLocationInfo, this));
                    i--;
                }
                i++;
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
            boolean z = SystemClock.elapsedRealtime() - this.lastLocationSendTime > 2000;
            this.lastLocationStartTime = jElapsedRealtime;
            this.lastLocationSendTime = SystemClock.elapsedRealtime();
            broadcastLastKnownLocation(z);
        }
    }

    public static void fetchLocationAddress(Location location, int i, LocationFetchCallback locationFetchCallback) {
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
        GiftSheet$$ExternalSyntheticLambda15 giftSheet$$ExternalSyntheticLambda15 = new GiftSheet$$ExternalSyntheticLambda15(locale, location, i, locale2, locationFetchCallback, 1);
        dispatchQueue.postRunnable(giftSheet$$ExternalSyntheticLambda15, 300L);
        callbacks.put(locationFetchCallback, giftSheet$$ExternalSyntheticLambda15);
    }
}
