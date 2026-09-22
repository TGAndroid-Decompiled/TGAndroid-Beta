package ci;

import android.view.ViewGroup;
import org.telegram.ui.h71;
public final class l1 extends w7.y5 {
    public final int f4913a;
    public final ViewGroup f4914b;

    public l1(ViewGroup viewGroup, int i10) {
        this.f4913a = i10;
        this.f4914b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f4913a) {
            case 0:
                ((p1) this.f4914b).f5292b3 = false;
                return;
            default:
                ((h71) this.f4914b).f34165w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f4913a) {
            case 0:
                ((p1) this.f4914b).f5292b3 = true;
                return;
            default:
                ((h71) this.f4914b).f34165w1 = true;
                return;
        }
    }
}
