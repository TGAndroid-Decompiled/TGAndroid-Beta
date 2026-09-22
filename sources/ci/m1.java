package ci;

import android.content.Context;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.kz;
import org.telegram.ui.j71;
import org.telegram.ui.x51;
public final class m1 extends ji.o {
    public final int f5031q;
    public final Object f5032r;

    public m1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f5031q = i10;
        this.f5032r = obj;
    }

    @Override
    public void e() {
        switch (this.f5031q) {
            case 0:
                ((p1) this.f5032r).f5294b3 = true;
                return;
            case 1:
                ((kz) this.f5032r).f25867f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((j71) this.f5032r).f34850w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f5031q) {
            case 0:
                ((p1) this.f5032r).f5294b3 = false;
                return;
            case 1:
                ((kz) this.f5032r).f25867f0 = false;
                return;
            case 2:
                ((kx) this.f5032r).Q.f25867f0 = false;
                return;
            case 3:
                ((x51) this.f5032r).R.f34850w1 = false;
                return;
            case 4:
                ((j71) this.f5032r).f34850w1 = false;
                return;
            default:
                ((x51) this.f5032r).R.f34850w1 = false;
                return;
        }
    }
}
