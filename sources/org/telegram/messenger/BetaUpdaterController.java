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
            this.f$0.checkForUpdate(false, null);
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
                BetaUpdaterController.$r8$lambda$zmJCbdiPRh9mZUyBhIkpFLCyoBs(this.f$0, runnable, (String) obj);
            }
        }).execute("https://telegram.org/dl/android/apk-public-beta.json");
    }

    public static void $r8$lambda$zmJCbdiPRh9mZUyBhIkpFLCyoBs(final BetaUpdaterController betaUpdaterController, final Runnable runnable, final String str) {
        betaUpdaterController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BetaUpdaterController.m359$r8$lambda$fsz3n_NR6ZdjRTY4e6lYYhKrkM(this.f$0, str, runnable);
            }
        });
    }

    public static void m359$r8$lambda$fsz3n_NR6ZdjRTY4e6lYYhKrkM(BetaUpdaterController betaUpdaterController, String str, Runnable runnable) {
        String str2;
        betaUpdaterController.checkingForUpdate = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("version");
            int i = jSONObject.getInt("version_code");
            String string2 = jSONObject.getString("file_url");
            String strOptString = jSONObject.optString("changelog", null);
            int i2 = betaUpdaterController.versionCode;
            String str3 = betaUpdaterController.version;
            if (str3 == null || (SharedConfig.versionBiggerOrEqual(string, str3) && i > betaUpdaterController.versionCode)) {
                if (SharedConfig.versionBiggerOrEqual(string, betaUpdaterController.getCurrentVersion()) && i > betaUpdaterController.getCurrentVersionCode()) {
                    if (!TextUtils.isEmpty(betaUpdaterController.path)) {
                        try {
                            new File(betaUpdaterController.path).delete();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    betaUpdaterController.path = null;
                    betaUpdaterController.version = string;
                    betaUpdaterController.versionCode = i;
                    betaUpdaterController.fileUrl = string2;
                    betaUpdaterController.changelog = strOptString;
                } else {
                    str2 = betaUpdaterController.version;
                    if (str2 == null && betaUpdaterController.versionCode != 0 && SharedConfig.versionBiggerOrEqual(str2, string) && betaUpdaterController.versionCode == i) {
                        betaUpdaterController.fileUrl = string2;
                        betaUpdaterController.changelog = strOptString;
                    } else {
                        if (!TextUtils.isEmpty(betaUpdaterController.path)) {
                            try {
                                new File(betaUpdaterController.path).delete();
                            } catch (Exception e2) {
                                FileLog.e(e2);
                            }
                        }
                        betaUpdaterController.path = null;
                        if (!SharedConfig.versionBiggerOrEqual(betaUpdaterController.getCurrentVersion(), string) && betaUpdaterController.getCurrentVersionCode() < i) {
                            betaUpdaterController.version = string;
                            betaUpdaterController.versionCode = i;
                            betaUpdaterController.fileUrl = string2;
                            betaUpdaterController.changelog = strOptString;
                        } else {
                            betaUpdaterController.version = null;
                            betaUpdaterController.versionCode = 0;
                            betaUpdaterController.fileUrl = null;
                            betaUpdaterController.changelog = null;
                        }
                    }
                }
            } else {
                str2 = betaUpdaterController.version;
                if (str2 == null) {
                    if (!TextUtils.isEmpty(betaUpdaterController.path)) {
                        new File(betaUpdaterController.path).delete();
                    }
                    betaUpdaterController.path = null;
                    if (!SharedConfig.versionBiggerOrEqual(betaUpdaterController.getCurrentVersion(), string)) {
                        betaUpdaterController.version = null;
                        betaUpdaterController.versionCode = 0;
                        betaUpdaterController.fileUrl = null;
                        betaUpdaterController.changelog = null;
                    } else {
                        betaUpdaterController.version = null;
                        betaUpdaterController.versionCode = 0;
                        betaUpdaterController.fileUrl = null;
                        betaUpdaterController.changelog = null;
                    }
                } else {
                    if (!TextUtils.isEmpty(betaUpdaterController.path)) {
                        new File(betaUpdaterController.path).delete();
                    }
                    betaUpdaterController.path = null;
                    if (!SharedConfig.versionBiggerOrEqual(betaUpdaterController.getCurrentVersion(), string)) {
                        betaUpdaterController.version = null;
                        betaUpdaterController.versionCode = 0;
                        betaUpdaterController.fileUrl = null;
                        betaUpdaterController.changelog = null;
                    } else {
                        betaUpdaterController.version = null;
                        betaUpdaterController.versionCode = 0;
                        betaUpdaterController.fileUrl = null;
                        betaUpdaterController.changelog = null;
                    }
                }
            }
            betaUpdaterController.lastCheck = System.currentTimeMillis();
            betaUpdaterController.save();
            if (betaUpdaterController.versionCode != i2) {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.appUpdateAvailable, new Object[0]);
            }
            AndroidUtilities.cancelRunOnUIThread(betaUpdaterController.scheduledUpdateCheck);
            AndroidUtilities.runOnUIThread(betaUpdaterController.scheduledUpdateCheck, BuildVars.DEBUG_PRIVATE_VERSION ? 240000L : 1200000L);
            if (runnable != null) {
                runnable.run();
                return;
            }
            if (betaUpdaterController.versionCode == i2 || ApplicationLoader.mainInterfacePaused) {
                return;
            }
            Context context = LaunchActivity.instance;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            BetaUpdate update = betaUpdaterController.getUpdate();
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

    public void downloadUpdate(boolean z) {
        if (this.downloading || !TextUtils.isEmpty(this.path)) {
            return;
        }
        this.downloading = true;
        this.downloadingProgress = 0.0f;
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.appUpdateLoading, new Object[0]);
        if (!TextUtils.isEmpty(this.fileUrl)) {
            HttpGetFileTask overrideExtension = new HttpGetFileTask(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    BetaUpdaterController.m360$r8$lambda$rWrbCAumhAkPQje3pEdS8p0L_M(this.f$0, (File) obj);
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    BetaUpdaterController.$r8$lambda$y2Q4LVbQ8eFUoryuszvKafy_Ogk(this.f$0, (Float) obj);
                }
            }).setOverrideExtension("apk");
            this.downloadingTask = overrideExtension;
            overrideExtension.execute(this.fileUrl);
        } else if (!z) {
            checkForUpdate(true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.downloadUpdate(true);
                }
            });
        } else {
            this.downloading = false;
        }
    }

    public static void m360$r8$lambda$rWrbCAumhAkPQje3pEdS8p0L_M(final BetaUpdaterController betaUpdaterController, final File file) {
        betaUpdaterController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BetaUpdaterController.m358$r8$lambda$7jnCGEmKStos3SMukfEyKvZNu8(this.f$0, file);
            }
        });
    }

    public static void m358$r8$lambda$7jnCGEmKStos3SMukfEyKvZNu8(BetaUpdaterController betaUpdaterController, File file) {
        if (file != null) {
            if (!TextUtils.isEmpty(betaUpdaterController.path)) {
                try {
                    new File(betaUpdaterController.path).delete();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            betaUpdaterController.path = file.getAbsolutePath();
            betaUpdaterController.save();
            betaUpdaterController.downloadingProgress = 1.0f;
            betaUpdaterController.downloading = false;
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.appUpdateAvailable, new Object[0]);
            return;
        }
        betaUpdaterController.downloading = false;
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.appUpdateAvailable, new Object[0]);
    }

    public static void $r8$lambda$y2Q4LVbQ8eFUoryuszvKafy_Ogk(BetaUpdaterController betaUpdaterController, Float f) {
        betaUpdaterController.getClass();
        betaUpdaterController.downloadingProgress = f.floatValue();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.appUpdateLoading, new Object[0]);
    }

    public void cancelDownloadingUpdate() {
        if (this.downloading) {
            HttpGetFileTask httpGetFileTask = this.downloadingTask;
            if (httpGetFileTask != null) {
                httpGetFileTask.cancel(false);
            }
            this.downloading = false;
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.appUpdateAvailable, new Object[0]);
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
