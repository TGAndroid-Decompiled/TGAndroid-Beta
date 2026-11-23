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
import org.telegram.ui.Components.nv0;
public class FilesMigrationService extends Service {
    public static boolean f22711c = false;
    public static boolean d = false;
    public static b9 f22712e = null;
    public static boolean f22713f = false;
    public int f22714a;
    public int f22715b;

    public static void a(org.telegram.ui.bx bxVar) {
        SharedPreferences sharedPreferences = t0.f27013b.getSharedPreferences("systemConfig", 0);
        if (Environment.isExternalStorageLegacy() && !sharedPreferences.getBoolean("migration_to_scoped_storage_finished", false) && sharedPreferences.getInt("migration_to_scoped_storage_count", 0) < 5 && !f22713f && f22712e == null && !d) {
            if (Build.VERSION.SDK_INT >= 30) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (!TextUtils.isEmpty(bz.f23290h0)) {
                    ArrayList d12 = g0.d1();
                    int size = d12.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            break;
                        }
                        File file = (File) d12.get(i7);
                        if (file.getAbsolutePath().startsWith(bz.f23290h0)) {
                            externalStorageDirectory = file;
                            break;
                        }
                        i7++;
                    }
                }
                f22711c = new File(externalStorageDirectory, "Telegram").exists();
            }
            if (f22711c) {
                b9 b9Var = new b9((Context) bxVar.getParentActivity(), false);
                b9Var.n1 = bxVar;
                b9Var.setCanceledOnTouchOutside(false);
                Activity parentActivity = bxVar.getParentActivity();
                LinearLayout f10 = f3.f(parentActivity, 1);
                nv0 nv0Var = new nv0(parentActivity, b9Var.f30223a);
                nv0Var.setStickerNum(7);
                nv0Var.getImageReceiver().X(1);
                f10.addView(nv0Var, c8.na.t(144, 144, 1, 0, 16, 0, 0));
                TextView textView = new TextView(parentActivity);
                textView.setGravity(8388611);
                int i10 = org.telegram.ui.ActionBar.n6.f29559j5;
                f3.l(textView, i10, null, 1, 20.0f);
                textView.setText(gd.N0(2131748238, null));
                f10.addView(textView, c8.na.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setGravity(8388611);
                textView2.setTextSize(1, 15.0f);
                org.telegram.ui.ActionBar.u6.U(textView2, i10, null);
                textView2.setText(g0.W2(gd.N0(2131748239, null)));
                f10.addView(textView2, c8.na.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setPadding(g0.L(34.0f), 0, g0.L(34.0f), 0);
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                textView3.setTypeface(g0.o());
                textView3.setText(gd.N0(2131748240, null));
                org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.Ji, null);
                textView3.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 6.0f));
                f10.addView(textView3, c8.na.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                textView3.setOnClickListener(new a9(b9Var, 0));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(f10);
                b9Var.O = scrollView;
                f22712e = b9Var;
                b9Var.show();
                f22713f = true;
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
        int i7 = 0;
        for (int i10 = 0; i10 < listFiles.length; i10++) {
            if (listFiles[i10].isDirectory()) {
                i7 = b(listFiles[i10]) + i7;
            } else {
                i7++;
            }
        }
        return i7;
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
                            boolean z10 = FilesMigrationService.f22711c;
                            File file3 = new File(file2, path.getFileName().toString());
                            boolean isDirectory = Files.isDirectory(path, new LinkOption[0]);
                            FilesMigrationService filesMigrationService = FilesMigrationService.this;
                            if (isDirectory) {
                                filesMigrationService.c(path.toFile(), file3);
                                return;
                            }
                            try {
                                Files.move(path, file3.toPath(), new CopyOption[0]);
                            } catch (Exception e10) {
                                a8.g(e10, false);
                                try {
                                    path.toFile().delete();
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                }
                            }
                            filesMigrationService.f22715b++;
                            if (System.currentTimeMillis() > 20 || filesMigrationService.f22715b >= filesMigrationService.f22714a - 1) {
                                g0.g3(new x0(filesMigrationService, filesMigrationService.f22715b, 2));
                            }
                        }

                        public Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    convert.close();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                try {
                    file.delete();
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
        }
    }

    @Override
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        xs.i();
        Notification build = y8.b(this, xs.f28072k0).setContentTitle(gd.N0(2131748237, null)).setAutoCancel(false).setSmallIcon(2131232457).build();
        d = true;
        new k2.k(this).start();
        try {
            startForeground(301, build);
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        return super.onStartCommand(intent, i7, i10);
    }

    public final void onTimeout(int i7, int i10) {
        a8.b("FilesMigrationService timeout, type = " + i10);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
