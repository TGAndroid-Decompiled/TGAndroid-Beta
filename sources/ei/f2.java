package ei;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.r41;
public final class f2 extends nq {
    public final int h;
    public final Object f9005i;

    public f2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f9005i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Je, (org.telegram.ui.ActionBar.g6) this.f9005i);
            case 1:
                return ((org.telegram.ui.ActionBar.u0) this.f9005i).f21877c.f21965b.f21078r0;
            case 2:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Je, ((ez) this.f9005i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Q5, ((xn0) this.f9005i).e);
            default:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Je, ((r41) this.f9005i).F.Z0);
        }
    }

    public f2(ez ezVar) {
        super(1.25f);
        this.h = 2;
        this.f9005i = ezVar;
        this.f28995f = AndroidUtilities.dp(7.0f);
    }

    public f2(org.telegram.ui.ActionBar.g6 g6Var) {
        super(1.25f);
        this.h = 0;
        this.f9005i = g6Var;
        this.f28995f = AndroidUtilities.dp(7.0f);
    }

    public f2(r41 r41Var) {
        super(1.25f);
        this.h = 4;
        this.f9005i = r41Var;
        this.f28995f = AndroidUtilities.dp(7.0f);
    }
}
