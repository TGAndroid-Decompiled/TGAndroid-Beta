package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
public final class fi2 {
    public static final yn j = new yn("ClearcutLogger.API", new op5((byte) 10), new Object());
    public final Context a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final h7e f;
    public final u84 g;
    public final c6e h;
    public final o7f i;

    public fi2(Context context) {
        ?? by4Var = new by4(context, j, (vn) null, new eef((byte) 13));
        c6e c6eVar = c6e.a;
        o7f o7fVar = new o7f(context);
        this.e = -1;
        h7e h7eVar = h7e.DEFAULT;
        this.f = h7eVar;
        this.a = context;
        this.b = context.getPackageName();
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.c = i;
        this.e = -1;
        this.d = "VISION";
        this.g = by4Var;
        this.h = c6eVar;
        this.f = h7eVar;
        this.i = o7fVar;
    }
}
