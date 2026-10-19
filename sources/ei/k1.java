package ei;

import android.view.ViewGroup;
import org.telegram.ui.x51;
public final class k1 extends w7.a6 {
    public final int f9292a;
    public final ViewGroup f9293b;

    public k1(ViewGroup viewGroup, int i10) {
        this.f9292a = i10;
        this.f9293b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f9292a) {
            case 0:
                ((o1) this.f9293b).Z2 = false;
                return;
            case 1:
                ((x51) this.f9293b).f43088w1 = false;
                return;
            default:
                ((zh.j0) this.f9293b).v = false;
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f9292a) {
            case 0:
                ((o1) this.f9293b).Z2 = true;
                return;
            case 1:
                ((x51) this.f9293b).f43088w1 = true;
                return;
            default:
                return;
        }
    }
}
