package ci;

import android.view.ViewGroup;
import org.telegram.ui.j71;
public final class l1 extends w7.z5 {
    public final int f4917a;
    public final ViewGroup f4918b;

    public l1(ViewGroup viewGroup, int i10) {
        this.f4917a = i10;
        this.f4918b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f4917a) {
            case 0:
                ((p1) this.f4918b).f5296b3 = false;
                return;
            default:
                ((j71) this.f4918b).f34825w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f4917a) {
            case 0:
                ((p1) this.f4918b).f5296b3 = true;
                return;
            default:
                ((j71) this.f4918b).f34825w1 = true;
                return;
        }
    }
}
