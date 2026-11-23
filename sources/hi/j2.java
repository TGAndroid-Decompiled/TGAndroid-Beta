package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.i01;
public final class j2 extends cq {
    public final int h;
    public final Object f14724i;

    public j2(int i7, FrameLayout frameLayout) {
        this.h = i7;
        this.f14724i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, (org.telegram.ui.ActionBar.i6) this.f14724i);
            case 1:
                return ((org.telegram.ui.ActionBar.q0) this.f14724i).f29961c.f30340b.f29176s0;
            case 2:
                return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, ((dy) this.f14724i).H.f39037a2);
            case 3:
                return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Q5, ((tl0) this.f14724i).f40077e);
            default:
                return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, ((i01) this.f14724i).G.f51227a1);
        }
    }

    public j2(dy dyVar) {
        super(1.25f);
        this.h = 2;
        this.f14724i = dyVar;
        this.f34107f = org.telegram.messenger.g0.L(7.0f);
    }

    public j2(org.telegram.ui.ActionBar.i6 i6Var) {
        super(1.25f);
        this.h = 0;
        this.f14724i = i6Var;
        this.f34107f = org.telegram.messenger.g0.L(7.0f);
    }

    public j2(i01 i01Var) {
        super(1.25f);
        this.h = 4;
        this.f14724i = i01Var;
        this.f34107f = org.telegram.messenger.g0.L(7.0f);
    }
}
