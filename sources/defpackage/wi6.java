package defpackage;

import android.os.Build;
public final class wi6 implements Runnable {
    public final byte a;
    public final bj6 b;

    public wi6(bj6 bj6Var, byte b) {
        this.a = b;
        this.b = bj6Var;
    }

    @Override
    public final void run() {
        nz4 nz4Var;
        qz4[] qz4VarArr;
        byte b = this.a;
        bj6 bj6Var = this.b;
        switch (b) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (nz4Var = bj6Var.S) != null) {
                    nz4Var.c.d = 0L;
                    bj6Var.T.c.d = 0L;
                    bj6Var.c0();
                    return;
                }
                return;
            case 1:
                new ml7(bj6Var, bj6Var.getParentActivity()).show();
                return;
            case 2:
                bj6Var.presentFragment(new ia1(ts2.l("needFinishFragment", false)));
                return;
            case 3:
                if (bj6Var.getParentActivity() != null && (qz4VarArr = bj6Var.K) != null) {
                    qz4 qz4Var = qz4VarArr[3];
                    float width = ((qz4Var.getWidth() / 2.0f) + (bj6Var.b.getWidth() - ((qz4Var.getX() + bj6Var.F.getX()) + qz4Var.getWidth()))) / gm.p;
                    hg5 hg5Var = new hg5(bj6Var.getParentActivity(), 3);
                    bj6Var.P = hg5Var;
                    hg5Var.setTranslationY(gm.L(4.0f) + (-bj6Var.L));
                    bj6Var.P.setPadding(gm.L(7.33f), 0, gm.L(7.33f), 0);
                    bj6Var.P.p(false);
                    bj6Var.P.j(true);
                    bj6Var.P.t(jb6.M0(2131743986, null));
                    bj6Var.P.n(1.0f, (-width) + 7.33f);
                    bj6Var.b.addView(bj6Var.P, qoe.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    hg5 hg5Var2 = bj6Var.P;
                    hg5Var2.r0 = new wi6(bj6Var, (byte) 4);
                    hg5Var2.d = 8000L;
                    hg5Var2.v();
                    jg5.r.b();
                    return;
                }
                return;
            case 4:
                gm.B2(bj6Var.P);
                return;
            default:
                bj6Var.k0();
                return;
        }
    }
}
