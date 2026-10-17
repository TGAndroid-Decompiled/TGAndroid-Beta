package ei;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.un0;
import org.telegram.ui.q41;
public final class f2 extends pq {
    public final int h;
    public final Object f8996i;

    public f2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f8996i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Je, (org.telegram.ui.ActionBar.d6) this.f8996i);
            case 1:
                return ((org.telegram.ui.ActionBar.u0) this.f8996i).f21730c.f21889b.f21502r0;
            case 2:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Je, ((gz) this.f8996i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Q5, ((un0) this.f8996i).f31056f);
            default:
                return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Je, ((q41) this.f8996i).f39667y.Z0);
        }
    }

    public f2(gz gzVar) {
        super(1.25f);
        this.h = 2;
        this.f8996i = gzVar;
        this.f29396f = AndroidUtilities.dp(7.0f);
    }

    public f2(org.telegram.ui.ActionBar.d6 d6Var) {
        super(1.25f);
        this.h = 0;
        this.f8996i = d6Var;
        this.f29396f = AndroidUtilities.dp(7.0f);
    }

    public f2(q41 q41Var) {
        super(1.25f);
        this.h = 4;
        this.f8996i = q41Var;
        this.f29396f = AndroidUtilities.dp(7.0f);
    }
}
