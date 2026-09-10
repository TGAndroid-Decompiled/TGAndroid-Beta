package bi;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.c61;
public final class v2 extends lq {
    public final int h;
    public final Object f3782i;

    public v2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f3782i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Je, (org.telegram.ui.ActionBar.f6) this.f3782i);
            case 1:
                return ((org.telegram.ui.ActionBar.w0) this.f3782i).f18688c.f18793b.f18398r0;
            case 2:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Je, ((ez) this.f3782i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Q5, ((gn0) this.f3782i).f23391f);
            default:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Je, ((c61) this.f3782i).f30821y.Z0);
        }
    }

    public v2(ez ezVar) {
        super(1.25f);
        this.h = 2;
        this.f3782i = ezVar;
        this.f25074f = AndroidUtilities.dp(7.0f);
    }

    public v2(org.telegram.ui.ActionBar.f6 f6Var) {
        super(1.25f);
        this.h = 0;
        this.f3782i = f6Var;
        this.f25074f = AndroidUtilities.dp(7.0f);
    }

    public v2(c61 c61Var) {
        super(1.25f);
        this.h = 4;
        this.f3782i = c61Var;
        this.f25074f = AndroidUtilities.dp(7.0f);
    }
}
