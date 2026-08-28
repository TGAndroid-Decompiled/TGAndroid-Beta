package kh;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.vp;
import org.telegram.ui.s41;
public final class e2 extends vp {
    public final int h;
    public final Object f15145i;

    public e2(int i9, FrameLayout frameLayout) {
        this.h = i9;
        this.f15145i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Je, (org.telegram.ui.ActionBar.b6) this.f15145i);
            case 1:
                return ((org.telegram.ui.ActionBar.w0) this.f15145i).f23903c.f23999b.f23584n0;
            case 2:
                return org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Je, ((jy) this.f15145i).C.V1);
            case 3:
                return org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Q5, ((hm0) this.f15145i).f29133f);
            default:
                return org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Je, ((s41) this.f15145i).f41692y.V0);
        }
    }

    public e2(jy jyVar) {
        super(1.25f);
        this.h = 2;
        this.f15145i = jyVar;
        this.f33975f = AndroidUtilities.dp(7.0f);
    }

    public e2(org.telegram.ui.ActionBar.b6 b6Var) {
        super(1.25f);
        this.h = 0;
        this.f15145i = b6Var;
        this.f33975f = AndroidUtilities.dp(7.0f);
    }

    public e2(s41 s41Var) {
        super(1.25f);
        this.h = 4;
        this.f15145i = s41Var;
        this.f33975f = AndroidUtilities.dp(7.0f);
    }
}
