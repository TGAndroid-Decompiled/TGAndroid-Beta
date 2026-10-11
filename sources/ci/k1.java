package ci;

import android.view.ViewGroup;
import org.telegram.ui.j71;
public final class k1 extends w7.y5 {
    public final int f5303a;
    public final ViewGroup f5304b;

    public k1(ViewGroup viewGroup, int i10) {
        this.f5303a = i10;
        this.f5304b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f5303a) {
            case 0:
                ((o1) this.f5304b).Z2 = false;
                return;
            default:
                ((j71) this.f5304b).f38961w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f5303a) {
            case 0:
                ((o1) this.f5304b).Z2 = true;
                return;
            default:
                ((j71) this.f5304b).f38961w1 = true;
                return;
        }
    }
}
