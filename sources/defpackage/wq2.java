package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
public final class wq2 implements vw8 {
    public final byte a;
    public final Object b;
    public final Object c;

    public wq2(Object obj, Object obj2, byte b) {
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
                fq2 fq2Var = (fq2) obj;
                return fq2Var.f.b0(new am2(fq2Var, (xq2) obj2));
            case 1:
                return new uf5((Context) obj2, (String) obj);
            default:
                ji4 ji4Var = (ji4) obj2;
                Context context = (Context) obj;
                String d = ji4Var.d();
                cy8 cy8Var = (cy8) ji4Var.d.a(cy8.class);
                ?? obj3 = new Object();
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    if (i >= 24) {
                        context = lh0.d(context);
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
