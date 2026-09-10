package bi;

import android.view.ViewGroup;
import org.telegram.ui.l71;
public final class s1 extends w7.b6 {
    public final int f3639a;
    public final ViewGroup f3640b;

    public s1(ViewGroup viewGroup, int i10) {
        this.f3639a = i10;
        this.f3640b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f3639a) {
            case 0:
                ((w1) this.f3640b).f3817b3 = false;
                return;
            default:
                ((l71) this.f3640b).f34603w1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f3639a) {
            case 0:
                ((w1) this.f3640b).f3817b3 = true;
                return;
            default:
                ((l71) this.f3640b).f34603w1 = true;
                return;
        }
    }
}
