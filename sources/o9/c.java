package o9;

import a8.r7;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
public final class c implements ua.b {
    public final int f20863a;
    public final Object f20864b;
    public final Object f20865c;

    public c(int i7, Object obj, Object obj2) {
        this.f20863a = i7;
        this.f20865c = obj;
        this.f20864b = obj2;
    }

    @Override
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f20863a) {
            case 0:
                g gVar = (g) this.f20865c;
                Context context = (Context) this.f20864b;
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
                obj.f59923a = z9;
                return obj;
            case 1:
                return new sa.h((Context) this.f20864b, (String) this.f20865c);
            default:
                u9.a aVar2 = (u9.a) this.f20864b;
                return aVar2.f56366f.e(new r7(aVar2, (u9.f) this.f20865c));
        }
    }

    public c(Context context, String str) {
        this.f20863a = 1;
        this.f20864b = context;
        this.f20865c = str;
    }
}
