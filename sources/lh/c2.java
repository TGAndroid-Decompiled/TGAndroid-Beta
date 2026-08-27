package lh;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.tp;
import org.telegram.ui.r41;

public final class c2 extends tp {
    public final int h;

    public final Object f15732i;

    public c2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f15732i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Je, (org.telegram.ui.ActionBar.c6) this.f15732i);
            case 1:
                return ((org.telegram.ui.ActionBar.v0) this.f15732i).f23856c.f23984b.f23585n0;
            case 2:
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Je, ((ky) this.f15732i).C.V1);
            case 3:
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Q5, ((km0) this.f15732i).f30150f);
            default:
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Je, ((r41) this.f15732i).f41282y.V0);
        }
    }

    public c2(ky kyVar) {
        super(1.25f);
        this.h = 2;
        this.f15732i = kyVar;
        this.f32852f = AndroidUtilities.dp(7.0f);
    }

    public c2(org.telegram.ui.ActionBar.c6 c6Var) {
        super(1.25f);
        this.h = 0;
        this.f15732i = c6Var;
        this.f32852f = AndroidUtilities.dp(7.0f);
    }

    public c2(r41 r41Var) {
        super(1.25f);
        this.h = 4;
        this.f15732i = r41Var;
        this.f32852f = AndroidUtilities.dp(7.0f);
    }
}
