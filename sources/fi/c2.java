package fi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.ux;
import org.telegram.ui.i01;
public final class c2 extends op {
    public final int h;
    public final Object f11724i;

    public c2(int i7, FrameLayout frameLayout) {
        this.h = i7;
        this.f11724i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28252yf, (org.telegram.ui.ActionBar.f6) this.f11724i);
            case 1:
                return ((org.telegram.ui.ActionBar.r0) this.f11724i).f28426c.f28759b.f27688r0;
            case 2:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28252yf, ((ux) this.f11724i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Q5, ((el0) this.f11724i).f33330e);
            default:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28252yf, ((i01) this.f11724i).F.Z0);
        }
    }

    public c2(ux uxVar) {
        super(1.25f);
        this.h = 2;
        this.f11724i = uxVar;
        this.f36678f = org.telegram.messenger.g0.L(7.0f);
    }

    public c2(org.telegram.ui.ActionBar.f6 f6Var) {
        super(1.25f);
        this.h = 0;
        this.f11724i = f6Var;
        this.f36678f = org.telegram.messenger.g0.L(7.0f);
    }

    public c2(i01 i01Var) {
        super(1.25f);
        this.h = 4;
        this.f11724i = i01Var;
        this.f36678f = org.telegram.messenger.g0.L(7.0f);
    }
}
