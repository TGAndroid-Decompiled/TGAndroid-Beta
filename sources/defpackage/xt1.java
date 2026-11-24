package defpackage;

import android.view.View;
public final class xt1 extends kse {
    public k27 a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final mu1 h;

    public xt1(mu1 mu1Var) {
        this.h = mu1Var;
    }

    @Override
    public final void a() {
        k27 k27Var = this.a;
        mu1 mu1Var = this.h;
        vs1 vs1Var = mu1Var.D0;
        if (k27Var != null) {
            vs1Var.O();
            int indexOf = mu1Var.M6.indexOf(this.a) + mu1Var.D0.K;
            if (indexOf >= 0) {
                mu1Var.C0.h1(indexOf, (int) ((this.e + this.g) - mu1Var.P9), this.f);
            }
        } else {
            vs1Var.O();
            mu1Var.C0.h1(this.b, this.d, this.c);
        }
        this.a = null;
        mu1Var.B3 = true;
        mu1Var.ud(false);
        gl.c3(new hq1(this, (byte) 5));
    }

    @Override
    public final void c() {
        mu1 mu1Var = this.h;
        mu1Var.fa = mu1Var.getNotificationCenter().q(mu1.td, mu1Var.fa, true);
        jr1 jr1Var = mu1Var.Ta;
        if (jr1Var.n) {
            jr1Var.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof gb2) {
            gb2 gb2Var = (gb2) view;
            gb2Var.setDelegate(null);
            gb2Var.setResourcesProvider(null);
        }
    }
}
