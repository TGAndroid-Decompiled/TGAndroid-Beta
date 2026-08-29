package nh;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.zp;
import org.telegram.ui.u41;
public final class b2 extends zp {
    public final int h;
    public final Object f17411i;

    public b2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f17411i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Je, (org.telegram.ui.ActionBar.c6) this.f17411i);
            case 1:
                return ((org.telegram.ui.ActionBar.w0) this.f17411i).f23917c.f22719b.f23619n0;
            case 2:
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Je, ((ry) this.f17411i).C.V1);
            case 3:
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Q5, ((um0) this.f17411i).f33274f);
            default:
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Je, ((u41) this.f17411i).f42281y.V0);
        }
    }

    public b2(ry ryVar) {
        super(1.25f);
        this.h = 2;
        this.f17411i = ryVar;
        this.f35387f = AndroidUtilities.dp(7.0f);
    }

    public b2(org.telegram.ui.ActionBar.c6 c6Var) {
        super(1.25f);
        this.h = 0;
        this.f17411i = c6Var;
        this.f35387f = AndroidUtilities.dp(7.0f);
    }

    public b2(u41 u41Var) {
        super(1.25f);
        this.h = 4;
        this.f17411i = u41Var;
        this.f35387f = AndroidUtilities.dp(7.0f);
    }
}
