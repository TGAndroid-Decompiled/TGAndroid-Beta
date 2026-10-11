package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.vq;
import org.telegram.ui.a61;
public final class i2 extends vq {
    public final int h;
    public final Object f5193i;

    public i2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f5193i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Je, (org.telegram.ui.ActionBar.d6) this.f5193i);
            case 1:
                return ((org.telegram.ui.ActionBar.u0) this.f5193i).f21537c.f21686b.f21295r0;
            case 2:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Je, ((nz) this.f5193i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Q5, ((eo0) this.f5193i).f26112f);
            default:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Je, ((a61) this.f5193i).f44272y.Z0);
        }
    }

    public i2(nz nzVar) {
        super(1.25f);
        this.h = 2;
        this.f5193i = nzVar;
        this.f32462f = AndroidUtilities.dp(7.0f);
    }

    public i2(org.telegram.ui.ActionBar.d6 d6Var) {
        super(1.25f);
        this.h = 0;
        this.f5193i = d6Var;
        this.f32462f = AndroidUtilities.dp(7.0f);
    }

    public i2(a61 a61Var) {
        super(1.25f);
        this.h = 4;
        this.f5193i = a61Var;
        this.f32462f = AndroidUtilities.dp(7.0f);
    }
}
