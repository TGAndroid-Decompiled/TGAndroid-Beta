package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.json.JSONObject;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.web.HttpGetTask;

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
    private final Runnable scheduledUpdateCheck = new Runnable() {
        @Override
        public final void run() {
            this.f$0.lambda$new$0();
        }
    };

    public static BetaUpdaterController getInstance() {
        if (instance == null) {
            instance = new BetaUpdaterController();
        }
        return instance;
    }

    public BetaUpdaterController() {
        load();
    }

    private SharedPreferences getSharedPreferences() {
        return ApplicationLoader.applicationContext.getSharedPreferences("beta", 0);
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
        int i = this.versionCode;
        if (i == 0) {
            editorEdit.remove("versionCode");
        } else {
            editorEdit.putInt("versionCode", i);
        }
        if (TextUtils.isEmpty(this.path)) {
            editorEdit.remove("path");
        } else {
            editorEdit.putString("path", this.path);
        }
        long j = this.lastCheck;
        if (j == 0) {
            editorEdit.remove("lastCheck");
        } else {
            editorEdit.putLong("lastCheck", j);
        }
        editorEdit.apply();
    }

    public void lambda$new$0() {
        checkForUpdate(false, null);
    }

    public void checkForUpdate(boolean z, final Runnable runnable) {
        long j;
        if (this.checkingForUpdate) {
            return;
        }
        if (this.firstCheck) {
            z = true;
        }
        if (!z) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.lastCheck;
            if (ApplicationLoader.mainInterfacePaused) {
                j = 86400000;
            } else {
                j = BuildVars.DEBUG_PRIVATE_VERSION ? 240000L : 1200000L;
            }
            if (jCurrentTimeMillis < j) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        this.checkingForUpdate = true;
        this.firstCheck = false;
        new HttpGetTask(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$checkForUpdate$2(runnable, (String) obj);
            }
        }).execute("https://telegram.org/dl/android/apk-public-beta.json");
    }

    public void lambda$checkForUpdate$2(final Runnable runnable, final String str) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkForUpdate$1(str, runnable);
            }
        });
    }

    public void lambda$checkForUpdate$1(String str, Runnable runnable) {
        String str2;
        this.checkingForUpdate = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("version");
            int i = jSONObject.getInt("version_code");
            String string2 = jSONObject.getString("file_url");
            String strOptString = jSONObject.optString("changelog", null);
            int i2 = this.versionCode;
            String str3 = this.version;
            if (str3 == null || (SharedConfig.versionBiggerOrEqual(string, str3) && i > this.versionCode)) {
                if (SharedConfig.versionBiggerOrEqual(string, getCurrentVersion()) && i > getCurrentVersionCode()) {
                    if (!TextUtils.isEmpty(this.path)) {
                        try {
                            new File(this.path).delete();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    this.path = null;
                    this.version = string;
                    this.versionCode = i;
                    this.fileUrl = string2;
                    this.changelog = strOptString;
                } else {
                    str2 = this.version;
                    if (str2 == null && this.versionCode != 0 && SharedConfig.versionBiggerOrEqual(str2, string) && this.versionCode == i) {
                        this.fileUrl = string2;
                        this.changelog = strOptString;
                    } else {
                        if (!TextUtils.isEmpty(this.path)) {
                            try {
                                new File(this.path).delete();
                            } catch (Exception e2) {
                                FileLog.e(e2);
                            }
                        }
                        this.path = null;
                        if (!SharedConfig.versionBiggerOrEqual(getCurrentVersion(), string) && getCurrentVersionCode() < i) {
                            this.version = string;
                            this.versionCode = i;
                            this.fileUrl = string2;
                            this.changelog = strOptString;
                        } else {
                            this.version = null;
                            this.versionCode = 0;
                            this.fileUrl = null;
                            this.changelog = null;
                        }
                    }
                }
            } else {
                str2 = this.version;
                if (str2 == null) {
                    if (!TextUtils.isEmpty(this.path)) {
                        new File(this.path).delete();
                    }
                    this.path = null;
                    if (!SharedConfig.versionBiggerOrEqual(getCurrentVersion(), string)) {
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
                    if (!SharedConfig.versionBiggerOrEqual(getCurrentVersion(), string)) {
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
            }
            this.lastCheck = System.currentTimeMillis();
            save();
            if (this.versionCode != i2) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
            }
            AndroidUtilities.cancelRunOnUIThread(this.scheduledUpdateCheck);
            AndroidUtilities.runOnUIThread(this.scheduledUpdateCheck, BuildVars.DEBUG_PRIVATE_VERSION ? 240000L : 1200000L);
            if (runnable != null) {
                runnable.run();
                return;
            }
            if (this.versionCode == i2 || ApplicationLoader.mainInterfacePaused) {
                return;
            }
            Context context = LaunchActivity.instance;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            BetaUpdate update = getUpdate();
            if (context == null || update == null) {
                return;
            }
            ApplicationLoader.applicationLoaderInstance.showCustomUpdateAppPopup(context, update, UserConfig.selectedAccount);
        } catch (Exception e3) {
            FileLog.e("Failed to check for beta update at https://telegram.org/dl/android/apk-public-beta.json received: " + str, e3);
        }
    }

    public BetaUpdate getUpdate() {
        int i;
        String str = this.version;
        if (str == null || (i = this.versionCode) == 0) {
            return null;
        }
        return new BetaUpdate(str, i, this.changelog);
    }

    public void downloadUpdate() {
        downloadUpdate(false);
    }

    private void downloadUpdate(boolean z) {
        if (this.downloading || !TextUtils.isEmpty(this.path)) {
            return;
        }
        this.downloading = true;
        this.downloadingProgress = 0.0f;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateLoading, new Object[0]);
        if (!TextUtils.isEmpty(this.fileUrl)) {
            HttpGetFileTask overrideExtension = new HttpGetFileTask(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$downloadUpdate$5((File) obj);
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$downloadUpdate$6((Float) obj);
                }
            }).setOverrideExtension("apk");
            this.downloadingTask = overrideExtension;
            overrideExtension.execute(this.fileUrl);
        } else if (!z) {
            checkForUpdate(true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$downloadUpdate$3();
                }
            });
        } else {
            this.downloading = false;
        }
    }

    public void lambda$downloadUpdate$3() {
        downloadUpdate(true);
    }

    public void lambda$downloadUpdate$5(final File file) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$downloadUpdate$4(file);
            }
        });
    }

    public void lambda$downloadUpdate$4(File file) {
        if (file != null) {
            if (!TextUtils.isEmpty(this.path)) {
                try {
                    new File(this.path).delete();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            this.path = file.getAbsolutePath();
            save();
            this.downloadingProgress = 1.0f;
            this.downloading = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
            return;
        }
        this.downloading = false;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
    }

    public void lambda$downloadUpdate$6(Float f) {
        this.downloadingProgress = f.floatValue();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateLoading, new Object[0]);
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

    public boolean isDownloading() {
        return this.downloading;
    }

    public float getDownloadingProgress() {
        return this.downloadingProgress;
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

    private String getCurrentVersion() {
        try {
            return ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionName;
        } catch (Exception e) {
            FileLog.e(e);
            return "";
        }
    }

    private int getCurrentVersionCode() {
        try {
            return ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            FileLog.e(e);
            return 0;
        }
    }
}
