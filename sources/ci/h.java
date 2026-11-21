package ci;

import android.view.ViewGroup;
import c8.oa;
import hi.o1;
import org.telegram.ui.s11;
public final class h extends oa {
    public final int f5695a;
    public final ViewGroup f5696b;

    public h(ViewGroup viewGroup, int i7) {
        this.f5695a = i7;
        this.f5696b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f5695a) {
            case 0:
                ((h0) this.f5696b).f5794w = false;
                return;
            case 1:
                ((o1) this.f5696b).j3 = false;
                return;
            default:
                ((s11) this.f5696b).f51876y1 = false;
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f5695a) {
            case 1:
                ((o1) this.f5696b).j3 = true;
                return;
            case 2:
                ((s11) this.f5696b).f51876y1 = true;
                return;
            default:
                return;
        }
    }
}
