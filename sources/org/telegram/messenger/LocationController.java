package org.telegram.messenger;

import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ge0;
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
            LocationController.this = r1;
        }

        @Override
        public void onLocationChanged(Location location) {
            if (location != null) {
                LocationController.this.setLastKnownLocation(location);
            }
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
        ILocationServiceProvider.ILocationRequest onCreateLocationRequest = ApplicationLoader.getLocationServiceProvider().onCreateLocationRequest();
        this.locationRequest = onCreateLocationRequest;
        onCreateLocationRequest.setPriority(0);
        this.locationRequest.setInterval(1000L);
        this.locationRequest.setFastestInterval(1000L);
        AndroidUtilities.runOnUIThread(new s5(this, 2));
        loadSharingLocations();
    }

    private void broadcastLastKnownLocation(boolean z4) {
        TLRPC.GeoPoint geoPoint;
        if (this.lastKnownLocation != null) {
            if (this.requests.size() != 0) {
                if (z4) {
                    for (int i10 = 0; i10 < this.requests.size(); i10++) {
                        getConnectionsManager().cancelRequest(this.requests.keyAt(i10), false);
                    }
                }
                this.requests.clear();
            }
            if (!this.sharingLocations.isEmpty()) {
                int currentTime = getConnectionsManager().getCurrentTime();
                float[] fArr = new float[1];
                for (int i11 = 0; i11 < this.sharingLocations.size(); i11++) {
                    SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i11);
                    TLRPC.Message message = sharingLocationInfo.messageObject.messageOwner;
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia != null && (geoPoint = messageMedia.geo) != null && sharingLocationInfo.lastSentProximityMeters == sharingLocationInfo.proximityMeters) {
                        int i12 = message.edit_date;
                        if (i12 == 0) {
                            i12 = message.date;
                        }
                        if (Math.abs(currentTime - i12) < 10) {
                            Location.distanceBetween(geoPoint.lat, geoPoint._long, this.lastKnownLocation.getLatitude(), this.lastKnownLocation.getLongitude(), fArr);
                            if (fArr[0] < 1.0f) {
                            }
                        }
                    }
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
                    tL_messages_editMessage.f19267id = sharingLocationInfo.mid;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = false;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                    tL_messages_editMessage.media.geo_point.lat = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLatitude());
                    tL_messages_editMessage.media.geo_point._long = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLongitude());
                    tL_messages_editMessage.media.geo_point.accuracy_radius = (int) this.lastKnownLocation.getAccuracy();
                    TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                    TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
                    if (inputGeoPoint.accuracy_radius != 0) {
                        inputGeoPoint.flags |= 1;
                    }
                    int i13 = sharingLocationInfo.lastSentProximityMeters;
                    int i14 = sharingLocationInfo.proximityMeters;
                    if (i13 != i14) {
                        inputMedia.proximity_notification_radius = i14;
                        inputMedia.flags |= 8;
                    }
                    inputMedia.heading = getHeading(this.lastKnownLocation);
                    tL_messages_editMessage.media.flags |= 4;
                    int sendRequest = getConnectionsManager().sendRequest(tL_messages_editMessage, new i2(this, sharingLocationInfo, r6, tL_messages_editMessage, 1));
                    int[] iArr = {sendRequest};
                    this.requests.put(sendRequest, 0);
                }
            }
            getConnectionsManager().resumeNetworkMaybe();
            if (shouldStopGps()) {
                stop(false);
            }
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
        int codePointCount = upperCase.codePointCount(0, upperCase.length());
        if (codePointCount > 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < codePointCount; i10++) {
            sb.append(Character.toChars(Character.codePointAt(upperCase, i10) - (-127397)));
        }
        return sb.toString();
    }

    public static String detectOcean(double d, double d10) {
        if (d10 > 65.0d) {
            return "Arctic Ocean";
        }
        if (d <= -88.0d || d >= 40.0d || d10 <= 0.0d) {
            if (d > -60.0d && d < 20.0d && d10 <= 0.0d) {
                return "Atlantic Ocean";
            }
            if (d10 <= 30.0d && d >= 20.0d && d < 150.0d) {
                return "Indian Ocean";
            }
            if ((d <= 106.0d && d >= -60.0d) || d10 <= 0.0d) {
                if ((d <= 150.0d && d >= -60.0d) || d10 > 0.0d) {
                    return null;
                }
                return "Pacific Ocean";
            }
            return "Pacific Ocean";
        }
        return "Atlantic Ocean";
    }

    public static void fetchLocationAddress(Location location, LocationFetchCallback locationFetchCallback) {
        fetchLocationAddress(location, 0, locationFetchCallback);
    }

    public static int getHeading(Location location) {
        float bearing = location.getBearing();
        if (bearing > 0.0f && bearing < 1.0f) {
            if (bearing < 0.5f) {
                return 360;
            }
            return 1;
        }
        return (int) bearing;
    }

    public static LocationController getInstance(int i10) {
        LocationController locationController;
        LocationController locationController2 = Instance[i10];
        if (locationController2 == null) {
            synchronized (LocationController.class) {
                try {
                    locationController = Instance[i10];
                    if (locationController == null) {
                        LocationController[] locationControllerArr = Instance;
                        LocationController locationController3 = new LocationController(i10);
                        locationControllerArr[i10] = locationController3;
                        locationController = locationController3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return locationController;
        }
        return locationController2;
    }

    public static int getLocationsCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 += getInstance(i11).sharingLocationsUI.size();
        }
        return i10;
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
                AndroidUtilities.runOnUIThread(new q5(0, sharingLocationInfo, this));
                return;
            }
            return;
        }
        if ((tL_messages_editMessage.flags & 8) != 0) {
            sharingLocationInfo.lastSentProximityMeters = tL_messages_editMessage.media.proximity_notification_radius;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        boolean z4 = false;
        for (int i10 = 0; i10 < updates.updates.size(); i10++) {
            TLRPC.Update update = updates.updates.get(i10);
            if (update instanceof TL_update.TL_updateEditMessage) {
                sharingLocationInfo.messageObject.messageOwner = ((TL_update.TL_updateEditMessage) update).message;
            } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                sharingLocationInfo.messageObject.messageOwner = ((TL_update.TL_updateEditChannelMessage) update).message;
            }
            z4 = true;
        }
        if (z4) {
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

    public static void lambda$fetchLocationAddress$29(java.util.Locale r24, android.location.Location r25, int r26, java.util.Locale r27, org.telegram.messenger.LocationController.LocationFetchCallback r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.LocationController.lambda$fetchLocationAddress$29(java.util.Locale, android.location.Location, int, java.util.Locale, org.telegram.messenger.LocationController$LocationFetchCallback):void");
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
        AndroidUtilities.runOnUIThread(new d4(this, j10, tLObject, 4));
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
        AndroidUtilities.runOnUIThread(new u5(this, arrayList, 0));
    }

    public void lambda$loadSharingLocations$16(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        Utilities.stageQueue.postRunnable(new u5(this, arrayList3, 1));
    }

    public void lambda$loadSharingLocations$17() {
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        try {
            ArrayList<Long> arrayList4 = new ArrayList<>();
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
                    MessageObject messageObject = new MessageObject(this.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
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
            getMessagesStorage().getUsersInternal(arrayList4, arrayList2);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new sk(this, arrayList2, arrayList3, arrayList, 9));
        }
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
        if (!this.sharingLocations.isEmpty()) {
            AndroidUtilities.runOnUIThread(new r5(this, num, 1));
        }
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
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    return;
                }
                Utilities.stageQueue.postRunnable(new s5(this, 0));
                return;
            }
            Utilities.stageQueue.postRunnable(new r5(this, num, 0));
            return;
        }
        startFusedLocationRequest(true);
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
            tL_messages_editMessage.f19267id = sharingLocationInfo.mid;
            tL_messages_editMessage.flags |= 16384;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = true;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
            getConnectionsManager().sendRequest(tL_messages_editMessage, new t5(this, 1));
        }
        this.sharingLocations.clear();
        this.sharingLocationsMap.b();
        saveSharingLocation(null, 2);
        stop(true);
        AndroidUtilities.runOnUIThread(new s5(this, 3));
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
            tL_messages_editMessage.f19267id = sharingLocationInfo.mid;
            tL_messages_editMessage.flags |= 16384;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = true;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
            getConnectionsManager().sendRequest(tL_messages_editMessage, new t5(this, 0));
            this.sharingLocations.remove(sharingLocationInfo);
            saveSharingLocation(sharingLocationInfo, 1);
            AndroidUtilities.runOnUIThread(new q5(1, sharingLocationInfo, this));
            if (this.sharingLocations.isEmpty()) {
                stop(true);
            }
        }
    }

    public void lambda$saveSharingLocation$18(int i10, SharingLocationInfo sharingLocationInfo) {
        try {
            if (i10 == 2) {
                getMessagesStorage().getDatabase().executeFast("DELETE FROM sharing_locations WHERE 1").stepThis().dispose();
            } else if (i10 == 1) {
                if (sharingLocationInfo != null) {
                    SQLiteDatabase database = getMessagesStorage().getDatabase();
                    database.executeFast("DELETE FROM sharing_locations WHERE uid = " + sharingLocationInfo.did).stepThis().dispose();
                }
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
            FileLog.e(e);
        }
    }

    public static void lambda$setLastKnownLocation$10() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newLocationAvailable, new Object[0]);
    }

    public void lambda$setProximityLocation$12(int i10, long j10) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE sharing_locations SET proximity = ? WHERE uid = ?");
            executeFast.requery();
            executeFast.bindInteger(1, i10);
            executeFast.bindLong(2, j10);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$setProximityLocation$13() {
        broadcastLastKnownLocation(true);
    }

    public void lambda$startFusedLocationRequest$5(boolean z4) {
        if (!z4) {
            this.servicesAvailable = Boolean.FALSE;
        }
        if (!this.sharingLocations.isEmpty()) {
            if (z4) {
                try {
                    ApplicationLoader.getLocationServiceProvider().getLastLocation(new v5(this, 1));
                    ApplicationLoader.getLocationServiceProvider().requestLocationUpdates(this.locationRequest, this.fusedLocationListener);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            }
            start();
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
        getMessagesStorage().getStorageQueue().postRunnable(new s5(this, 6));
    }

    private void saveSharingLocation(SharingLocationInfo sharingLocationInfo, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new s4(this, i10, sharingLocationInfo, 5));
    }

    public void setLastKnownLocation(Location location) {
        if (location == null || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.lastKnownLocation = location;
            if (location != null) {
                AndroidUtilities.runOnUIThread(new x1(12));
            }
        }
    }

    private boolean shouldSendLocationNow() {
        if (!shouldStopGps() || Math.abs(this.lastLocationSendTime - SystemClock.elapsedRealtime()) < 2000) {
            return false;
        }
        return true;
    }

    private boolean shouldStopGps() {
        if (SystemClock.elapsedRealtime() > this.locationEndWatchTime) {
            return true;
        }
        return false;
    }

    private void start() {
        if (!this.started) {
            this.lastLocationStartTime = SystemClock.elapsedRealtime();
            this.started = true;
            if (checkServices()) {
                try {
                    this.apiClient.connect();
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            try {
                this.locationManager.requestLocationUpdates("gps", 1L, 0.0f, this.gpsLocationListener);
            } catch (Exception e) {
                FileLog.e(e);
            }
            try {
                this.locationManager.requestLocationUpdates("network", 1L, 0.0f, this.networkLocationListener);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            try {
                this.locationManager.requestLocationUpdates("passive", 1L, 0.0f, this.passiveLocationListener);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            if (this.lastKnownLocation == null) {
                try {
                    setLastKnownLocation(this.locationManager.getLastKnownLocation("gps"));
                    if (this.lastKnownLocation == null) {
                        setLastKnownLocation(this.locationManager.getLastKnownLocation("network"));
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
        }
    }

    private void startService() {
        try {
            if (!ge0.f("android.permission.ACCESS_COARSE_LOCATION") && !ge0.f("android.permission.ACCESS_FINE_LOCATION")) {
                return;
            }
            ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, LocationSharingService.class));
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    private void stop(boolean z4) {
        this.started = false;
        if (checkServices()) {
            try {
                ApplicationLoader.getLocationServiceProvider().removeLocationUpdates(this.fusedLocationListener);
                this.apiClient.disconnect();
            } catch (Throwable th2) {
                FileLog.e(th2, false);
            }
        }
        this.locationManager.removeUpdates(this.gpsLocationListener);
        if (z4) {
            this.locationManager.removeUpdates(this.networkLocationListener);
            this.locationManager.removeUpdates(this.passiveLocationListener);
        }
    }

    private void stopService() {
        ApplicationLoader.applicationContext.stopService(new Intent(ApplicationLoader.applicationContext, LocationSharingService.class));
    }

    public void addSharingLocation(TLRPC.Message message) {
        SharingLocationInfo sharingLocationInfo = new SharingLocationInfo();
        sharingLocationInfo.did = message.dialog_id;
        sharingLocationInfo.mid = message.f19205id;
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
        AndroidUtilities.runOnUIThread(new g0(this, sharingLocationInfo2, sharingLocationInfo, 25));
    }

    public void cleanup() {
        this.sharingLocationsUI.clear();
        this.sharingLocationsMapUI.b();
        this.locationsCache.b();
        this.cacheRequests.b();
        this.lastReadLocationTime.b();
        stopService();
        Utilities.stageQueue.postRunnable(new s5(this, 5));
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        long j10;
        ArrayList arrayList2;
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue()) {
                Long l10 = (Long) objArr[0];
                long longValue = l10.longValue();
                if (isSharingLocation(longValue) && (arrayList2 = (ArrayList) this.locationsCache.f(longValue)) != null) {
                    ArrayList arrayList3 = (ArrayList) objArr[1];
                    boolean z4 = false;
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i12);
                        if (messageObject.isLiveLocation()) {
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList2.size()) {
                                    if (MessageObject.getFromChatId((TLRPC.Message) arrayList2.get(i13)) == messageObject.getFromChatId()) {
                                        arrayList2.set(i13, messageObject.messageOwner);
                                        break;
                                    }
                                    i13++;
                                } else {
                                    arrayList2.add(messageObject.messageOwner);
                                    break;
                                }
                            }
                            z4 = true;
                        } else if (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) {
                            long dialogId = messageObject.getDialogId();
                            if (DialogObject.isUserDialog(dialogId)) {
                                setProximityLocation(dialogId, 0, false);
                            }
                        }
                    }
                    if (z4) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, l10, Integer.valueOf(this.currentAccount));
                    }
                }
            }
        } else if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && !this.sharingLocationsUI.isEmpty()) {
                ArrayList arrayList4 = (ArrayList) objArr[0];
                long longValue2 = ((Long) objArr[1]).longValue();
                ArrayList arrayList5 = null;
                for (int i14 = 0; i14 < this.sharingLocationsUI.size(); i14++) {
                    SharingLocationInfo sharingLocationInfo = this.sharingLocationsUI.get(i14);
                    MessageObject messageObject2 = sharingLocationInfo.messageObject;
                    if (messageObject2 != null) {
                        j10 = messageObject2.getChannelId();
                    } else {
                        j10 = 0;
                    }
                    if (longValue2 == j10 && arrayList4.contains(Integer.valueOf(sharingLocationInfo.mid))) {
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
                }
            }
        } else if (i10 == NotificationCenter.replaceMessagesObjects) {
            Long l11 = (Long) objArr[0];
            long longValue3 = l11.longValue();
            if (isSharingLocation(longValue3) && (arrayList = (ArrayList) this.locationsCache.f(longValue3)) != null) {
                ArrayList arrayList6 = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                    MessageObject messageObject3 = (MessageObject) arrayList6.get(i16);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList.size()) {
                            break;
                        } else if (MessageObject.getFromChatId((TLRPC.Message) arrayList.get(i17)) == messageObject3.getFromChatId()) {
                            if (!messageObject3.isLiveLocation()) {
                                arrayList.remove(i17);
                            } else {
                                arrayList.set(i17, messageObject3.messageOwner);
                            }
                            z10 = true;
                        } else {
                            i17++;
                        }
                    }
                }
                if (z10) {
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
        if (this.sharingLocationsMapUI.h(j10) >= 0) {
            return true;
        }
        return false;
    }

    public void loadLiveLocations(long j10) {
        if (this.cacheRequests.h(j10) >= 0) {
            return;
        }
        this.cacheRequests.k(Boolean.TRUE, j10);
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(j10);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new nh.t5(this, j10, 2));
    }

    public void markLiveLoactionsAsRead(long j10) {
        ArrayList arrayList;
        ?? tL_messages_readMessageContents;
        if (!DialogObject.isEncryptedDialog(j10) && (arrayList = (ArrayList) this.locationsCache.f(j10)) != null && !arrayList.isEmpty()) {
            Integer num = (Integer) this.lastReadLocationTime.f(j10);
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
            if (num == null || num.intValue() + 60 <= elapsedRealtime) {
                this.lastReadLocationTime.k(Integer.valueOf(elapsedRealtime), j10);
                int i10 = 0;
                if (DialogObject.isChatDialog(j10)) {
                    long j11 = -j10;
                    if (ChatObject.isChannel(j11, this.currentAccount)) {
                        tL_messages_readMessageContents = new TLRPC.TL_channels_readMessageContents();
                        int size = arrayList.size();
                        while (i10 < size) {
                            i10 = org.telegram.ui.yh.e(((TLRPC.Message) arrayList.get(i10)).f19205id, i10, 1, tL_messages_readMessageContents.f19223id);
                        }
                        tL_messages_readMessageContents.channel = getMessagesController().getInputChannel(j11);
                        getConnectionsManager().sendRequest(tL_messages_readMessageContents, new t5(this, 2));
                    }
                }
                tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    i10 = org.telegram.ui.yh.e(((TLRPC.Message) arrayList.get(i10)).f19205id, i10, 1, tL_messages_readMessageContents.f19287id);
                }
                getConnectionsManager().sendRequest(tL_messages_readMessageContents, new t5(this, 2));
            }
        }
    }

    @Override
    public void onConnected(Bundle bundle) {
        this.wasConnectedToPlayServices = true;
        try {
            ApplicationLoader.getLocationServiceProvider().checkLocationSettings(this.locationRequest, new v5(this, 0));
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public void onConnectionFailed() {
        if (!this.wasConnectedToPlayServices) {
            this.servicesAvailable = Boolean.FALSE;
            if (this.started) {
                this.started = false;
                start();
            }
        }
    }

    public void removeAllLocationSharings() {
        Utilities.stageQueue.postRunnable(new s5(this, 4));
    }

    public void removeSharingLocation(long j10) {
        Utilities.stageQueue.postRunnable(new gg.y1(this, j10, 10));
    }

    public void setMapLocation(Location location, boolean z4) {
        Location location2;
        if (location == null) {
            return;
        }
        this.lastLocationByMaps = true;
        if (!z4 && ((location2 = this.lastKnownLocation) == null || location2.distanceTo(location) < 20.0f)) {
            if (this.locationSentSinceLastMapUpdate) {
                this.lastLocationSendTime = SystemClock.elapsedRealtime() - 10000;
                this.locationSentSinceLastMapUpdate = false;
            }
        } else {
            this.lastLocationSendTime = SystemClock.elapsedRealtime() - 30000;
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

    public boolean setProximityLocation(long j10, int i10, boolean z4) {
        SharingLocationInfo sharingLocationInfo = (SharingLocationInfo) this.sharingLocationsMapUI.f(j10);
        if (sharingLocationInfo != null) {
            sharingLocationInfo.proximityMeters = i10;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new lh.a9(this, i10, j10, 2));
        if (z4) {
            Utilities.stageQueue.postRunnable(new s5(this, 1));
        }
        if (sharingLocationInfo != null) {
            return true;
        }
        return false;
    }

    public void startFusedLocationRequest(boolean z4) {
        Utilities.stageQueue.postRunnable(new jh.f(9, this, z4));
    }

    public void update() {
        getUserConfig();
        boolean z4 = false;
        if (!this.sharingLocations.isEmpty()) {
            int i10 = 0;
            while (i10 < this.sharingLocations.size()) {
                SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i10);
                if (sharingLocationInfo.stopTime <= getConnectionsManager().getCurrentTime()) {
                    this.sharingLocations.remove(i10);
                    this.sharingLocationsMap.l(sharingLocationInfo.did);
                    saveSharingLocation(sharingLocationInfo, 1);
                    AndroidUtilities.runOnUIThread(new q5(2, sharingLocationInfo, this));
                    i10--;
                }
                i10++;
            }
        }
        if (this.started) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.lastLocationByMaps || Math.abs(this.lastLocationStartTime - elapsedRealtime) > 10000 || shouldSendLocationNow()) {
                this.lastLocationByMaps = false;
                this.locationSentSinceLastMapUpdate = true;
                if (SystemClock.elapsedRealtime() - this.lastLocationSendTime > 2000) {
                    z4 = true;
                }
                this.lastLocationStartTime = elapsedRealtime;
                this.lastLocationSendTime = SystemClock.elapsedRealtime();
                broadcastLastKnownLocation(z4);
            }
        } else if (!this.sharingLocations.isEmpty() && Math.abs(this.lastLocationSendTime - SystemClock.elapsedRealtime()) > 30000) {
            this.lastLocationStartTime = SystemClock.elapsedRealtime();
            start();
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
        dg.f3 f3Var = new dg.f3(locale, location, i10, locale2, locationFetchCallback, 3);
        dispatchQueue.postRunnable(f3Var, 300L);
        callbacks.put(locationFetchCallback, f3Var);
    }

    public class GpsLocationListener implements LocationListener {
        private GpsLocationListener() {
            LocationController.this = r1;
        }

        @Override
        public void onLocationChanged(Location location) {
            if (location != null) {
                if (LocationController.this.lastKnownLocation == null || (this != LocationController.this.networkLocationListener && this != LocationController.this.passiveLocationListener)) {
                    LocationController.this.setLastKnownLocation(location);
                } else if (!LocationController.this.started && location.distanceTo(LocationController.this.lastKnownLocation) > 20.0f) {
                    LocationController.this.setLastKnownLocation(location);
                    LocationController.this.lastLocationSendTime = SystemClock.elapsedRealtime() - 25000;
                }
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
