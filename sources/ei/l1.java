package ei;

import android.content.Context;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.tz;
import org.telegram.ui.l41;
import org.telegram.ui.x51;
public final class l1 extends li.n {
    public final int f9358q;
    public final Object f9359r;

    public l1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f9358q = i10;
        this.f9359r = obj;
    }

    @Override
    public void e() {
        switch (this.f9358q) {
            case 0:
                ((o1) this.f9359r).Z2 = true;
                return;
            case 1:
                ((tz) this.f9359r).f30777f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((x51) this.f9359r).f43088w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f9358q) {
            case 0:
                ((o1) this.f9359r).Z2 = false;
                return;
            case 1:
                ((tz) this.f9359r).f30777f0 = false;
                return;
            case 2:
                ((rx) this.f9359r).Q.f30777f0 = false;
                return;
            case 3:
                ((l41) this.f9359r).R.f43088w1 = false;
                return;
            case 4:
                ((x51) this.f9359r).f43088w1 = false;
                return;
            default:
                ((l41) this.f9359r).R.f43088w1 = false;
                return;
        }
    }
}
