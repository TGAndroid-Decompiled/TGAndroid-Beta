package fi;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.rq;
import org.telegram.ui.w41;
public final class d2 extends rq {
    public final int h;
    public final Object f10716i;

    public d2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f10716i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Je, (org.telegram.ui.ActionBar.u6) this.f10716i);
            case 1:
                return ((org.telegram.ui.ActionBar.w0) this.f10716i).f23179c.f23779b.f22784r0;
            case 2:
                return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Je, ((fz) this.f10716i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Q5, ((eo0) this.f10716i).e);
            default:
                return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Je, ((w41) this.f10716i).F.Z0);
        }
    }

    public d2(fz fzVar) {
        super(1.25f);
        this.h = 2;
        this.f10716i = fzVar;
        this.f32321f = AndroidUtilities.dp(7.0f);
    }

    public d2(org.telegram.ui.ActionBar.u6 u6Var) {
        super(1.25f);
        this.h = 0;
        this.f10716i = u6Var;
        this.f32321f = AndroidUtilities.dp(7.0f);
    }

    public d2(w41 w41Var) {
        super(1.25f);
        this.h = 4;
        this.f10716i = w41Var;
        this.f32321f = AndroidUtilities.dp(7.0f);
    }
}
