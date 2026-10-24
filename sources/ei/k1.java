package ei;

import android.view.ViewGroup;
import org.telegram.ui.a61;
public final class k1 extends w7.a6 {
    public final int f9303a;
    public final ViewGroup f9304b;

    public k1(ViewGroup viewGroup, int i10) {
        this.f9303a = i10;
        this.f9304b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f9303a) {
            case 0:
                ((o1) this.f9304b).f9552c3 = false;
                return;
            case 1:
                ((a61) this.f9304b).f35658x1 = false;
                return;
            default:
                ((zh.k0) this.f9304b).v = false;
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f9303a) {
            case 0:
                ((o1) this.f9304b).f9552c3 = true;
                return;
            case 1:
                ((a61) this.f9304b).f35658x1 = true;
                return;
            default:
                return;
        }
    }
}
