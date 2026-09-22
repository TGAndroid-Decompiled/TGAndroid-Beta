package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.xy;
import org.telegram.ui.y51;
public final class j2 extends fq {
    public final int h;
    public final Object f4835i;

    public j2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f4835i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Je, (org.telegram.ui.ActionBar.e6) this.f4835i);
            case 1:
                return ((org.telegram.ui.ActionBar.v0) this.f4835i).f19576c.f19732b.f19322r0;
            case 2:
                return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Je, ((xy) this.f4835i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Q5, ((wm0) this.f4835i).f29751f);
            default:
                return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Je, ((y51) this.f4835i).f38711y.Z0);
        }
    }

    public j2(xy xyVar) {
        super(1.25f);
        this.h = 2;
        this.f4835i = xyVar;
        this.f24053f = AndroidUtilities.dp(7.0f);
    }

    public j2(org.telegram.ui.ActionBar.e6 e6Var) {
        super(1.25f);
        this.h = 0;
        this.f4835i = e6Var;
        this.f24053f = AndroidUtilities.dp(7.0f);
    }

    public j2(y51 y51Var) {
        super(1.25f);
        this.h = 4;
        this.f4835i = y51Var;
        this.f24053f = AndroidUtilities.dp(7.0f);
    }
}
