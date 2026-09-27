package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hq;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.zy;
import org.telegram.ui.t51;
public final class j2 extends hq {
    public final int h;
    public final Object f4817i;

    public j2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f4817i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Je, (org.telegram.ui.ActionBar.e6) this.f4817i);
            case 1:
                return ((org.telegram.ui.ActionBar.w0) this.f4817i).f19840c.f18660b.f19579r0;
            case 2:
                return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Je, ((zy) this.f4817i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Q5, ((ln0) this.f4817i).f26095f);
            default:
                return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Je, ((t51) this.f4817i).f37015y.Z0);
        }
    }

    public j2(zy zyVar) {
        super(1.25f);
        this.h = 2;
        this.f4817i = zyVar;
        this.f24880f = AndroidUtilities.dp(7.0f);
    }

    public j2(org.telegram.ui.ActionBar.e6 e6Var) {
        super(1.25f);
        this.h = 0;
        this.f4817i = e6Var;
        this.f24880f = AndroidUtilities.dp(7.0f);
    }

    public j2(t51 t51Var) {
        super(1.25f);
        this.h = 4;
        this.f4817i = t51Var;
        this.f24880f = AndroidUtilities.dp(7.0f);
    }
}
