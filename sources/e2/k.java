package e2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import h7.u;
public abstract class k {
    public static final c0.l f5078a = new Object();
    public static final Object f5079b = new Object();
    public static u f5080c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return i.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static u b() {
        u uVar = new u(5);
        f5080c = uVar;
        f5078a.k(uVar);
        return f5080c;
    }

    public static void c(android.content.Context r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: e2.k.c(android.content.Context, boolean):void");
    }
}
