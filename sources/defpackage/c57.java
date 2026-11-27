package defpackage;

import android.content.Context;
public final class c57 implements Runnable {
    public final byte a;
    public final m57 b;
    public final Context c;

    public c57(m57 m57Var, Context context, byte b) {
        this.a = b;
        this.b = m57Var;
        this.c = context;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Context context = this.c;
        m57 m57Var = this.b;
        switch (b) {
            case 0:
                m57Var.d0.a(false);
                hl.c3(new c57(m57Var, context, (byte) 1));
                return;
            default:
                if (hl.C1(context)) {
                    new xk8(43, m57Var.d0.G, context).show();
                    return;
                }
                return;
        }
    }
}
