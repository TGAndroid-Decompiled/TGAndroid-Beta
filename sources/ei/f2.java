package ei;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.un0;
import org.telegram.ui.o41;
public final class f2 extends pq {
    public final int h;
    public final Object f8994i;

    public f2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f8994i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Je, (org.telegram.ui.ActionBar.d6) this.f8994i);
            case 1:
                return ((org.telegram.ui.ActionBar.u0) this.f8994i).f21731c.f21890b.f21503r0;
            case 2:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Je, ((gz) this.f8994i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Q5, ((un0) this.f8994i).f31029f);
            default:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Je, ((o41) this.f8994i).f39116y.Z0);
        }
    }

    public f2(gz gzVar) {
        super(1.25f);
        this.h = 2;
        this.f8994i = gzVar;
        this.f29366f = AndroidUtilities.dp(7.0f);
    }

    public f2(org.telegram.ui.ActionBar.d6 d6Var) {
        super(1.25f);
        this.h = 0;
        this.f8994i = d6Var;
        this.f29366f = AndroidUtilities.dp(7.0f);
    }

    public f2(o41 o41Var) {
        super(1.25f);
        this.h = 4;
        this.f8994i = o41Var;
        this.f29366f = AndroidUtilities.dp(7.0f);
    }
}
