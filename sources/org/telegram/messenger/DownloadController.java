package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Pair;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.VideoPlayer;
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
    private LongSparseArray typingTimes;
    public final SparseArray<MessageObject> unviewedDownloads;
    private ArrayList<DownloadObject> videoDownloadQueue;
    public Preset wifiPreset;

    public interface FileDownloadProgressListener {
        int getObserverTag();

        void onFailedDownload(String str, boolean z);

        void onProgressDownload(String str, long j, long j2);

        void onProgressUpload(String str, long j, long j2, boolean z);

        void onSuccessDownload(String str);
    }

    public static void $r8$lambda$a932j3A0ioLRfL9x8R0cRYMLIoM(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static int typeToIndex(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 4) {
            return 1;
        }
        return i == 8 ? 2 : 0;
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

        public Preset(int[] iArr, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
            int[] iArr2 = new int[4];
            this.mask = iArr2;
            this.sizes = new long[4];
            System.arraycopy(iArr, 0, iArr2, 0, Math.max(iArr.length, 4));
            long[] jArr = this.sizes;
            jArr[0] = j;
            jArr[1] = j2;
            jArr[2] = j3;
            jArr[3] = 524288;
            this.preloadVideo = z;
            this.preloadMusic = z2;
            this.lessCallData = z4;
            this.maxVideoBitrate = i;
            this.enabled = z3;
            this.preloadStories = z5;
        }

        public Preset(String str, String str2) {
            String[] strArrSplit;
            this.mask = new int[4];
            this.sizes = new long[4];
            String[] strArrSplit2 = str.split("_");
            if (strArrSplit2.length >= 11) {
                this.mask[0] = Utilities.parseInt((CharSequence) strArrSplit2[0]).intValue();
                this.mask[1] = Utilities.parseInt((CharSequence) strArrSplit2[1]).intValue();
                this.mask[2] = Utilities.parseInt((CharSequence) strArrSplit2[2]).intValue();
                this.mask[3] = Utilities.parseInt((CharSequence) strArrSplit2[3]).intValue();
                this.sizes[0] = Utilities.parseInt((CharSequence) strArrSplit2[4]).intValue();
                this.sizes[1] = Utilities.parseInt((CharSequence) strArrSplit2[5]).intValue();
                this.sizes[2] = Utilities.parseInt((CharSequence) strArrSplit2[6]).intValue();
                this.sizes[3] = Utilities.parseInt((CharSequence) strArrSplit2[7]).intValue();
                this.preloadVideo = Utilities.parseInt((CharSequence) strArrSplit2[8]).intValue() == 1;
                this.preloadMusic = Utilities.parseInt((CharSequence) strArrSplit2[9]).intValue() == 1;
                this.enabled = Utilities.parseInt((CharSequence) strArrSplit2[10]).intValue() == 1;
                if (strArrSplit2.length >= 12) {
                    this.lessCallData = Utilities.parseInt((CharSequence) strArrSplit2[11]).intValue() == 1;
                    strArrSplit = null;
                } else {
                    strArrSplit = str2.split("_");
                    this.lessCallData = Utilities.parseInt((CharSequence) strArrSplit[11]).intValue() == 1;
                }
                if (strArrSplit2.length >= 13) {
                    this.maxVideoBitrate = Utilities.parseInt((CharSequence) strArrSplit2[12]).intValue();
                } else {
                    strArrSplit = strArrSplit == null ? str2.split("_") : strArrSplit;
                    this.maxVideoBitrate = Utilities.parseInt((CharSequence) strArrSplit[12]).intValue();
                }
                if (strArrSplit2.length >= 14) {
                    this.preloadStories = Utilities.parseInt((CharSequence) strArrSplit2[13]).intValue() == 1;
                } else {
                    this.preloadStories = Utilities.parseInt((CharSequence) (strArrSplit == null ? str2.split("_") : strArrSplit)[13]).intValue() == 1;
                }
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

        public void set(TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings) {
            this.preloadMusic = tL_autoDownloadSettings.audio_preload_next;
            this.preloadVideo = tL_autoDownloadSettings.video_preload_large;
            this.lessCallData = tL_autoDownloadSettings.phonecalls_less_data;
            this.maxVideoBitrate = tL_autoDownloadSettings.video_upload_maxbitrate;
            int i = 0;
            this.sizes[0] = Math.max(512000, tL_autoDownloadSettings.photo_size_max);
            this.sizes[1] = Math.max(512000L, tL_autoDownloadSettings.video_size_max);
            this.sizes[2] = Math.max(512000L, tL_autoDownloadSettings.file_size_max);
            while (true) {
                int[] iArr = this.mask;
                if (i < iArr.length) {
                    if (tL_autoDownloadSettings.photo_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                        iArr[i] = iArr[i] | 1;
                    } else {
                        iArr[i] = iArr[i] & (-2);
                    }
                    if (tL_autoDownloadSettings.video_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                        iArr[i] = iArr[i] | 4;
                    } else {
                        iArr[i] = iArr[i] & (-5);
                    }
                    if (tL_autoDownloadSettings.file_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                        iArr[i] = iArr[i] | 8;
                    } else {
                        iArr[i] = iArr[i] & (-9);
                    }
                    i++;
                } else {
                    this.preloadStories = true;
                    return;
                }
            }
        }

        public String toString() {
            return this.mask[0] + "_" + this.mask[1] + "_" + this.mask[2] + "_" + this.mask[3] + "_" + this.sizes[0] + "_" + this.sizes[1] + "_" + this.sizes[2] + "_" + this.sizes[3] + "_" + (this.preloadVideo ? 1 : 0) + "_" + (this.preloadMusic ? 1 : 0) + "_" + (this.enabled ? 1 : 0) + "_" + (this.lessCallData ? 1 : 0) + "_" + this.maxVideoBitrate + "_" + (this.preloadStories ? 1 : 0);
        }

        public boolean equals(Preset preset) {
            int[] iArr = this.mask;
            int i = iArr[0];
            int[] iArr2 = preset.mask;
            if (i == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
                long[] jArr = this.sizes;
                long j = jArr[0];
                long[] jArr2 = preset.sizes;
                if (j == jArr2[0] && jArr[1] == jArr2[1] && jArr[2] == jArr2[2] && jArr[3] == jArr2[3] && this.preloadVideo == preset.preloadVideo && this.preloadMusic == preset.preloadMusic && this.maxVideoBitrate == preset.maxVideoBitrate && this.preloadStories == preset.preloadStories) {
                    return true;
                }
            }
            return false;
        }

        public boolean isEnabled() {
            int i = 0;
            while (true) {
                int[] iArr = this.mask;
                if (i >= iArr.length) {
                    return false;
                }
                if (iArr[i] != 0) {
                    return true;
                }
                i++;
            }
        }
    }

    public static DownloadController getInstance(int i) {
        DownloadController downloadController;
        DownloadController downloadController2 = Instance[i];
        if (downloadController2 != null) {
            return downloadController2;
        }
        synchronized (DownloadController.class) {
            try {
                downloadController = Instance[i];
                if (downloadController == null) {
                    DownloadController[] downloadControllerArr = Instance;
                    DownloadController downloadController3 = new DownloadController(i);
                    downloadControllerArr[i] = downloadController3;
                    downloadController = downloadController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return downloadController;
    }

    public DownloadController(int i) {
        super(i);
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
        this.typingTimes = new LongSparseArray();
        this.downloadingFiles = new ArrayList<>();
        this.recentDownloadingFiles = new ArrayList<>();
        this.unviewedDownloads = new SparseArray<>();
        this.clearUnviewedDownloadsRunnale = new Runnable() {
            @Override
            public void run() {
                DownloadController.this.clearUnviewedDownloads();
                DownloadController.this.getNotificationCenter().postNotificationName(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
            }
        };
        SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
        Preset preset = new Preset(mainSettings.getString("preset0", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
        this.lowPreset = preset;
        preset.preloadStories = false;
        this.mediumPreset = new Preset(mainSettings.getString("preset1", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
        this.highPreset = new Preset(mainSettings.getString("preset2", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
        boolean zContains = mainSettings.contains("newConfig");
        if (zContains || !getUserConfig().isClientActivated()) {
            this.mobilePreset = new Preset(mainSettings.getString("mobilePreset", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
            this.wifiPreset = new Preset(mainSettings.getString("wifiPreset", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
            this.roamingPreset = new Preset(mainSettings.getString("roamingPreset", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
            this.currentMobilePreset = mainSettings.getInt("currentMobilePreset", 3);
            this.currentWifiPreset = mainSettings.getInt("currentWifiPreset", 3);
            this.currentRoamingPreset = mainSettings.getInt("currentRoamingPreset", 3);
            if (!zContains) {
                mainSettings.edit().putBoolean("newConfig", true).commit();
            }
        } else {
            int[] iArr = new int[4];
            int[] iArr2 = new int[4];
            int[] iArr3 = new int[4];
            long[] jArr = new long[7];
            long[] jArr2 = new long[7];
            long[] jArr3 = new long[7];
            int i2 = 0;
            for (int i3 = 4; i2 < i3; i3 = 4) {
                StringBuilder sb = new StringBuilder();
                int i4 = i2;
                sb.append("mobileDataDownloadMask");
                Object objValueOf = "";
                if (i4 != 0) {
                    objValueOf = Integer.valueOf(i4);
                }
                sb.append(objValueOf);
                String string = sb.toString();
                if (i4 == 0 || mainSettings.contains(string)) {
                    iArr[i4] = mainSettings.getInt(string, 13);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("wifiDownloadMask");
                    sb2.append(i4 == 0 ? "" : Integer.valueOf(i4));
                    iArr2[i4] = mainSettings.getInt(sb2.toString(), 13);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("roamingDownloadMask");
                    sb3.append(i4 == 0 ? objValueOf : Integer.valueOf(i4));
                    iArr3[i4] = mainSettings.getInt(sb3.toString(), 1);
                } else {
                    iArr[i4] = iArr[0];
                    iArr2[i4] = iArr2[0];
                    iArr3[i4] = iArr3[0];
                }
                i2 = i4 + 1;
            }
            jArr[2] = mainSettings.getLong("mobileMaxDownloadSize2", this.mediumPreset.sizes[1]);
            jArr[3] = mainSettings.getLong("mobileMaxDownloadSize3", this.mediumPreset.sizes[2]);
            jArr2[2] = mainSettings.getLong("wifiMaxDownloadSize2", this.highPreset.sizes[1]);
            jArr2[3] = mainSettings.getLong("wifiMaxDownloadSize3", this.highPreset.sizes[2]);
            jArr3[2] = mainSettings.getLong("roamingMaxDownloadSize2", this.lowPreset.sizes[1]);
            jArr3[3] = mainSettings.getLong("roamingMaxDownloadSize3", this.lowPreset.sizes[2]);
            boolean z = mainSettings.getBoolean("globalAutodownloadEnabled", true);
            this.mobilePreset = new Preset(iArr, this.mediumPreset.sizes[0], jArr[2], jArr[3], true, true, z, false, 100, false);
            this.wifiPreset = new Preset(iArr2, this.highPreset.sizes[0], jArr2[2], jArr2[3], true, true, z, false, 100, true);
            this.roamingPreset = new Preset(iArr3, this.lowPreset.sizes[0], jArr3[2], jArr3[3], false, false, z, true, 50, true);
            SharedPreferences.Editor editorEdit = mainSettings.edit();
            editorEdit.putBoolean("newConfig", true);
            editorEdit.putString("mobilePreset", this.mobilePreset.toString());
            editorEdit.putString("wifiPreset", this.wifiPreset.toString());
            editorEdit.putString("roamingPreset", this.roamingPreset.toString());
            this.currentMobilePreset = 3;
            editorEdit.putInt("currentMobilePreset", 3);
            this.currentWifiPreset = 3;
            editorEdit.putInt("currentWifiPreset", 3);
            this.currentRoamingPreset = 3;
            editorEdit.putInt("currentRoamingPreset", 3);
            editorEdit.commit();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DownloadController.$r8$lambda$jtM8ztYJaKuPiKYHa4SHK7d987Y(this.f$0);
            }
        });
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
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

    public static void $r8$lambda$jtM8ztYJaKuPiKYHa4SHK7d987Y(DownloadController downloadController) {
        downloadController.getNotificationCenter().addObserver(downloadController, NotificationCenter.fileLoadFailed);
        downloadController.getNotificationCenter().addObserver(downloadController, NotificationCenter.fileLoaded);
        downloadController.getNotificationCenter().addObserver(downloadController, NotificationCenter.fileLoadProgressChanged);
        downloadController.getNotificationCenter().addObserver(downloadController, NotificationCenter.fileUploadProgressChanged);
        downloadController.getNotificationCenter().addObserver(downloadController, NotificationCenter.httpFileDidLoad);
        downloadController.getNotificationCenter().addObserver(downloadController, NotificationCenter.httpFileDidFailedLoad);
        downloadController.loadAutoDownloadConfig(false);
    }

    public void loadAutoDownloadConfig(boolean z) {
        if (this.loadingAutoDownloadConfig) {
            return;
        }
        if (z || Math.abs(System.currentTimeMillis() - getUserConfig().autoDownloadConfigLoadTime) >= 86400000) {
            this.loadingAutoDownloadConfig = true;
            getConnectionsManager().sendRequest(new TL_account.getAutoDownloadSettings(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    DownloadController.m417$r8$lambda$3XCINFDrpmT681ezG92zUagPh8(this.f$0, tLObject, tL_error);
                }
            });
        }
    }

    public static void m417$r8$lambda$3XCINFDrpmT681ezG92zUagPh8(final DownloadController downloadController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        downloadController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DownloadController.$r8$lambda$f0uz3okQQD7wvDjcvE43WU08UMQ(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$f0uz3okQQD7wvDjcvE43WU08UMQ(DownloadController downloadController, TLObject tLObject) {
        Preset preset;
        downloadController.loadingAutoDownloadConfig = false;
        downloadController.getUserConfig().autoDownloadConfigLoadTime = System.currentTimeMillis();
        downloadController.getUserConfig().saveConfig(false);
        if (tLObject != null) {
            TL_account.autoDownloadSettings autodownloadsettings = (TL_account.autoDownloadSettings) tLObject;
            downloadController.lowPreset.set(autodownloadsettings.low);
            downloadController.lowPreset.preloadStories = false;
            downloadController.mediumPreset.set(autodownloadsettings.medium);
            downloadController.highPreset.set(autodownloadsettings.high);
            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    preset = downloadController.mobilePreset;
                } else if (i == 1) {
                    preset = downloadController.wifiPreset;
                } else {
                    preset = downloadController.roamingPreset;
                }
                if (preset.equals(downloadController.lowPreset)) {
                    preset.set(autodownloadsettings.low);
                    preset.preloadStories = false;
                } else if (preset.equals(downloadController.mediumPreset)) {
                    preset.set(autodownloadsettings.medium);
                } else if (preset.equals(downloadController.highPreset)) {
                    preset.set(autodownloadsettings.high);
                }
            }
            SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(downloadController.currentAccount).edit();
            editorEdit.putString("mobilePreset", downloadController.mobilePreset.toString());
            editorEdit.putString("wifiPreset", downloadController.wifiPreset.toString());
            editorEdit.putString("roamingPreset", downloadController.roamingPreset.toString());
            editorEdit.putString("preset0", downloadController.lowPreset.toString());
            editorEdit.putString("preset1", downloadController.mediumPreset.toString());
            editorEdit.putString("preset2", downloadController.highPreset.toString());
            editorEdit.commit();
            downloadController.lowPreset.toString();
            downloadController.mediumPreset.toString();
            downloadController.highPreset.toString();
            downloadController.checkAutodownloadSettings();
        }
    }

    public Preset getCurrentMobilePreset() {
        int i = this.currentMobilePreset;
        if (i == 0) {
            return this.lowPreset;
        }
        if (i == 1) {
            return this.mediumPreset;
        }
        if (i == 2) {
            return this.highPreset;
        }
        return this.mobilePreset;
    }

    public Preset getCurrentWiFiPreset() {
        int i = this.currentWifiPreset;
        if (i == 0) {
            return this.lowPreset;
        }
        if (i == 1) {
            return this.mediumPreset;
        }
        if (i == 2) {
            return this.highPreset;
        }
        return this.wifiPreset;
    }

    public Preset getCurrentRoamingPreset() {
        int i = this.currentRoamingPreset;
        if (i == 0) {
            return this.lowPreset;
        }
        if (i == 1) {
            return this.mediumPreset;
        }
        if (i == 2) {
            return this.highPreset;
        }
        return this.roamingPreset;
    }

    public void cleanup() {
        this.photoDownloadQueue.clear();
        this.audioDownloadQueue.clear();
        this.documentDownloadQueue.clear();
        this.videoDownloadQueue.clear();
        this.downloadQueueKeys.clear();
        this.downloadQueuePairs.clear();
        this.typingTimes.clear();
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

    public int getAutodownloadMask() {
        int[] iArr;
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
        } else {
            if (!this.mobilePreset.enabled) {
                return 0;
            }
            iArr = getCurrentMobilePreset().mask;
        }
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int i4 = (i3 & 1) != 0 ? 1 : 0;
            if ((i3 & 2) != 0) {
                i4 |= 2;
            }
            if ((i3 & 4) != 0) {
                i4 |= 4;
            }
            if ((i3 & 8) != 0) {
                i4 |= 8;
            }
            i |= i4 << (i2 * 8);
        }
        return i;
    }

    protected int getAutodownloadMaskAll() {
        if (!this.mobilePreset.enabled && !this.roamingPreset.enabled && !this.wifiPreset.enabled) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if ((getCurrentMobilePreset().mask[i2] & 1) != 0 || (getCurrentWiFiPreset().mask[i2] & 1) != 0 || (getCurrentRoamingPreset().mask[i2] & 1) != 0) {
                i |= 1;
            }
            if ((getCurrentMobilePreset().mask[i2] & 2) != 0 || (getCurrentWiFiPreset().mask[i2] & 2) != 0 || (getCurrentRoamingPreset().mask[i2] & 2) != 0) {
                i |= 2;
            }
            if ((getCurrentMobilePreset().mask[i2] & 4) != 0 || (getCurrentWiFiPreset().mask[i2] & 4) != 0 || (4 & getCurrentRoamingPreset().mask[i2]) != 0) {
                i |= 4;
            }
            if ((getCurrentMobilePreset().mask[i2] & 8) != 0 || (getCurrentWiFiPreset().mask[i2] & 8) != 0 || (getCurrentRoamingPreset().mask[i2] & 8) != 0) {
                i |= 8;
            }
        }
        return i;
    }

    public void checkAutodownloadSettings() {
        int currentDownloadMask = getCurrentDownloadMask();
        if (currentDownloadMask == this.lastCheckMask) {
            return;
        }
        this.lastCheckMask = currentDownloadMask;
        if ((currentDownloadMask & 1) != 0) {
            if (this.photoDownloadQueue.isEmpty()) {
                newDownloadObjectsAvailable(1);
            }
        } else {
            for (int i = 0; i < this.photoDownloadQueue.size(); i++) {
                DownloadObject downloadObject = this.photoDownloadQueue.get(i);
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
            for (int i2 = 0; i2 < this.audioDownloadQueue.size(); i2++) {
                getFileLoader().cancelLoadFile((TLRPC.Document) this.audioDownloadQueue.get(i2).object);
            }
            this.audioDownloadQueue.clear();
        }
        if ((currentDownloadMask & 8) != 0) {
            if (this.documentDownloadQueue.isEmpty()) {
                newDownloadObjectsAvailable(8);
            }
        } else {
            for (int i3 = 0; i3 < this.documentDownloadQueue.size(); i3++) {
                getFileLoader().cancelLoadFile((TLRPC.Document) this.documentDownloadQueue.get(i3).object);
            }
            this.documentDownloadQueue.clear();
        }
        if ((currentDownloadMask & 4) != 0) {
            if (this.videoDownloadQueue.isEmpty()) {
                newDownloadObjectsAvailable(4);
            }
        } else {
            for (int i4 = 0; i4 < this.videoDownloadQueue.size(); i4++) {
                getFileLoader().cancelLoadFile((TLRPC.Document) this.videoDownloadQueue.get(i4).object);
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

    public boolean canDownloadMedia(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (messageObject.type == 23) {
            return (!SharedConfig.isAutoplayVideo() || (storyItem = ((TLRPC.TL_messageMediaStory) MessageObject.getMedia(messageObject)).storyItem) == null || (messageMedia = storyItem.media) == null || messageMedia.document == null || !storyItem.isPublic) ? false : true;
        }
        if (messageObject.sponsoredMedia != null) {
            return true;
        }
        return !messageObject.isHiddenSensitive() && canDownloadMediaInternal(messageObject) == 1;
    }

    public boolean canDownloadMedia(int i, long j) {
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
        } else {
            if (!this.mobilePreset.enabled) {
                return false;
            }
            currentMobilePreset = getCurrentMobilePreset();
        }
        return (i == 1 || (j != 0 && j <= currentMobilePreset.sizes[typeToIndex(i)])) && (i == 2 || (i & currentMobilePreset.mask[1]) != 0);
    }

    public int canDownloadMediaType(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (messageObject.type == 23) {
            return (!SharedConfig.isAutoplayVideo() || (storyItem = ((TLRPC.TL_messageMediaStory) MessageObject.getMedia(messageObject)).storyItem) == null || (messageMedia = storyItem.media) == null || messageMedia.document == null || !storyItem.isPublic) ? 0 : 2;
        }
        if (messageObject.sponsoredMedia != null) {
            return 2;
        }
        if (messageObject.isHiddenSensitive()) {
            return 0;
        }
        return canDownloadMediaInternal(messageObject);
    }

    public int canDownloadMediaType(MessageObject messageObject, long j) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (messageObject.type == 23) {
            return (!SharedConfig.isAutoplayVideo() || (storyItem = ((TLRPC.TL_messageMediaStory) MessageObject.getMedia(messageObject)).storyItem) == null || (messageMedia = storyItem.media) == null || messageMedia.document == null || !storyItem.isPublic) ? 0 : 2;
        }
        if (messageObject.sponsoredMedia != null) {
            return 2;
        }
        if (messageObject.isHiddenSensitive()) {
            return 0;
        }
        return canDownloadMediaInternal(messageObject, j);
    }

    private int canDownloadMediaInternal(MessageObject messageObject) {
        TLRPC.Message message;
        int i;
        char c;
        Preset currentMobilePreset;
        int i2;
        long jMax;
        long messageSize;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return 0;
        }
        if (message.media instanceof TLRPC.TL_messageMediaStory) {
            return canPreloadStories() ? 2 : 0;
        }
        boolean zIsVideoMessage = MessageObject.isVideoMessage(message);
        if (zIsVideoMessage || MessageObject.isGifMessage(message) || MessageObject.isRoundVideoMessage(message) || MessageObject.isGameMessage(message)) {
            i = 4;
        } else if (MessageObject.isVoiceMessage(message)) {
            i = 2;
        } else if (MessageObject.isPhoto(message) || MessageObject.isStickerMessage(message) || MessageObject.isAnimatedStickerMessage(message)) {
            i = 1;
        } else {
            if (MessageObject.getDocument(message) == null) {
                return 0;
            }
            i = 8;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer == null) {
            c = 1;
        } else {
            if (peer.user_id != 0) {
                if (!getContactsController().contactsDict.containsKey(Long.valueOf(peer.user_id))) {
                    c = 1;
                }
            } else if (peer.chat_id != 0) {
                if (!(message.from_id instanceof TLRPC.TL_peerUser) || !getContactsController().contactsDict.containsKey(Long.valueOf(message.from_id.user_id))) {
                    c = 2;
                }
            } else {
                TLRPC.Chat chat = peer.channel_id != 0 ? getMessagesController().getChat(Long.valueOf(message.peer_id.channel_id)) : null;
                if (!ChatObject.isChannel(chat) || !chat.megagroup) {
                    c = 3;
                } else if (!(message.from_id instanceof TLRPC.TL_peerUser) || !getContactsController().contactsDict.containsKey(Long.valueOf(message.from_id.user_id))) {
                    c = 2;
                }
            }
            c = 0;
        }
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
            if (!this.wifiPreset.enabled) {
                return 0;
            }
            currentMobilePreset = getCurrentWiFiPreset();
        } else if (autodownloadNetworkType == 2) {
            if (!this.roamingPreset.enabled) {
                return 0;
            }
            currentMobilePreset = getCurrentRoamingPreset();
        } else {
            if (!this.mobilePreset.enabled) {
                return 0;
            }
            currentMobilePreset = getCurrentMobilePreset();
        }
        int i3 = currentMobilePreset.mask[c];
        if (i == 2) {
            i2 = 0;
            jMax = Math.max(524288L, currentMobilePreset.sizes[typeToIndex(i)]);
        } else {
            i2 = 0;
            jMax = currentMobilePreset.sizes[typeToIndex(i)];
        }
        VideoPlayer.VideoUri videoUri = messageObject.highestQuality;
        if (videoUri != null) {
            messageSize = videoUri.document.size;
        } else {
            VideoPlayer.VideoUri videoUri2 = messageObject.thumbQuality;
            if (videoUri2 != null) {
                messageSize = videoUri2.document.size;
            } else {
                messageSize = MessageObject.getMessageSize(message);
            }
        }
        if (zIsVideoMessage && currentMobilePreset.preloadVideo && messageSize > jMax && jMax > 2097152) {
            if ((i3 & i) != 0) {
                return 2;
            }
            return i2;
        }
        if ((i == 1 || (messageSize != 0 && messageSize <= jMax)) && (i == 2 || (i3 & i) != 0)) {
            return 1;
        }
        return i2;
    }

    private int canDownloadMediaInternal(MessageObject messageObject, long j) {
        TLRPC.Message message;
        int i;
        char c;
        Preset currentMobilePreset;
        long jMax;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return 0;
        }
        if (message.media instanceof TLRPC.TL_messageMediaStory) {
            return canPreloadStories() ? 2 : 0;
        }
        boolean zIsVideoMessage = MessageObject.isVideoMessage(message);
        if (zIsVideoMessage || MessageObject.isGifMessage(message) || MessageObject.isRoundVideoMessage(message) || MessageObject.isGameMessage(message)) {
            i = 4;
        } else if (MessageObject.isVoiceMessage(message)) {
            i = 2;
        } else if (MessageObject.isPhoto(message) || MessageObject.isStickerMessage(message) || MessageObject.isAnimatedStickerMessage(message)) {
            i = 1;
        } else {
            if (MessageObject.getDocument(message) == null) {
                return 0;
            }
            i = 8;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer == null) {
            c = 1;
        } else {
            if (peer.user_id != 0) {
                if (!getContactsController().contactsDict.containsKey(Long.valueOf(peer.user_id))) {
                    c = 1;
                }
            } else if (peer.chat_id != 0) {
                if (!(message.from_id instanceof TLRPC.TL_peerUser) || !getContactsController().contactsDict.containsKey(Long.valueOf(message.from_id.user_id))) {
                    c = 2;
                }
            } else {
                TLRPC.Chat chat = peer.channel_id != 0 ? getMessagesController().getChat(Long.valueOf(message.peer_id.channel_id)) : null;
                if (!ChatObject.isChannel(chat) || !chat.megagroup) {
                    c = 3;
                } else if (!(message.from_id instanceof TLRPC.TL_peerUser) || !getContactsController().contactsDict.containsKey(Long.valueOf(message.from_id.user_id))) {
                    c = 2;
                }
            }
            c = 0;
        }
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
            if (!this.wifiPreset.enabled) {
                return 0;
            }
            currentMobilePreset = getCurrentWiFiPreset();
        } else if (autodownloadNetworkType == 2) {
            if (!this.roamingPreset.enabled) {
                return 0;
            }
            currentMobilePreset = getCurrentRoamingPreset();
        } else {
            if (!this.mobilePreset.enabled) {
                return 0;
            }
            currentMobilePreset = getCurrentMobilePreset();
        }
        int i2 = currentMobilePreset.mask[c];
        if (i == 2) {
            jMax = Math.max(524288L, currentMobilePreset.sizes[typeToIndex(i)]);
        } else {
            jMax = currentMobilePreset.sizes[typeToIndex(i)];
        }
        if (!zIsVideoMessage || !currentMobilePreset.preloadVideo || j <= jMax || jMax <= 2097152) {
            return ((i == 1 || (j != 0 && j <= jMax)) && (i == 2 || (i2 & i) != 0)) ? 1 : 0;
        }
        return (i2 & i) != 0 ? 2 : 0;
    }

    public int canDownloadMedia(TLRPC.Message message) {
        int i;
        char c;
        Preset currentMobilePreset;
        long jMax;
        if (message == null || (message.media instanceof TLRPC.TL_messageMediaStory)) {
            return canPreloadStories() ? 2 : 0;
        }
        boolean zIsVideoMessage = MessageObject.isVideoMessage(message);
        if (zIsVideoMessage || MessageObject.isGifMessage(message) || MessageObject.isRoundVideoMessage(message) || MessageObject.isGameMessage(message)) {
            i = 4;
        } else if (MessageObject.isVoiceMessage(message)) {
            i = 2;
        } else if (MessageObject.isPhoto(message) || MessageObject.isStickerMessage(message) || MessageObject.isAnimatedStickerMessage(message)) {
            i = 1;
        } else {
            if (MessageObject.getDocument(message) == null) {
                return 0;
            }
            i = 8;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer == null) {
            c = 1;
        } else {
            if (peer.user_id != 0) {
                if (!getContactsController().contactsDict.containsKey(Long.valueOf(peer.user_id))) {
                    c = 1;
                }
            } else if (peer.chat_id != 0) {
                if (!(message.from_id instanceof TLRPC.TL_peerUser) || !getContactsController().contactsDict.containsKey(Long.valueOf(message.from_id.user_id))) {
                    c = 2;
                }
            } else {
                TLRPC.Chat chat = peer.channel_id != 0 ? getMessagesController().getChat(Long.valueOf(message.peer_id.channel_id)) : null;
                if (!ChatObject.isChannel(chat) || !chat.megagroup) {
                    c = 3;
                } else if (!(message.from_id instanceof TLRPC.TL_peerUser) || !getContactsController().contactsDict.containsKey(Long.valueOf(message.from_id.user_id))) {
                    c = 2;
                }
            }
            c = 0;
        }
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
            if (!this.wifiPreset.enabled) {
                return 0;
            }
            currentMobilePreset = getCurrentWiFiPreset();
        } else if (autodownloadNetworkType == 2) {
            if (!this.roamingPreset.enabled) {
                return 0;
            }
            currentMobilePreset = getCurrentRoamingPreset();
        } else {
            if (!this.mobilePreset.enabled) {
                return 0;
            }
            currentMobilePreset = getCurrentMobilePreset();
        }
        int i2 = currentMobilePreset.mask[c];
        if (i == 2) {
            jMax = Math.max(524288L, currentMobilePreset.sizes[typeToIndex(i)]);
        } else {
            jMax = currentMobilePreset.sizes[typeToIndex(i)];
        }
        long messageSize = MessageObject.getMessageSize(message);
        if (!zIsVideoMessage || !currentMobilePreset.preloadVideo || messageSize <= jMax || jMax <= 2097152) {
            return ((i == 1 || (messageSize != 0 && messageSize <= jMax)) && (i == 2 || (i2 & i) != 0)) ? 1 : 0;
        }
        return (i2 & i) != 0 ? 2 : 0;
    }

    public int canDownloadMedia(TLRPC.Message message, TLRPC.MessageMedia messageMedia) {
        int i;
        boolean z;
        char c;
        Preset currentMobilePreset;
        long jMax;
        if (message == null || (messageMedia instanceof TLRPC.TL_messageMediaStory)) {
            return canPreloadStories() ? 2 : 0;
        }
        if (MessageObject.isVideoDocument(messageMedia.document)) {
            i = 4;
            z = true;
        } else {
            if (MessageObject.isVoiceDocument(messageMedia.document)) {
                i = 2;
            } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                i = 1;
            } else {
                if (messageMedia.document == null) {
                    return 0;
                }
                i = 8;
            }
            z = false;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer == null) {
            c = 1;
        } else {
            if (peer.user_id != 0) {
                if (!getContactsController().contactsDict.containsKey(Long.valueOf(peer.user_id))) {
                    c = 1;
                }
            } else if (peer.chat_id != 0) {
                if (!(message.from_id instanceof TLRPC.TL_peerUser) || !getContactsController().contactsDict.containsKey(Long.valueOf(message.from_id.user_id))) {
                    c = 2;
                }
            } else {
                TLRPC.Chat chat = peer.channel_id != 0 ? getMessagesController().getChat(Long.valueOf(message.peer_id.channel_id)) : null;
                if (!ChatObject.isChannel(chat) || !chat.megagroup) {
                    c = 3;
                } else if (!(message.from_id instanceof TLRPC.TL_peerUser) || !getContactsController().contactsDict.containsKey(Long.valueOf(message.from_id.user_id))) {
                    c = 2;
                }
            }
            c = 0;
        }
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
            if (!this.wifiPreset.enabled) {
                return 0;
            }
            currentMobilePreset = getCurrentWiFiPreset();
        } else if (autodownloadNetworkType == 2) {
            if (!this.roamingPreset.enabled) {
                return 0;
            }
            currentMobilePreset = getCurrentRoamingPreset();
        } else {
            if (!this.mobilePreset.enabled) {
                return 0;
            }
            currentMobilePreset = getCurrentMobilePreset();
        }
        int i2 = currentMobilePreset.mask[c];
        if (i == 2) {
            jMax = Math.max(524288L, currentMobilePreset.sizes[typeToIndex(i)]);
        } else {
            jMax = currentMobilePreset.sizes[typeToIndex(i)];
        }
        long mediaSize = MessageObject.getMediaSize(messageMedia);
        if (!z || !currentMobilePreset.preloadVideo || mediaSize <= jMax || jMax <= 2097152) {
            return ((i == 1 || (mediaSize != 0 && mediaSize <= jMax)) && (i == 2 || (i2 & i) != 0)) ? 1 : 0;
        }
        return (i2 & i) != 0 ? 2 : 0;
    }

    protected boolean canDownloadNextTrack() {
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        if (autodownloadNetworkType == 1) {
            return this.wifiPreset.enabled && getCurrentWiFiPreset().preloadMusic;
        }
        if (autodownloadNetworkType == 2) {
            return this.roamingPreset.enabled && getCurrentRoamingPreset().preloadMusic;
        }
        return this.mobilePreset.enabled && getCurrentMobilePreset().preloadMusic;
    }

    public int getCurrentDownloadMask() {
        int autodownloadNetworkType = ApplicationLoader.getAutodownloadNetworkType();
        int i = 0;
        if (autodownloadNetworkType == 1) {
            if (!this.wifiPreset.enabled) {
                return 0;
            }
            int i2 = 0;
            while (i < 4) {
                i2 |= getCurrentWiFiPreset().mask[i];
                i++;
            }
            return i2;
        }
        if (autodownloadNetworkType == 2) {
            if (!this.roamingPreset.enabled) {
                return 0;
            }
            int i3 = 0;
            while (i < 4) {
                i3 |= getCurrentRoamingPreset().mask[i];
                i++;
            }
            return i3;
        }
        if (!this.mobilePreset.enabled) {
            return 0;
        }
        int i4 = 0;
        while (i < 4) {
            i4 |= getCurrentMobilePreset().mask[i];
            i++;
        }
        return i4;
    }

    public void savePresetToServer(int i) {
        Preset currentRoamingPreset;
        boolean z;
        TL_account.saveAutoDownloadSettings saveautodownloadsettings = new TL_account.saveAutoDownloadSettings();
        if (i == 0) {
            currentRoamingPreset = getCurrentMobilePreset();
            z = this.mobilePreset.enabled;
        } else if (i == 1) {
            currentRoamingPreset = getCurrentWiFiPreset();
            z = this.wifiPreset.enabled;
        } else {
            currentRoamingPreset = getCurrentRoamingPreset();
            z = this.roamingPreset.enabled;
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings = new TLRPC.TL_autoDownloadSettings();
        saveautodownloadsettings.settings = tL_autoDownloadSettings;
        tL_autoDownloadSettings.audio_preload_next = currentRoamingPreset.preloadMusic;
        tL_autoDownloadSettings.video_preload_large = currentRoamingPreset.preloadVideo;
        tL_autoDownloadSettings.phonecalls_less_data = currentRoamingPreset.lessCallData;
        tL_autoDownloadSettings.video_upload_maxbitrate = currentRoamingPreset.maxVideoBitrate;
        tL_autoDownloadSettings.disabled = !z;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            int[] iArr = currentRoamingPreset.mask;
            if (i2 >= iArr.length) {
                break;
            }
            int i3 = iArr[i2];
            if ((i3 & 1) != 0) {
                z2 = true;
            }
            if ((i3 & 4) != 0) {
                z3 = true;
            }
            if ((i3 & 8) != 0) {
                z4 = true;
            }
            if (z2 && z3 && z4) {
                break;
            } else {
                i2++;
            }
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings2 = saveautodownloadsettings.settings;
        tL_autoDownloadSettings2.photo_size_max = z2 ? (int) currentRoamingPreset.sizes[0] : 0;
        tL_autoDownloadSettings2.video_size_max = z3 ? currentRoamingPreset.sizes[1] : 0L;
        tL_autoDownloadSettings2.file_size_max = z4 ? currentRoamingPreset.sizes[2] : 0L;
        getConnectionsManager().sendRequest(saveautodownloadsettings, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                DownloadController.$r8$lambda$a932j3A0ioLRfL9x8R0cRYMLIoM(tLObject, tL_error);
            }
        });
    }

    public void cancelDownloading(ArrayList<Pair<Long, Integer>> arrayList) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            DownloadObject downloadObject = this.downloadQueuePairs.get(arrayList.get(i));
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

    public void processDownloadObjects(int i, ArrayList<DownloadObject> arrayList) {
        ArrayList<DownloadObject> arrayList2;
        TLRPC.PhotoSize photoSize;
        String attachFileName;
        int i2;
        if (arrayList.isEmpty()) {
            return;
        }
        if (i == 1) {
            arrayList2 = this.photoDownloadQueue;
        } else if (i == 2) {
            arrayList2 = this.audioDownloadQueue;
        } else if (i == 4) {
            arrayList2 = this.videoDownloadQueue;
        } else {
            arrayList2 = this.documentDownloadQueue;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            DownloadObject downloadObject = arrayList.get(i3);
            TLObject tLObject = downloadObject.object;
            String str = null;
            TLRPC.PhotoSize closestPhotoSizeWithSize = null;
            if (tLObject instanceof TLRPC.Document) {
                attachFileName = FileLoader.getAttachFileName((TLRPC.Document) tLObject);
            } else {
                if (tLObject instanceof TLRPC.Photo) {
                    closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
                    attachFileName = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                } else {
                    photoSize = null;
                }
                if (str == null && !this.downloadQueueKeys.containsKey(str)) {
                    if (photoSize != null) {
                        TLRPC.Photo photo = (TLRPC.Photo) downloadObject.object;
                        if (downloadObject.secret) {
                            i2 = 2;
                        } else {
                            i2 = downloadObject.forceCache ? 1 : 0;
                        }
                        getFileLoader().loadFile(ImageLocation.getForPhoto(photoSize, photo), downloadObject.parent, null, 0, i2);
                    } else {
                        TLObject tLObject2 = downloadObject.object;
                        if (tLObject2 instanceof TLRPC.Document) {
                            getFileLoader().loadFile((TLRPC.Document) tLObject2, downloadObject.parent, 0, downloadObject.secret ? 2 : 0);
                        }
                    }
                    arrayList2.add(downloadObject);
                    this.downloadQueueKeys.put(str, downloadObject);
                    this.downloadQueuePairs.put(new Pair<>(Long.valueOf(downloadObject.id), Integer.valueOf(downloadObject.type)), downloadObject);
                }
            }
            TLRPC.PhotoSize photoSize2 = closestPhotoSizeWithSize;
            str = attachFileName;
            photoSize = photoSize2;
            if (str == null) {
            }
        }
    }

    public void newDownloadObjectsAvailable(int i) {
        int currentDownloadMask = getCurrentDownloadMask();
        if ((currentDownloadMask & 1) != 0 && (i & 1) != 0 && this.photoDownloadQueue.isEmpty()) {
            getMessagesStorage().getDownloadQueue(1);
        }
        if ((currentDownloadMask & 2) != 0 && (i & 2) != 0 && this.audioDownloadQueue.isEmpty()) {
            getMessagesStorage().getDownloadQueue(2);
        }
        if ((currentDownloadMask & 4) != 0 && (i & 4) != 0 && this.videoDownloadQueue.isEmpty()) {
            getMessagesStorage().getDownloadQueue(4);
        }
        if ((currentDownloadMask & 8) == 0 || (i & 8) == 0 || !this.documentDownloadQueue.isEmpty()) {
            return;
        }
        getMessagesStorage().getDownloadQueue(8);
    }

    private void checkDownloadFinished(String str, int i) {
        DownloadObject downloadObject = this.downloadQueueKeys.get(str);
        if (downloadObject != null) {
            this.downloadQueueKeys.remove(str);
            this.downloadQueuePairs.remove(new Pair(Long.valueOf(downloadObject.id), Integer.valueOf(downloadObject.type)));
            if (i == 0 || i == 2) {
                getMessagesStorage().removeFromDownloadQueue(downloadObject.id, downloadObject.type, false);
            }
            int i2 = downloadObject.type;
            if (i2 == 1) {
                this.photoDownloadQueue.remove(downloadObject);
                if (this.photoDownloadQueue.isEmpty()) {
                    newDownloadObjectsAvailable(1);
                    return;
                }
                return;
            }
            if (i2 == 2) {
                this.audioDownloadQueue.remove(downloadObject);
                if (this.audioDownloadQueue.isEmpty()) {
                    newDownloadObjectsAvailable(2);
                    return;
                }
                return;
            }
            if (i2 == 4) {
                this.videoDownloadQueue.remove(downloadObject);
                if (this.videoDownloadQueue.isEmpty()) {
                    newDownloadObjectsAvailable(4);
                    return;
                }
                return;
            }
            if (i2 == 8) {
                this.documentDownloadQueue.remove(downloadObject);
                if (this.documentDownloadQueue.isEmpty()) {
                    newDownloadObjectsAvailable(8);
                }
            }
        }
    }

    public int generateObserverTag() {
        int i = this.lastTag;
        this.lastTag = i + 1;
        return i;
    }

    public void addLoadingFileObserver(String str, FileDownloadProgressListener fileDownloadProgressListener) {
        addLoadingFileObserver(str, null, fileDownloadProgressListener);
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

    public void removeLoadingFileObserver(FileDownloadProgressListener fileDownloadProgressListener) {
        if (this.listenerInProgress) {
            this.deleteLaterArray.add(fileDownloadProgressListener);
            return;
        }
        String str = this.observersByTag.get(fileDownloadProgressListener.getObserverTag());
        if (str != null) {
            ArrayList<WeakReference<FileDownloadProgressListener>> arrayList = this.loadingFileObservers.get(str);
            if (arrayList != null) {
                int i = 0;
                while (i < arrayList.size()) {
                    WeakReference<FileDownloadProgressListener> weakReference = arrayList.get(i);
                    if (weakReference.get() == null || weakReference.get() == fileDownloadProgressListener) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                if (arrayList.isEmpty()) {
                    this.loadingFileObservers.remove(str);
                }
            }
            this.observersByTag.remove(fileDownloadProgressListener.getObserverTag());
        }
    }

    private void processLaterArrays() {
        for (Map.Entry<String, FileDownloadProgressListener> entry : this.addLaterArray.entrySet()) {
            addLoadingFileObserver(entry.getKey(), entry.getValue());
        }
        this.addLaterArray.clear();
        ArrayList<FileDownloadProgressListener> arrayList = this.deleteLaterArray;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            FileDownloadProgressListener fileDownloadProgressListener = arrayList.get(i);
            i++;
            removeLoadingFileObserver(fileDownloadProgressListener);
        }
        this.deleteLaterArray.clear();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.fileLoadFailed || i == NotificationCenter.httpFileDidFailedLoad) {
            String str = (String) objArr[0];
            Integer num = (Integer) objArr[1];
            this.listenerInProgress = true;
            ArrayList<WeakReference<FileDownloadProgressListener>> arrayList = this.loadingFileObservers.get(str);
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    WeakReference<FileDownloadProgressListener> weakReference = arrayList.get(i3);
                    if (weakReference.get() != null) {
                        weakReference.get().onFailedDownload(str, num.intValue() == 1);
                        if (num.intValue() != 1) {
                            this.observersByTag.remove(weakReference.get().getObserverTag());
                        }
                    }
                }
                if (num.intValue() != 1) {
                    this.loadingFileObservers.remove(str);
                }
            }
            this.listenerInProgress = false;
            processLaterArrays();
            checkDownloadFinished(str, num.intValue());
            return;
        }
        if (i == NotificationCenter.fileLoaded || i == NotificationCenter.httpFileDidLoad) {
            this.listenerInProgress = true;
            String str2 = (String) objArr[0];
            ArrayList<MessageObject> arrayList2 = this.loadingFileMessagesObservers.get(str2);
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList2.get(i4).mediaExists = true;
                }
                this.loadingFileMessagesObservers.remove(str2);
            }
            ArrayList<WeakReference<FileDownloadProgressListener>> arrayList3 = this.loadingFileObservers.get(str2);
            if (arrayList3 != null) {
                int size3 = arrayList3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    WeakReference<FileDownloadProgressListener> weakReference2 = arrayList3.get(i5);
                    if (weakReference2.get() != null) {
                        weakReference2.get().onSuccessDownload(str2);
                        this.observersByTag.remove(weakReference2.get().getObserverTag());
                    }
                }
                this.loadingFileObservers.remove(str2);
            }
            this.listenerInProgress = false;
            processLaterArrays();
            checkDownloadFinished(str2, 0);
            return;
        }
        if (i == NotificationCenter.fileLoadProgressChanged) {
            this.listenerInProgress = true;
            String str3 = (String) objArr[0];
            ArrayList<WeakReference<FileDownloadProgressListener>> arrayList4 = this.loadingFileObservers.get(str3);
            if (arrayList4 != null) {
                Long l = (Long) objArr[1];
                Long l2 = (Long) objArr[2];
                int size4 = arrayList4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    WeakReference<FileDownloadProgressListener> weakReference3 = arrayList4.get(i6);
                    if (weakReference3.get() != null) {
                        weakReference3.get().onProgressDownload(str3, l.longValue(), l2.longValue());
                    }
                }
            }
            this.listenerInProgress = false;
            processLaterArrays();
            return;
        }
        if (i == NotificationCenter.fileUploadProgressChanged) {
            this.listenerInProgress = true;
            String str4 = (String) objArr[0];
            ArrayList<WeakReference<FileDownloadProgressListener>> arrayList5 = this.loadingFileObservers.get(str4);
            if (arrayList5 != null) {
                Long l3 = (Long) objArr[1];
                Long l4 = (Long) objArr[2];
                Boolean bool = (Boolean) objArr[3];
                int size5 = arrayList5.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    WeakReference<FileDownloadProgressListener> weakReference4 = arrayList5.get(i7);
                    if (weakReference4.get() != null) {
                        weakReference4.get().onProgressUpload(str4, l3.longValue(), l4.longValue(), bool.booleanValue());
                    }
                }
            }
            this.listenerInProgress = false;
            processLaterArrays();
            try {
                ArrayList<SendMessagesHelper.DelayedMessage> delayedMessages = getSendMessagesHelper().getDelayedMessages(str4);
                if (delayedMessages != null) {
                    for (int i8 = 0; i8 < delayedMessages.size(); i8++) {
                        SendMessagesHelper.DelayedMessage delayedMessage = delayedMessages.get(i8);
                        if (delayedMessage.encryptedChat == null) {
                            long j = delayedMessage.peer;
                            int i9 = delayedMessage.topMessageId;
                            Long l5 = (Long) this.typingTimes.get(j);
                            if (delayedMessage.type != 4) {
                                delayedMessage.obj.getDocument();
                                if (l5 == null || l5.longValue() + 4000 < System.currentTimeMillis()) {
                                    if (delayedMessage.obj.isRoundVideo()) {
                                        getMessagesController().sendTyping(j, i9, 8, 0);
                                    } else if (delayedMessage.obj.isVideo()) {
                                        getMessagesController().sendTyping(j, i9, 5, 0);
                                    } else if (delayedMessage.obj.isVoice()) {
                                        getMessagesController().sendTyping(j, i9, 9, 0);
                                    } else if (delayedMessage.obj.getDocument() != null) {
                                        getMessagesController().sendTyping(j, i9, 3, 0);
                                    } else if (delayedMessage.photoSize != null) {
                                        getMessagesController().sendTyping(j, i9, 4, 0);
                                    }
                                    this.typingTimes.put(j, Long.valueOf(System.currentTimeMillis()));
                                }
                            } else if (l5 == null || l5.longValue() + 4000 < System.currentTimeMillis()) {
                                MessageObject messageObject = (MessageObject) delayedMessage.extraHashMap.get(str4 + "_i");
                                if (messageObject != null && messageObject.isVideo()) {
                                    getMessagesController().sendTyping(j, i9, 5, 0);
                                } else if (messageObject != null && messageObject.getDocument() != null) {
                                    getMessagesController().sendTyping(j, i9, 3, 0);
                                } else {
                                    getMessagesController().sendTyping(j, i9, 4, 0);
                                }
                                this.typingTimes.put(j, Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static float getProgress(long[] jArr) {
        if (jArr == null || jArr.length < 2) {
            return 0.0f;
        }
        long j = jArr[1];
        if (j == 0) {
            return 0.0f;
        }
        return Math.min(1.0f, jArr[0] / j);
    }

    public void startDownloadFile(TLRPC.Document document, final MessageObject messageObject) {
        final TLRPC.Document document2;
        if (messageObject == null || (document2 = messageObject.getDocument()) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DownloadController.$r8$lambda$YmkxhQNmF6b1ByZUDpu9BIuoOcM(this.f$0, document2, messageObject);
            }
        });
    }

    public static void $r8$lambda$YmkxhQNmF6b1ByZUDpu9BIuoOcM(final DownloadController downloadController, TLRPC.Document document, final MessageObject messageObject) {
        boolean z;
        boolean z2;
        TLRPC.Document document2;
        TLRPC.Document document3;
        if (document == null) {
            downloadController.getClass();
            return;
        }
        int i = 0;
        while (true) {
            z = true;
            if (i >= downloadController.recentDownloadingFiles.size()) {
                z2 = false;
                break;
            }
            MessageObject messageObject2 = downloadController.recentDownloadingFiles.get(i);
            if (messageObject2 != null && (document3 = messageObject2.getDocument()) != null && document3.id == document.id) {
                z2 = true;
                break;
            }
            i++;
        }
        if (!z2) {
            int i2 = 0;
            while (true) {
                if (i2 >= downloadController.downloadingFiles.size()) {
                    z = z2;
                    break;
                }
                MessageObject messageObject3 = downloadController.downloadingFiles.get(i2);
                if (messageObject3 != null && (document2 = messageObject3.getDocument()) != null && document2.id == document.id) {
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            z = z2;
            break;
        }
        if (!z) {
            downloadController.downloadingFiles.add(0, messageObject);
            downloadController.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    DownloadController.$r8$lambda$Dksqzf_GR26w8D7hYfC1So1ktQw(this.f$0, messageObject);
                }
            });
        }
        downloadController.getNotificationCenter().postNotificationName(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
    }

    public static void $r8$lambda$Dksqzf_GR26w8D7hYfC1So1ktQw(DownloadController downloadController, MessageObject messageObject) {
        downloadController.getClass();
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageObject.messageOwner.getObjectSize());
            messageObject.messageOwner.serializeToStream(nativeByteBuffer);
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = downloadController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO downloading_documents VALUES(?, ?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindInteger(2, messageObject.getDocument().dc_id);
            sQLitePreparedStatementExecuteFast.bindLong(3, messageObject.getDocument().id);
            sQLitePreparedStatementExecuteFast.bindLong(4, System.currentTimeMillis());
            sQLitePreparedStatementExecuteFast.bindInteger(4, 0);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
            nativeByteBuffer.reuse();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void onDownloadComplete(final MessageObject messageObject) {
        if (messageObject == null || messageObject.getDocument() == null) {
            return;
        }
        final TLRPC.Document document = messageObject.getDocument();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DownloadController.$r8$lambda$STVs57YQkw3YHAGda1zAZLNgwz8(this.f$0, document, messageObject);
            }
        });
    }

    public static void $r8$lambda$STVs57YQkw3YHAGda1zAZLNgwz8(final DownloadController downloadController, TLRPC.Document document, final MessageObject messageObject) {
        for (int i = 0; i < downloadController.downloadingFiles.size(); i++) {
            if (downloadController.downloadingFiles.get(i).getDocument() != null && downloadController.downloadingFiles.get(i).getDocument().id == document.id) {
                downloadController.downloadingFiles.remove(i);
                for (int i2 = 0; i2 < downloadController.recentDownloadingFiles.size(); i2++) {
                    if (downloadController.recentDownloadingFiles.get(i2).getDocument() != null && downloadController.recentDownloadingFiles.get(i2).getDocument().id == document.id) {
                        downloadController.getNotificationCenter().postNotificationName(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
                        downloadController.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                DownloadController.m418$r8$lambda$P6r9uZLaAu0ltVJKMeLziP6q5U(this.f$0, messageObject);
                            }
                        });
                        return;
                    }
                }
                downloadController.recentDownloadingFiles.add(0, messageObject);
                downloadController.putToUnviewedDownloads(messageObject);
                downloadController.getNotificationCenter().postNotificationName(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
                downloadController.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        DownloadController.m418$r8$lambda$P6r9uZLaAu0ltVJKMeLziP6q5U(this.f$0, messageObject);
                    }
                });
                return;
            }
        }
    }

    public static void m418$r8$lambda$P6r9uZLaAu0ltVJKMeLziP6q5U(DownloadController downloadController, MessageObject messageObject) {
        downloadController.getClass();
        try {
            downloadController.getMessagesStorage().getDatabase().executeFast(String.format(Locale.ENGLISH, "UPDATE downloading_documents SET state = 1, date = %d WHERE hash = %d AND id = %d", Long.valueOf(System.currentTimeMillis()), Integer.valueOf(messageObject.getDocument().dc_id), Long.valueOf(messageObject.getDocument().id))).stepThis().dispose();
            SQLiteCursor sQLiteCursorQueryFinalized = downloadController.getMessagesStorage().getDatabase().queryFinalized("SELECT COUNT(*) FROM downloading_documents WHERE state = 1", new Object[0]);
            int iIntValue = sQLiteCursorQueryFinalized.next() ? sQLiteCursorQueryFinalized.intValue(0) : 0;
            sQLiteCursorQueryFinalized.dispose();
            SQLiteCursor sQLiteCursorQueryFinalized2 = downloadController.getMessagesStorage().getDatabase().queryFinalized("SELECT state FROM downloading_documents WHERE state = 1", new Object[0]);
            if (sQLiteCursorQueryFinalized2.next()) {
                sQLiteCursorQueryFinalized2.intValue(0);
            }
            sQLiteCursorQueryFinalized2.dispose();
            if (iIntValue > 100) {
                SQLiteCursor sQLiteCursorQueryFinalized3 = downloadController.getMessagesStorage().getDatabase().queryFinalized("SELECT hash, id FROM downloading_documents WHERE state = 1 ORDER BY date ASC LIMIT " + (100 - iIntValue), new Object[0]);
                ArrayList arrayList = new ArrayList();
                while (sQLiteCursorQueryFinalized3.next()) {
                    DownloadingDocumentEntry downloadingDocumentEntry = new DownloadingDocumentEntry();
                    downloadingDocumentEntry.hash = sQLiteCursorQueryFinalized3.intValue(0);
                    downloadingDocumentEntry.id = sQLiteCursorQueryFinalized3.longValue(1);
                    arrayList.add(downloadingDocumentEntry);
                }
                sQLiteCursorQueryFinalized3.dispose();
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = downloadController.getMessagesStorage().getDatabase().executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                for (int i = 0; i < arrayList.size(); i++) {
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindInteger(1, ((DownloadingDocumentEntry) arrayList.get(i)).hash);
                    sQLitePreparedStatementExecuteFast.bindLong(2, ((DownloadingDocumentEntry) arrayList.get(i)).id);
                    sQLitePreparedStatementExecuteFast.step();
                }
                sQLitePreparedStatementExecuteFast.dispose();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void onDownloadFail(final MessageObject messageObject, final int i) {
        if (messageObject == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DownloadController.m419$r8$lambda$f7_RkOXf_LiagAZYva90hZkd4(this.f$0, messageObject, i);
            }
        });
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                DownloadController.$r8$lambda$bhvDAqS1DyTwbK9sq9l1SU55k6M(this.f$0, messageObject);
            }
        });
    }

    public static void m419$r8$lambda$f7_RkOXf_LiagAZYva90hZkd4(DownloadController downloadController, MessageObject messageObject, int i) {
        downloadController.getClass();
        TLRPC.Document document = messageObject.getDocument();
        for (int i2 = 0; i2 < downloadController.downloadingFiles.size(); i2++) {
            TLRPC.Document document2 = downloadController.downloadingFiles.get(i2).getDocument();
            if (document2 == null || (document != null && document2.id == document.id)) {
                downloadController.downloadingFiles.remove(i2);
                downloadController.getNotificationCenter().postNotificationName(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
                if (i == 0) {
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 1, LocaleController.formatString("MessageNotFound", R.string.MessageNotFound, new Object[0]));
                    return;
                } else {
                    if (i == -1) {
                        LaunchActivity.checkFreeDiscSpaceStatic(2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static void $r8$lambda$bhvDAqS1DyTwbK9sq9l1SU55k6M(DownloadController downloadController, MessageObject messageObject) {
        downloadController.getClass();
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = downloadController.getMessagesStorage().getDatabase().executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
            sQLitePreparedStatementExecuteFast.bindInteger(1, messageObject.getDocument().dc_id);
            sQLitePreparedStatementExecuteFast.bindLong(2, messageObject.getDocument().id);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void putToUnviewedDownloads(MessageObject messageObject) {
        this.unviewedDownloads.put(messageObject.getId(), messageObject);
        AndroidUtilities.cancelRunOnUIThread(this.clearUnviewedDownloadsRunnale);
        AndroidUtilities.runOnUIThread(this.clearUnviewedDownloadsRunnale, 60000L);
    }

    public void clearUnviewedDownloads() {
        this.unviewedDownloads.clear();
    }

    public void checkUnviewedDownloads(int i, long j) {
        MessageObject messageObject = this.unviewedDownloads.get(i);
        if (messageObject == null || messageObject.getDialogId() != j) {
            return;
        }
        this.unviewedDownloads.remove(i);
        if (this.unviewedDownloads.size() == 0) {
            getNotificationCenter().postNotificationName(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
        }
    }

    public boolean hasUnviewedDownloads() {
        return this.unviewedDownloads.size() > 0;
    }

    class DownloadingDocumentEntry {
        int hash;
        long id;

        private DownloadingDocumentEntry() {
        }
    }

    public void loadDownloadingFiles() {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                DownloadController.$r8$lambda$0GxlyfTiJLNhXyvFYED3JzOpa_c(this.f$0);
            }
        });
    }

    public static void $r8$lambda$0GxlyfTiJLNhXyvFYED3JzOpa_c(final DownloadController downloadController) {
        downloadController.getClass();
        final ArrayList<MessageObject> arrayList = new ArrayList<>();
        final ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = downloadController.getMessagesStorage().getDatabase().queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
            while (sQLiteCursorQueryFinalized.next()) {
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                int iIntValue = sQLiteCursorQueryFinalized.intValue(1);
                if (nativeByteBufferByteBufferValue != null) {
                    TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                    if (messageTLdeserialize != null) {
                        messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, UserConfig.getInstance(downloadController.currentAccount).clientUserId);
                        MessageObject messageObject = new MessageObject(downloadController.currentAccount, messageTLdeserialize, false, false);
                        arrayList3.add(messageObject);
                        if (iIntValue == 0) {
                            arrayList.add(messageObject);
                        } else {
                            arrayList2.add(messageObject);
                        }
                    }
                    nativeByteBufferByteBufferValue.reuse();
                }
            }
            sQLiteCursorQueryFinalized.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
        downloadController.getFileLoader().checkMediaExistance(arrayList);
        downloadController.getFileLoader().checkMediaExistance(arrayList2);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DownloadController.$r8$lambda$5cTMxskZ1inUCsToE84mgTZcAO8(this.f$0, arrayList, arrayList2);
            }
        });
    }

    public static void $r8$lambda$5cTMxskZ1inUCsToE84mgTZcAO8(DownloadController downloadController, ArrayList arrayList, ArrayList arrayList2) {
        downloadController.downloadingFiles.clear();
        downloadController.downloadingFiles.addAll(arrayList);
        downloadController.recentDownloadingFiles.clear();
        downloadController.recentDownloadingFiles.addAll(arrayList2);
    }

    public void swapLoadingPriority(MessageObject messageObject, MessageObject messageObject2) {
        int iIndexOf = this.downloadingFiles.indexOf(messageObject);
        int iIndexOf2 = this.downloadingFiles.indexOf(messageObject2);
        if (iIndexOf >= 0 && iIndexOf2 >= 0) {
            this.downloadingFiles.set(iIndexOf, messageObject2);
            this.downloadingFiles.set(iIndexOf2, messageObject);
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

    public void clearRecentDownloadedFiles() {
        this.recentDownloadingFiles.clear();
        getNotificationCenter().postNotificationName(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                DownloadController.$r8$lambda$k8PMHQeLdnurv94xWF2DwUCt030(this.f$0);
            }
        });
    }

    public static void $r8$lambda$k8PMHQeLdnurv94xWF2DwUCt030(DownloadController downloadController) {
        downloadController.getClass();
        try {
            downloadController.getMessagesStorage().getDatabase().executeFast("DELETE FROM downloading_documents WHERE state = 1").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void deleteRecentFiles(final ArrayList<MessageObject> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            int i2 = 0;
            while (true) {
                if (i2 < this.recentDownloadingFiles.size()) {
                    if (arrayList.get(i).getId() == this.recentDownloadingFiles.get(i2).getId() && this.recentDownloadingFiles.get(i2).getDialogId() == arrayList.get(i).getDialogId()) {
                        this.recentDownloadingFiles.remove(i2);
                        break;
                    }
                    i2++;
                } else {
                    for (int i3 = 0; i3 < this.downloadingFiles.size(); i3++) {
                        if (arrayList.get(i).getId() == this.downloadingFiles.get(i3).getId() && this.downloadingFiles.get(i3).getDialogId() == arrayList.get(i).getDialogId()) {
                            this.downloadingFiles.remove(i3);
                            break;
                        }
                    }
                    break;
                }
            }
            arrayList.get(i).putInDownloadsStore = false;
            FileLoader.getInstance(this.currentAccount).loadFile(arrayList.get(i).getDocument(), arrayList.get(i), 0, 0);
            FileLoader.getInstance(this.currentAccount).cancelLoadFile(arrayList.get(i).getDocument(), true);
        }
        getNotificationCenter().postNotificationName(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                DownloadController.m420$r8$lambda$mso2FcYyMfwylGUaFPzFDYSwQ(this.f$0, arrayList);
            }
        });
    }

    public static void m420$r8$lambda$mso2FcYyMfwylGUaFPzFDYSwQ(DownloadController downloadController, ArrayList arrayList) {
        downloadController.getClass();
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = downloadController.getMessagesStorage().getDatabase().executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
            for (int i = 0; i < arrayList.size(); i++) {
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindInteger(1, ((MessageObject) arrayList.get(i)).getDocument().dc_id);
                sQLitePreparedStatementExecuteFast.bindLong(2, ((MessageObject) arrayList.get(i)).getDocument().id);
                sQLitePreparedStatementExecuteFast.step();
                try {
                    FileLoader.getInstance(downloadController.currentAccount).getPathToMessage(((MessageObject) arrayList.get(i)).messageOwner).delete();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public boolean isDownloading(int i) {
        for (int i2 = 0; i2 < this.downloadingFiles.size(); i2++) {
            if (this.downloadingFiles.get(i2).messageOwner.id == i) {
                return true;
            }
        }
        return false;
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
        } else {
            if (!this.mobilePreset.enabled) {
                return false;
            }
            currentMobilePreset = getCurrentMobilePreset();
        }
        return currentMobilePreset.preloadStories;
    }
}
