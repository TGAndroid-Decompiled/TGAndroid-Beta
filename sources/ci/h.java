package ci;

import android.view.ViewGroup;
import c8.oa;
import hi.o1;
import org.telegram.ui.s11;
public final class h extends oa {
    public final int f5698a;
    public final ViewGroup f5699b;

    public h(ViewGroup viewGroup, int i7) {
        this.f5698a = i7;
        this.f5699b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f5698a) {
            case 0:
                ((h0) this.f5699b).f5797w = false;
                return;
            case 1:
                ((o1) this.f5699b).j3 = false;
                return;
            default:
                ((s11) this.f5699b).f51880y1 = false;
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f5698a) {
            case 1:
                ((o1) this.f5699b).j3 = true;
                return;
            case 2:
                ((s11) this.f5699b).f51880y1 = true;
                return;
            default:
                return;
        }
    }
}
