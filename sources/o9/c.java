package o9;

import a8.r7;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
public final class c implements ua.b {
    public final int f21779a;
    public final Object f21780b;
    public final Object f21781c;

    public c(int i7, Object obj, Object obj2) {
        this.f21779a = i7;
        this.f21781c = obj;
        this.f21780b = obj2;
    }

    @Override
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f21779a) {
            case 0:
                g gVar = (g) this.f21781c;
                Context context = (Context) this.f21780b;
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
                boolean z10 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                obj.f61841a = z10;
                return obj;
            case 1:
                return new sa.h((Context) this.f21780b, (String) this.f21781c);
            default:
                u9.a aVar2 = (u9.a) this.f21780b;
                return aVar2.f58577f.e(new r7(aVar2, (u9.f) this.f21781c));
        }
    }

    public c(Context context, String str) {
        this.f21779a = 1;
        this.f21780b = context;
        this.f21781c = str;
    }
}
