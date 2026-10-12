package di;

import android.content.Context;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.wz;
import org.telegram.ui.f61;
import org.telegram.ui.r71;
public final class l1 extends ki.o {
    public final int f7341q;
    public final Object f7342r;

    public l1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f7341q = i10;
        this.f7342r = obj;
    }

    @Override
    public void e() {
        switch (this.f7341q) {
            case 0:
                ((o1) this.f7342r).Z2 = true;
                return;
            case 1:
                ((wz) this.f7342r).f31023f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((r71) this.f7342r).f39670w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f7341q) {
            case 0:
                ((o1) this.f7342r).Z2 = false;
                return;
            case 1:
                ((wz) this.f7342r).f31023f0 = false;
                return;
            case 2:
                ((vx) this.f7342r).Q.f31023f0 = false;
                return;
            case 3:
                ((f61) this.f7342r).R.f39670w1 = false;
                return;
            case 4:
                ((r71) this.f7342r).f39670w1 = false;
                return;
            default:
                ((f61) this.f7342r).R.f39670w1 = false;
                return;
        }
    }
}
