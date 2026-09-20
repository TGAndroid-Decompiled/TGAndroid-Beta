package ci;

import android.content.Context;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.kz;
import org.telegram.ui.j71;
import org.telegram.ui.x51;
public final class m1 extends ji.o {
    public final int f5033q;
    public final Object f5034r;

    public m1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f5033q = i10;
        this.f5034r = obj;
    }

    @Override
    public void e() {
        switch (this.f5033q) {
            case 0:
                ((p1) this.f5034r).f5296b3 = true;
                return;
            case 1:
                ((kz) this.f5034r).f25907f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((j71) this.f5034r).f34825w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f5033q) {
            case 0:
                ((p1) this.f5034r).f5296b3 = false;
                return;
            case 1:
                ((kz) this.f5034r).f25907f0 = false;
                return;
            case 2:
                ((kx) this.f5034r).Q.f25907f0 = false;
                return;
            case 3:
                ((x51) this.f5034r).R.f34825w1 = false;
                return;
            case 4:
                ((j71) this.f5034r).f34825w1 = false;
                return;
            default:
                ((x51) this.f5034r).R.f34825w1 = false;
                return;
        }
    }
}
