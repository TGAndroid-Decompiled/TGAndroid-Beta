package ci;

import android.view.ViewGroup;
import org.telegram.ui.n71;
public final class k1 extends w7.x5 {
    public final int f5302a;
    public final ViewGroup f5303b;

    public k1(ViewGroup viewGroup, int i10) {
        this.f5302a = i10;
        this.f5303b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f5302a) {
            case 0:
                ((o1) this.f5303b).Z2 = false;
                return;
            default:
                ((n71) this.f5303b).f40305w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f5302a) {
            case 0:
                ((o1) this.f5303b).Z2 = true;
                return;
            default:
                ((n71) this.f5303b).f40305w1 = true;
                return;
        }
    }
}
