package e2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import d7.u;
public abstract class k {
    public static final c0.l f4822a = new Object();
    public static final Object f4823b = new Object();
    public static u f4824c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return i.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static u b() {
        u uVar = new u(6);
        f4824c = uVar;
        f4822a.k(uVar);
        return f4824c;
    }

    public static void c(android.content.Context r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: e2.k.c(android.content.Context, boolean):void");
    }
}
