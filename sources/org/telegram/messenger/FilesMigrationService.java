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
    public static ab0 e = null;
    public static boolean f = false;
    public int a;
    public int b;

    public static void a(uj3 uj3Var) {
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("systemConfig", 0);
        if (Environment.isExternalStorageLegacy() && !sharedPreferences.getBoolean("migration_to_scoped_storage_finished", false) && sharedPreferences.getInt("migration_to_scoped_storage_count", 0) < 5 && !f && e == null && !d) {
            if (Build.VERSION.SDK_INT >= 30) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (!TextUtils.isEmpty(xea.e0)) {
                    ArrayList c1 = hl.c1();
                    int size = c1.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        File file = (File) c1.get(i);
                        if (file.getAbsolutePath().startsWith(xea.e0)) {
                            externalStorageDirectory = file;
                            break;
                        }
                        i++;
                    }
                }
                c = new File(externalStorageDirectory, "Telegram").exists();
            }
            if (c) {
                ab0 ab0Var = new ab0((Context) uj3Var.getParentActivity(), false);
                ab0Var.m1 = uj3Var;
                ab0Var.setCanceledOnTouchOutside(false);
                Activity parentActivity = uj3Var.getParentActivity();
                LinearLayout m = bs2.m(parentActivity, 1);
                a3b a3bVar = new a3b(parentActivity, ab0Var.a);
                a3bVar.setStickerNum(7);
                a3bVar.getImageReceiver().M(1);
                m.addView(a3bVar, tre.t(144, 144, 1, 0, 16, 0, 0));
                TextView textView = new TextView(parentActivity);
                textView.setGravity(8388611);
                int i2 = aob.j5;
                qd4.w(textView, i2, null, 1, 20.0f);
                textView.setText(ob6.M0(2131748185, null));
                m.addView(textView, tre.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setGravity(8388611);
                textView2.setTextSize(1, 15.0f);
                yob.X(textView2, i2, null);
                textView2.setText(hl.S2(ob6.M0(2131748186, null)));
                m.addView(textView2, tre.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                textView3.setTypeface(hl.o());
                textView3.setText(ob6.M0(2131748187, null));
                yob.X(textView3, aob.Ji, null);
                textView3.setBackground(rnb.f(aob.Fi, 6.0f));
                m.addView(textView3, tre.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                textView3.setOnClickListener(new mh3(ab0Var, (byte) 10));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(m);
                ab0Var.O = scrollView;
                e = ab0Var;
                ab0Var.show();
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
                    convert.forEach(new vy2(this, file2, (byte) 1));
                    convert.close();
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
                try {
                    file.delete();
                } catch (Exception e3) {
                    cc4.g(e3, true);
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
        ip7.c();
        bs2.q();
        Notification build = gk.b(this, ip7.k0).setContentTitle(ob6.M0(2131748184, null)).setAutoCancel(false).setSmallIcon(2131232468).build();
        d = true;
        new rd4(this).start();
        try {
            startForeground(301, build);
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        return super.onStartCommand(intent, i, i2);
    }

    public final void onTimeout(int i, int i2) {
        cc4.b("FilesMigrationService timeout, type = " + i2);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
