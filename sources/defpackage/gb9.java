package defpackage;

import android.content.Context;
public final class gb9 implements Runnable {
    public final byte a;
    public final vn1 b;
    public final d31 c;
    public final Context d;
    public final w53 e;

    public gb9(vn1 vn1Var, d31 d31Var, Context context, w53 w53Var, byte b) {
        this.a = b;
        this.b = vn1Var;
        this.c = d31Var;
        this.d = context;
        this.e = w53Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        w53 w53Var = this.e;
        Context context = this.d;
        d31 d31Var = this.c;
        vn1 vn1Var = this.b;
        switch (b) {
            case 0:
                vn1Var.run();
                d31Var.c(hl.N2(ob6.M0(2131754480, null), -1, 2, new xf1(context, (byte) 10), w53Var)).j();
                return;
            case 1:
                vn1Var.run();
                d31Var.c(hl.N2(ob6.M0(2131754480, null), -1, 2, new xf1(context, (byte) 12), w53Var)).j();
                return;
            default:
                vn1Var.run();
                d31Var.c(hl.N2(ob6.M0(2131754480, null), -1, 2, new xf1(context, (byte) 13), w53Var)).j();
                return;
        }
    }
}
