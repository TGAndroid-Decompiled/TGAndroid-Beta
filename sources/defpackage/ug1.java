package defpackage;

import android.view.View;
public final class ug1 extends nue {
    public k47 a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final vg1 f;

    public ug1(vg1 vg1Var) {
        this.f = vg1Var;
    }

    @Override
    public final void a() {
        k47 k47Var = this.a;
        vg1 vg1Var = this.f;
        if (k47Var != null) {
            int indexOf = vg1Var.p0.indexOf(k47Var) + vg1Var.F.f;
            if (indexOf >= 0) {
                vg1Var.y.h1(indexOf, this.e, false);
            }
        } else {
            vg1Var.y.h1(this.b, this.d, this.c);
        }
        this.a = null;
        vg1Var.W = true;
        vg1Var.i1();
        gm.c3(new yt0(this, (byte) 25));
    }

    @Override
    public final void c() {
        vg1 vg1Var = this.f;
        vg1Var.K0 = vg1Var.getNotificationCenter().p(vg1.R0, vg1Var.K0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof rc2) {
            this.f.h.add((rc2) view);
        }
    }
}
