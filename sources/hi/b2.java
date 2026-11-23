package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.j01;
public final class b2 extends fq {
    public final int h;
    public final Object f14209i;

    public b2(int i7, FrameLayout frameLayout) {
        this.h = i7;
        this.f14209i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, (org.telegram.ui.ActionBar.h6) this.f14209i);
            case 1:
                return ((org.telegram.ui.ActionBar.q0) this.f14209i).f29870c.f30249b.f29126s0;
            case 2:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, ((gy) this.f14209i).H.f40064a2);
            case 3:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Q5, ((tl0) this.f14209i).f39895e);
            default:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, ((j01) this.f14209i).G.f51402a1);
        }
    }

    public b2(gy gyVar) {
        super(1.25f);
        this.h = 2;
        this.f14209i = gyVar;
        this.f35261f = org.telegram.messenger.g0.L(7.0f);
    }

    public b2(org.telegram.ui.ActionBar.h6 h6Var) {
        super(1.25f);
        this.h = 0;
        this.f14209i = h6Var;
        this.f35261f = org.telegram.messenger.g0.L(7.0f);
    }

    public b2(j01 j01Var) {
        super(1.25f);
        this.h = 4;
        this.f14209i = j01Var;
        this.f35261f = org.telegram.messenger.g0.L(7.0f);
    }
}
