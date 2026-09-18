package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.xy;
import org.telegram.ui.z51;
public final class j2 extends fq {
    public final int h;
    public final Object f4838i;

    public j2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f4838i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Je, (org.telegram.ui.ActionBar.f6) this.f4838i);
            case 1:
                return ((org.telegram.ui.ActionBar.w0) this.f4838i).f19608c.f18452b.f19314r0;
            case 2:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Je, ((xy) this.f4838i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Q5, ((xm0) this.f4838i).f29949f);
            default:
                return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Je, ((z51) this.f4838i).f39404y.Z0);
        }
    }

    public j2(xy xyVar) {
        super(1.25f);
        this.h = 2;
        this.f4838i = xyVar;
        this.f23979f = AndroidUtilities.dp(7.0f);
    }

    public j2(org.telegram.ui.ActionBar.f6 f6Var) {
        super(1.25f);
        this.h = 0;
        this.f4838i = f6Var;
        this.f23979f = AndroidUtilities.dp(7.0f);
    }

    public j2(z51 z51Var) {
        super(1.25f);
        this.h = 4;
        this.f4838i = z51Var;
        this.f23979f = AndroidUtilities.dp(7.0f);
    }
}
