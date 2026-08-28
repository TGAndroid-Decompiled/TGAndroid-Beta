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
import org.telegram.ui.Components.hw0;
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
            FilesMigrationService.this = r1;
        }

        public void lambda$run$0() {
            FilesMigrationService.isRunning = false;
            FilesMigrationService.this.stopForeground(true);
            FilesMigrationService.this.stopSelf();
        }

        @Override
        public void run() {
            FilesMigrationService.this.migrateOldFolder();
            AndroidUtilities.runOnUIThread(new e1(this, 2));
        }
    }

    public static void checkBottomSheet(org.telegram.ui.ActionBar.o2 o2Var) {
        ArrayList<File> rootDirs;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0);
        if (Environment.isExternalStorageLegacy() && !sharedPreferences.getBoolean("migration_to_scoped_storage_finished", false) && sharedPreferences.getInt("migration_to_scoped_storage_count", 0) < 5 && !wasShown && filesMigrationBottomSheet == null && !isRunning) {
            if (Build.VERSION.SDK_INT >= 30) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (!TextUtils.isEmpty(SharedConfig.storageCacheDir) && (rootDirs = AndroidUtilities.getRootDirs()) != null) {
                    int size = rootDirs.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size) {
                            break;
                        }
                        File file = rootDirs.get(i9);
                        if (file.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                            externalStorageDirectory = file;
                            break;
                        }
                        i9++;
                    }
                }
                hasOldFolder = new File(externalStorageDirectory, "Telegram").exists();
            }
            if (hasOldFolder) {
                FilesMigrationBottomSheet filesMigrationBottomSheet2 = new FilesMigrationBottomSheet(o2Var);
                filesMigrationBottomSheet = filesMigrationBottomSheet2;
                filesMigrationBottomSheet2.show();
                wasShown = true;
                sharedPreferences.edit().putInt("migration_to_scoped_storage_count", sharedPreferences.getInt("migration_to_scoped_storage_count", 0) + 1).apply();
                return;
            }
            sharedPreferences.edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
        }
    }

    private int getFilesCount(File file) {
        File[] listFiles;
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < listFiles.length; i10++) {
            if (listFiles[i10].isDirectory()) {
                i9 += getFilesCount(listFiles[i10]);
            } else {
                i9++;
            }
        }
        return i9;
    }

    public void lambda$moveDirectory$0(File file, Path path) {
        File file2 = new File(file, path.getFileName().toString());
        if (Files.isDirectory(path, new LinkOption[0])) {
            moveDirectory(path.toFile(), file2);
            return;
        }
        try {
            Files.move(path, file2.toPath(), new CopyOption[0]);
        } catch (Exception e10) {
            FileLog.e((Throwable) e10, false);
            try {
                path.toFile().delete();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        this.movedFilesCount++;
        updateProgress();
    }

    public void lambda$updateProgress$1(int i9) {
        Notification.Builder contentTitle = t3.a(this, NotificationsController.OTHER_NOTIFICATIONS_CHANNEL).setContentTitle(getText(R.string.MigratingFiles));
        int i10 = this.totalFilesCount;
        ((NotificationManager) getSystemService("notification")).notify(301, contentTitle.setContentText(i9 + "/" + i10).setSmallIcon(R.drawable.notification).setAutoCancel(false).setProgress(this.totalFilesCount, i9, false).build());
    }

    private void moveDirectory(File file, final File file2) {
        Stream convert;
        if (file.exists()) {
            if (file2.exists() || file2.mkdir()) {
                try {
                    convert = Stream.VivifiedWrapper.convert(Files.list(file.toPath()));
                    convert.forEach(new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            FilesMigrationService.this.lambda$moveDirectory$0(file2, (Path) obj);
                        }

                        public Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    convert.close();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                try {
                    file.delete();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
        }
    }

    public static void start() {
        ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, FilesMigrationService.class));
    }

    private void updateProgress() {
        if (System.currentTimeMillis() - this.lastUpdateTime <= 20 && this.movedFilesCount < this.totalFilesCount - 1) {
            return;
        }
        AndroidUtilities.runOnUIThread(new n6(this, this.movedFilesCount, 6));
    }

    public void migrateOldFolder() {
        ArrayList<File> rootDirs;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir) && (rootDirs = AndroidUtilities.getRootDirs()) != null) {
            int size = rootDirs.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                }
                File file = rootDirs.get(i9);
                if (file.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                    externalStorageDirectory = file;
                    break;
                }
                i9++;
            }
        }
        File file2 = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), "Telegram");
        File file3 = new File(externalStorageDirectory, "Telegram");
        this.totalFilesCount = getFilesCount(file3);
        long currentTimeMillis = System.currentTimeMillis();
        if (file3.canRead() && file3.canWrite()) {
            moveDirectory(file3, file2);
        }
        FileLog.d("move time = " + (System.currentTimeMillis() - currentTimeMillis));
        ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int i9, int i10) {
        NotificationsController.checkOtherNotificationsChannel();
        Notification build = t3.a(this, NotificationsController.OTHER_NOTIFICATIONS_CHANNEL).setContentTitle(getText(R.string.MigratingFiles)).setAutoCancel(false).setSmallIcon(R.drawable.notification).build();
        isRunning = true;
        new AnonymousClass1().start();
        startForeground(301, build);
        return super.onStartCommand(intent, i9, i10);
    }

    public static class FilesMigrationBottomSheet extends org.telegram.ui.ActionBar.f3 {
        org.telegram.ui.ActionBar.o2 fragment;

        public FilesMigrationBottomSheet(org.telegram.ui.ActionBar.o2 o2Var) {
            super(o2Var.getParentActivity(), false);
            this.fragment = o2Var;
            setCanceledOnTouchOutside(false);
            Activity parentActivity = o2Var.getParentActivity();
            LinearLayout f10 = l0.f(parentActivity, 1);
            hw0 hw0Var = new hw0(parentActivity, this.currentAccount);
            hw0Var.setStickerNum(7);
            hw0Var.getImageReceiver().setAutoRepeat(1);
            f10.addView(hw0Var, g7.e6.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i9 = org.telegram.ui.ActionBar.f6.f23108j5;
            l0.q(textView, org.telegram.ui.ActionBar.f6.w0(null, i9, false), 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.MigrateOldFolderTitle));
            f10.addView(textView, g7.e6.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            l0.m(R.string.MigrateOldFolderDescription, textView2);
            f10.addView(textView2, g7.e6.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.MigrateOldFolderButton));
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
            textView3.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.f6.Oh));
            f10.addView(textView3, g7.e6.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new v3(this, 0));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(f10);
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
            boolean z10;
            Activity parentActivity = this.fragment.getParentActivity();
            boolean z11 = false;
            if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i9 = Build.VERSION.SDK_INT;
            if ((i9 >= 33 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) || (i9 < 33 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0)) {
                z11 = true;
            }
            if (z11 && z10) {
                FilesMigrationService.start();
                dismiss();
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (!z11) {
                if (i9 >= 33) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                } else {
                    arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                }
            }
            if (!z10) {
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            parentActivity.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 4);
        }

        @Override
        public void setLastVisible(boolean z10) {
        }
    }
}
