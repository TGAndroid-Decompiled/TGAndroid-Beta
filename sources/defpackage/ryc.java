package defpackage;

import android.content.Context;
public final class ryc {
    public static final ryc b;
    public p13 a;

    static {
        ?? obj = new Object();
        obj.a = null;
        b = obj;
    }

    public static p13 a(Context context) {
        p13 p13Var;
        ryc rycVar = b;
        synchronized (rycVar) {
            p13Var = rycVar.a;
            if (p13Var == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                p13Var = new p13(context, (char) 0);
                rycVar.a = p13Var;
            }
        }
        return p13Var;
    }
}
