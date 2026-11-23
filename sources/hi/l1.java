package hi;

import android.content.Context;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.uw;
import org.telegram.ui.h01;
import org.telegram.ui.s11;
public final class l1 extends pi.l {
    public final int f14963q;
    public final Object f14964r;

    public l1(int i7, Context context, Object obj) {
        super(context, 2);
        this.f14963q = i7;
        this.f14964r = obj;
    }

    @Override
    public void e() {
        switch (this.f14963q) {
            case 0:
                ((o1) this.f14964r).j3 = true;
                return;
            case 1:
                ((ty) this.f14964r).f40101g0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((s11) this.f14964r).f51880y1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f14963q) {
            case 0:
                ((o1) this.f14964r).j3 = false;
                return;
            case 1:
                ((ty) this.f14964r).f40101g0 = false;
                return;
            case 2:
                ((uw) this.f14964r).Q.f40101g0 = false;
                return;
            case 3:
                ((h01) this.f14964r).R.f51880y1 = false;
                return;
            case 4:
                ((s11) this.f14964r).f51880y1 = false;
                return;
            default:
                ((h01) this.f14964r).R.f51880y1 = false;
                return;
        }
    }
}
