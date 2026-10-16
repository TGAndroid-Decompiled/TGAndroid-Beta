package di;

import android.content.Context;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.wz;
import org.telegram.ui.f61;
import org.telegram.ui.r71;
public final class l1 extends ki.o {
    public final int f7344q;
    public final Object f7345r;

    public l1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f7344q = i10;
        this.f7345r = obj;
    }

    @Override
    public void e() {
        switch (this.f7344q) {
            case 0:
                ((o1) this.f7345r).Z2 = true;
                return;
            case 1:
                ((wz) this.f7345r).f30716f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((r71) this.f7345r).f39363w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f7344q) {
            case 0:
                ((o1) this.f7345r).Z2 = false;
                return;
            case 1:
                ((wz) this.f7345r).f30716f0 = false;
                return;
            case 2:
                ((vx) this.f7345r).Q.f30716f0 = false;
                return;
            case 3:
                ((f61) this.f7345r).R.f39363w1 = false;
                return;
            case 4:
                ((r71) this.f7345r).f39363w1 = false;
                return;
            default:
                ((f61) this.f7345r).R.f39363w1 = false;
                return;
        }
    }
}
