package di;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.i61;
public final class i2 extends sq {
    public final int h;
    public final Object f7035i;

    public i2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f7035i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Je, (org.telegram.ui.ActionBar.c6) this.f7035i);
            case 1:
                return ((org.telegram.ui.ActionBar.u0) this.f7035i).f20377c.f20517b.f20151r0;
            case 2:
                return org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Je, ((iz) this.f7035i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Q5, ((yn0) this.f7035i).f31339f);
            default:
                return org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Je, ((i61) this.f7035i).f36093y.Z0);
        }
    }

    public i2(iz izVar) {
        super(1.25f);
        this.h = 2;
        this.f7035i = izVar;
        this.f28880f = AndroidUtilities.dp(7.0f);
    }

    public i2(org.telegram.ui.ActionBar.c6 c6Var) {
        super(1.25f);
        this.h = 0;
        this.f7035i = c6Var;
        this.f28880f = AndroidUtilities.dp(7.0f);
    }

    public i2(i61 i61Var) {
        super(1.25f);
        this.h = 4;
        this.f7035i = i61Var;
        this.f28880f = AndroidUtilities.dp(7.0f);
    }
}
