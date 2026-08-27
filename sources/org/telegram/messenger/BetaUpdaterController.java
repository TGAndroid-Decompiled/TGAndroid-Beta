package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.json.JSONObject;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.HttpGetFileTask;

public class BetaUpdaterController {
    private static final long CHECK_INTERVAL = 1200000;
    private static final long CHECK_INTERVAL_PAUSED = 86400000;
    private static final long CHECK_INTERVAL_PRIVATE = 240000;
    private static BetaUpdaterController instance;
    private String changelog;
    private boolean checkingForUpdate;
    private boolean downloading;
    private float downloadingProgress;
    private HttpGetFileTask downloadingTask;
    private String fileUrl;
    private long lastCheck;
    private String path;
    private String version;
    private int versionCode;
    private boolean firstCheck = true;
    private final Runnable scheduledUpdateCheck = new u(this, 1);

    public BetaUpdaterController() {
        load();
    }

    private String getCurrentVersion() {
        try {
            return ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionName;
        } catch (Exception e9) {
            FileLog.e(e9);
            return "";
        }
    }

    private int getCurrentVersionCode() {
        try {
            return ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode;
        } catch (Exception e9) {
            FileLog.e(e9);
            return 0;
        }
    }

    public static BetaUpdaterController getInstance() {
        if (instance == null) {
            instance = new BetaUpdaterController();
        }
        return instance;
    }

    private SharedPreferences getSharedPreferences() {
        return ApplicationLoader.applicationContext.getSharedPreferences("beta", 0);
    }

    public void lambda$checkForUpdate$1(String str, Runnable runnable) {
        String str2;
        this.checkingForUpdate = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("version");
            int i10 = jSONObject.getInt("version_code");
            String string2 = jSONObject.getString("file_url");
            String strOptString = jSONObject.optString("changelog", null);
            int i11 = this.versionCode;
            String str3 = this.version;
            if (str3 != null && (!SharedConfig.versionBiggerOrEqual(string, str3) || i10 <= this.versionCode)) {
                str2 = this.version;
                if (str2 == null) {
                    if (!TextUtils.isEmpty(this.path)) {
                        new File(this.path).delete();
                    }
                    this.path = null;
                    if (SharedConfig.versionBiggerOrEqual(getCurrentVersion(), string)) {
                        this.version = null;
                        this.versionCode = 0;
                        this.fileUrl = null;
                        this.changelog = null;
                    } else {
                        this.version = null;
                        this.versionCode = 0;
                        this.fileUrl = null;
                        this.changelog = null;
                    }
                } else {
                    if (!TextUtils.isEmpty(this.path)) {
                        new File(this.path).delete();
                    }
                    this.path = null;
                    if (SharedConfig.versionBiggerOrEqual(getCurrentVersion(), string)) {
                        this.version = null;
                        this.versionCode = 0;
                        this.fileUrl = null;
                        this.changelog = null;
                    } else {
                        this.version = null;
                        this.versionCode = 0;
                        this.fileUrl = null;
                        this.changelog = null;
                    }
                }
            } else if (!SharedConfig.versionBiggerOrEqual(string, getCurrentVersion()) || i10 <= getCurrentVersionCode()) {
                str2 = this.version;
                if (str2 == null && this.versionCode != 0 && SharedConfig.versionBiggerOrEqual(str2, string) && this.versionCode == i10) {
                    this.fileUrl = string2;
                    this.changelog = strOptString;
                } else {
                    if (!TextUtils.isEmpty(this.path)) {
                        try {
                            new File(this.path).delete();
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                    this.path = null;
                    if (SharedConfig.versionBiggerOrEqual(getCurrentVersion(), string) || getCurrentVersionCode() >= i10) {
                        this.version = null;
                        this.versionCode = 0;
                        this.fileUrl = null;
                        this.changelog = null;
                    } else {
                        this.version = string;
                        this.versionCode = i10;
                        this.fileUrl = string2;
                        this.changelog = strOptString;
                    }
                }
            } else {
                if (!TextUtils.isEmpty(this.path)) {
                    try {
                        new File(this.path).delete();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                this.path = null;
                this.version = string;
                this.versionCode = i10;
                this.fileUrl = string2;
                this.changelog = strOptString;
            }
            this.lastCheck = System.currentTimeMillis();
            save();
            if (this.versionCode != i11) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
            }
            AndroidUtilities.cancelRunOnUIThread(this.scheduledUpdateCheck);
            AndroidUtilities.runOnUIThread(this.scheduledUpdateCheck, BuildVars.DEBUG_PRIVATE_VERSION ? 240000L : 1200000L);
            if (runnable != null) {
                runnable.run();
                return;
            }
            if (this.versionCode == i11 || ApplicationLoader.mainInterfacePaused) {
                return;
            }
            Context context = LaunchActivity.C1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            BetaUpdate update = getUpdate();
            if (context == null || update == null) {
                return;
            }
            ApplicationLoader.applicationLoaderInstance.showCustomUpdateAppPopup(context, update, UserConfig.selectedAccount);
        } catch (Exception e11) {
            FileLog.e("Failed to check for beta update at null received: " + str, e11);
        }
    }

    public void lambda$checkForUpdate$2(Runnable runnable, String str) {
        AndroidUtilities.runOnUIThread(new f0(this, str, runnable, 6));
    }

    public void lambda$downloadUpdate$3() {
        downloadUpdate(true);
    }

    public void lambda$downloadUpdate$4(File file) {
        if (file == null) {
            this.downloading = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
            return;
        }
        if (!TextUtils.isEmpty(this.path)) {
            try {
                new File(this.path).delete();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        this.path = file.getAbsolutePath();
        save();
        this.downloadingProgress = 1.0f;
        this.downloading = false;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
    }

    public void lambda$downloadUpdate$5(File file) {
        AndroidUtilities.runOnUIThread(new e3(11, this, file));
    }

    public void lambda$downloadUpdate$6(Float f10) {
        this.downloadingProgress = f10.floatValue();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateLoading, new Object[0]);
    }

    public void lambda$new$0() {
        checkForUpdate(false, null);
    }

    private void load() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        this.version = sharedPreferences.getString("version", null);
        this.versionCode = sharedPreferences.getInt("versionCode", 0);
        this.changelog = sharedPreferences.getString("changelog", null);
        this.path = sharedPreferences.getString("path", null);
        this.lastCheck = sharedPreferences.getLong("lastCheck", 0L);
        if (getCurrentVersionCode() >= this.versionCode || !(TextUtils.isEmpty(this.path) || new File(this.path).exists())) {
            this.version = null;
            this.versionCode = 0;
            this.path = null;
            this.changelog = null;
            this.lastCheck = 0L;
            save();
        }
    }

    private void save() {
        SharedPreferences.Editor editorEdit = getSharedPreferences().edit();
        if (TextUtils.isEmpty(this.version)) {
            editorEdit.remove("version");
        } else {
            editorEdit.putString("version", this.version);
        }
        if (TextUtils.isEmpty(this.changelog)) {
            editorEdit.remove("changelog");
        } else {
            editorEdit.putString("changelog", this.changelog);
        }
        int i10 = this.versionCode;
        if (i10 == 0) {
            editorEdit.remove("versionCode");
        } else {
            editorEdit.putInt("versionCode", i10);
        }
        if (TextUtils.isEmpty(this.path)) {
            editorEdit.remove("path");
        } else {
            editorEdit.putString("path", this.path);
        }
        long j10 = this.lastCheck;
        if (j10 == 0) {
            editorEdit.remove("lastCheck");
        } else {
            editorEdit.putLong("lastCheck", j10);
        }
        editorEdit.apply();
    }

    public void cancelDownloadingUpdate() {
        if (this.downloading) {
            HttpGetFileTask httpGetFileTask = this.downloadingTask;
            if (httpGetFileTask != null) {
                httpGetFileTask.cancel(false);
            }
            this.downloading = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        }
    }

    public void checkForUpdate(boolean z10, Runnable runnable) {
        long j10;
        if (this.checkingForUpdate) {
            return;
        }
        if (this.firstCheck) {
            z10 = true;
        }
        if (!z10) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.lastCheck;
            if (ApplicationLoader.mainInterfacePaused) {
                j10 = 86400000;
            } else {
                j10 = BuildVars.DEBUG_PRIVATE_VERSION ? 240000L : 1200000L;
            }
            if (jCurrentTimeMillis < j10) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        this.checkingForUpdate = true;
        this.firstCheck = false;
        new org.telegram.ui.web.f1(new w(0, this, runnable)).execute("null");
    }

    public void downloadUpdate() {
        downloadUpdate(false);
    }

    public File getDownloadedFile() {
        if (this.path == null) {
            return null;
        }
        File file = new File(this.path);
        if (file.exists()) {
            return file;
        }
        this.path = null;
        save();
        return null;
    }

    public float getDownloadingProgress() {
        return this.downloadingProgress;
    }

    public BetaUpdate getUpdate() {
        int i10;
        String str = this.version;
        if (str == null || (i10 = this.versionCode) == 0) {
            return null;
        }
        return new BetaUpdate(str, i10, this.changelog);
    }

    public boolean isDownloading() {
        return this.downloading;
    }

    private void downloadUpdate(boolean z10) {
        if (this.downloading || !TextUtils.isEmpty(this.path)) {
            return;
        }
        this.downloading = true;
        this.downloadingProgress = 0.0f;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateLoading, new Object[0]);
        if (TextUtils.isEmpty(this.fileUrl)) {
            if (z10) {
                this.downloading = false;
                return;
            } else {
                checkForUpdate(true, new u(this, 0));
                return;
            }
        }
        final int i10 = 0;
        final int i11 = 1;
        HttpGetFileTask overrideExtension = new HttpGetFileTask(new Utilities.Callback(this) {

            public final BetaUpdaterController f21758b;

            {
                this.f21758b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        this.f21758b.lambda$downloadUpdate$5((File) obj);
                        break;
                    default:
                        this.f21758b.lambda$downloadUpdate$6((Float) obj);
                        break;
                }
            }
        }, new Utilities.Callback(this) {

            public final BetaUpdaterController f21758b;

            {
                this.f21758b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        this.f21758b.lambda$downloadUpdate$5((File) obj);
                        break;
                    default:
                        this.f21758b.lambda$downloadUpdate$6((Float) obj);
                        break;
                }
            }
        }).setOverrideExtension("apk");
        this.downloadingTask = overrideExtension;
        overrideExtension.execute(this.fileUrl);
    }
}
