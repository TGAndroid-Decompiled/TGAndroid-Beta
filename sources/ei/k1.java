package ei;

import android.view.ViewGroup;
import org.telegram.ui.z51;
public final class k1 extends w7.a6 {
    public final int f9293a;
    public final ViewGroup f9294b;

    public k1(ViewGroup viewGroup, int i10) {
        this.f9293a = i10;
        this.f9294b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f9293a) {
            case 0:
                ((o1) this.f9294b).Z2 = false;
                return;
            case 1:
                ((z51) this.f9294b).f43619w1 = false;
                return;
            default:
                ((zh.d0) this.f9294b).v = false;
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f9293a) {
            case 0:
                ((o1) this.f9294b).Z2 = true;
                return;
            case 1:
                ((z51) this.f9294b).f43619w1 = true;
                return;
            default:
                return;
        }
    }
}
