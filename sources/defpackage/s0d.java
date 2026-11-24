package defpackage;

import android.content.Context;
public final class s0d {
    public static final s0d b;
    public n63 a;

    static {
        ?? obj = new Object();
        obj.a = null;
        b = obj;
    }

    public static n63 a(Context context) {
        n63 n63Var;
        s0d s0dVar = b;
        synchronized (s0dVar) {
            n63 n63Var2 = s0dVar.a;
            n63Var = n63Var2;
            if (n63Var2 == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                ?? obj = new Object();
                obj.a = context;
                s0dVar.a = obj;
                n63Var = obj;
            }
        }
        return n63Var;
    }
}
