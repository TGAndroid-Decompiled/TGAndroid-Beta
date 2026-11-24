package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
public final class dq2 implements mt8 {
    public final byte a;
    public final Object b;
    public final Object c;

    public dq2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                mp2 mp2Var = (mp2) obj;
                return mp2Var.f.K(new gl2(mp2Var, (eq2) obj2));
            case 1:
                return new td5((Context) obj2, (String) obj);
            default:
                jg4 jg4Var = (jg4) obj2;
                Context context = (Context) obj;
                String d = jg4Var.d();
                tu8 tu8Var = (tu8) jg4Var.d.a(tu8.class);
                ?? obj3 = new Object();
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    if (i >= 24) {
                        context = kh0.d(context);
                    } else {
                        context = null;
                    }
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:".concat(d), 0);
                boolean z = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                obj3.a = z;
                return obj3;
        }
    }
}
