package e2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
public abstract class k {
    public static final c0.l f5072a = new Object();
    public static final Object f5073b = new Object();
    public static z9.d f5074c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return i.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static z9.d b() {
        z9.d dVar = new z9.d(5);
        f5074c = dVar;
        f5072a.k(dVar);
        return f5074c;
    }

    public static void c(android.content.Context r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: e2.k.c(android.content.Context, boolean):void");
    }
}
