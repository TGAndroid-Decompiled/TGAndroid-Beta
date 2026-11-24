package defpackage;

import android.app.Activity;
public final class r79 implements Runnable {
    public final byte a;
    public final mu1 b;
    public final Activity c;
    public final wjb d;
    public final k27 e;

    public r79(mu1 mu1Var, Activity activity, wjb wjbVar, k27 k27Var, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = activity;
        this.d = wjbVar;
        this.e = k27Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        k27 k27Var = this.e;
        wjb wjbVar = this.d;
        Activity activity = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                u21.b0(mu1Var).c(gl.N2(k96.M0(2131754484, null), -1, 2, new m9(activity, (byte) 3), wjbVar)).j();
                mu1Var.Pa(k27Var);
                mu1Var.Ra(k27Var);
                return;
            case 1:
                u21.b0(mu1Var).c(gl.N2(k96.M0(2131754484, null), -1, 2, new m9(activity, (byte) 2), wjbVar)).j();
                mu1Var.Pa(k27Var);
                mu1Var.Ra(k27Var);
                return;
            default:
                u21.b0(mu1Var).c(gl.N2(k96.M0(2131754484, null), -1, 2, new m9(activity, (byte) 4), wjbVar)).j();
                mu1Var.Pa(k27Var);
                mu1Var.Ra(k27Var);
                return;
        }
    }
}
