package gi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.rx;
import org.telegram.ui.yz0;
public final class b2 extends op {
    public final int h;
    public final Object f12441i;

    public b2(int i3, FrameLayout frameLayout) {
        this.h = i3;
        this.f12441i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28280yf, (org.telegram.ui.ActionBar.e6) this.f12441i);
            case 1:
                return ((org.telegram.ui.ActionBar.q0) this.f12441i).f28442c.f28786b.f27738s0;
            case 2:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28280yf, ((rx) this.f12441i).H.f33520a2);
            case 3:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Q5, ((il0) this.f12441i).f34741e);
            default:
                return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28280yf, ((yz0) this.f12441i).G.f45436a1);
        }
    }

    public b2(rx rxVar) {
        super(1.25f);
        this.h = 2;
        this.f12441i = rxVar;
        this.f36919f = org.telegram.messenger.g0.L(7.0f);
    }

    public b2(org.telegram.ui.ActionBar.e6 e6Var) {
        super(1.25f);
        this.h = 0;
        this.f12441i = e6Var;
        this.f36919f = org.telegram.messenger.g0.L(7.0f);
    }

    public b2(yz0 yz0Var) {
        super(1.25f);
        this.h = 4;
        this.f12441i = yz0Var;
        this.f36919f = org.telegram.messenger.g0.L(7.0f);
    }
}
