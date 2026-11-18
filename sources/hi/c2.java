package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.j01;
public final class c2 extends dq {
    public final int h;
    public final Object f14307i;

    public c2(int i7, FrameLayout frameLayout) {
        this.h = i7;
        this.f14307i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, (org.telegram.ui.ActionBar.i6) this.f14307i);
            case 1:
                return ((org.telegram.ui.ActionBar.r0) this.f14307i).f29920c.f30299b.f29098s0;
            case 2:
                return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, ((ey) this.f14307i).H.f39335a2);
            case 3:
                return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Q5, ((rl0) this.f14307i).f39175e);
            default:
                return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, ((j01) this.f14307i).G.f51418a1);
        }
    }

    public c2(ey eyVar) {
        super(1.25f);
        this.h = 2;
        this.f14307i = eyVar;
        this.f34485f = org.telegram.messenger.g0.L(7.0f);
    }

    public c2(org.telegram.ui.ActionBar.i6 i6Var) {
        super(1.25f);
        this.h = 0;
        this.f14307i = i6Var;
        this.f34485f = org.telegram.messenger.g0.L(7.0f);
    }

    public c2(j01 j01Var) {
        super(1.25f);
        this.h = 4;
        this.f14307i = j01Var;
        this.f34485f = org.telegram.messenger.g0.L(7.0f);
    }
}
