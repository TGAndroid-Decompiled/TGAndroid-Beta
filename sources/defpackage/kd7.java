package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
public final class kd7 {
    public byte a;
    public int b;
    public String c;
    public Object d;
    public Object e;

    public static String b(jg4 jg4Var) {
        jg4Var.a();
        xg4 xg4Var = jg4Var.c;
        String str = xg4Var.e;
        if (str != null) {
            return str;
        }
        jg4Var.a();
        String str2 = xg4Var.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        if (this.c == null) {
            f();
        }
        return this.c;
    }

    public final synchronized int c() {
        PackageInfo d;
        if (this.b == 0 && (d = d("com.google.android.gms")) != null) {
            this.b = d.versionCode;
        }
        return this.b;
    }

    public final PackageInfo d(String str) {
        try {
            return ((Context) this.d).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    public final boolean e() {
        byte b;
        synchronized (this) {
            b = this.a;
            if (b == 0) {
                PackageManager packageManager = ((Context) this.d).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    b = 0;
                } else {
                    if (!xqe.a()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.a = (byte) 1;
                            b = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.a = (byte) 2;
                        b = 2;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (xqe.a()) {
                            this.a = (byte) 2;
                            b = 2;
                        } else {
                            this.a = (byte) 1;
                            b = 1;
                        }
                    }
                }
            }
        }
        if (b != 0) {
            return true;
        }
        return false;
    }

    public final synchronized void f() {
        PackageInfo d = d(((Context) this.d).getPackageName());
        if (d != null) {
            this.c = Integer.toString(d.versionCode);
            this.e = d.versionName;
        }
    }
}
