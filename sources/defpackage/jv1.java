package defpackage;

import android.view.View;
public final class jv1 extends nue {
    public k47 a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final yv1 h;

    public jv1(yv1 yv1Var) {
        this.h = yv1Var;
    }

    @Override
    public final void a() {
        k47 k47Var = this.a;
        yv1 yv1Var = this.h;
        hu1 hu1Var = yv1Var.D0;
        if (k47Var != null) {
            hu1Var.O();
            int indexOf = yv1Var.M6.indexOf(this.a) + yv1Var.D0.K;
            if (indexOf >= 0) {
                yv1Var.C0.h1(indexOf, (int) ((this.e + this.g) - yv1Var.P9), this.f);
            }
        } else {
            hu1Var.O();
            yv1Var.C0.h1(this.b, this.d, this.c);
        }
        this.a = null;
        yv1Var.B3 = true;
        yv1Var.Gd(false);
        gm.c3(new fo1(this, (byte) 9));
    }

    @Override
    public final void c() {
        yv1 yv1Var = this.h;
        yv1Var.fa = yv1Var.getNotificationCenter().p(yv1.Dd, yv1Var.fa, true);
        vs1 vs1Var = yv1Var.Ta;
        if (vs1Var.n) {
            vs1Var.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof rc2) {
            rc2 rc2Var = (rc2) view;
            rc2Var.setDelegate(null);
            rc2Var.setResourcesProvider(null);
        }
    }
}
