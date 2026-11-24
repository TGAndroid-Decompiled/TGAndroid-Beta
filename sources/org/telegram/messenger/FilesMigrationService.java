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
import j$.util.stream.Stream;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
public class FilesMigrationService extends Service {
    public static boolean c = false;
    public static boolean d = false;
    public static yb0 e = null;
    public static boolean f = false;
    public int a;
    public int b;

    public static void a(nk3 nk3Var) {
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("systemConfig", 0);
        if (Environment.isExternalStorageLegacy() && !sharedPreferences.getBoolean("migration_to_scoped_storage_finished", false) && sharedPreferences.getInt("migration_to_scoped_storage_count", 0) < 5 && !f && e == null && !d) {
            if (Build.VERSION.SDK_INT >= 30) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (!TextUtils.isEmpty(gda.e0)) {
                    ArrayList c1 = gm.c1();
                    int size = c1.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        File file = (File) c1.get(i);
                        if (file.getAbsolutePath().startsWith(gda.e0)) {
                            externalStorageDirectory = file;
                            break;
                        }
                        i++;
                    }
                }
                c = new File(externalStorageDirectory, "Telegram").exists();
            }
            if (c) {
                yb0 yb0Var = new yb0((Context) nk3Var.getParentActivity(), false);
                yb0Var.m1 = nk3Var;
                yb0Var.setCanceledOnTouchOutside(false);
                Activity parentActivity = nk3Var.getParentActivity();
                LinearLayout l = td4.l(parentActivity, 1);
                b1b b1bVar = new b1b(parentActivity, yb0Var.a);
                b1bVar.setStickerNum(7);
                b1bVar.getImageReceiver().M(1);
                l.addView(b1bVar, qoe.t(144, 144, 1, 0, 16, 0, 0));
                TextView textView = new TextView(parentActivity);
                textView.setGravity(8388611);
                int i2 = cmb.i5;
                td4.x(textView, i2, null, 1, 20.0f);
                textView.setText(jb6.M0(2131748188, null));
                l.addView(textView, qoe.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setGravity(8388611);
                textView2.setTextSize(1, 15.0f);
                anb.X(textView2, i2, null);
                textView2.setText(gm.S2(jb6.M0(2131748189, null)));
                l.addView(textView2, qoe.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                textView3.setTypeface(gm.o());
                textView3.setText(jb6.M0(2131748190, null));
                anb.X(textView3, cmb.Ii, null);
                textView3.setBackground(ulb.f(cmb.Ei, 6.0f));
                l.addView(textView3, qoe.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                textView3.setOnClickListener(new sf3(yb0Var, (byte) 11));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(l);
                yb0Var.O = scrollView;
                e = yb0Var;
                yb0Var.show();
                f = true;
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
        int i = 0;
        for (int i2 = 0; i2 < listFiles.length; i2++) {
            if (listFiles[i2].isDirectory()) {
                i = b(listFiles[i2]) + i;
            } else {
                i++;
            }
        }
        return i;
    }

    public final void c(File file, File file2) {
        Stream convert;
        if (file.exists()) {
            if (file2.exists() || file2.mkdir()) {
                try {
                    convert = Stream.VivifiedWrapper.convert(Files.list(file.toPath()));
                    convert.forEach(new kz2(this, file2, (byte) 1));
                    convert.close();
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
                try {
                    file.delete();
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
            }
        }
    }

    @Override
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public final int onStartCommand(Intent intent, int i, int i2) {
        lo7.c();
        ts2.p();
        Notification build = fl.b(this, lo7.k0).setContentTitle(jb6.M0(2131748187, null)).setAutoCancel(false).setSmallIcon(2131232469).build();
        d = true;
        new ud4(this).start();
        try {
            startForeground(301, build);
        } catch (Throwable th) {
            fc4.g(th, true);
        }
        return super.onStartCommand(intent, i, i2);
    }

    public final void onTimeout(int i, int i2) {
        fc4.b("FilesMigrationService timeout, type = " + i2);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
