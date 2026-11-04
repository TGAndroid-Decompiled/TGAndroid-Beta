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
import org.telegram.ui.Components.av0;
public class FilesMigrationService extends Service {
    public static boolean f21221c = false;
    public static boolean d = false;
    public static b9 f21222e = null;
    public static boolean f21223f = false;
    public int f21224a;
    public int f21225b;

    public static void a(org.telegram.ui.uw uwVar) {
        SharedPreferences sharedPreferences = t0.f25457b.getSharedPreferences("systemConfig", 0);
        if (Environment.isExternalStorageLegacy() && !sharedPreferences.getBoolean("migration_to_scoped_storage_finished", false) && sharedPreferences.getInt("migration_to_scoped_storage_count", 0) < 5 && !f21223f && f21222e == null && !d) {
            if (Build.VERSION.SDK_INT >= 30) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (!TextUtils.isEmpty(az.f21632h0)) {
                    ArrayList d12 = g0.d1();
                    int size = d12.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        File file = (File) d12.get(i3);
                        if (file.getAbsolutePath().startsWith(az.f21632h0)) {
                            externalStorageDirectory = file;
                            break;
                        }
                        i3++;
                    }
                }
                f21221c = new File(externalStorageDirectory, "Telegram").exists();
            }
            if (f21221c) {
                b9 b9Var = new b9((Context) uwVar.getParentActivity(), false);
                b9Var.k1 = uwVar;
                b9Var.setCanceledOnTouchOutside(false);
                Activity parentActivity = uwVar.getParentActivity();
                LinearLayout e10 = k5.e(parentActivity, 1);
                av0 av0Var = new av0(parentActivity, b9Var.f28583a);
                av0Var.setStickerNum(7);
                av0Var.getImageReceiver().W(1);
                e10.addView(av0Var, b8.mf.t(144, 144, 1, 0, 16, 0, 0));
                TextView textView = new TextView(parentActivity);
                textView.setGravity(8388611);
                int i10 = org.telegram.ui.ActionBar.k6.f27988j5;
                k5.n(textView, i10, null, 1, 20.0f);
                textView.setText(bd.M0(2131748439, null));
                e10.addView(textView, b8.mf.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setGravity(8388611);
                textView2.setTextSize(1, 15.0f);
                org.telegram.ui.ActionBar.r6.V(textView2, i10, null);
                textView2.setText(g0.X2(bd.M0(2131748440, null)));
                e10.addView(textView2, b8.mf.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setPadding(g0.L(34.0f), 0, g0.L(34.0f), 0);
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                textView3.setTypeface(g0.o());
                textView3.setText(bd.M0(2131748441, null));
                org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Gi, null);
                textView3.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 6.0f));
                e10.addView(textView3, b8.mf.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                textView3.setOnClickListener(new a9(b9Var, 0));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e10);
                b9Var.O = scrollView;
                f21222e = b9Var;
                b9Var.show();
                f21223f = true;
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
        int i3 = 0;
        for (int i10 = 0; i10 < listFiles.length; i10++) {
            if (listFiles[i10].isDirectory()) {
                i3 = b(listFiles[i10]) + i3;
            } else {
                i3++;
            }
        }
        return i3;
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
                            boolean z10 = FilesMigrationService.f21221c;
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
                            filesMigrationService.f21225b++;
                            if (System.currentTimeMillis() > 20 || filesMigrationService.f21225b >= filesMigrationService.f21224a - 1) {
                                g0.h3(new x0(filesMigrationService, filesMigrationService.f21225b, 2));
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
    public final int onStartCommand(Intent intent, int i3, int i10) {
        us.i();
        Notification build = e9.b.b(this, us.f25747k0).setContentTitle(bd.M0(2131748438, null)).setAutoCancel(false).setSmallIcon(2131232452).build();
        d = true;
        new j2.k(this).start();
        try {
            startForeground(301, build);
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        return super.onStartCommand(intent, i3, i10);
    }

    public final void onTimeout(int i3, int i10) {
        a8.b("FilesMigrationService timeout, type = " + i10);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
