package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.yx;
import org.telegram.ui.f01;
public final class b2 extends wp {
    public final int h;
    public final Object f13920i;

    public b2(int i7, FrameLayout frameLayout) {
        this.h = i7;
        this.f13920i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Bf, (org.telegram.ui.ActionBar.e6) this.f13920i);
            case 1:
                return ((org.telegram.ui.ActionBar.q0) this.f13920i).f29499c.f29876b.f29314s0;
            case 2:
                return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Bf, ((yx) this.f13920i).H.f36931a2);
            case 3:
                return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Q5, ((jl0) this.f13920i).f36040e);
            default:
                return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Bf, ((f01) this.f13920i).G.f49366a1);
        }
    }

    public b2(yx yxVar) {
        super(1.25f);
        this.h = 2;
        this.f13920i = yxVar;
        this.f41418f = org.telegram.messenger.g0.L(7.0f);
    }

    public b2(org.telegram.ui.ActionBar.e6 e6Var) {
        super(1.25f);
        this.h = 0;
        this.f13920i = e6Var;
        this.f41418f = org.telegram.messenger.g0.L(7.0f);
    }

    public b2(f01 f01Var) {
        super(1.25f);
        this.h = 4;
        this.f13920i = f01Var;
        this.f41418f = org.telegram.messenger.g0.L(7.0f);
    }
}
