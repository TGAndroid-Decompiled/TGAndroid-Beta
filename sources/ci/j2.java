package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.xy;
import org.telegram.ui.a61;
public final class j2 extends fq {
    public final int h;
    public final Object f4839i;

    public j2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f4839i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Je, (org.telegram.ui.ActionBar.f6) this.f4839i);
            case 1:
                return ((org.telegram.ui.ActionBar.v0) this.f4839i).f19799c.f19955b.f19546r0;
            case 2:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Je, ((xy) this.f4839i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Q5, ((jn0) this.f4839i).f25405f);
            default:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Je, ((a61) this.f4839i).f39814y.Z0);
        }
    }

    public j2(xy xyVar) {
        super(1.25f);
        this.h = 2;
        this.f4839i = xyVar;
        this.f24150f = AndroidUtilities.dp(7.0f);
    }

    public j2(org.telegram.ui.ActionBar.f6 f6Var) {
        super(1.25f);
        this.h = 0;
        this.f4839i = f6Var;
        this.f24150f = AndroidUtilities.dp(7.0f);
    }

    public j2(a61 a61Var) {
        super(1.25f);
        this.h = 4;
        this.f4839i = a61Var;
        this.f24150f = AndroidUtilities.dp(7.0f);
    }
}
