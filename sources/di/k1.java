package di;

import android.view.ViewGroup;
import org.telegram.ui.r71;
public final class k1 extends w7.b6 {
    public final int f7153a;
    public final ViewGroup f7154b;

    public k1(ViewGroup viewGroup, int i10) {
        this.f7153a = i10;
        this.f7154b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f7153a) {
            case 0:
                ((o1) this.f7154b).Z2 = false;
                return;
            default:
                ((r71) this.f7154b).f39670w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f7153a) {
            case 0:
                ((o1) this.f7154b).Z2 = true;
                return;
            default:
                ((r71) this.f7154b).f39670w1 = true;
                return;
        }
    }
}
