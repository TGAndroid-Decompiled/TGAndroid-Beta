package fi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.tx;
import org.telegram.ui.l01;
public final class c2 extends op {
    public final int h;
    public final Object f11729i;

    public c2(int i7, FrameLayout frameLayout) {
        this.h = i7;
        this.f11729i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28290yf, (org.telegram.ui.ActionBar.h6) this.f11729i);
            case 1:
                return ((org.telegram.ui.ActionBar.r0) this.f11729i).f28432c.f28771b.f27699r0;
            case 2:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28290yf, ((tx) this.f11729i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Q5, ((el0) this.f11729i).f33293e);
            default:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28290yf, ((l01) this.f11729i).F.Z0);
        }
    }

    public c2(tx txVar) {
        super(1.25f);
        this.h = 2;
        this.f11729i = txVar;
        this.f36659f = org.telegram.messenger.g0.L(7.0f);
    }

    public c2(org.telegram.ui.ActionBar.h6 h6Var) {
        super(1.25f);
        this.h = 0;
        this.f11729i = h6Var;
        this.f36659f = org.telegram.messenger.g0.L(7.0f);
    }

    public c2(l01 l01Var) {
        super(1.25f);
        this.h = 4;
        this.f11729i = l01Var;
        this.f36659f = org.telegram.messenger.g0.L(7.0f);
    }
}
