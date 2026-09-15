package ci;

import android.view.ViewGroup;
import org.telegram.ui.g71;
public final class l1 extends w7.y5 {
    public final int f4911a;
    public final ViewGroup f4912b;

    public l1(ViewGroup viewGroup, int i10) {
        this.f4911a = i10;
        this.f4912b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f4911a) {
            case 0:
                ((p1) this.f4912b).f5290b3 = false;
                return;
            default:
                ((g71) this.f4912b).f33829w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f4911a) {
            case 0:
                ((p1) this.f4912b).f5290b3 = true;
                return;
            default:
                ((g71) this.f4912b).f33829w1 = true;
                return;
        }
    }
}
