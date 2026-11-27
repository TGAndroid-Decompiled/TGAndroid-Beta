package defpackage;

import android.content.Context;
public final class h3d {
    public static final h3d b;
    public di4 a;

    static {
        ?? obj = new Object();
        obj.a = null;
        b = obj;
    }

    public static di4 a(Context context) {
        di4 di4Var;
        h3d h3dVar = b;
        synchronized (h3dVar) {
            di4Var = h3dVar.a;
            if (di4Var == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                di4Var = new di4(context);
                h3dVar.a = di4Var;
            }
        }
        return di4Var;
    }
}
