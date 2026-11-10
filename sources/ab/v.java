package ab;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
public final class v {
    public int f1002a;
    public int f1003b;
    public Object f1004c;
    public Object d;
    public Object f1005e;

    public static String b(o9.g gVar) {
        gVar.a();
        o9.i iVar = gVar.f20882c;
        String str = iVar.f20895e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = iVar.f20893b;
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

    public synchronized String a() {
        try {
            if (((String) this.d) == null) {
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.d;
    }

    public synchronized int c() {
        PackageInfo d;
        try {
            if (this.f1002a == 0 && (d = d("com.google.android.gms")) != null) {
                this.f1002a = d.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f1002a;
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.f1004c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public boolean e() {
        int i7;
        synchronized (this) {
            i7 = this.f1003b;
            if (i7 == 0) {
                PackageManager packageManager = ((Context) this.f1004c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i7 = 0;
                } else {
                    if (!x6.b.d()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f1003b = 1;
                            i7 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.f1003b = 2;
                        i7 = 2;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (x6.b.d()) {
                            this.f1003b = 2;
                        } else {
                            this.f1003b = 1;
                        }
                        i7 = this.f1003b;
                    }
                }
            }
        }
        if (i7 != 0) {
            return true;
        }
        return false;
    }

    public synchronized void f() {
        PackageInfo d = d(((Context) this.f1004c).getPackageName());
        if (d != null) {
            this.d = Integer.toString(d.versionCode);
            this.f1005e = d.versionName;
        }
    }
}
