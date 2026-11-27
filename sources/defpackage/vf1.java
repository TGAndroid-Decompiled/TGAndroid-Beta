package defpackage;

import android.view.View;
public final class vf1 extends cxe {
    public r47 a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final wf1 f;

    public vf1(wf1 wf1Var) {
        this.f = wf1Var;
    }

    @Override
    public final void a() {
        r47 r47Var = this.a;
        wf1 wf1Var = this.f;
        if (r47Var != null) {
            int indexOf = wf1Var.p0.indexOf(r47Var) + wf1Var.F.f;
            if (indexOf >= 0) {
                wf1Var.y.h1(indexOf, this.e, false);
            }
        } else {
            wf1Var.y.h1(this.b, this.d, this.c);
        }
        this.a = null;
        wf1Var.W = true;
        wf1Var.i1();
        hl.c3(new fv0(this, (byte) 25));
    }

    @Override
    public final void c() {
        wf1 wf1Var = this.f;
        wf1Var.K0 = wf1Var.getNotificationCenter().p(wf1.R0, wf1Var.K0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof wb2) {
            this.f.h.add((wb2) view);
        }
    }
}
