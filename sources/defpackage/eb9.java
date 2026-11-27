package defpackage;

import android.app.Activity;
public final class eb9 implements Runnable {
    public final byte a;
    public final zu1 b;
    public final Activity c;
    public final vnb d;
    public final r47 e;

    public eb9(zu1 zu1Var, Activity activity, vnb vnbVar, r47 r47Var, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = activity;
        this.d = vnbVar;
        this.e = r47Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        r47 r47Var = this.e;
        vnb vnbVar = this.d;
        Activity activity = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                d31.b0(zu1Var).c(hl.N2(ob6.M0(2131754480, null), -1, 2, new n9(activity, (byte) 3), vnbVar)).j();
                zu1Var.ab(r47Var);
                zu1Var.cb(r47Var);
                return;
            case 1:
                d31.b0(zu1Var).c(hl.N2(ob6.M0(2131754480, null), -1, 2, new n9(activity, (byte) 2), vnbVar)).j();
                zu1Var.ab(r47Var);
                zu1Var.cb(r47Var);
                return;
            default:
                d31.b0(zu1Var).c(hl.N2(ob6.M0(2131754480, null), -1, 2, new n9(activity, (byte) 4), vnbVar)).j();
                zu1Var.ab(r47Var);
                zu1Var.cb(r47Var);
                return;
        }
    }
}
