package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.r51;
public final class j2 extends gq {
    public final int h;
    public final Object f4815i;

    public j2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f4815i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Je, (org.telegram.ui.ActionBar.d6) this.f4815i);
            case 1:
                return ((org.telegram.ui.ActionBar.u0) this.f4815i).f19791c.f19929b.f19565r0;
            case 2:
                return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Je, ((yy) this.f4815i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Q5, ((jn0) this.f4815i).f25458f);
            default:
                return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Je, ((r51) this.f4815i).f36418y.Z0);
        }
    }

    public j2(yy yyVar) {
        super(1.25f);
        this.h = 2;
        this.f4815i = yyVar;
        this.f24498f = AndroidUtilities.dp(7.0f);
    }

    public j2(org.telegram.ui.ActionBar.d6 d6Var) {
        super(1.25f);
        this.h = 0;
        this.f4815i = d6Var;
        this.f24498f = AndroidUtilities.dp(7.0f);
    }

    public j2(r51 r51Var) {
        super(1.25f);
        this.h = 4;
        this.f4815i = r51Var;
        this.f24498f = AndroidUtilities.dp(7.0f);
    }
}
