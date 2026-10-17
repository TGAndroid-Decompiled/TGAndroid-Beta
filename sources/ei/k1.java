package ei;

import android.view.ViewGroup;
import org.telegram.ui.z51;
public final class k1 extends w7.a6 {
    public final int f9294a;
    public final ViewGroup f9295b;

    public k1(ViewGroup viewGroup, int i10) {
        this.f9294a = i10;
        this.f9295b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f9294a) {
            case 0:
                ((o1) this.f9295b).Z2 = false;
                return;
            case 1:
                ((z51) this.f9295b).f43629w1 = false;
                return;
            default:
                ((zh.k0) this.f9295b).v = false;
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f9294a) {
            case 0:
                ((o1) this.f9295b).Z2 = true;
                return;
            case 1:
                ((z51) this.f9295b).f43629w1 = true;
                return;
            default:
                return;
        }
    }
}
