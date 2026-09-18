package ci;

import android.view.ViewGroup;
import org.telegram.ui.g71;
public final class l1 extends w7.z5 {
    public final int f4916a;
    public final ViewGroup f4917b;

    public l1(ViewGroup viewGroup, int i10) {
        this.f4916a = i10;
        this.f4917b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f4916a) {
            case 0:
                ((p1) this.f4917b).f5295b3 = false;
                return;
            default:
                ((g71) this.f4917b).f33761w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f4916a) {
            case 0:
                ((p1) this.f4917b).f5295b3 = true;
                return;
            default:
                ((g71) this.f4917b).f33761w1 = true;
                return;
        }
    }
}
