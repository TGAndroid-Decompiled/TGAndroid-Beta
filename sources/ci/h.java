package ci;

import android.view.ViewGroup;
import c8.oa;
import hi.o1;
import org.telegram.ui.r11;
public final class h extends oa {
    public final int f5669a;
    public final ViewGroup f5670b;

    public h(ViewGroup viewGroup, int i7) {
        this.f5669a = i7;
        this.f5670b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f5669a) {
            case 0:
                ((h0) this.f5670b).f5768w = false;
                return;
            case 1:
                ((o1) this.f5670b).j3 = false;
                return;
            default:
                ((r11) this.f5670b).f51474y1 = false;
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f5669a) {
            case 1:
                ((o1) this.f5670b).j3 = true;
                return;
            case 2:
                ((r11) this.f5670b).f51474y1 = true;
                return;
            default:
                return;
        }
    }
}
