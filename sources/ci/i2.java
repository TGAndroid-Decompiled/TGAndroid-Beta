package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.xq;
import org.telegram.ui.e61;
public final class i2 extends xq {
    public final int h;
    public final Object f5192i;

    public i2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f5192i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Je, (org.telegram.ui.ActionBar.c6) this.f5192i);
            case 1:
                return ((org.telegram.ui.ActionBar.u0) this.f5192i).f21311c.f21460b.f21069r0;
            case 2:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Je, ((pz) this.f5192i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Q5, ((io0) this.f5192i).f27251f);
            default:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Je, ((e61) this.f5192i).f36363y.Z0);
        }
    }

    public i2(pz pzVar) {
        super(1.25f);
        this.h = 2;
        this.f5192i = pzVar;
        this.f32828f = AndroidUtilities.dp(7.0f);
    }

    public i2(org.telegram.ui.ActionBar.c6 c6Var) {
        super(1.25f);
        this.h = 0;
        this.f5192i = c6Var;
        this.f32828f = AndroidUtilities.dp(7.0f);
    }

    public i2(e61 e61Var) {
        super(1.25f);
        this.h = 4;
        this.f5192i = e61Var;
        this.f32828f = AndroidUtilities.dp(7.0f);
    }
}
