package org.telegram.messenger;

import android.app.Activity;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.text.TextUtils;
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
import org.telegram.ui.Components.fw0;
public class FilesMigrationService extends Service {
    public static boolean f14361c = false;
    public static boolean d = false;
    public static i9 e = null;
    public static boolean f14362f = false;
    public int f14363a;
    public int f14364b;

    public static void a(org.telegram.ui.zx zxVar) {
        SharedPreferences sharedPreferences = w0.f18945b.getSharedPreferences("systemConfig", 0);
        if (Environment.isExternalStorageLegacy() && !sharedPreferences.getBoolean("migration_to_scoped_storage_finished", false) && sharedPreferences.getInt("migration_to_scoped_storage_count", 0) < 5 && !f14362f && e == null && !d) {
            if (Build.VERSION.SDK_INT >= 30) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (!TextUtils.isEmpty(uz.f18519h0)) {
                    ArrayList d12 = i0.d1();
                    int size = d12.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        File file = (File) d12.get(i10);
                        if (file.getAbsolutePath().startsWith(uz.f18519h0)) {
                            externalStorageDirectory = file;
                            break;
                        }
                        i10++;
                    }
                }
                f14361c = new File(externalStorageDirectory, "Telegram").exists();
            }
            if (f14361c) {
                i9 i9Var = new i9((Context) zxVar.getParentActivity(), false);
                i9Var.f16244j1 = zxVar;
                i9Var.setCanceledOnTouchOutside(false);
                Activity parentActivity = zxVar.getParentActivity();
                LinearLayout e7 = m5.e(parentActivity, 1);
                fw0 fw0Var = new fw0(parentActivity, i9Var.f21584a);
                fw0Var.setStickerNum(7);
                fw0Var.getImageReceiver().W(1);
                e7.addView(fw0Var, w7.b6.t(144, 144, 1, 0, 16, 0, 0));
                TextView textView = new TextView(parentActivity);
                textView.setGravity(8388611);
                int i11 = org.telegram.ui.ActionBar.t6.f21038j5;
                m5.m(textView, i11, null, 1, 20.0f);
                textView.setText(dd.L0(2131748446, null));
                e7.addView(textView, w7.b6.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setGravity(8388611);
                textView2.setTextSize(1, 15.0f);
                org.telegram.ui.ActionBar.a7.V(textView2, i11, null);
                textView2.setText(i0.W2(dd.L0(2131748447, null)));
                e7.addView(textView2, w7.b6.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setPadding(i0.L(34.0f), 0, i0.L(34.0f), 0);
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                textView3.setTypeface(i0.o());
                textView3.setText(dd.L0(2131748448, null));
                org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.Gi, null);
                textView3.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 6.0f));
                e7.addView(textView3, w7.b6.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                textView3.setOnClickListener(new h9(i9Var, 0));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e7);
                i9Var.N = scrollView;
                e = i9Var;
                i9Var.show();
                f14362f = true;
                sharedPreferences.edit().putInt("migration_to_scoped_storage_count", sharedPreferences.getInt("migration_to_scoped_storage_count", 0) + 1).apply();
                return;
            }
            sharedPreferences.edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
        }
    }

    public static int b(File file) {
        File[] listFiles;
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < listFiles.length; i11++) {
            if (listFiles[i11].isDirectory()) {
                i10 = b(listFiles[i11]) + i10;
            } else {
                i10++;
            }
        }
        return i10;
    }

    public final void c(File file, final File file2) {
        Stream convert;
        if (file.exists()) {
            if (file2.exists() || file2.mkdir()) {
                try {
                    convert = Stream.VivifiedWrapper.convert(Files.list(file.toPath()));
                    convert.forEach(new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            Path path = (Path) obj;
                            boolean z10 = FilesMigrationService.f14361c;
                            File file3 = new File(file2, path.getFileName().toString());
                            boolean isDirectory = Files.isDirectory(path, new LinkOption[0]);
                            FilesMigrationService filesMigrationService = FilesMigrationService.this;
                            if (isDirectory) {
                                filesMigrationService.c(path.toFile(), file3);
                                return;
                            }
                            try {
                                Files.move(path, file3.toPath(), new CopyOption[0]);
                            } catch (Exception e7) {
                                f8.g(e7, false);
                                try {
                                    path.toFile().delete();
                                } catch (Exception e10) {
                                    f8.g(e10, true);
                                }
                            }
                            filesMigrationService.f14364b++;
                            if (System.currentTimeMillis() > 20 || filesMigrationService.f14364b >= filesMigrationService.f14363a - 1) {
                                i0.g3(new a1(filesMigrationService, filesMigrationService.f14364b, 2));
                            }
                        }

                        public Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    convert.close();
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                try {
                    file.delete();
                } catch (Exception e10) {
                    f8.g(e10, true);
                }
            }
        }
    }

    @Override
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        pt.i();
        Notification build = f9.b(this, pt.f17636j0).setContentTitle(dd.L0(2131748445, null)).setAutoCancel(false).setSmallIcon(2131232451).build();
        d = true;
        new h2.k(this).start();
        try {
            startForeground(301, build);
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        return super.onStartCommand(intent, i10, i11);
    }

    public final void onTimeout(int i10, int i11) {
        f8.b("FilesMigrationService timeout, type = " + i11);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
