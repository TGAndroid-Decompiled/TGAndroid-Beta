package defpackage;

import android.content.Context;
public final class v27 implements Runnable {
    public final byte a;
    public final f37 b;
    public final Context c;

    public v27(f37 f37Var, Context context, byte b) {
        this.a = b;
        this.b = f37Var;
        this.c = context;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Context context = this.c;
        f37 f37Var = this.b;
        switch (b) {
            case 0:
                f37Var.d0.a(false);
                gl.d3(new v27(f37Var, context, (byte) 1));
                return;
            default:
                if (gl.C1(context)) {
                    new jh8(43, f37Var.d0.G, context).show();
                    return;
                }
                return;
        }
    }
}
