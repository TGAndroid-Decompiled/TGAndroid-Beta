package ei;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.s41;
public final class f2 extends pq {
    public final int h;
    public final Object f9005i;

    public f2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f9005i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Je, (org.telegram.ui.ActionBar.g6) this.f9005i);
            case 1:
                return ((org.telegram.ui.ActionBar.u0) this.f9005i).f21876c.f21964b.f21077r0;
            case 2:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Je, ((gz) this.f9005i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Q5, ((yn0) this.f9005i).e);
            default:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Je, ((s41) this.f9005i).F.Z0);
        }
    }

    public f2(gz gzVar) {
        super(1.25f);
        this.h = 2;
        this.f9005i = gzVar;
        this.f29635f = AndroidUtilities.dp(7.0f);
    }

    public f2(org.telegram.ui.ActionBar.g6 g6Var) {
        super(1.25f);
        this.h = 0;
        this.f9005i = g6Var;
        this.f29635f = AndroidUtilities.dp(7.0f);
    }

    public f2(s41 s41Var) {
        super(1.25f);
        this.h = 4;
        this.f9005i = s41Var;
        this.f29635f = AndroidUtilities.dp(7.0f);
    }
}
