package defpackage;

import android.app.Activity;
public final class t99 implements Runnable {
    public final byte a;
    public final yv1 b;
    public final Activity c;
    public final ylb d;
    public final k47 e;

    public t99(yv1 yv1Var, Activity activity, ylb ylbVar, k47 k47Var, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = activity;
        this.d = ylbVar;
        this.e = k47Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        k47 k47Var = this.e;
        ylb ylbVar = this.d;
        Activity activity = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                c41.b0(yv1Var).c(gm.N2(jb6.M0(2131754484, null), -1, 2, new m9(activity, (byte) 3), ylbVar)).j();
                yv1Var.Za(k47Var);
                yv1Var.bb(k47Var);
                return;
            case 1:
                c41.b0(yv1Var).c(gm.N2(jb6.M0(2131754484, null), -1, 2, new m9(activity, (byte) 2), ylbVar)).j();
                yv1Var.Za(k47Var);
                yv1Var.bb(k47Var);
                return;
            default:
                c41.b0(yv1Var).c(gm.N2(jb6.M0(2131754484, null), -1, 2, new m9(activity, (byte) 4), ylbVar)).j();
                yv1Var.Za(k47Var);
                yv1Var.bb(k47Var);
                return;
        }
    }
}
