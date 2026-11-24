package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
public final class or2 implements nv8 {
    public final byte a;
    public final Object b;
    public final Object c;

    public or2(Object obj, Object obj2, byte b) {
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
                xq2 xq2Var = (xq2) obj;
                return xq2Var.f.X(new sm2(xq2Var, (pr2) obj2));
            case 1:
                return new rf5((Context) obj2, (String) obj);
            default:
                li4 li4Var = (li4) obj2;
                Context context = (Context) obj;
                String d = li4Var.d();
                uw8 uw8Var = (uw8) li4Var.d.a(uw8.class);
                ?? obj3 = new Object();
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    if (i >= 24) {
                        context = ki0.d(context);
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
