package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.r51;
public final class j2 extends iq {
    public final int h;
    public final Object f4823i;

    public j2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f4823i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Je, (org.telegram.ui.ActionBar.d6) this.f4823i);
            case 1:
                return ((org.telegram.ui.ActionBar.u0) this.f4823i).f19807c.f19945b.f19581r0;
            case 2:
                return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Je, ((az) this.f4823i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Q5, ((mn0) this.f4823i).f26333f);
            default:
                return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Je, ((r51) this.f4823i).f36522y.Z0);
        }
    }

    public j2(az azVar) {
        super(1.25f);
        this.h = 2;
        this.f4823i = azVar;
        this.f25164f = AndroidUtilities.dp(7.0f);
    }

    public j2(org.telegram.ui.ActionBar.d6 d6Var) {
        super(1.25f);
        this.h = 0;
        this.f4823i = d6Var;
        this.f25164f = AndroidUtilities.dp(7.0f);
    }

    public j2(r51 r51Var) {
        super(1.25f);
        this.h = 4;
        this.f4823i = r51Var;
        this.f25164f = AndroidUtilities.dp(7.0f);
    }
}
