package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.k01;
public final class b2 extends fq {
    public final int h;
    public final Object f14288i;

    public b2(int i7, FrameLayout frameLayout) {
        this.h = i7;
        this.f14288i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, (org.telegram.ui.ActionBar.h6) this.f14288i);
            case 1:
                return ((org.telegram.ui.ActionBar.q0) this.f14288i).f29904c.f30283b.f29160s0;
            case 2:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, ((gy) this.f14288i).H.f40081a2);
            case 3:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Q5, ((tl0) this.f14288i).f39941e);
            default:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, ((k01) this.f14288i).G.f51824a1);
        }
    }

    public b2(gy gyVar) {
        super(1.25f);
        this.h = 2;
        this.f14288i = gyVar;
        this.f35305f = org.telegram.messenger.g0.L(7.0f);
    }

    public b2(org.telegram.ui.ActionBar.h6 h6Var) {
        super(1.25f);
        this.h = 0;
        this.f14288i = h6Var;
        this.f35305f = org.telegram.messenger.g0.L(7.0f);
    }

    public b2(k01 k01Var) {
        super(1.25f);
        this.h = 4;
        this.f14288i = k01Var;
        this.f35305f = org.telegram.messenger.g0.L(7.0f);
    }
}
