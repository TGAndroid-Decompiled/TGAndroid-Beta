package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Pair;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
public class DownloadController extends BaseController implements NotificationCenter.NotificationCenterDelegate {
    public static final int AUTODOWNLOAD_TYPE_AUDIO = 2;
    public static final int AUTODOWNLOAD_TYPE_DOCUMENT = 8;
    public static final int AUTODOWNLOAD_TYPE_PHOTO = 1;
    public static final int AUTODOWNLOAD_TYPE_VIDEO = 4;
    private static volatile DownloadController[] Instance = new DownloadController[4];
    public static final int PRESET_NUM_CHANNEL = 3;
    public static final int PRESET_NUM_CONTACT = 0;
    public static final int PRESET_NUM_GROUP = 2;
    public static final int PRESET_NUM_PM = 1;
    public static final int PRESET_SIZE_NUM_AUDIO = 3;
    public static final int PRESET_SIZE_NUM_DOCUMENT = 2;
    public static final int PRESET_SIZE_NUM_PHOTO = 0;
    public static final int PRESET_SIZE_NUM_VIDEO = 1;
    private HashMap<String, FileDownloadProgressListener> addLaterArray;
    private ArrayList<DownloadObject> audioDownloadQueue;
    Runnable clearUnviewedDownloadsRunnale;
    public int currentMobilePreset;
    public int currentRoamingPreset;
    public int currentWifiPreset;
    private ArrayList<FileDownloadProgressListener> deleteLaterArray;
    private ArrayList<DownloadObject> documentDownloadQueue;
    private HashMap<String, DownloadObject> downloadQueueKeys;
    private HashMap<Pair<Long, Integer>, DownloadObject> downloadQueuePairs;
    public final ArrayList<MessageObject> downloadingFiles;
    public Preset highPreset;
    private int lastCheckMask;
    private int lastTag;
    private boolean listenerInProgress;
    private boolean loadingAutoDownloadConfig;
    private HashMap<String, ArrayList<MessageObject>> loadingFileMessagesObservers;
    private HashMap<String, ArrayList<WeakReference<FileDownloadProgressListener>>> loadingFileObservers;
    public Preset lowPreset;
    public Preset mediumPreset;
    public Preset mobilePreset;
    private SparseArray<String> observersByTag;
    private ArrayList<DownloadObject> photoDownloadQueue;
    public final ArrayList<MessageObject> recentDownloadingFiles;
    public Preset roamingPreset;
    private a0.h typingTimes;
    public final SparseArray<MessageObject> unviewedDownloads;
    private ArrayList<DownloadObject> videoDownloadQueue;
    public Preset wifiPreset;

    public class DownloadingDocumentEntry {
        int hash;
        long f18043id;

        private DownloadingDocumentEntry() {
            DownloadController.this = r1;
        }
    }

    public interface FileDownloadProgressListener {
        int getObserverTag();

        void onFailedDownload(String str, boolean z4);

        void onProgressDownload(String str, long j10, long j11);

        void onProgressUpload(String str, long j10, long j11, boolean z4);

        void onSuccessDownload(String str);
    }

    public DownloadController(int i10) {
        super(i10);
        Integer num;
        Integer valueOf;
        Integer valueOf2;
        this.lastCheckMask = 0;
        this.photoDownloadQueue = new ArrayList<>();
        this.audioDownloadQueue = new ArrayList<>();
        this.documentDownloadQueue = new ArrayList<>();
        this.videoDownloadQueue = new ArrayList<>();
        this.downloadQueueKeys = new HashMap<>();
        this.downloadQueuePairs = new HashMap<>();
        this.loadingFileObservers = new HashMap<>();
        this.loadingFileMessagesObservers = new HashMap<>();
        this.observersByTag = new SparseArray<>();
        this.listenerInProgress = false;
        this.addLaterArray = new HashMap<>();
        this.deleteLaterArray = new ArrayList<>();
        this.lastTag = 0;
        this.typingTimes = new a0.h();
        this.downloadingFiles = new ArrayList<>();
        this.recentDownloadingFiles = new ArrayList<>();
        this.unviewedDownloads = new SparseArray<>();
        this.clearUnviewedDownloadsRunnale = new Runnable() {
            {
                DownloadController.this = this;
            }

            @Override
            public void run() {
                DownloadController.this.clearUnviewedDownloads();
                DownloadController.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
            }
        };
        SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
        Preset preset = new Preset(mainSettings.getString("preset0", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
        this.lowPreset = preset;
        preset.preloadStories = false;
        this.mediumPreset = new Preset(mainSettings.getString("preset1", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
        this.highPreset = new Preset(mainSettings.getString("preset2", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
        boolean contains = mainSettings.contains("newConfig");
        if (!contains && getUserConfig().isClientActivated()) {
            int[] iArr = new int[4];
            int[] iArr2 = new int[4];
            int[] iArr3 = new int[4];
            long[] jArr = new long[7];
            long[] jArr2 = new long[7];
            long[] jArr3 = new long[7];
            int i11 = 0;
            for (int i12 = 4; i11 < i12; i12 = 4) {
                int i13 = i11;
                StringBuilder sb = new StringBuilder("mobileDataDownloadMask");
                Object obj = "";
                if (i13 == 0) {
                    num = "";
                } else {
                    num = "";
                    obj = Integer.valueOf(i13);
                }
                sb.append(obj);
                String sb2 = sb.toString();
                if (i13 != 0 && !mainSettings.contains(sb2)) {
                    iArr[i13] = iArr[0];
                    iArr2[i13] = iArr2[0];
                    iArr3[i13] = iArr3[0];
                } else {
                    iArr[i13] = mainSettings.getInt(sb2, 13);
                    StringBuilder sb3 = new StringBuilder("wifiDownloadMask");
                    if (i13 == 0) {
                        valueOf = num;
                    } else {
                        valueOf = Integer.valueOf(i13);
                    }
                    sb3.append(valueOf);
                    iArr2[i13] = mainSettings.getInt(sb3.toString(), 13);
                    StringBuilder sb4 = new StringBuilder("roamingDownloadMask");
                    if (i13 == 0) {
                        valueOf2 = num;
                    } else {
                        valueOf2 = Integer.valueOf(i13);
                    }
                    sb4.append(valueOf2);
                    iArr3[i13] = mainSettings.getInt(sb4.toString(), 1);
                }
                i11 = i13 + 1;
            }
            jArr[2] = mainSettings.getLong("mobileMaxDownloadSize2", this.mediumPreset.sizes[1]);
            jArr[3] = mainSettings.getLong("mobileMaxDownloadSize3", this.mediumPreset.sizes[2]);
            jArr2[2] = mainSettings.getLong("wifiMaxDownloadSize2", this.highPreset.sizes[1]);
            jArr2[3] = mainSettings.getLong("wifiMaxDownloadSize3", this.highPreset.sizes[2]);
            jArr3[2] = mainSettings.getLong("roamingMaxDownloadSize2", this.lowPreset.sizes[1]);
            jArr3[3] = mainSettings.getLong("roamingMaxDownloadSize3", this.lowPreset.sizes[2]);
            boolean z4 = mainSettings.getBoolean("globalAutodownloadEnabled", true);
            this.mobilePreset = new Preset(iArr, this.mediumPreset.sizes[0], jArr[2], jArr[3], true, true, z4, false, 100, false);
            this.wifiPreset = new Preset(iArr2, this.highPreset.sizes[0], jArr2[2], jArr2[3], true, true, z4, false, 100, true);
            this.roamingPreset = new Preset(iArr3, this.lowPreset.sizes[0], jArr3[2], jArr3[3], false, false, z4, true, 50, true);
            SharedPreferences.Editor edit = mainSettings.edit();
            edit.putBoolean("newConfig", true);
            edit.putString("mobilePreset", this.mobilePreset.toString());
            edit.putString("wifiPreset", this.wifiPreset.toString());
            edit.putString("roamingPreset", this.roamingPreset.toString());
            this.currentMobilePreset = 3;
            edit.putInt("currentMobilePreset", 3);
            this.currentWifiPreset = 3;
            edit.putInt("currentWifiPreset", 3);
            this.currentRoamingPreset = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.commit();
        } else {
            this.mobilePreset = new Preset(mainSettings.getString("mobilePreset", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
            this.wifiPreset = new Preset(mainSettings.getString("wifiPreset", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
            this.roamingPreset = new Preset(mainSettings.getString("roamingPreset", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
            this.currentMobilePreset = mainSettings.getInt("currentMobilePreset", 3);
            this.currentWifiPreset = mainSettings.getInt("currentWifiPreset", 3);
            this.currentRoamingPreset = mainSettings.getInt("currentRoamingPreset", 3);
            if (!contains) {
                mainSettings.edit().putBoolean("newConfig", true).commit();
            }
        }
        AndroidUtilities.runOnUIThread(new a2(this, 1));
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
            {
                DownloadController.this = this;
            }

            @Override
            public void onReceive(Context context, Intent intent) {
                DownloadController.this.checkAutodownloadSettings();
            }
        };
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationLoader.applicationContext.registerReceiver(broadcastReceiver, intentFilter, 4);
        } else {
            ApplicationLoader.applicationContext.registerReceiver(broadcastReceiver, intentFilter);
        }
        if (getUserConfig().isClientActivated()) {
            checkAutodownloadSettings();
        }
    }

    private int canDownloadMediaInternal(org.telegram.messenger.MessageObject r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.DownloadController.canDownloadMediaInternal(org.telegram.messenger.MessageObject):int");
    }

    private void checkDownloadFinished(String str, int i10) {
        DownloadObject downloadObject = this.downloadQueueKeys.get(str);
        if (downloadObject != null) {
            this.downloadQueueKeys.remove(str);
            this.downloadQueuePairs.remove(new Pair(Long.valueOf(downloadObject.f18044id), Integer.valueOf(downloadObject.type)));
            if (i10 == 0 || i10 == 2) {
                getMessagesStorage().removeFromDownloadQueue(downloadObject.f18044id, downloadObject.type, false);
            }
            int i11 = downloadObject.type;
            if (i11 == 1) {
                this.photoDownloadQueue.remove(downloadObject);
                if (this.photoDownloadQueue.isEmpty()) {
                    newDownloadObjectsAvailable(1);
                }
            } else if (i11 == 2) {
                this.audioDownloadQueue.remove(downloadObject);
                if (this.audioDownloadQueue.isEmpty()) {
                    newDownloadObjectsAvailable(2);
                }
            } else if (i11 == 4) {
                this.videoDownloadQueue.remove(downloadObject);
                if (this.videoDownloadQueue.isEmpty()) {
                    newDownloadObjectsAvailable(4);
                }
            } else if (i11 == 8) {
                this.documentDownloadQueue.remove(downloadObject);
                if (this.documentDownloadQueue.isEmpty()) {
                    newDownloadObjectsAvailable(8);
                }
            }
        }
    }

    public static DownloadController getInstance(int i10) {
        DownloadController downloadController;
        DownloadController downloadController2 = Instance[i10];
        if (downloadController2 == null) {
            synchronized (DownloadController.class) {
                try {
                    downloadController = Instance[i10];
                    if (downloadController == null) {
                        DownloadController[] downloadControllerArr = Instance;
                        DownloadController downloadController3 = new DownloadController(i10);
                        downloadControllerArr[i10] = downloadController3;
                        downloadController = downloadController3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return downloadController;
        }
        return downloadController2;
    }

    public static float getProgress(long[] jArr) {
        if (jArr != null && jArr.length >= 2) {
            long j10 = jArr[1];
            if (j10 != 0) {
                return Math.min(1.0f, ((float) jArr[0]) / ((float) j10));
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public void lambda$clearRecentDownloadedFiles$12() {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM downloading_documents WHERE state = 1").stepThis().dispose();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public void lambda$deleteRecentFiles$13(ArrayList arrayList) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                executeFast.requery();
                executeFast.bindInteger(1, ((MessageObject) arrayList.get(i10)).getDocument().dc_id);
                executeFast.bindLong(2, ((MessageObject) arrayList.get(i10)).getDocument().f20849id);
                executeFast.step();
                try {
                    FileLoader.getInstance(this.currentAccount).getPathToMessage(((MessageObject) arrayList.get(i10)).messageOwner).delete();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$loadAutoDownloadConfig$1(TLObject tLObject) {
        Preset preset;
        this.loadingAutoDownloadConfig = false;
        getUserConfig().autoDownloadConfigLoadTime = System.currentTimeMillis();
        getUserConfig().saveConfig(false);
        if (tLObject != null) {
            TL_account.autoDownloadSettings autodownloadsettings = (TL_account.autoDownloadSettings) tLObject;
            this.lowPreset.set(autodownloadsettings.low);
            this.lowPreset.preloadStories = false;
            this.mediumPreset.set(autodownloadsettings.medium);
            this.highPreset.set(autodownloadsettings.high);
            for (int i10 = 0; i10 < 3; i10++) {
                if (i10 == 0) {
                    preset = this.mobilePreset;
                } else if (i10 == 1) {
                    preset = this.wifiPreset;
                } else {
                    preset = this.roamingPreset;
                }
                if (preset.equals(this.lowPreset)) {
                    preset.set(autodownloadsettings.low);
                    preset.preloadStories = false;
                } else if (preset.equals(this.mediumPreset)) {
                    preset.set(autodownloadsettings.medium);
                } else if (preset.equals(this.highPreset)) {
                    preset.set(autodownloadsettings.high);
                }
            }
            SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
            edit.putString("mobilePreset", this.mobilePreset.toString());
            edit.putString("wifiPreset", this.wifiPreset.toString());
            edit.putString("roamingPreset", this.roamingPreset.toString());
            edit.putString("preset0", this.lowPreset.toString());
            edit.putString("preset1", this.mediumPreset.toString());
            edit.putString("preset2", this.highPreset.toString());
            edit.commit();
            this.lowPreset.toString();
            this.mediumPreset.toString();
            this.highPreset.toString();
            checkAutodownloadSettings();
        }
    }

    public void lambda$loadAutoDownloadConfig$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new d2(0, this, tLObject));
    }

    public void lambda$loadDownloadingFiles$10(ArrayList arrayList, ArrayList arrayList2) {
        this.downloadingFiles.clear();
        this.downloadingFiles.addAll(arrayList);
        this.recentDownloadingFiles.clear();
        this.recentDownloadingFiles.addAll(arrayList2);
    }

    public void lambda$loadDownloadingFiles$11() {
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        try {
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                int intValue = queryFinalized.intValue(1);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (TLdeserialize != null) {
                        TLdeserialize.readAttachPath(byteBufferValue, UserConfig.getInstance(this.currentAccount).clientUserId);
                        MessageObject messageObject = new MessageObject(this.currentAccount, TLdeserialize, false, false);
                        arrayList3.add(messageObject);
                        if (intValue == 0) {
                            arrayList.add(messageObject);
                        } else {
                            arrayList2.add(messageObject);
                        }
                    }
                    byteBufferValue.reuse();
                }
            }
            queryFinalized.dispose();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        getFileLoader().checkMediaExistance(arrayList);
        getFileLoader().checkMediaExistance(arrayList2);
        AndroidUtilities.runOnUIThread(new g0((BaseController) this, (ArrayList) arrayList, (Object) arrayList2, 18));
    }

    public void lambda$new$0() {
        getNotificationCenter().addObserver(this, NotificationCenter.fileLoadFailed);
        getNotificationCenter().addObserver(this, NotificationCenter.fileLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.fileLoadProgressChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.fileUploadProgressChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.httpFileDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.httpFileDidFailedLoad);
        loadAutoDownloadConfig(false);
    }

    public void lambda$onDownloadComplete$6(MessageObject messageObject) {
        int i10;
        try {
            Locale locale = Locale.ENGLISH;
            long currentTimeMillis = System.currentTimeMillis();
            int i11 = messageObject.getDocument().dc_id;
            long j10 = messageObject.getDocument().f20849id;
            getMessagesStorage().getDatabase().executeFast("UPDATE downloading_documents SET state = 1, date = " + currentTimeMillis + " WHERE hash = " + i11 + " AND id = " + j10).stepThis().dispose();
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT COUNT(*) FROM downloading_documents WHERE state = 1", new Object[0]);
            if (queryFinalized.next()) {
                i10 = queryFinalized.intValue(0);
            } else {
                i10 = 0;
            }
            queryFinalized.dispose();
            SQLiteCursor queryFinalized2 = getMessagesStorage().getDatabase().queryFinalized("SELECT state FROM downloading_documents WHERE state = 1", new Object[0]);
            if (queryFinalized2.next()) {
                queryFinalized2.intValue(0);
            }
            queryFinalized2.dispose();
            if (i10 > 100) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                SQLiteCursor queryFinalized3 = database.queryFinalized("SELECT hash, id FROM downloading_documents WHERE state = 1 ORDER BY date ASC LIMIT " + (100 - i10), new Object[0]);
                ArrayList arrayList = new ArrayList();
                while (queryFinalized3.next()) {
                    DownloadingDocumentEntry downloadingDocumentEntry = new DownloadingDocumentEntry();
                    downloadingDocumentEntry.hash = queryFinalized3.intValue(0);
                    downloadingDocumentEntry.f18043id = queryFinalized3.longValue(1);
                    arrayList.add(downloadingDocumentEntry);
                }
                queryFinalized3.dispose();
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    executeFast.requery();
                    executeFast.bindInteger(1, ((DownloadingDocumentEntry) arrayList.get(i12)).hash);
                    executeFast.bindLong(2, ((DownloadingDocumentEntry) arrayList.get(i12)).f18043id);
                    executeFast.step();
                }
                executeFast.dispose();
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public void lambda$onDownloadComplete$7(TLRPC.Document document, MessageObject messageObject) {
        for (int i10 = 0; i10 < this.downloadingFiles.size(); i10++) {
            if (this.downloadingFiles.get(i10).getDocument() != null && this.downloadingFiles.get(i10).getDocument().f20849id == document.f20849id) {
                this.downloadingFiles.remove(i10);
                int i11 = 0;
                while (true) {
                    if (i11 < this.recentDownloadingFiles.size()) {
                        if (this.recentDownloadingFiles.get(i11).getDocument() != null && this.recentDownloadingFiles.get(i11).getDocument().f20849id == document.f20849id) {
                            break;
                        }
                        i11++;
                    } else {
                        this.recentDownloadingFiles.add(0, messageObject);
                        putToUnviewedDownloads(messageObject);
                        break;
                    }
                }
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
                getMessagesStorage().getStorageQueue().postRunnable(new b2(this, messageObject, 2));
                return;
            }
        }
    }

    public void lambda$onDownloadFail$8(MessageObject messageObject, int i10) {
        TLRPC.Document document = messageObject.getDocument();
        for (int i11 = 0; i11 < this.downloadingFiles.size(); i11++) {
            TLRPC.Document document2 = this.downloadingFiles.get(i11).getDocument();
            if (document2 == null || (document != null && document2.f20849id == document.f20849id)) {
                this.downloadingFiles.remove(i11);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
                if (i10 == 0) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.formatString("MessageNotFound", R.string.MessageNotFound, new Object[0]));
                    return;
                } else if (i10 == -1) {
                    LaunchActivity.E(2);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public void lambda$onDownloadFail$9(MessageObject messageObject) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
            executeFast.bindInteger(1, messageObject.getDocument().dc_id);
            executeFast.bindLong(2, messageObject.getDocument().f20849id);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public void lambda$startDownloadFile$4(MessageObject messageObject) {
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageObject.messageOwner.getObjectSize());
            messageObject.messageOwner.serializeToStream(nativeByteBuffer);
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO downloading_documents VALUES(?, ?, ?, ?, ?)");
            executeFast.bindByteBuffer(1, nativeByteBuffer);
            executeFast.bindInteger(2, messageObject.getDocument().dc_id);
            executeFast.bindLong(3, messageObject.getDocument().f20849id);
            executeFast.bindLong(4, System.currentTimeMillis());
            executeFast.bindInteger(4, 0);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer.reuse();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public void lambda$startDownloadFile$5(TLRPC.Document document, MessageObject messageObject) {
        boolean z4;
        boolean z10;
        TLRPC.Document document2;
        TLRPC.Document document3;
        if (document == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            z4 = true;
            if (i10 < this.recentDownloadingFiles.size()) {
                MessageObject messageObject2 = this.recentDownloadingFiles.get(i10);
                if (messageObject2 != null && (document3 = messageObject2.getDocument()) != null && document3.f20849id == document.f20849id) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            for (int i11 = 0; i11 < this.downloadingFiles.size(); i11++) {
                MessageObject messageObject3 = this.downloadingFiles.get(i11);
                if (messageObject3 != null && (document2 = messageObject3.getDocument()) != null && document2.f20849id == document.f20849id) {
                    break;
                }
            }
        }
        z4 = z10;
        if (!z4) {
            this.downloadingFiles.add(0, messageObject);
            getMessagesStorage().getStorageQueue().postRunnable(new b2(this, messageObject, 0));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
    }

    private void processLaterArrays() {
        for (Map.Entry<String, FileDownloadProgressListener> entry : this.addLaterArray.entrySet()) {
            addLoadingFileObserver(entry.getKey(), entry.getValue());
        }
        this.addLaterArray.clear();
        ArrayList<FileDownloadProgressListener> arrayList = this.deleteLaterArray;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            FileDownloadProgressListener fileDownloadProgressListener = arrayList.get(i10);
            i10++;
            removeLoadingFileObserver(fileDownloadProgressListener);
        }
        this.deleteLaterArray.clear();
    }

    private void putToUnviewedDownloads(MessageObject messageObject) {
        this.unviewedDownloads.put(messageObject.getId(), messageObject);
        AndroidUtilities.cancelRunOnUIThread(this.clearUnviewedDownloadsRunnale);
        AndroidUtilities.runOnUIThread(this.clearUnviewedDownloadsRunnale, 60000L);
    }

    public static int typeToIndex(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 4) {
            return 1;
        }
        if (i10 != 8) {
            return 0;
        }
        return 2;
    }

    public void addLoadingFileObserver(String str, FileDownloadProgressListener fileDownloadProgressListener) {
        addLoadingFileObserver(str, null, fileDownloadProgressListener);
    }

    public boolean canDownloadMedia(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (messageObject.type == 23) {
            return (!SharedConfig.isAutoplayVideo() || (storyItem = ((TLRPC.TL_messageMediaStory) MessageObject.getMedia(messageObject)).storyItem) == null || (messageMedia = storyItem.media) == null || messageMedia.document == null || !storyItem.isPublic) ? false : true;
        } else if (messageObject.sponsoredMedia != null) {
            return true;
        } else {
            return !messageObject.isHiddenSensitive() && canDownloadMediaInternal(messageObject) == 1;
        }
    }

    public int canDownloadMediaType(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (messageObject.type == 23) {
            return (!SharedConfig.isAutoplayVideo() || (storyItem = ((TLRPC.TL_messageMediaStory) MessageObject.getMedia(messageObject)).storyItem) == null || (messageMedia = storyItem.media) == null || messageMedia.document == null || !storyItem.isPublic) ? 0 : 2;
        } else if (messageObject.sponsoredMedia != null) {
            return 2;
        } else {
            if (messageObject.isHiddenSensitive()) {
                return 0;
            }
            return canDownloadMediaInternal(messageObject);
        }
    }

    public boolean canDownloadNextTrack() {
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
            if (!this.wifiPreset.enabled || !getCurrentWiFiPreset().preloadMusic) {
                return false;
            }
            return true;
        } else if (autodownloadNetworkType == 2) {
            if (!this.roamingPreset.enabled || !getCurrentRoamingPreset().preloadMusic) {
                return false;
            }
            return true;
        } else if (!this.mobilePreset.enabled || !getCurrentMobilePreset().preloadMusic) {
            return false;
        } else {
            return true;
        }
    }

    public boolean canPreloadStories() {
        Preset currentMobilePreset;
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
            if (!this.wifiPreset.enabled) {
                return false;
            }
            currentMobilePreset = getCurrentWiFiPreset();
        } else if (autodownloadNetworkType == 2) {
            if (!this.roamingPreset.enabled) {
                return false;
            }
            currentMobilePreset = getCurrentRoamingPreset();
        } else if (!this.mobilePreset.enabled) {
            return false;
        } else {
            currentMobilePreset = getCurrentMobilePreset();
        }
        return currentMobilePreset.preloadStories;
    }

    public void cancelDownloading(ArrayList<Pair<Long, Integer>> arrayList) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            DownloadObject downloadObject = this.downloadQueuePairs.get(arrayList.get(i10));
            if (downloadObject != null) {
                TLObject tLObject = downloadObject.object;
                if (tLObject instanceof TLRPC.Document) {
                    getFileLoader().cancelLoadFile((TLRPC.Document) tLObject, true);
                } else if ((tLObject instanceof TLRPC.Photo) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize())) != null) {
                    getFileLoader().cancelLoadFile(closestPhotoSizeWithSize, true);
                }
            }
        }
    }

    public void checkAutodownloadSettings() {
        int currentDownloadMask = getCurrentDownloadMask();
        if (currentDownloadMask != this.lastCheckMask) {
            this.lastCheckMask = currentDownloadMask;
            if ((currentDownloadMask & 1) != 0) {
                if (this.photoDownloadQueue.isEmpty()) {
                    newDownloadObjectsAvailable(1);
                }
            } else {
                for (int i10 = 0; i10 < this.photoDownloadQueue.size(); i10++) {
                    DownloadObject downloadObject = this.photoDownloadQueue.get(i10);
                    TLObject tLObject = downloadObject.object;
                    if (tLObject instanceof TLRPC.Photo) {
                        getFileLoader().cancelLoadFile(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize()));
                    } else if (tLObject instanceof TLRPC.Document) {
                        getFileLoader().cancelLoadFile((TLRPC.Document) downloadObject.object);
                    }
                }
                this.photoDownloadQueue.clear();
            }
            if ((currentDownloadMask & 2) != 0) {
                if (this.audioDownloadQueue.isEmpty()) {
                    newDownloadObjectsAvailable(2);
                }
            } else {
                for (int i11 = 0; i11 < this.audioDownloadQueue.size(); i11++) {
                    getFileLoader().cancelLoadFile((TLRPC.Document) this.audioDownloadQueue.get(i11).object);
                }
                this.audioDownloadQueue.clear();
            }
            if ((currentDownloadMask & 8) != 0) {
                if (this.documentDownloadQueue.isEmpty()) {
                    newDownloadObjectsAvailable(8);
                }
            } else {
                for (int i12 = 0; i12 < this.documentDownloadQueue.size(); i12++) {
                    getFileLoader().cancelLoadFile((TLRPC.Document) this.documentDownloadQueue.get(i12).object);
                }
                this.documentDownloadQueue.clear();
            }
            if ((currentDownloadMask & 4) != 0) {
                if (this.videoDownloadQueue.isEmpty()) {
                    newDownloadObjectsAvailable(4);
                }
            } else {
                for (int i13 = 0; i13 < this.videoDownloadQueue.size(); i13++) {
                    getFileLoader().cancelLoadFile((TLRPC.Document) this.videoDownloadQueue.get(i13).object);
                }
                this.videoDownloadQueue.clear();
            }
            int autodownloadMaskAll = getAutodownloadMaskAll();
            if (autodownloadMaskAll == 0) {
                getMessagesStorage().clearDownloadQueue(0);
                return;
            }
            if ((autodownloadMaskAll & 1) == 0) {
                getMessagesStorage().clearDownloadQueue(1);
            }
            if ((autodownloadMaskAll & 2) == 0) {
                getMessagesStorage().clearDownloadQueue(2);
            }
            if ((autodownloadMaskAll & 4) == 0) {
                getMessagesStorage().clearDownloadQueue(4);
            }
            if ((autodownloadMaskAll & 8) == 0) {
                getMessagesStorage().clearDownloadQueue(8);
            }
        }
    }

    public void checkUnviewedDownloads(int i10, long j10) {
        MessageObject messageObject = this.unviewedDownloads.get(i10);
        if (messageObject != null && messageObject.getDialogId() == j10) {
            this.unviewedDownloads.remove(i10);
            if (this.unviewedDownloads.size() == 0) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
            }
        }
    }

    public void cleanup() {
        this.photoDownloadQueue.clear();
        this.audioDownloadQueue.clear();
        this.documentDownloadQueue.clear();
        this.videoDownloadQueue.clear();
        this.downloadQueueKeys.clear();
        this.downloadQueuePairs.clear();
        this.typingTimes.b();
    }

    public void clearRecentDownloadedFiles() {
        this.recentDownloadingFiles.clear();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
        getMessagesStorage().getStorageQueue().postRunnable(new a2(this, 0));
    }

    public void clearUnviewedDownloads() {
        this.unviewedDownloads.clear();
    }

    public void deleteRecentFiles(ArrayList<MessageObject> arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int i11 = 0;
            while (true) {
                if (i11 < this.recentDownloadingFiles.size()) {
                    if (arrayList.get(i10).getId() == this.recentDownloadingFiles.get(i11).getId() && this.recentDownloadingFiles.get(i11).getDialogId() == arrayList.get(i10).getDialogId()) {
                        this.recentDownloadingFiles.remove(i11);
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= this.downloadingFiles.size()) {
                            break;
                        }
                        if (arrayList.get(i10).getId() == this.downloadingFiles.get(i12).getId() && this.downloadingFiles.get(i12).getDialogId() == arrayList.get(i10).getDialogId()) {
                            this.downloadingFiles.remove(i12);
                            break;
                        }
                        i12++;
                    }
                }
            }
            arrayList.get(i10).putInDownloadsStore = false;
            FileLoader.getInstance(this.currentAccount).loadFile(arrayList.get(i10).getDocument(), arrayList.get(i10), 0, 0);
            FileLoader.getInstance(this.currentAccount).cancelLoadFile(arrayList.get(i10).getDocument(), true);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
        getMessagesStorage().getStorageQueue().postRunnable(new e3(29, this, arrayList));
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z4;
        if (i10 != NotificationCenter.fileLoadFailed && i10 != NotificationCenter.httpFileDidFailedLoad) {
            if (i10 != NotificationCenter.fileLoaded && i10 != NotificationCenter.httpFileDidLoad) {
                if (i10 == NotificationCenter.fileLoadProgressChanged) {
                    this.listenerInProgress = true;
                    String str = (String) objArr[0];
                    ArrayList<WeakReference<FileDownloadProgressListener>> arrayList = this.loadingFileObservers.get(str);
                    if (arrayList != null) {
                        Long l10 = (Long) objArr[1];
                        Long l11 = (Long) objArr[2];
                        int size = arrayList.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            WeakReference<FileDownloadProgressListener> weakReference = arrayList.get(i12);
                            if (weakReference.get() != null) {
                                weakReference.get().onProgressDownload(str, l10.longValue(), l11.longValue());
                            }
                        }
                    }
                    this.listenerInProgress = false;
                    processLaterArrays();
                    return;
                } else if (i10 == NotificationCenter.fileUploadProgressChanged) {
                    this.listenerInProgress = true;
                    String str2 = (String) objArr[0];
                    ArrayList<WeakReference<FileDownloadProgressListener>> arrayList2 = this.loadingFileObservers.get(str2);
                    if (arrayList2 != null) {
                        Long l12 = (Long) objArr[1];
                        Long l13 = (Long) objArr[2];
                        Boolean bool = (Boolean) objArr[3];
                        int size2 = arrayList2.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            WeakReference<FileDownloadProgressListener> weakReference2 = arrayList2.get(i13);
                            if (weakReference2.get() != null) {
                                weakReference2.get().onProgressUpload(str2, l12.longValue(), l13.longValue(), bool.booleanValue());
                            }
                        }
                    }
                    this.listenerInProgress = false;
                    processLaterArrays();
                    try {
                        ArrayList<SendMessagesHelper.DelayedMessage> delayedMessages = getSendMessagesHelper().getDelayedMessages(str2);
                        if (delayedMessages != null) {
                            for (int i14 = 0; i14 < delayedMessages.size(); i14++) {
                                SendMessagesHelper.DelayedMessage delayedMessage = delayedMessages.get(i14);
                                if (delayedMessage.encryptedChat == null) {
                                    long j10 = delayedMessage.peer;
                                    int i15 = delayedMessage.topMessageId;
                                    Long l14 = (Long) this.typingTimes.f(j10);
                                    if (delayedMessage.type == 4) {
                                        if (l14 != null && l14.longValue() + 4000 >= System.currentTimeMillis()) {
                                        }
                                        HashMap<Object, Object> hashMap = delayedMessage.extraHashMap;
                                        MessageObject messageObject = (MessageObject) hashMap.get(str2 + "_i");
                                        if (messageObject != null && messageObject.isVideo()) {
                                            getMessagesController().sendTyping(j10, i15, 5, 0);
                                        } else if (messageObject != null && messageObject.getDocument() != null) {
                                            getMessagesController().sendTyping(j10, i15, 3, 0);
                                        } else {
                                            getMessagesController().sendTyping(j10, i15, 4, 0);
                                        }
                                        this.typingTimes.k(Long.valueOf(System.currentTimeMillis()), j10);
                                    } else {
                                        delayedMessage.obj.getDocument();
                                        if (l14 == null || l14.longValue() + 4000 < System.currentTimeMillis()) {
                                            if (delayedMessage.obj.isRoundVideo()) {
                                                getMessagesController().sendTyping(j10, i15, 8, 0);
                                            } else if (delayedMessage.obj.isVideo()) {
                                                getMessagesController().sendTyping(j10, i15, 5, 0);
                                            } else if (delayedMessage.obj.isVoice()) {
                                                getMessagesController().sendTyping(j10, i15, 9, 0);
                                            } else if (delayedMessage.obj.getDocument() != null) {
                                                getMessagesController().sendTyping(j10, i15, 3, 0);
                                            } else if (delayedMessage.photoSize != null) {
                                                getMessagesController().sendTyping(j10, i15, 4, 0);
                                            }
                                            this.typingTimes.k(Long.valueOf(System.currentTimeMillis()), j10);
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                } else {
                    return;
                }
            }
            this.listenerInProgress = true;
            String str3 = (String) objArr[0];
            ArrayList<MessageObject> arrayList3 = this.loadingFileMessagesObservers.get(str3);
            if (arrayList3 != null) {
                int size3 = arrayList3.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    arrayList3.get(i16).mediaExists = true;
                }
                this.loadingFileMessagesObservers.remove(str3);
            }
            ArrayList<WeakReference<FileDownloadProgressListener>> arrayList4 = this.loadingFileObservers.get(str3);
            if (arrayList4 != null) {
                int size4 = arrayList4.size();
                for (int i17 = 0; i17 < size4; i17++) {
                    WeakReference<FileDownloadProgressListener> weakReference3 = arrayList4.get(i17);
                    if (weakReference3.get() != null) {
                        weakReference3.get().onSuccessDownload(str3);
                        this.observersByTag.remove(weakReference3.get().getObserverTag());
                    }
                }
                this.loadingFileObservers.remove(str3);
            }
            this.listenerInProgress = false;
            processLaterArrays();
            checkDownloadFinished(str3, 0);
            return;
        }
        String str4 = (String) objArr[0];
        Integer num = (Integer) objArr[1];
        this.listenerInProgress = true;
        ArrayList<WeakReference<FileDownloadProgressListener>> arrayList5 = this.loadingFileObservers.get(str4);
        if (arrayList5 != null) {
            int size5 = arrayList5.size();
            for (int i18 = 0; i18 < size5; i18++) {
                WeakReference<FileDownloadProgressListener> weakReference4 = arrayList5.get(i18);
                if (weakReference4.get() != null) {
                    FileDownloadProgressListener fileDownloadProgressListener = weakReference4.get();
                    if (num.intValue() == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    fileDownloadProgressListener.onFailedDownload(str4, z4);
                    if (num.intValue() != 1) {
                        this.observersByTag.remove(weakReference4.get().getObserverTag());
                    }
                }
            }
            if (num.intValue() != 1) {
                this.loadingFileObservers.remove(str4);
            }
        }
        this.listenerInProgress = false;
        processLaterArrays();
        checkDownloadFinished(str4, num.intValue());
    }

    public int generateObserverTag() {
        int i10 = this.lastTag;
        this.lastTag = i10 + 1;
        return i10;
    }

    public int getAutodownloadMask() {
        int[] iArr;
        int i10;
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
            if (!this.wifiPreset.enabled) {
                return 0;
            }
            iArr = getCurrentWiFiPreset().mask;
        } else if (autodownloadNetworkType == 2) {
            if (!this.roamingPreset.enabled) {
                return 0;
            }
            iArr = getCurrentRoamingPreset().mask;
        } else if (!this.mobilePreset.enabled) {
            return 0;
        } else {
            iArr = getCurrentMobilePreset().mask;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            if ((i13 & 1) != 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if ((i13 & 2) != 0) {
                i10 |= 2;
            }
            if ((i13 & 4) != 0) {
                i10 |= 4;
            }
            if ((i13 & 8) != 0) {
                i10 |= 8;
            }
            i11 |= i10 << (i12 * 8);
        }
        return i11;
    }

    public int getAutodownloadMaskAll() {
        if (!this.mobilePreset.enabled && !this.roamingPreset.enabled && !this.wifiPreset.enabled) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            if ((getCurrentMobilePreset().mask[i11] & 1) != 0 || (getCurrentWiFiPreset().mask[i11] & 1) != 0 || (getCurrentRoamingPreset().mask[i11] & 1) != 0) {
                i10 |= 1;
            }
            if ((getCurrentMobilePreset().mask[i11] & 2) != 0 || (getCurrentWiFiPreset().mask[i11] & 2) != 0 || (getCurrentRoamingPreset().mask[i11] & 2) != 0) {
                i10 |= 2;
            }
            if ((getCurrentMobilePreset().mask[i11] & 4) != 0 || (getCurrentWiFiPreset().mask[i11] & 4) != 0 || (4 & getCurrentRoamingPreset().mask[i11]) != 0) {
                i10 |= 4;
            }
            if ((getCurrentMobilePreset().mask[i11] & 8) != 0 || (getCurrentWiFiPreset().mask[i11] & 8) != 0 || (getCurrentRoamingPreset().mask[i11] & 8) != 0) {
                i10 |= 8;
            }
        }
        return i10;
    }

    public int getCurrentDownloadMask() {
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        int i10 = 0;
        if (autodownloadNetworkType == 1) {
            if (!this.wifiPreset.enabled) {
                return 0;
            }
            int i11 = 0;
            while (i10 < 4) {
                i11 |= getCurrentWiFiPreset().mask[i10];
                i10++;
            }
            return i11;
        } else if (autodownloadNetworkType == 2) {
            if (!this.roamingPreset.enabled) {
                return 0;
            }
            int i12 = 0;
            while (i10 < 4) {
                i12 |= getCurrentRoamingPreset().mask[i10];
                i10++;
            }
            return i12;
        } else if (!this.mobilePreset.enabled) {
            return 0;
        } else {
            int i13 = 0;
            while (i10 < 4) {
                i13 |= getCurrentMobilePreset().mask[i10];
                i10++;
            }
            return i13;
        }
    }

    public Preset getCurrentMobilePreset() {
        int i10 = this.currentMobilePreset;
        if (i10 == 0) {
            return this.lowPreset;
        }
        if (i10 == 1) {
            return this.mediumPreset;
        }
        if (i10 == 2) {
            return this.highPreset;
        }
        return this.mobilePreset;
    }

    public Preset getCurrentRoamingPreset() {
        int i10 = this.currentRoamingPreset;
        if (i10 == 0) {
            return this.lowPreset;
        }
        if (i10 == 1) {
            return this.mediumPreset;
        }
        if (i10 == 2) {
            return this.highPreset;
        }
        return this.roamingPreset;
    }

    public Preset getCurrentWiFiPreset() {
        int i10 = this.currentWifiPreset;
        if (i10 == 0) {
            return this.lowPreset;
        }
        if (i10 == 1) {
            return this.mediumPreset;
        }
        if (i10 == 2) {
            return this.highPreset;
        }
        return this.wifiPreset;
    }

    public int getMaxVideoBitrate() {
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
            return getCurrentWiFiPreset().maxVideoBitrate;
        }
        if (autodownloadNetworkType == 2) {
            return getCurrentRoamingPreset().maxVideoBitrate;
        }
        return getCurrentMobilePreset().maxVideoBitrate;
    }

    public boolean hasUnviewedDownloads() {
        if (this.unviewedDownloads.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean isDownloading(int i10) {
        for (int i11 = 0; i11 < this.downloadingFiles.size(); i11++) {
            if (this.downloadingFiles.get(i11).messageOwner.f20864id == i10) {
                return true;
            }
        }
        return false;
    }

    public void loadAutoDownloadConfig(boolean z4) {
        if (!this.loadingAutoDownloadConfig) {
            if (z4 || Math.abs(System.currentTimeMillis() - getUserConfig().autoDownloadConfigLoadTime) >= 86400000) {
                this.loadingAutoDownloadConfig = true;
                getConnectionsManager().sendRequest(new TL_account.getAutoDownloadSettings(), new h0(this, 2));
            }
        }
    }

    public void loadDownloadingFiles() {
        getMessagesStorage().getStorageQueue().postRunnable(new a2(this, 2));
    }

    public void newDownloadObjectsAvailable(int i10) {
        int currentDownloadMask = getCurrentDownloadMask();
        if ((currentDownloadMask & 1) != 0 && (i10 & 1) != 0 && this.photoDownloadQueue.isEmpty()) {
            getMessagesStorage().getDownloadQueue(1);
        }
        if ((currentDownloadMask & 2) != 0 && (i10 & 2) != 0 && this.audioDownloadQueue.isEmpty()) {
            getMessagesStorage().getDownloadQueue(2);
        }
        if ((currentDownloadMask & 4) != 0 && (i10 & 4) != 0 && this.videoDownloadQueue.isEmpty()) {
            getMessagesStorage().getDownloadQueue(4);
        }
        if ((currentDownloadMask & 8) != 0 && (i10 & 8) != 0 && this.documentDownloadQueue.isEmpty()) {
            getMessagesStorage().getDownloadQueue(8);
        }
    }

    public void onDownloadComplete(MessageObject messageObject) {
        if (messageObject != null && messageObject.getDocument() != null) {
            AndroidUtilities.runOnUIThread(new c2(this, messageObject.getDocument(), messageObject, 0));
        }
    }

    public void onDownloadFail(MessageObject messageObject, int i10) {
        if (messageObject == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new s4(this, messageObject, i10, 2));
        getMessagesStorage().getStorageQueue().postRunnable(new b2(this, messageObject, 1));
    }

    public void processDownloadObjects(int r20, java.util.ArrayList<org.telegram.messenger.DownloadObject> r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.DownloadController.processDownloadObjects(int, java.util.ArrayList):void");
    }

    public void removeLoadingFileObserver(FileDownloadProgressListener fileDownloadProgressListener) {
        if (this.listenerInProgress) {
            this.deleteLaterArray.add(fileDownloadProgressListener);
            return;
        }
        String str = this.observersByTag.get(fileDownloadProgressListener.getObserverTag());
        if (str != null) {
            ArrayList<WeakReference<FileDownloadProgressListener>> arrayList = this.loadingFileObservers.get(str);
            if (arrayList != null) {
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    WeakReference<FileDownloadProgressListener> weakReference = arrayList.get(i10);
                    if (weakReference.get() == null || weakReference.get() == fileDownloadProgressListener) {
                        arrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                if (arrayList.isEmpty()) {
                    this.loadingFileObservers.remove(str);
                }
            }
            this.observersByTag.remove(fileDownloadProgressListener.getObserverTag());
        }
    }

    public void savePresetToServer(int i10) {
        Preset currentRoamingPreset;
        boolean z4;
        long j10;
        TL_account.saveAutoDownloadSettings saveautodownloadsettings = new TL_account.saveAutoDownloadSettings();
        if (i10 == 0) {
            currentRoamingPreset = getCurrentMobilePreset();
            z4 = this.mobilePreset.enabled;
        } else if (i10 == 1) {
            currentRoamingPreset = getCurrentWiFiPreset();
            z4 = this.wifiPreset.enabled;
        } else {
            currentRoamingPreset = getCurrentRoamingPreset();
            z4 = this.roamingPreset.enabled;
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings = new TLRPC.TL_autoDownloadSettings();
        saveautodownloadsettings.settings = tL_autoDownloadSettings;
        tL_autoDownloadSettings.audio_preload_next = currentRoamingPreset.preloadMusic;
        tL_autoDownloadSettings.video_preload_large = currentRoamingPreset.preloadVideo;
        tL_autoDownloadSettings.phonecalls_less_data = currentRoamingPreset.lessCallData;
        tL_autoDownloadSettings.video_upload_maxbitrate = currentRoamingPreset.maxVideoBitrate;
        tL_autoDownloadSettings.disabled = !z4;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            int[] iArr = currentRoamingPreset.mask;
            if (i12 >= iArr.length) {
                break;
            }
            int i13 = iArr[i12];
            if ((i13 & 1) != 0) {
                z10 = true;
            }
            if ((i13 & 4) != 0) {
                z11 = true;
            }
            if ((i13 & 8) != 0) {
                z12 = true;
            }
            if (z10 && z11 && z12) {
                break;
            }
            i12++;
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings2 = saveautodownloadsettings.settings;
        if (z10) {
            i11 = (int) currentRoamingPreset.sizes[0];
        }
        tL_autoDownloadSettings2.photo_size_max = i11;
        long j11 = 0;
        if (z11) {
            j10 = currentRoamingPreset.sizes[1];
        } else {
            j10 = 0;
        }
        tL_autoDownloadSettings2.video_size_max = j10;
        if (z12) {
            j11 = currentRoamingPreset.sizes[2];
        }
        tL_autoDownloadSettings2.file_size_max = j11;
        getConnectionsManager().sendRequest(saveautodownloadsettings, new f5(3));
    }

    public void startDownloadFile(TLRPC.Document document, MessageObject messageObject) {
        TLRPC.Document document2;
        if (messageObject == null || (document2 = messageObject.getDocument()) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new c2(this, document2, messageObject, 1));
    }

    public void swapLoadingPriority(MessageObject messageObject, MessageObject messageObject2) {
        int indexOf = this.downloadingFiles.indexOf(messageObject);
        int indexOf2 = this.downloadingFiles.indexOf(messageObject2);
        if (indexOf >= 0 && indexOf2 >= 0) {
            this.downloadingFiles.set(indexOf, messageObject2);
            this.downloadingFiles.set(indexOf2, messageObject);
        }
        updateFilesLoadingPriority();
    }

    public void updateFilesLoadingPriority() {
        for (int size = this.downloadingFiles.size() - 1; size >= 0; size--) {
            if (getFileLoader().isLoadingFile(this.downloadingFiles.get(size).getFileName())) {
                getFileLoader().loadFile(this.downloadingFiles.get(size).getDocument(), this.downloadingFiles.get(size), 2, 0);
            }
        }
    }

    public void addLoadingFileObserver(String str, MessageObject messageObject, FileDownloadProgressListener fileDownloadProgressListener) {
        if (this.listenerInProgress) {
            this.addLaterArray.put(str, fileDownloadProgressListener);
            return;
        }
        removeLoadingFileObserver(fileDownloadProgressListener);
        ArrayList<WeakReference<FileDownloadProgressListener>> arrayList = this.loadingFileObservers.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.loadingFileObservers.put(str, arrayList);
        }
        arrayList.add(new WeakReference<>(fileDownloadProgressListener));
        if (messageObject != null) {
            ArrayList<MessageObject> arrayList2 = this.loadingFileMessagesObservers.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
                this.loadingFileMessagesObservers.put(str, arrayList2);
            }
            arrayList2.add(messageObject);
        }
        this.observersByTag.put(fileDownloadProgressListener.getObserverTag(), str);
    }

    public static class Preset {
        public boolean enabled;
        public boolean lessCallData;
        public int[] mask;
        public int maxVideoBitrate;
        public boolean preloadMusic;
        public boolean preloadStories;
        public boolean preloadVideo;
        public long[] sizes;

        public Preset(int[] iArr, long j10, long j11, long j12, boolean z4, boolean z10, boolean z11, boolean z12, int i10, boolean z13) {
            int[] iArr2 = new int[4];
            this.mask = iArr2;
            this.sizes = new long[4];
            System.arraycopy(iArr, 0, iArr2, 0, Math.max(iArr.length, iArr2.length));
            long[] jArr = this.sizes;
            jArr[0] = j10;
            jArr[1] = j11;
            jArr[2] = j12;
            jArr[3] = 524288;
            this.preloadVideo = z4;
            this.preloadMusic = z10;
            this.lessCallData = z12;
            this.maxVideoBitrate = i10;
            this.enabled = z11;
            this.preloadStories = z13;
        }

        public boolean equals(Preset preset) {
            int[] iArr = this.mask;
            int i10 = iArr[0];
            int[] iArr2 = preset.mask;
            if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
                long[] jArr = this.sizes;
                long j10 = jArr[0];
                long[] jArr2 = preset.sizes;
                if (j10 == jArr2[0] && jArr[1] == jArr2[1] && jArr[2] == jArr2[2] && jArr[3] == jArr2[3] && this.preloadVideo == preset.preloadVideo && this.preloadMusic == preset.preloadMusic && this.maxVideoBitrate == preset.maxVideoBitrate && this.preloadStories == preset.preloadStories) {
                    return true;
                }
            }
            return false;
        }

        public boolean isEnabled() {
            int i10 = 0;
            while (true) {
                int[] iArr = this.mask;
                if (i10 >= iArr.length) {
                    return false;
                }
                if (iArr[i10] != 0) {
                    return true;
                }
                i10++;
            }
        }

        public void set(Preset preset) {
            int[] iArr = preset.mask;
            int[] iArr2 = this.mask;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            long[] jArr = preset.sizes;
            long[] jArr2 = this.sizes;
            System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
            this.preloadVideo = preset.preloadVideo;
            this.preloadMusic = preset.preloadMusic;
            this.lessCallData = preset.lessCallData;
            this.maxVideoBitrate = preset.maxVideoBitrate;
            this.preloadStories = preset.preloadStories;
        }

        public String toString() {
            return this.mask[0] + "_" + this.mask[1] + "_" + this.mask[2] + "_" + this.mask[3] + "_" + this.sizes[0] + "_" + this.sizes[1] + "_" + this.sizes[2] + "_" + this.sizes[3] + "_" + (this.preloadVideo ? 1 : 0) + "_" + (this.preloadMusic ? 1 : 0) + "_" + (this.enabled ? 1 : 0) + "_" + (this.lessCallData ? 1 : 0) + "_" + this.maxVideoBitrate + "_" + (this.preloadStories ? 1 : 0);
        }

        public void set(TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings) {
            this.preloadMusic = tL_autoDownloadSettings.audio_preload_next;
            this.preloadVideo = tL_autoDownloadSettings.video_preload_large;
            this.lessCallData = tL_autoDownloadSettings.phonecalls_less_data;
            this.maxVideoBitrate = tL_autoDownloadSettings.video_upload_maxbitrate;
            int i10 = 0;
            this.sizes[0] = Math.max(512000, tL_autoDownloadSettings.photo_size_max);
            this.sizes[1] = Math.max(512000L, tL_autoDownloadSettings.video_size_max);
            this.sizes[2] = Math.max(512000L, tL_autoDownloadSettings.file_size_max);
            while (true) {
                int[] iArr = this.mask;
                if (i10 < iArr.length) {
                    if (tL_autoDownloadSettings.photo_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                        iArr[i10] = iArr[i10] | 1;
                    } else {
                        iArr[i10] = iArr[i10] & (-2);
                    }
                    if (tL_autoDownloadSettings.video_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                        iArr[i10] = iArr[i10] | 4;
                    } else {
                        iArr[i10] = iArr[i10] & (-5);
                    }
                    if (tL_autoDownloadSettings.file_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                        iArr[i10] = iArr[i10] | 8;
                    } else {
                        iArr[i10] = iArr[i10] & (-9);
                    }
                    i10++;
                } else {
                    this.preloadStories = true;
                    return;
                }
            }
        }

        public Preset(String str, String str2) {
            String[] split;
            this.mask = new int[4];
            this.sizes = new long[4];
            String[] split2 = str.split("_");
            if (split2.length >= 11) {
                this.mask[0] = Utilities.parseInt((CharSequence) split2[0]).intValue();
                this.mask[1] = Utilities.parseInt((CharSequence) split2[1]).intValue();
                this.mask[2] = Utilities.parseInt((CharSequence) split2[2]).intValue();
                this.mask[3] = Utilities.parseInt((CharSequence) split2[3]).intValue();
                this.sizes[0] = Utilities.parseInt((CharSequence) split2[4]).intValue();
                this.sizes[1] = Utilities.parseInt((CharSequence) split2[5]).intValue();
                this.sizes[2] = Utilities.parseInt((CharSequence) split2[6]).intValue();
                this.sizes[3] = Utilities.parseInt((CharSequence) split2[7]).intValue();
                this.preloadVideo = Utilities.parseInt((CharSequence) split2[8]).intValue() == 1;
                this.preloadMusic = Utilities.parseInt((CharSequence) split2[9]).intValue() == 1;
                this.enabled = Utilities.parseInt((CharSequence) split2[10]).intValue() == 1;
                if (split2.length >= 12) {
                    this.lessCallData = Utilities.parseInt((CharSequence) split2[11]).intValue() == 1;
                    split = null;
                } else {
                    split = str2.split("_");
                    this.lessCallData = Utilities.parseInt((CharSequence) split[11]).intValue() == 1;
                }
                if (split2.length >= 13) {
                    this.maxVideoBitrate = Utilities.parseInt((CharSequence) split2[12]).intValue();
                } else {
                    split = split == null ? str2.split("_") : split;
                    this.maxVideoBitrate = Utilities.parseInt((CharSequence) split[12]).intValue();
                }
                if (split2.length >= 14) {
                    this.preloadStories = Utilities.parseInt((CharSequence) split2[13]).intValue() == 1;
                } else {
                    this.preloadStories = Utilities.parseInt((CharSequence) (split == null ? str2.split("_") : split)[13]).intValue() == 1;
                }
            }
        }
    }

    public boolean canDownloadMedia(int i10, long j10) {
        Preset currentMobilePreset;
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
            if (!this.wifiPreset.enabled) {
                return false;
            }
            currentMobilePreset = getCurrentWiFiPreset();
        } else if (autodownloadNetworkType == 2) {
            if (!this.roamingPreset.enabled) {
                return false;
            }
            currentMobilePreset = getCurrentRoamingPreset();
        } else if (!this.mobilePreset.enabled) {
            return false;
        } else {
            currentMobilePreset = getCurrentMobilePreset();
        }
        return (i10 == 1 || (j10 != 0 && j10 <= currentMobilePreset.sizes[typeToIndex(i10)])) && (i10 == 2 || (i10 & currentMobilePreset.mask[1]) != 0);
    }

    public int canDownloadMediaType(MessageObject messageObject, long j10) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (messageObject.type == 23) {
            return (!SharedConfig.isAutoplayVideo() || (storyItem = ((TLRPC.TL_messageMediaStory) MessageObject.getMedia(messageObject)).storyItem) == null || (messageMedia = storyItem.media) == null || messageMedia.document == null || !storyItem.isPublic) ? 0 : 2;
        } else if (messageObject.sponsoredMedia != null) {
            return 2;
        } else {
            if (messageObject.isHiddenSensitive()) {
                return 0;
            }
            return canDownloadMediaInternal(messageObject, j10);
        }
    }

    public int canDownloadMedia(org.telegram.tgnet.TLRPC.Message r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.DownloadController.canDownloadMedia(org.telegram.tgnet.TLRPC$Message):int");
    }

    private int canDownloadMediaInternal(org.telegram.messenger.MessageObject r14, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.DownloadController.canDownloadMediaInternal(org.telegram.messenger.MessageObject, long):int");
    }

    public static void lambda$savePresetToServer$3(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public int canDownloadMedia(org.telegram.tgnet.TLRPC.Message r14, org.telegram.tgnet.TLRPC.MessageMedia r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.DownloadController.canDownloadMedia(org.telegram.tgnet.TLRPC$Message, org.telegram.tgnet.TLRPC$MessageMedia):int");
    }
}
