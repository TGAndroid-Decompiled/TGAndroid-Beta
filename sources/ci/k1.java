package ci;

import android.view.ViewGroup;
import org.telegram.ui.k71;
public final class k1 extends w7.y5 {
    public final int f5304a;
    public final ViewGroup f5305b;

    public k1(ViewGroup viewGroup, int i10) {
        this.f5304a = i10;
        this.f5305b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f5304a) {
            case 0:
                ((o1) this.f5305b).Z2 = false;
                return;
            default:
                ((k71) this.f5305b).f39163w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f5304a) {
            case 0:
                ((o1) this.f5305b).Z2 = true;
                return;
            default:
                ((k71) this.f5305b).f39163w1 = true;
                return;
        }
    }
}
