package ei;

import android.content.Context;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.tz;
import org.telegram.ui.n41;
import org.telegram.ui.z51;
public final class l1 extends li.n {
    public final int f9360q;
    public final Object f9361r;

    public l1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f9360q = i10;
        this.f9361r = obj;
    }

    @Override
    public void e() {
        switch (this.f9360q) {
            case 0:
                ((o1) this.f9361r).Z2 = true;
                return;
            case 1:
                ((tz) this.f9361r).f30756f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((z51) this.f9361r).f43629w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f9360q) {
            case 0:
                ((o1) this.f9361r).Z2 = false;
                return;
            case 1:
                ((tz) this.f9361r).f30756f0 = false;
                return;
            case 2:
                ((rx) this.f9361r).Q.f30756f0 = false;
                return;
            case 3:
                ((n41) this.f9361r).R.f43629w1 = false;
                return;
            case 4:
                ((z51) this.f9361r).f43629w1 = false;
                return;
            default:
                ((n41) this.f9361r).R.f43629w1 = false;
                return;
        }
    }
}
