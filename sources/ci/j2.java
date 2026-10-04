package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.t51;
public final class j2 extends iq {
    public final int h;
    public final Object f5203i;

    public j2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f5203i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Je, (org.telegram.ui.ActionBar.d6) this.f5203i);
            case 1:
                return ((org.telegram.ui.ActionBar.v0) this.f5203i).f21577c.f21724b.f21290r0;
            case 2:
                return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Je, ((az) this.f5203i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Q5, ((pn0) this.f5203i).f29678f);
            default:
                return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Je, ((t51) this.f5203i).f39942y.Z0);
        }
    }

    public j2(az azVar) {
        super(1.25f);
        this.h = 2;
        this.f5203i = azVar;
        this.f27464f = AndroidUtilities.dp(7.0f);
    }

    public j2(org.telegram.ui.ActionBar.d6 d6Var) {
        super(1.25f);
        this.h = 0;
        this.f5203i = d6Var;
        this.f27464f = AndroidUtilities.dp(7.0f);
    }

    public j2(t51 t51Var) {
        super(1.25f);
        this.h = 4;
        this.f5203i = t51Var;
        this.f27464f = AndroidUtilities.dp(7.0f);
    }
}
