package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
public final class plf {
    public final Context a;
    public int b;
    public byte c = 0;

    public plf(Context context) {
        this.a = context;
    }

    public final synchronized int a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plf.a():int");
    }

    public final synchronized int b() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = h3d.a(this.a).a(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }
}
