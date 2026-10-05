package ci;

import android.view.ViewGroup;
import org.telegram.ui.a71;
public final class l1 extends w7.a6 {
    public final int f5478a;
    public final ViewGroup f5479b;

    public l1(ViewGroup viewGroup, int i10) {
        this.f5478a = i10;
        this.f5479b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f5478a) {
            case 0:
                ((p1) this.f5479b).f5684i3 = false;
                return;
            default:
                ((a71) this.f5479b).f34772w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f5478a) {
            case 0:
                ((p1) this.f5479b).f5684i3 = true;
                return;
            default:
                ((a71) this.f5479b).f34772w1 = true;
                return;
        }
    }
}
