package e2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
public abstract class k {
    public static final c0.l f4908a = new Object();
    public static final Object f4909b = new Object();
    public static z9.d f4910c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return i.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static z9.d b() {
        z9.d dVar = new z9.d(5);
        f4910c = dVar;
        f4908a.k(dVar);
        return f4910c;
    }

    public static void c(android.content.Context r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: e2.k.c(android.content.Context, boolean):void");
    }
}
