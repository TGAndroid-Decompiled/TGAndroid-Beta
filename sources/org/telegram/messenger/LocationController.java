package org.telegram.messenger;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.LongSparseArray;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$GeoPoint;
import org.telegram.tgnet.TLRPC$InputGeoPoint;
import org.telegram.tgnet.TLRPC$InputMedia;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$TL_channels_readMessageContents;
import org.telegram.tgnet.TLRPC$TL_contacts_getLocated;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputGeoPoint;
import org.telegram.tgnet.TLRPC$TL_inputGeoPointEmpty;
import org.telegram.tgnet.TLRPC$TL_inputMediaGeoLive;
import org.telegram.tgnet.TLRPC$TL_messageActionGeoProximityReached;
import org.telegram.tgnet.TLRPC$TL_messageMediaGeoLive;
import org.telegram.tgnet.TLRPC$TL_messages_affectedMessages;
import org.telegram.tgnet.TLRPC$TL_messages_editMessage;
import org.telegram.tgnet.TLRPC$TL_messages_getRecentLocations;
import org.telegram.tgnet.TLRPC$TL_messages_readMessageContents;
import org.telegram.tgnet.TLRPC$TL_peerLocated;
import org.telegram.tgnet.TLRPC$TL_updateEditChannelMessage;
import org.telegram.tgnet.TLRPC$TL_updateEditMessage;
import org.telegram.tgnet.TLRPC$Update;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$messages_Messages;

@SuppressLint({"MissingPermission"})
public class LocationController extends BaseController implements NotificationCenter.NotificationCenterDelegate, ILocationServiceProvider.IAPIConnectionCallbacks, ILocationServiceProvider.IAPIOnConnectionFailedListener {
    private static final int BACKGROUD_UPDATE_TIME = 30000;
    private static final long FASTEST_INTERVAL = 1000;
    private static final int FOREGROUND_UPDATE_TIME = 20000;
    private static final int LOCATION_ACQUIRE_TIME = 10000;
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private static final int SEND_NEW_LOCATION_TIME = 2000;
    private static final long UPDATE_INTERVAL = 1000;
    private static final int WATCH_LOCATION_TIMEOUT = 65000;
    private ILocationServiceProvider.IMapApiClient apiClient;
    private LongSparseArray<Boolean> cacheRequests;
    private ArrayList<TLRPC$TL_peerLocated> cachedNearbyChats;
    private ArrayList<TLRPC$TL_peerLocated> cachedNearbyUsers;
    private FusedLocationListener fusedLocationListener;
    private GpsLocationListener gpsLocationListener;
    private Location lastKnownLocation;
    private boolean lastLocationByMaps;
    private long lastLocationSendTime;
    private long lastLocationStartTime;
    private LongSparseArray<Integer> lastReadLocationTime;
    private long locationEndWatchTime;
    private LocationManager locationManager;
    private ILocationServiceProvider.ILocationRequest locationRequest;
    private boolean locationSentSinceLastMapUpdate;
    public LongSparseArray<ArrayList<TLRPC$Message>> locationsCache;
    private boolean lookingForPeopleNearby;
    private GpsLocationListener networkLocationListener;
    private GpsLocationListener passiveLocationListener;
    private SparseIntArray requests;
    private Boolean servicesAvailable;
    private boolean shareMyCurrentLocation;
    private ArrayList<SharingLocationInfo> sharingLocations;
    private LongSparseArray<SharingLocationInfo> sharingLocationsMap;
    private LongSparseArray<SharingLocationInfo> sharingLocationsMapUI;
    public ArrayList<SharingLocationInfo> sharingLocationsUI;
    private boolean started;
    private boolean wasConnectedToPlayServices;
    private static volatile LocationController[] Instance = new LocationController[4];
    private static HashMap<LocationFetchCallback, Runnable> callbacks = new HashMap<>();

    public interface LocationFetchCallback {
        void onLocationAddressAvailable(String str, String str2, Location location);
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

    public static void lambda$broadcastLastKnownLocation$8(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    @Override
    public void onConnectionSuspended(int i) {
    }

    public static LocationController getInstance(int i) {
        LocationController locationController = Instance[i];
        if (locationController == null) {
            synchronized (LocationController.class) {
                locationController = Instance[i];
                if (locationController == null) {
                    LocationController[] locationControllerArr = Instance;
                    LocationController locationController2 = new LocationController(i);
                    locationControllerArr[i] = locationController2;
                    locationController = locationController2;
                }
            }
        }
        return locationController;
    }

    public class GpsLocationListener implements LocationListener {
        @Override
        public void onProviderDisabled(String str) {
        }

        @Override
        public void onProviderEnabled(String str) {
        }

        @Override
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }

        private GpsLocationListener() {
        }

        @Override
        public void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }
            if (LocationController.this.lastKnownLocation == null || (this != LocationController.this.networkLocationListener && this != LocationController.this.passiveLocationListener)) {
                LocationController.this.setLastKnownLocation(location);
            } else if (LocationController.this.started || location.distanceTo(LocationController.this.lastKnownLocation) <= 20.0f) {
            } else {
                LocationController.this.setLastKnownLocation(location);
                LocationController.this.lastLocationSendTime = (SystemClock.elapsedRealtime() - 30000) + 5000;
            }
        }
    }

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

    public LocationController(int i) {
        super(i);
        this.sharingLocationsMap = new LongSparseArray<>();
        this.sharingLocations = new ArrayList<>();
        this.locationsCache = new LongSparseArray<>();
        this.lastReadLocationTime = new LongSparseArray<>();
        this.gpsLocationListener = new GpsLocationListener();
        this.networkLocationListener = new GpsLocationListener();
        this.passiveLocationListener = new GpsLocationListener();
        this.fusedLocationListener = new FusedLocationListener();
        this.locationSentSinceLastMapUpdate = true;
        this.requests = new SparseIntArray();
        this.cacheRequests = new LongSparseArray<>();
        this.sharingLocationsUI = new ArrayList<>();
        this.sharingLocationsMapUI = new LongSparseArray<>();
        this.cachedNearbyUsers = new ArrayList<>();
        this.cachedNearbyChats = new ArrayList<>();
        this.locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        this.apiClient = ApplicationLoader.getLocationServiceProvider().onCreateLocationServicesAPI(ApplicationLoader.applicationContext, this, this);
        ILocationServiceProvider.ILocationRequest onCreateLocationRequest = ApplicationLoader.getLocationServiceProvider().onCreateLocationRequest();
        this.locationRequest = onCreateLocationRequest;
        onCreateLocationRequest.setPriority(0);
        this.locationRequest.setInterval(1000L);
        this.locationRequest.setFastestInterval(1000L);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LocationController.this.lambda$new$0();
            }
        });
        loadSharingLocations();
    }

    public void lambda$new$0() {
        LocationController locationController = getAccountInstance().getLocationController();
        getNotificationCenter().addObserver(locationController, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(locationController, NotificationCenter.messagesDeleted);
        getNotificationCenter().addObserver(locationController, NotificationCenter.replaceMessagesObjects);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList<TLRPC$Message> arrayList;
        ArrayList<TLRPC$Message> arrayList2;
        boolean z;
        if (i == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long longValue = ((Long) objArr[0]).longValue();
            if (isSharingLocation(longValue) && (arrayList2 = this.locationsCache.get(longValue)) != null) {
                ArrayList arrayList3 = (ArrayList) objArr[1];
                boolean z2 = false;
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    MessageObject messageObject = (MessageObject) arrayList3.get(i3);
                    if (messageObject.isLiveLocation()) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList2.size()) {
                                z = false;
                                break;
                            } else if (MessageObject.getFromChatId(arrayList2.get(i4)) == messageObject.getFromChatId()) {
                                arrayList2.set(i4, messageObject.messageOwner);
                                z = true;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (!z) {
                            arrayList2.add(messageObject.messageOwner);
                        }
                        z2 = true;
                    } else if (messageObject.messageOwner.action instanceof TLRPC$TL_messageActionGeoProximityReached) {
                        long dialogId = messageObject.getDialogId();
                        if (DialogObject.isUserDialog(dialogId)) {
                            setProximityLocation(dialogId, 0, false);
                        }
                    }
                }
                if (z2) {
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(longValue), Integer.valueOf(this.currentAccount));
                }
            }
        } else if (i == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue() || this.sharingLocationsUI.isEmpty()) {
                return;
            }
            ArrayList arrayList4 = (ArrayList) objArr[0];
            long longValue2 = ((Long) objArr[1]).longValue();
            ArrayList arrayList5 = null;
            for (int i5 = 0; i5 < this.sharingLocationsUI.size(); i5++) {
                SharingLocationInfo sharingLocationInfo = this.sharingLocationsUI.get(i5);
                MessageObject messageObject2 = sharingLocationInfo.messageObject;
                if (longValue2 == (messageObject2 != null ? messageObject2.getChannelId() : 0L) && arrayList4.contains(Integer.valueOf(sharingLocationInfo.mid))) {
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
            }
        } else if (i == NotificationCenter.replaceMessagesObjects) {
            long longValue3 = ((Long) objArr[0]).longValue();
            if (isSharingLocation(longValue3) && (arrayList = this.locationsCache.get(longValue3)) != null) {
                ArrayList arrayList6 = (ArrayList) objArr[1];
                boolean z3 = false;
                for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                    MessageObject messageObject3 = (MessageObject) arrayList6.get(i7);
                    int i8 = 0;
                    while (true) {
                        if (i8 >= arrayList.size()) {
                            break;
                        } else if (MessageObject.getFromChatId(arrayList.get(i8)) == messageObject3.getFromChatId()) {
                            if (!messageObject3.isLiveLocation()) {
                                arrayList.remove(i8);
                            } else {
                                arrayList.set(i8, messageObject3.messageOwner);
                            }
                            z3 = true;
                        } else {
                            i8++;
                        }
                    }
                }
                if (z3) {
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(longValue3), Integer.valueOf(this.currentAccount));
                }
            }
        }
    }

    @Override
    public void onConnected(Bundle bundle) {
        this.wasConnectedToPlayServices = true;
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                ApplicationLoader.getLocationServiceProvider().checkLocationSettings(this.locationRequest, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        LocationController.this.lambda$onConnected$4((Integer) obj);
                    }
                });
            } else {
                startFusedLocationRequest(true);
            }
        } catch (Throwable th) {
            FileLog.m31e(th);
        }
    }

    public void lambda$onConnected$4(final Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            startFusedLocationRequest(true);
        } else if (intValue == 1) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    LocationController.this.lambda$onConnected$2(num);
                }
            });
        } else if (intValue != 2) {
        } else {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    LocationController.this.lambda$onConnected$3();
                }
            });
        }
    }

    public void lambda$onConnected$2(final Integer num) {
        if (this.lookingForPeopleNearby || !this.sharingLocations.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LocationController.this.lambda$onConnected$1(num);
                }
            });
        }
    }

    public void lambda$onConnected$1(Integer num) {
        getNotificationCenter().postNotificationName(NotificationCenter.needShowPlayServicesAlert, num);
    }

    public void lambda$onConnected$3() {
        this.servicesAvailable = Boolean.FALSE;
        try {
            this.apiClient.disconnect();
            start();
        } catch (Throwable unused) {
        }
    }

    public void startFusedLocationRequest(final boolean z) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                LocationController.this.lambda$startFusedLocationRequest$5(z);
            }
        });
    }

    public void lambda$startFusedLocationRequest$5(boolean z) {
        if (!z) {
            this.servicesAvailable = Boolean.FALSE;
        }
        if (this.shareMyCurrentLocation || this.lookingForPeopleNearby || !this.sharingLocations.isEmpty()) {
            if (z) {
                try {
                    ApplicationLoader.getLocationServiceProvider().getLastLocation(new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            LocationController.this.setLastKnownLocation((Location) obj);
                        }
                    });
                    ApplicationLoader.getLocationServiceProvider().requestLocationUpdates(this.locationRequest, this.fusedLocationListener);
                    return;
                } catch (Throwable th) {
                    FileLog.m31e(th);
                    return;
                }
            }
            start();
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

    private boolean checkServices() {
        if (this.servicesAvailable == null) {
            this.servicesAvailable = Boolean.valueOf(ApplicationLoader.getLocationServiceProvider().checkServices());
        }
        return this.servicesAvailable.booleanValue();
    }

    private void broadcastLastKnownLocation(boolean z) {
        int i;
        TLRPC$GeoPoint tLRPC$GeoPoint;
        if (this.lastKnownLocation == null) {
            return;
        }
        if (this.requests.size() != 0) {
            if (z) {
                for (int i2 = 0; i2 < this.requests.size(); i2++) {
                    getConnectionsManager().cancelRequest(this.requests.keyAt(i2), false);
                }
            }
            this.requests.clear();
        }
        if (!this.sharingLocations.isEmpty()) {
            int currentTime = getConnectionsManager().getCurrentTime();
            float[] fArr = new float[1];
            while (i < this.sharingLocations.size()) {
                final SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i);
                TLRPC$Message tLRPC$Message = sharingLocationInfo.messageObject.messageOwner;
                TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
                if (tLRPC$MessageMedia != null && (tLRPC$GeoPoint = tLRPC$MessageMedia.geo) != null && sharingLocationInfo.lastSentProximityMeters == sharingLocationInfo.proximityMeters) {
                    int i3 = tLRPC$Message.edit_date;
                    if (i3 == 0) {
                        i3 = tLRPC$Message.date;
                    }
                    if (Math.abs(currentTime - i3) < 10) {
                        Location.distanceBetween(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long, this.lastKnownLocation.getLatitude(), this.lastKnownLocation.getLongitude(), fArr);
                        i = fArr[0] < 1.0f ? i + 1 : 0;
                    }
                }
                final TLRPC$TL_messages_editMessage tLRPC$TL_messages_editMessage = new TLRPC$TL_messages_editMessage();
                tLRPC$TL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
                tLRPC$TL_messages_editMessage.f940id = sharingLocationInfo.mid;
                tLRPC$TL_messages_editMessage.flags |= 16384;
                TLRPC$TL_inputMediaGeoLive tLRPC$TL_inputMediaGeoLive = new TLRPC$TL_inputMediaGeoLive();
                tLRPC$TL_messages_editMessage.media = tLRPC$TL_inputMediaGeoLive;
                tLRPC$TL_inputMediaGeoLive.stopped = false;
                tLRPC$TL_inputMediaGeoLive.geo_point = new TLRPC$TL_inputGeoPoint();
                tLRPC$TL_messages_editMessage.media.geo_point.lat = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLatitude());
                tLRPC$TL_messages_editMessage.media.geo_point._long = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLongitude());
                tLRPC$TL_messages_editMessage.media.geo_point.accuracy_radius = (int) this.lastKnownLocation.getAccuracy();
                TLRPC$InputMedia tLRPC$InputMedia = tLRPC$TL_messages_editMessage.media;
                TLRPC$InputGeoPoint tLRPC$InputGeoPoint = tLRPC$InputMedia.geo_point;
                if (tLRPC$InputGeoPoint.accuracy_radius != 0) {
                    tLRPC$InputGeoPoint.flags |= 1;
                }
                int i4 = sharingLocationInfo.lastSentProximityMeters;
                int i5 = sharingLocationInfo.proximityMeters;
                if (i4 != i5) {
                    tLRPC$InputMedia.proximity_notification_radius = i5;
                    tLRPC$InputMedia.flags |= 8;
                }
                tLRPC$InputMedia.heading = getHeading(this.lastKnownLocation);
                tLRPC$TL_messages_editMessage.media.flags |= 4;
                final int[] iArr = {getConnectionsManager().sendRequest(tLRPC$TL_messages_editMessage, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        LocationController.this.lambda$broadcastLastKnownLocation$7(sharingLocationInfo, iArr, tLRPC$TL_messages_editMessage, tLObject, tLRPC$TL_error);
                    }
                })};
                this.requests.put(iArr[0], 0);
            }
        }
        if (this.shareMyCurrentLocation) {
            UserConfig userConfig = getUserConfig();
            userConfig.lastMyLocationShareTime = (int) (System.currentTimeMillis() / 1000);
            userConfig.saveConfig(false);
            TLRPC$TL_contacts_getLocated tLRPC$TL_contacts_getLocated = new TLRPC$TL_contacts_getLocated();
            TLRPC$TL_inputGeoPoint tLRPC$TL_inputGeoPoint = new TLRPC$TL_inputGeoPoint();
            tLRPC$TL_contacts_getLocated.geo_point = tLRPC$TL_inputGeoPoint;
            tLRPC$TL_inputGeoPoint.lat = this.lastKnownLocation.getLatitude();
            tLRPC$TL_contacts_getLocated.geo_point._long = this.lastKnownLocation.getLongitude();
            tLRPC$TL_contacts_getLocated.background = true;
            getConnectionsManager().sendRequest(tLRPC$TL_contacts_getLocated, LocationController$$ExternalSyntheticLambda32.INSTANCE);
        }
        getConnectionsManager().resumeNetworkMaybe();
        if (shouldStopGps() || this.shareMyCurrentLocation) {
            this.shareMyCurrentLocation = false;
            stop(false);
        }
    }

    public void lambda$broadcastLastKnownLocation$7(final SharingLocationInfo sharingLocationInfo, int[] iArr, TLRPC$TL_messages_editMessage tLRPC$TL_messages_editMessage, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            if (tLRPC$TL_error.text.equals("MESSAGE_ID_INVALID")) {
                this.sharingLocations.remove(sharingLocationInfo);
                this.sharingLocationsMap.remove(sharingLocationInfo.did);
                saveSharingLocation(sharingLocationInfo, 1);
                this.requests.delete(iArr[0]);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        LocationController.this.lambda$broadcastLastKnownLocation$6(sharingLocationInfo);
                    }
                });
                return;
            }
            return;
        }
        if ((tLRPC$TL_messages_editMessage.flags & 8) != 0) {
            sharingLocationInfo.lastSentProximityMeters = tLRPC$TL_messages_editMessage.media.proximity_notification_radius;
        }
        TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
        boolean z = false;
        for (int i = 0; i < tLRPC$Updates.updates.size(); i++) {
            TLRPC$Update tLRPC$Update = tLRPC$Updates.updates.get(i);
            if (tLRPC$Update instanceof TLRPC$TL_updateEditMessage) {
                sharingLocationInfo.messageObject.messageOwner = ((TLRPC$TL_updateEditMessage) tLRPC$Update).message;
            } else if (tLRPC$Update instanceof TLRPC$TL_updateEditChannelMessage) {
                sharingLocationInfo.messageObject.messageOwner = ((TLRPC$TL_updateEditChannelMessage) tLRPC$Update).message;
            }
            z = true;
        }
        if (z) {
            saveSharingLocation(sharingLocationInfo, 0);
        }
        getMessagesController().processUpdates(tLRPC$Updates, false);
    }

    public void lambda$broadcastLastKnownLocation$6(SharingLocationInfo sharingLocationInfo) {
        this.sharingLocationsUI.remove(sharingLocationInfo);
        this.sharingLocationsMapUI.remove(sharingLocationInfo.did);
        if (this.sharingLocationsUI.isEmpty()) {
            stopService();
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    private boolean shouldStopGps() {
        return SystemClock.elapsedRealtime() > this.locationEndWatchTime;
    }

    public void setNewLocationEndWatchTime() {
        if (this.sharingLocations.isEmpty()) {
            return;
        }
        this.locationEndWatchTime = SystemClock.elapsedRealtime() + 65000;
        start();
    }

    public void update() {
        UserConfig userConfig = getUserConfig();
        if (ApplicationLoader.isScreenOn && !ApplicationLoader.mainInterfacePaused && !this.shareMyCurrentLocation && userConfig.isClientActivated() && userConfig.isConfigLoaded() && userConfig.sharingMyLocationUntil != 0 && Math.abs((System.currentTimeMillis() / 1000) - userConfig.lastMyLocationShareTime) >= 3600) {
            this.shareMyCurrentLocation = true;
        }
        if (!this.sharingLocations.isEmpty()) {
            int i = 0;
            while (i < this.sharingLocations.size()) {
                final SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i);
                if (sharingLocationInfo.stopTime <= getConnectionsManager().getCurrentTime()) {
                    this.sharingLocations.remove(i);
                    this.sharingLocationsMap.remove(sharingLocationInfo.did);
                    saveSharingLocation(sharingLocationInfo, 1);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            LocationController.this.lambda$update$9(sharingLocationInfo);
                        }
                    });
                    i--;
                }
                i++;
            }
        }
        if (this.started) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.lastLocationByMaps || Math.abs(this.lastLocationStartTime - elapsedRealtime) > 10000 || shouldSendLocationNow()) {
                this.lastLocationByMaps = false;
                this.locationSentSinceLastMapUpdate = true;
                boolean z = SystemClock.elapsedRealtime() - this.lastLocationSendTime > 2000;
                this.lastLocationStartTime = elapsedRealtime;
                this.lastLocationSendTime = SystemClock.elapsedRealtime();
                broadcastLastKnownLocation(z);
            }
        } else if (!this.sharingLocations.isEmpty() || this.shareMyCurrentLocation) {
            if (this.shareMyCurrentLocation || Math.abs(this.lastLocationSendTime - SystemClock.elapsedRealtime()) > 30000) {
                this.lastLocationStartTime = SystemClock.elapsedRealtime();
                start();
            }
        }
    }

    public void lambda$update$9(SharingLocationInfo sharingLocationInfo) {
        this.sharingLocationsUI.remove(sharingLocationInfo);
        this.sharingLocationsMapUI.remove(sharingLocationInfo.did);
        if (this.sharingLocationsUI.isEmpty()) {
            stopService();
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    private boolean shouldSendLocationNow() {
        return shouldStopGps() && Math.abs(this.lastLocationSendTime - SystemClock.elapsedRealtime()) >= 2000;
    }

    public void cleanup() {
        this.sharingLocationsUI.clear();
        this.sharingLocationsMapUI.clear();
        this.locationsCache.clear();
        this.cacheRequests.clear();
        this.cachedNearbyUsers.clear();
        this.cachedNearbyChats.clear();
        this.lastReadLocationTime.clear();
        stopService();
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                LocationController.this.lambda$cleanup$10();
            }
        });
    }

    public void lambda$cleanup$10() {
        this.locationEndWatchTime = 0L;
        this.requests.clear();
        this.sharingLocationsMap.clear();
        this.sharingLocations.clear();
        setLastKnownLocation(null);
        stop(true);
    }

    public void setLastKnownLocation(Location location) {
        if (location == null || Build.VERSION.SDK_INT < 17 || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.lastKnownLocation = location;
            if (location != null) {
                AndroidUtilities.runOnUIThread(LocationController$$ExternalSyntheticLambda26.INSTANCE);
            }
        }
    }

    public static void lambda$setLastKnownLocation$11() {
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.newLocationAvailable, new Object[0]);
    }

    public void setCachedNearbyUsersAndChats(ArrayList<TLRPC$TL_peerLocated> arrayList, ArrayList<TLRPC$TL_peerLocated> arrayList2) {
        this.cachedNearbyUsers = new ArrayList<>(arrayList);
        this.cachedNearbyChats = new ArrayList<>(arrayList2);
    }

    public ArrayList<TLRPC$TL_peerLocated> getCachedNearbyUsers() {
        return this.cachedNearbyUsers;
    }

    public ArrayList<TLRPC$TL_peerLocated> getCachedNearbyChats() {
        return this.cachedNearbyChats;
    }

    public void addSharingLocation(TLRPC$Message tLRPC$Message) {
        final SharingLocationInfo sharingLocationInfo = new SharingLocationInfo();
        sharingLocationInfo.did = tLRPC$Message.dialog_id;
        sharingLocationInfo.mid = tLRPC$Message.f881id;
        TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
        sharingLocationInfo.period = tLRPC$MessageMedia.period;
        int i = tLRPC$MessageMedia.proximity_notification_radius;
        sharingLocationInfo.proximityMeters = i;
        sharingLocationInfo.lastSentProximityMeters = i;
        sharingLocationInfo.account = this.currentAccount;
        sharingLocationInfo.messageObject = new MessageObject(this.currentAccount, tLRPC$Message, false, false);
        sharingLocationInfo.stopTime = getConnectionsManager().getCurrentTime() + sharingLocationInfo.period;
        final SharingLocationInfo sharingLocationInfo2 = this.sharingLocationsMap.get(sharingLocationInfo.did);
        this.sharingLocationsMap.put(sharingLocationInfo.did, sharingLocationInfo);
        if (sharingLocationInfo2 != null) {
            this.sharingLocations.remove(sharingLocationInfo2);
        }
        this.sharingLocations.add(sharingLocationInfo);
        saveSharingLocation(sharingLocationInfo, 0);
        this.lastLocationSendTime = (SystemClock.elapsedRealtime() - 30000) + 5000;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LocationController.this.lambda$addSharingLocation$12(sharingLocationInfo2, sharingLocationInfo);
            }
        });
    }

    public void lambda$addSharingLocation$12(SharingLocationInfo sharingLocationInfo, SharingLocationInfo sharingLocationInfo2) {
        if (sharingLocationInfo != null) {
            this.sharingLocationsUI.remove(sharingLocationInfo);
        }
        this.sharingLocationsUI.add(sharingLocationInfo2);
        this.sharingLocationsMapUI.put(sharingLocationInfo2.did, sharingLocationInfo2);
        startService();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    public boolean isSharingLocation(long j) {
        return this.sharingLocationsMapUI.indexOfKey(j) >= 0;
    }

    public SharingLocationInfo getSharingLocationInfo(long j) {
        return this.sharingLocationsMapUI.get(j);
    }

    public boolean setProximityLocation(final long j, final int i, boolean z) {
        SharingLocationInfo sharingLocationInfo = this.sharingLocationsMapUI.get(j);
        if (sharingLocationInfo != null) {
            sharingLocationInfo.proximityMeters = i;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                LocationController.this.lambda$setProximityLocation$13(i, j);
            }
        });
        if (z) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    LocationController.this.lambda$setProximityLocation$14();
                }
            });
        }
        return sharingLocationInfo != null;
    }

    public void lambda$setProximityLocation$13(int i, long j) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE sharing_locations SET proximity = ? WHERE uid = ?");
            executeFast.requery();
            executeFast.bindInteger(1, i);
            executeFast.bindLong(2, j);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.m31e(e);
        }
    }

    public void lambda$setProximityLocation$14() {
        broadcastLastKnownLocation(true);
    }

    public static int getHeading(Location location) {
        float bearing = location.getBearing();
        return (bearing <= 0.0f || bearing >= 1.0f) ? (int) bearing : bearing < 0.5f ? 360 : 1;
    }

    private void loadSharingLocations() {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                LocationController.this.lambda$loadSharingLocations$18();
            }
        });
    }

    public void lambda$loadSharingLocations$18() {
        final ArrayList arrayList = new ArrayList();
        final ArrayList<TLRPC$User> arrayList2 = new ArrayList<>();
        final ArrayList<TLRPC$Chat> arrayList3 = new ArrayList<>();
        try {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
            while (queryFinalized.next()) {
                SharingLocationInfo sharingLocationInfo = new SharingLocationInfo();
                sharingLocationInfo.did = queryFinalized.longValue(0);
                sharingLocationInfo.mid = queryFinalized.intValue(1);
                sharingLocationInfo.stopTime = queryFinalized.intValue(2);
                sharingLocationInfo.period = queryFinalized.intValue(3);
                sharingLocationInfo.proximityMeters = queryFinalized.intValue(5);
                sharingLocationInfo.account = this.currentAccount;
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                if (byteBufferValue != null) {
                    MessageObject messageObject = new MessageObject(this.currentAccount, TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                    sharingLocationInfo.messageObject = messageObject;
                    MessagesStorage.addUsersAndChatsFromMessage(messageObject.messageOwner, arrayList4, arrayList5, null);
                    byteBufferValue.reuse();
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
            queryFinalized.dispose();
            if (!arrayList5.isEmpty()) {
                getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList5), arrayList3);
            }
            if (!arrayList4.isEmpty()) {
                getMessagesStorage().getUsersInternal(TextUtils.join(",", arrayList4), arrayList2);
            }
        } catch (Exception e) {
            FileLog.m31e(e);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LocationController.this.lambda$loadSharingLocations$17(arrayList2, arrayList3, arrayList);
            }
        });
    }

    public void lambda$loadSharingLocations$17(ArrayList arrayList, ArrayList arrayList2, final ArrayList arrayList3) {
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                LocationController.this.lambda$loadSharingLocations$16(arrayList3);
            }
        });
    }

    public void lambda$loadSharingLocations$16(final ArrayList arrayList) {
        this.sharingLocations.addAll(arrayList);
        for (int i = 0; i < this.sharingLocations.size(); i++) {
            SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i);
            this.sharingLocationsMap.put(sharingLocationInfo.did, sharingLocationInfo);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LocationController.this.lambda$loadSharingLocations$15(arrayList);
            }
        });
    }

    public void lambda$loadSharingLocations$15(ArrayList arrayList) {
        this.sharingLocationsUI.addAll(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            SharingLocationInfo sharingLocationInfo = (SharingLocationInfo) arrayList.get(i);
            this.sharingLocationsMapUI.put(sharingLocationInfo.did, sharingLocationInfo);
        }
        startService();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    private void saveSharingLocation(final SharingLocationInfo sharingLocationInfo, final int i) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                LocationController.this.lambda$saveSharingLocation$19(i, sharingLocationInfo);
            }
        });
    }

    public void lambda$saveSharingLocation$19(int i, SharingLocationInfo sharingLocationInfo) {
        try {
            if (i == 2) {
                getMessagesStorage().getDatabase().executeFast("DELETE FROM sharing_locations WHERE 1").stepThis().dispose();
            } else if (i == 1) {
                if (sharingLocationInfo == null) {
                    return;
                }
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                database.executeFast("DELETE FROM sharing_locations WHERE uid = " + sharingLocationInfo.did).stepThis().dispose();
            } else if (sharingLocationInfo == null) {
            } else {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO sharing_locations VALUES(?, ?, ?, ?, ?, ?)");
                executeFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(sharingLocationInfo.messageObject.messageOwner.getObjectSize());
                sharingLocationInfo.messageObject.messageOwner.serializeToStream(nativeByteBuffer);
                executeFast.bindLong(1, sharingLocationInfo.did);
                executeFast.bindInteger(2, sharingLocationInfo.mid);
                executeFast.bindInteger(3, sharingLocationInfo.stopTime);
                executeFast.bindInteger(4, sharingLocationInfo.period);
                executeFast.bindByteBuffer(5, nativeByteBuffer);
                executeFast.bindInteger(6, sharingLocationInfo.proximityMeters);
                executeFast.step();
                executeFast.dispose();
                nativeByteBuffer.reuse();
            }
        } catch (Exception e) {
            FileLog.m31e(e);
        }
    }

    public void removeSharingLocation(final long j) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                LocationController.this.lambda$removeSharingLocation$22(j);
            }
        });
    }

    public void lambda$removeSharingLocation$22(long j) {
        final SharingLocationInfo sharingLocationInfo = this.sharingLocationsMap.get(j);
        this.sharingLocationsMap.remove(j);
        if (sharingLocationInfo != null) {
            TLRPC$TL_messages_editMessage tLRPC$TL_messages_editMessage = new TLRPC$TL_messages_editMessage();
            tLRPC$TL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
            tLRPC$TL_messages_editMessage.f940id = sharingLocationInfo.mid;
            tLRPC$TL_messages_editMessage.flags |= 16384;
            TLRPC$TL_inputMediaGeoLive tLRPC$TL_inputMediaGeoLive = new TLRPC$TL_inputMediaGeoLive();
            tLRPC$TL_messages_editMessage.media = tLRPC$TL_inputMediaGeoLive;
            tLRPC$TL_inputMediaGeoLive.stopped = true;
            tLRPC$TL_inputMediaGeoLive.geo_point = new TLRPC$TL_inputGeoPointEmpty();
            getConnectionsManager().sendRequest(tLRPC$TL_messages_editMessage, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    LocationController.this.lambda$removeSharingLocation$20(tLObject, tLRPC$TL_error);
                }
            });
            this.sharingLocations.remove(sharingLocationInfo);
            saveSharingLocation(sharingLocationInfo, 1);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LocationController.this.lambda$removeSharingLocation$21(sharingLocationInfo);
                }
            });
            if (this.sharingLocations.isEmpty()) {
                stop(true);
            }
        }
    }

    public void lambda$removeSharingLocation$20(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            return;
        }
        getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
    }

    public void lambda$removeSharingLocation$21(SharingLocationInfo sharingLocationInfo) {
        this.sharingLocationsUI.remove(sharingLocationInfo);
        this.sharingLocationsMapUI.remove(sharingLocationInfo.did);
        if (this.sharingLocationsUI.isEmpty()) {
            stopService();
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    private void startService() {
        try {
            ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, LocationSharingService.class));
        } catch (Throwable th) {
            FileLog.m31e(th);
        }
    }

    private void stopService() {
        ApplicationLoader.applicationContext.stopService(new Intent(ApplicationLoader.applicationContext, LocationSharingService.class));
    }

    public void removeAllLocationSharings() {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                LocationController.this.lambda$removeAllLocationSharings$25();
            }
        });
    }

    public void lambda$removeAllLocationSharings$25() {
        for (int i = 0; i < this.sharingLocations.size(); i++) {
            SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i);
            TLRPC$TL_messages_editMessage tLRPC$TL_messages_editMessage = new TLRPC$TL_messages_editMessage();
            tLRPC$TL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
            tLRPC$TL_messages_editMessage.f940id = sharingLocationInfo.mid;
            tLRPC$TL_messages_editMessage.flags |= 16384;
            TLRPC$TL_inputMediaGeoLive tLRPC$TL_inputMediaGeoLive = new TLRPC$TL_inputMediaGeoLive();
            tLRPC$TL_messages_editMessage.media = tLRPC$TL_inputMediaGeoLive;
            tLRPC$TL_inputMediaGeoLive.stopped = true;
            tLRPC$TL_inputMediaGeoLive.geo_point = new TLRPC$TL_inputGeoPointEmpty();
            getConnectionsManager().sendRequest(tLRPC$TL_messages_editMessage, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    LocationController.this.lambda$removeAllLocationSharings$23(tLObject, tLRPC$TL_error);
                }
            });
        }
        this.sharingLocations.clear();
        this.sharingLocationsMap.clear();
        saveSharingLocation(null, 2);
        stop(true);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LocationController.this.lambda$removeAllLocationSharings$24();
            }
        });
    }

    public void lambda$removeAllLocationSharings$23(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            return;
        }
        getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
    }

    public void lambda$removeAllLocationSharings$24() {
        this.sharingLocationsUI.clear();
        this.sharingLocationsMapUI.clear();
        stopService();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.liveLocationsChanged, new Object[0]);
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
            this.lastLocationSendTime = (SystemClock.elapsedRealtime() - 30000) + 20000;
            this.locationSentSinceLastMapUpdate = false;
        }
        setLastKnownLocation(location);
    }

    private void start() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.LocationController.start():void");
    }

    private void stop(boolean z) {
        if (this.lookingForPeopleNearby || this.shareMyCurrentLocation) {
            return;
        }
        this.started = false;
        if (checkServices()) {
            try {
                ApplicationLoader.getLocationServiceProvider().removeLocationUpdates(this.fusedLocationListener);
                this.apiClient.disconnect();
            } catch (Throwable th) {
                FileLog.m30e(th, false);
            }
        }
        this.locationManager.removeUpdates(this.gpsLocationListener);
        if (z) {
            this.locationManager.removeUpdates(this.networkLocationListener);
            this.locationManager.removeUpdates(this.passiveLocationListener);
        }
    }

    public void startLocationLookupForPeopleNearby(final boolean z) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                LocationController.this.lambda$startLocationLookupForPeopleNearby$26(z);
            }
        });
    }

    public void lambda$startLocationLookupForPeopleNearby$26(boolean z) {
        boolean z2 = !z;
        this.lookingForPeopleNearby = z2;
        if (z2) {
            start();
        } else if (this.sharingLocations.isEmpty()) {
            stop(true);
        }
    }

    public Location getLastKnownLocation() {
        return this.lastKnownLocation;
    }

    public void loadLiveLocations(final long j) {
        if (this.cacheRequests.indexOfKey(j) >= 0) {
            return;
        }
        this.cacheRequests.put(j, Boolean.TRUE);
        TLRPC$TL_messages_getRecentLocations tLRPC$TL_messages_getRecentLocations = new TLRPC$TL_messages_getRecentLocations();
        tLRPC$TL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(j);
        tLRPC$TL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getRecentLocations, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                LocationController.this.lambda$loadLiveLocations$28(j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadLiveLocations$28(final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LocationController.this.lambda$loadLiveLocations$27(j, tLObject);
            }
        });
    }

    public void lambda$loadLiveLocations$27(long j, TLObject tLObject) {
        this.cacheRequests.delete(j);
        TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
        int i = 0;
        while (i < tLRPC$messages_Messages.messages.size()) {
            if (!(tLRPC$messages_Messages.messages.get(i).media instanceof TLRPC$TL_messageMediaGeoLive)) {
                tLRPC$messages_Messages.messages.remove(i);
                i--;
            }
            i++;
        }
        getMessagesStorage().putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
        getMessagesController().putUsers(tLRPC$messages_Messages.users, false);
        getMessagesController().putChats(tLRPC$messages_Messages.chats, false);
        this.locationsCache.put(j, tLRPC$messages_Messages.messages);
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j), Integer.valueOf(this.currentAccount));
    }

    public void markLiveLoactionsAsRead(long j) {
        ArrayList<TLRPC$Message> arrayList;
        ?? tLRPC$TL_messages_readMessageContents;
        if (DialogObject.isEncryptedDialog(j) || (arrayList = this.locationsCache.get(j)) == null || arrayList.isEmpty()) {
            return;
        }
        Integer num = this.lastReadLocationTime.get(j);
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (num == null || num.intValue() + 60 <= elapsedRealtime) {
            this.lastReadLocationTime.put(j, Integer.valueOf(elapsedRealtime));
            int i = 0;
            if (DialogObject.isChatDialog(j)) {
                long j2 = -j;
                if (ChatObject.isChannel(j2, this.currentAccount)) {
                    tLRPC$TL_messages_readMessageContents = new TLRPC$TL_channels_readMessageContents();
                    int size = arrayList.size();
                    while (i < size) {
                        tLRPC$TL_messages_readMessageContents.f900id.add(Integer.valueOf(arrayList.get(i).f881id));
                        i++;
                    }
                    tLRPC$TL_messages_readMessageContents.channel = getMessagesController().getInputChannel(j2);
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_readMessageContents, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            LocationController.this.lambda$markLiveLoactionsAsRead$29(tLObject, tLRPC$TL_error);
                        }
                    });
                }
            }
            tLRPC$TL_messages_readMessageContents = new TLRPC$TL_messages_readMessageContents();
            int size2 = arrayList.size();
            while (i < size2) {
                tLRPC$TL_messages_readMessageContents.f956id.add(Integer.valueOf(arrayList.get(i).f881id));
                i++;
            }
            getConnectionsManager().sendRequest(tLRPC$TL_messages_readMessageContents, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    LocationController.this.lambda$markLiveLoactionsAsRead$29(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$markLiveLoactionsAsRead$29(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_messages_affectedMessages) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            getMessagesController().processNewDifferenceParams(-1, tLRPC$TL_messages_affectedMessages.pts, -1, tLRPC$TL_messages_affectedMessages.pts_count);
        }
    }

    public static int getLocationsCount() {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i += getInstance(i2).sharingLocationsUI.size();
        }
        return i;
    }

    public static void fetchLocationAddress(final Location location, final LocationFetchCallback locationFetchCallback) {
        if (locationFetchCallback == null) {
            return;
        }
        Runnable runnable = callbacks.get(locationFetchCallback);
        if (runnable != null) {
            Utilities.globalQueue.cancelRunnable(runnable);
            callbacks.remove(locationFetchCallback);
        }
        if (location == null) {
            locationFetchCallback.onLocationAddressAvailable(null, null, null);
            return;
        }
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                LocationController.lambda$fetchLocationAddress$31(location, locationFetchCallback);
            }
        };
        dispatchQueue.postRunnable(runnable2, 300L);
        callbacks.put(locationFetchCallback, runnable2);
    }

    public static void lambda$fetchLocationAddress$31(final Location location, final LocationFetchCallback locationFetchCallback) {
        final String format;
        final String str;
        boolean z;
        try {
            List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getSystemDefaultLocale()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (fromLocation.size() > 0) {
                Address address = fromLocation.get(0);
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                String subThoroughfare = address.getSubThoroughfare();
                if (TextUtils.isEmpty(subThoroughfare)) {
                    z = false;
                } else {
                    sb.append(subThoroughfare);
                    z = true;
                }
                String thoroughfare = address.getThoroughfare();
                if (!TextUtils.isEmpty(thoroughfare)) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(thoroughfare);
                    z = true;
                }
                if (!z) {
                    String adminArea = address.getAdminArea();
                    if (!TextUtils.isEmpty(adminArea)) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(adminArea);
                    }
                    String subAdminArea = address.getSubAdminArea();
                    if (!TextUtils.isEmpty(subAdminArea)) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(subAdminArea);
                    }
                }
                String locality = address.getLocality();
                if (!TextUtils.isEmpty(locality)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(locality);
                }
                String countryName = address.getCountryName();
                if (!TextUtils.isEmpty(countryName)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(countryName);
                }
                String countryName2 = address.getCountryName();
                if (!TextUtils.isEmpty(countryName2)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(countryName2);
                }
                String locality2 = address.getLocality();
                if (!TextUtils.isEmpty(locality2)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(locality2);
                }
                if (!z) {
                    String adminArea2 = address.getAdminArea();
                    if (!TextUtils.isEmpty(adminArea2)) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(adminArea2);
                    }
                    String subAdminArea2 = address.getSubAdminArea();
                    if (!TextUtils.isEmpty(subAdminArea2)) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(subAdminArea2);
                    }
                }
                str = sb.toString();
                format = sb2.toString();
            } else {
                str = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                format = str;
            }
        } catch (Exception unused) {
            format = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
            str = format;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LocationController.lambda$fetchLocationAddress$30(LocationController.LocationFetchCallback.this, str, format, location);
            }
        });
    }

    public static void lambda$fetchLocationAddress$30(LocationFetchCallback locationFetchCallback, String str, String str2, Location location) {
        callbacks.remove(locationFetchCallback);
        locationFetchCallback.onLocationAddressAvailable(str, str2, location);
    }
}
