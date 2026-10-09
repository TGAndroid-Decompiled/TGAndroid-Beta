package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.vq;
import org.telegram.ui.b61;
public final class i2 extends vq {
    public final int h;
    public final Object f5194i;

    public i2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f5194i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Je, (org.telegram.ui.ActionBar.e6) this.f5194i);
            case 1:
                return ((org.telegram.ui.ActionBar.v0) this.f5194i).f21581c.f21734b.f21294r0;
            case 2:
                return org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Je, ((mz) this.f5194i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Q5, ((co0) this.f5194i).f25452f);
            default:
                return org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Je, ((b61) this.f5194i).f44500y.Z0);
        }
    }

    public i2(mz mzVar) {
        super(1.25f);
        this.h = 2;
        this.f5194i = mzVar;
        this.f32422f = AndroidUtilities.dp(7.0f);
    }

    public i2(org.telegram.ui.ActionBar.e6 e6Var) {
        super(1.25f);
        this.h = 0;
        this.f5194i = e6Var;
        this.f32422f = AndroidUtilities.dp(7.0f);
    }

    public i2(b61 b61Var) {
        super(1.25f);
        this.h = 4;
        this.f5194i = b61Var;
        this.f32422f = AndroidUtilities.dp(7.0f);
    }
}
