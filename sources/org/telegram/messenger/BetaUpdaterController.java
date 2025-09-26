package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.Utilities;
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
            BetaUpdaterController.this.lambda$new$0();
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
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        if (TextUtils.isEmpty(this.version)) {
            edit.remove("version");
        } else {
            edit.putString("version", this.version);
        }
        if (TextUtils.isEmpty(this.changelog)) {
            edit.remove("changelog");
        } else {
            edit.putString("changelog", this.changelog);
        }
        int i = this.versionCode;
        if (i == 0) {
            edit.remove("versionCode");
        } else {
            edit.putInt("versionCode", i);
        }
        if (TextUtils.isEmpty(this.path)) {
            edit.remove("path");
        } else {
            edit.putString("path", this.path);
        }
        long j = this.lastCheck;
        if (j == 0) {
            edit.remove("lastCheck");
        } else {
            edit.putLong("lastCheck", j);
        }
        edit.apply();
    }

    public void lambda$new$0() {
        checkForUpdate(false, null);
    }

    public void checkForUpdate(boolean z, final Runnable runnable) {
        if (this.checkingForUpdate) {
            return;
        }
        if (this.firstCheck) {
            z = true;
        }
        if (!z) {
            if (System.currentTimeMillis() - this.lastCheck < (ApplicationLoader.mainInterfacePaused ? 86400000L : BuildVars.DEBUG_PRIVATE_VERSION ? 240000L : 1200000L)) {
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
                BetaUpdaterController.this.lambda$checkForUpdate$2(runnable, (String) obj);
            }
        }).execute("https://telegram.org/dl/android/apk-public-beta.json");
    }

    public void lambda$checkForUpdate$2(final Runnable runnable, final String str) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BetaUpdaterController.this.lambda$checkForUpdate$1(str, runnable);
            }
        });
    }

    public void lambda$checkForUpdate$1(java.lang.String r10, java.lang.Runnable r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.BetaUpdaterController.lambda$checkForUpdate$1(java.lang.String, java.lang.Runnable):void");
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
                    BetaUpdaterController.this.lambda$downloadUpdate$5((File) obj);
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    BetaUpdaterController.this.lambda$downloadUpdate$6((Float) obj);
                }
            }).setOverrideExtension("apk");
            this.downloadingTask = overrideExtension;
            overrideExtension.execute(this.fileUrl);
        } else if (!z) {
            checkForUpdate(true, new Runnable() {
                @Override
                public final void run() {
                    BetaUpdaterController.this.lambda$downloadUpdate$3();
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
                BetaUpdaterController.this.lambda$downloadUpdate$4(file);
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
