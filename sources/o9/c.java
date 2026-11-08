package o9;

import a8.r7;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
public final class c implements ua.b {
    public final int f20866a;
    public final Object f20867b;
    public final Object f20868c;

    public c(int i7, Object obj, Object obj2) {
        this.f20866a = i7;
        this.f20868c = obj;
        this.f20867b = obj2;
    }

    @Override
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f20866a) {
            case 0:
                g gVar = (g) this.f20868c;
                Context context = (Context) this.f20867b;
                String d = gVar.d();
                ra.a aVar = (ra.a) gVar.d.a(ra.a.class);
                ?? obj = new Object();
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 24) {
                    if (i7 >= 24) {
                        context = f0.a.a(context);
                    } else {
                        context = null;
                    }
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + d, 0);
                boolean z9 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z9 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z9 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                obj.f60023a = z9;
                return obj;
            case 1:
                return new sa.h((Context) this.f20867b, (String) this.f20868c);
            default:
                u9.a aVar2 = (u9.a) this.f20867b;
                return aVar2.f56456f.e(new r7(aVar2, (u9.g) this.f20868c));
        }
    }

    public c(Context context, String str) {
        this.f20866a = 1;
        this.f20867b = context;
        this.f20868c = str;
    }
}
