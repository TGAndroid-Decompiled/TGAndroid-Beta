package e2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import c0.l;
public abstract class j {
    public static final l f5792a = new Object();
    public static final Object f5793b = new Object();
    public static bb.a f5794c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return h.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static bb.a b() {
        bb.a aVar = new bb.a(6);
        f5794c = aVar;
        f5792a.k(aVar);
        return f5794c;
    }

    public static void c(android.content.Context r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: e2.j.c(android.content.Context, boolean):void");
    }
}
