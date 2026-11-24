package defpackage;

import android.content.Context;
public final class w99 implements Runnable {
    public final byte a;
    public final bo1 b;
    public final c41 c;
    public final Context d;
    public final q63 e;

    public w99(bo1 bo1Var, c41 c41Var, Context context, q63 q63Var, byte b) {
        this.a = b;
        this.b = bo1Var;
        this.c = c41Var;
        this.d = context;
        this.e = q63Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        q63 q63Var = this.e;
        Context context = this.d;
        c41 c41Var = this.c;
        bo1 bo1Var = this.b;
        switch (b) {
            case 0:
                bo1Var.run();
                c41Var.c(gm.N2(jb6.M0(2131754484, null), -1, 2, new dh1(context, (byte) 9), q63Var)).j();
                return;
            case 1:
                bo1Var.run();
                c41Var.c(gm.N2(jb6.M0(2131754484, null), -1, 2, new dh1(context, (byte) 12), q63Var)).j();
                return;
            default:
                bo1Var.run();
                c41Var.c(gm.N2(jb6.M0(2131754484, null), -1, 2, new dh1(context, (byte) 13), q63Var)).j();
                return;
        }
    }
}
