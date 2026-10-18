package ei;

import android.view.ViewGroup;
import org.telegram.ui.z51;
public final class k1 extends w7.a6 {
    public final int f9295a;
    public final ViewGroup f9296b;

    public k1(ViewGroup viewGroup, int i10) {
        this.f9295a = i10;
        this.f9296b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f9295a) {
            case 0:
                ((o1) this.f9296b).Z2 = false;
                return;
            case 1:
                ((z51) this.f9296b).f43655w1 = false;
                return;
            default:
                ((zh.d0) this.f9296b).v = false;
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f9295a) {
            case 0:
                ((o1) this.f9296b).Z2 = true;
                return;
            case 1:
                ((z51) this.f9296b).f43655w1 = true;
                return;
            default:
                return;
        }
    }
}
