package ci;

import android.view.ViewGroup;
import org.telegram.ui.z61;
public final class l1 extends w7.y5 {
    public final int f4945a;
    public final ViewGroup f4946b;

    public l1(ViewGroup viewGroup, int i10) {
        this.f4945a = i10;
        this.f4946b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f4945a) {
            case 0:
                ((p1) this.f4946b).f5277b3 = false;
                return;
            default:
                ((z61) this.f4946b).f40054w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f4945a) {
            case 0:
                ((p1) this.f4946b).f5277b3 = true;
                return;
            default:
                ((z61) this.f4946b).f40054w1 = true;
                return;
        }
    }
}
