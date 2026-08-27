package org.telegram.messenger;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.telegram.ui.Components.jw0;

public class FilesMigrationService extends Service {
    public static FilesMigrationBottomSheet filesMigrationBottomSheet = null;
    public static boolean hasOldFolder = false;
    public static boolean isRunning = false;
    private static boolean wasShown = false;
    long lastUpdateTime;
    private int movedFilesCount;
    private int totalFilesCount;

    public class AnonymousClass1 extends Thread {
        public AnonymousClass1() {
        }

        public void lambda$run$0() {
            FilesMigrationService.isRunning = false;
            FilesMigrationService.this.stopForeground(true);
            FilesMigrationService.this.stopSelf();
        }

        @Override
        public void run() {
            FilesMigrationService.this.migrateOldFolder();
            AndroidUtilities.runOnUIThread(new d1(this, 2));
        }
    }

    public static void checkBottomSheet(org.telegram.ui.ActionBar.n2 n2Var) {
        ArrayList<File> rootDirs;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0);
        if (!Environment.isExternalStorageLegacy() || sharedPreferences.getBoolean("migration_to_scoped_storage_finished", false) || sharedPreferences.getInt("migration_to_scoped_storage_count", 0) >= 5 || wasShown || filesMigrationBottomSheet != null || isRunning) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (!TextUtils.isEmpty(SharedConfig.storageCacheDir) && (rootDirs = AndroidUtilities.getRootDirs()) != null) {
                int size = rootDirs.size();
                for (int i10 = 0; i10 < size; i10++) {
                    File file = rootDirs.get(i10);
                    if (file.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                        externalStorageDirectory = file;
                        break;
                    }
                }
            }
            hasOldFolder = new File(externalStorageDirectory, "Telegram").exists();
        }
        if (!hasOldFolder) {
            sharedPreferences.edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
            return;
        }
        FilesMigrationBottomSheet filesMigrationBottomSheet2 = new FilesMigrationBottomSheet(n2Var);
        filesMigrationBottomSheet = filesMigrationBottomSheet2;
        filesMigrationBottomSheet2.show();
        wasShown = true;
        sharedPreferences.edit().putInt("migration_to_scoped_storage_count", sharedPreferences.getInt("migration_to_scoped_storage_count", 0) + 1).apply();
    }

    private int getFilesCount(File file) {
        File[] fileArrListFiles;
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return 0;
        }
        int filesCount = 0;
        for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
            filesCount = fileArrListFiles[i10].isDirectory() ? filesCount + getFilesCount(fileArrListFiles[i10]) : filesCount + 1;
        }
        return filesCount;
    }

    public void lambda$moveDirectory$0(File file, Path path) {
        File file2 = new File(file, path.getFileName().toString());
        if (Files.isDirectory(path, new LinkOption[0])) {
            moveDirectory(path.toFile(), file2);
            return;
        }
        try {
            Files.move(path, file2.toPath(), new CopyOption[0]);
        } catch (Exception e9) {
            FileLog.e((Throwable) e9, false);
            try {
                path.toFile().delete();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        this.movedFilesCount++;
        updateProgress();
    }

    public void lambda$updateProgress$1(int i10) {
        ((NotificationManager) getSystemService("notification")).notify(301, v3.a(this, NotificationsController.OTHER_NOTIFICATIONS_CHANNEL).setContentTitle(getText(R.string.MigratingFiles)).setContentText(i10 + "/" + this.totalFilesCount).setSmallIcon(R.drawable.notification).setAutoCancel(false).setProgress(this.totalFilesCount, i10, false).build());
    }

    private void moveDirectory(File file, final File file2) {
        if (file.exists()) {
            if (file2.exists() || file2.mkdir()) {
                try {
                    Stream streamE = b.e(file.toPath());
                    try {
                        streamE.forEach(new Consumer() {
                            @Override
                            public final void x(Object obj) {
                                this.f22011a.lambda$moveDirectory$0(file2, (Path) obj);
                            }

                            public Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        streamE.close();
                    } catch (Throwable th) {
                        if (streamE != null) {
                            try {
                                streamE.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                try {
                    file.delete();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public static void start() {
        ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) FilesMigrationService.class));
    }

    private void updateProgress() {
        if (System.currentTimeMillis() - this.lastUpdateTime > 20 || this.movedFilesCount >= this.totalFilesCount - 1) {
            AndroidUtilities.runOnUIThread(new p6(this, this.movedFilesCount, 6));
        }
    }

    public void migrateOldFolder() {
        ArrayList<File> rootDirs;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir) && (rootDirs = AndroidUtilities.getRootDirs()) != null) {
            int size = rootDirs.size();
            for (int i10 = 0; i10 < size; i10++) {
                File file = rootDirs.get(i10);
                if (file.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                    externalStorageDirectory = file;
                    break;
                }
            }
        }
        File file2 = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), "Telegram");
        File file3 = new File(externalStorageDirectory, "Telegram");
        this.totalFilesCount = getFilesCount(file3);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (file3.canRead() && file3.canWrite()) {
            moveDirectory(file3, file2);
        }
        FileLog.d("move time = " + (System.currentTimeMillis() - jCurrentTimeMillis));
        ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int i10, int i11) {
        NotificationsController.checkOtherNotificationsChannel();
        Notification notificationBuild = v3.a(this, NotificationsController.OTHER_NOTIFICATIONS_CHANNEL).setContentTitle(getText(R.string.MigratingFiles)).setAutoCancel(false).setSmallIcon(R.drawable.notification).build();
        isRunning = true;
        new AnonymousClass1().start();
        startForeground(301, notificationBuild);
        return super.onStartCommand(intent, i10, i11);
    }

    public static class FilesMigrationBottomSheet extends org.telegram.ui.ActionBar.e3 {
        org.telegram.ui.ActionBar.n2 fragment;

        public FilesMigrationBottomSheet(org.telegram.ui.ActionBar.n2 n2Var) {
            super(n2Var.getParentActivity(), false);
            this.fragment = n2Var;
            setCanceledOnTouchOutside(false);
            Activity parentActivity = n2Var.getParentActivity();
            LinearLayout linearLayoutF = y1.f(parentActivity, 1);
            jw0 jw0Var = new jw0(parentActivity, this.currentAccount);
            jw0Var.setStickerNum(7);
            jw0Var.getImageReceiver().setAutoRepeat(1);
            linearLayoutF.addView(jw0Var, h7.z5.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
            y1.s(textView, org.telegram.ui.ActionBar.g6.w0(null, i10, false), 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.MigrateOldFolderTitle));
            linearLayoutF.addView(textView, h7.z5.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            y1.p(R.string.MigrateOldFolderDescription, textView2);
            linearLayoutF.addView(textView2, h7.z5.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.MigrateOldFolderButton));
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            textView3.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.g6.Oh));
            linearLayoutF.addView(textView3, h7.z5.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new x3(this, 0));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(linearLayoutF);
            setCustomView(scrollView);
        }

        public void lambda$new$0(View view) {
            migrateOldFolder();
        }

        @Override
        public boolean canDismissWithSwipe() {
            return false;
        }

        @Override
        public boolean canDismissWithTouchOutside() {
            return false;
        }

        @Override
        public void dismiss() {
            super.dismiss();
            FilesMigrationService.filesMigrationBottomSheet = null;
        }

        public void migrateOldFolder() {
            Activity parentActivity = this.fragment.getParentActivity();
            boolean z10 = false;
            boolean z11 = parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 >= 33 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) || (i10 < 33 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0)) {
                z10 = true;
            }
            if (z10 && z11) {
                FilesMigrationService.start();
                dismiss();
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (!z10) {
                if (i10 >= 33) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                } else {
                    arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                }
            }
            if (!z11) {
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            parentActivity.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 4);
        }

        @Override
        public void setLastVisible(boolean z10) {
        }
    }
}
