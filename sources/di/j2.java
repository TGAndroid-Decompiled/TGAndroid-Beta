package di;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.xy;
import org.telegram.ui.a61;
public final class j2 extends eq {
    public final int h;
    public final Object f7424i;

    public j2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f7424i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Je, (org.telegram.ui.ActionBar.f6) this.f7424i);
            case 1:
                return ((org.telegram.ui.ActionBar.v0) this.f7424i).f21380c.f21546b.f21112r0;
            case 2:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Je, ((xy) this.f7424i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Q5, ((wm0) this.f7424i).f32296f);
            default:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Je, ((a61) this.f7424i).f43010y.Z0);
        }
    }

    public j2(xy xyVar) {
        super(1.25f);
        this.h = 2;
        this.f7424i = xyVar;
        this.f25750f = AndroidUtilities.dp(7.0f);
    }

    public j2(org.telegram.ui.ActionBar.f6 f6Var) {
        super(1.25f);
        this.h = 0;
        this.f7424i = f6Var;
        this.f25750f = AndroidUtilities.dp(7.0f);
    }

    public j2(a61 a61Var) {
        super(1.25f);
        this.h = 4;
        this.f7424i = a61Var;
        this.f25750f = AndroidUtilities.dp(7.0f);
    }
}
