package ci;

import android.view.ViewGroup;
import org.telegram.ui.j71;
public final class l1 extends w7.z5 {
    public final int f4915a;
    public final ViewGroup f4916b;

    public l1(ViewGroup viewGroup, int i10) {
        this.f4915a = i10;
        this.f4916b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f4915a) {
            case 0:
                ((p1) this.f4916b).f5294b3 = false;
                return;
            default:
                ((j71) this.f4916b).f34850w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f4915a) {
            case 0:
                ((p1) this.f4916b).f5294b3 = true;
                return;
            default:
                ((j71) this.f4916b).f34850w1 = true;
                return;
        }
    }
}
