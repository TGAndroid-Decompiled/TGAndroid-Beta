package ci;

import android.view.ViewGroup;
import c8.ra;
import hi.n1;
import org.telegram.ui.r11;
public final class h extends ra {
    public final int f5661a;
    public final ViewGroup f5662b;

    public h(ViewGroup viewGroup, int i7) {
        this.f5661a = i7;
        this.f5662b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f5661a) {
            case 0:
                ((h0) this.f5662b).f5760w = false;
                return;
            case 1:
                ((n1) this.f5662b).j3 = false;
                return;
            default:
                ((r11) this.f5662b).f51458y1 = false;
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f5661a) {
            case 1:
                ((n1) this.f5662b).j3 = true;
                return;
            case 2:
                ((r11) this.f5662b).f51458y1 = true;
                return;
            default:
                return;
        }
    }
}
