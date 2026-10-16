package di;

import android.view.ViewGroup;
import org.telegram.ui.r71;
public final class k1 extends w7.a6 {
    public final int f7156a;
    public final ViewGroup f7157b;

    public k1(ViewGroup viewGroup, int i10) {
        this.f7156a = i10;
        this.f7157b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f7156a) {
            case 0:
                ((o1) this.f7157b).Z2 = false;
                return;
            default:
                ((r71) this.f7157b).f39363w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f7156a) {
            case 0:
                ((o1) this.f7157b).Z2 = true;
                return;
            default:
                ((r71) this.f7157b).f39363w1 = true;
                return;
        }
    }
}
