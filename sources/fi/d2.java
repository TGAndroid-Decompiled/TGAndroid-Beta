package fi;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.rq;
import org.telegram.ui.t41;
public final class d2 extends rq {
    public final int h;
    public final Object f10717i;

    public d2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f10717i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Je, (org.telegram.ui.ActionBar.u6) this.f10717i);
            case 1:
                return ((org.telegram.ui.ActionBar.w0) this.f10717i).f23176c.f23776b.f22781r0;
            case 2:
                return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Je, ((fz) this.f10717i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Q5, ((do0) this.f10717i).e);
            default:
                return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Je, ((t41) this.f10717i).F.Z0);
        }
    }

    public d2(fz fzVar) {
        super(1.25f);
        this.h = 2;
        this.f10717i = fzVar;
        this.f32283f = AndroidUtilities.dp(7.0f);
    }

    public d2(org.telegram.ui.ActionBar.u6 u6Var) {
        super(1.25f);
        this.h = 0;
        this.f10717i = u6Var;
        this.f32283f = AndroidUtilities.dp(7.0f);
    }

    public d2(t41 t41Var) {
        super(1.25f);
        this.h = 4;
        this.f10717i = t41Var;
        this.f32283f = AndroidUtilities.dp(7.0f);
    }
}
