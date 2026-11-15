package ci;

import android.view.ViewGroup;
import c8.ma;
import hi.o1;
import org.telegram.ui.n11;
public final class h extends ma {
    public final int f5383a;
    public final ViewGroup f5384b;

    public h(ViewGroup viewGroup, int i7) {
        this.f5383a = i7;
        this.f5384b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f5383a) {
            case 0:
                ((g0) this.f5384b).f5486w = false;
                return;
            case 1:
                ((o1) this.f5384b).j3 = false;
                return;
            default:
                ((n11) this.f5384b).f49421y1 = false;
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f5383a) {
            case 1:
                ((o1) this.f5384b).j3 = true;
                return;
            case 2:
                ((n11) this.f5384b).f49421y1 = true;
                return;
            default:
                return;
        }
    }
}
