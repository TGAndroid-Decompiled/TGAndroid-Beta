package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.Utilities;
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

    public static BetaUpdaterController getInstance() {
        if (instance == null) {
            instance = new BetaUpdaterController();
        }
        return instance;
    }

    private SharedPreferences getSharedPreferences() {
        return ApplicationLoader.applicationContext.getSharedPreferences("beta", 0);
    }

    public void lambda$checkForUpdate$1(java.lang.String r10, java.lang.Runnable r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.BetaUpdaterController.lambda$checkForUpdate$1(java.lang.String, java.lang.Runnable):void");
    }

    public void lambda$checkForUpdate$2(Runnable runnable, String str) {
        AndroidUtilities.runOnUIThread(new g0(this, str, runnable, 7));
    }

    public void lambda$downloadUpdate$3() {
        downloadUpdate(true);
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
        if (getCurrentVersionCode() < this.versionCode && (TextUtils.isEmpty(this.path) || new File(this.path).exists())) {
            return;
        }
        this.version = null;
        this.versionCode = 0;
        this.path = null;
        this.changelog = null;
        this.lastCheck = 0L;
        save();
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
        int i10 = this.versionCode;
        if (i10 == 0) {
            edit.remove("versionCode");
        } else {
            edit.putInt("versionCode", i10);
        }
        if (TextUtils.isEmpty(this.path)) {
            edit.remove("path");
        } else {
            edit.putString("path", this.path);
        }
        long j10 = this.lastCheck;
        if (j10 == 0) {
            edit.remove("lastCheck");
        } else {
            edit.putLong("lastCheck", j10);
        }
        edit.apply();
    }

    public void cancelDownloadingUpdate() {
        if (!this.downloading) {
            return;
        }
        HttpGetFileTask httpGetFileTask = this.downloadingTask;
        if (httpGetFileTask != null) {
            httpGetFileTask.cancel(false);
        }
        this.downloading = false;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
    }

    public void checkForUpdate(boolean z4, Runnable runnable) {
        long j10;
        if (!this.checkingForUpdate) {
            if (this.firstCheck) {
                z4 = true;
            }
            if (!z4) {
                long currentTimeMillis = System.currentTimeMillis() - this.lastCheck;
                if (ApplicationLoader.mainInterfacePaused) {
                    j10 = 86400000;
                } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    j10 = 240000;
                } else {
                    j10 = 1200000;
                }
                if (currentTimeMillis < j10) {
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
            }
            this.checkingForUpdate = true;
            this.firstCheck = false;
            new org.telegram.ui.web.i1(new w(0, this, runnable)).execute("null");
        }
    }

    public void downloadUpdate() {
        downloadUpdate(false);
    }

    public File getDownloadedFile() {
        if (this.path == null) {
            return null;
        }
        File file = new File(this.path);
        if (!file.exists()) {
            this.path = null;
            save();
            return null;
        }
        return file;
    }

    public float getDownloadingProgress() {
        return this.downloadingProgress;
    }

    public BetaUpdate getUpdate() {
        int i10;
        String str = this.version;
        if (str != null && (i10 = this.versionCode) != 0) {
            return new BetaUpdate(str, i10, this.changelog);
        }
        return null;
    }

    public boolean isDownloading() {
        return this.downloading;
    }

    private void downloadUpdate(boolean z4) {
        if (this.downloading || !TextUtils.isEmpty(this.path)) {
            return;
        }
        this.downloading = true;
        this.downloadingProgress = 0.0f;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateLoading, new Object[0]);
        if (!TextUtils.isEmpty(this.fileUrl)) {
            HttpGetFileTask overrideExtension = new HttpGetFileTask(new Utilities.Callback(this) {
                public final BetaUpdaterController f18604b;

                {
                    this.f18604b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            this.f18604b.lambda$downloadUpdate$5((File) obj);
                            return;
                        default:
                            this.f18604b.lambda$downloadUpdate$6((Float) obj);
                            return;
                    }
                }
            }, new Utilities.Callback(this) {
                public final BetaUpdaterController f18604b;

                {
                    this.f18604b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            this.f18604b.lambda$downloadUpdate$5((File) obj);
                            return;
                        default:
                            this.f18604b.lambda$downloadUpdate$6((Float) obj);
                            return;
                    }
                }
            }).setOverrideExtension("apk");
            this.downloadingTask = overrideExtension;
            overrideExtension.execute(this.fileUrl);
        } else if (!z4) {
            checkForUpdate(true, new u(this, 0));
        } else {
            this.downloading = false;
        }
    }
}
