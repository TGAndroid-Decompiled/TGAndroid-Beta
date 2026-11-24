package defpackage;

import android.content.Context;
public final class v47 implements Runnable {
    public final byte a;
    public final f57 b;
    public final Context c;

    public v47(f57 f57Var, Context context, byte b) {
        this.a = b;
        this.b = f57Var;
        this.c = context;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Context context = this.c;
        f57 f57Var = this.b;
        switch (b) {
            case 0:
                f57Var.d0.a(false);
                gm.c3(new v47(f57Var, context, (byte) 1));
                return;
            default:
                if (gm.C1(context)) {
                    new kj8(43, f57Var.d0.G, context).show();
                    return;
                }
                return;
        }
    }
}
