package n9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import b8.ke;
public final class d implements ta.b {
    public final int f20287a;
    public final Object f20288b;
    public final Object f20289c;

    public d(int i3, Object obj, Object obj2) {
        this.f20287a = i3;
        this.f20289c = obj;
        this.f20288b = obj2;
    }

    @Override
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f20287a) {
            case 0:
                h hVar = (h) this.f20289c;
                Context context = (Context) this.f20288b;
                String d = hVar.d();
                qa.a aVar = (qa.a) hVar.d.a(qa.a.class);
                ?? obj = new Object();
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 24) {
                    if (i3 >= 24) {
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
                obj.f59348a = z10;
                return obj;
            case 1:
                return new ra.i((Context) this.f20288b, (String) this.f20289c);
            default:
                t9.a aVar2 = (t9.a) this.f20288b;
                return aVar2.f55045f.q1(new ke(aVar2, (t9.g) this.f20289c));
        }
    }

    public d(Context context, String str) {
        this.f20287a = 1;
        this.f20288b = context;
        this.f20289c = str;
    }
}
