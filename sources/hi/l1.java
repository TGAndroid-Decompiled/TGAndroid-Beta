package hi;

import android.content.Context;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.mw;
import org.telegram.ui.c01;
import org.telegram.ui.n11;
public final class l1 extends pi.l {
    public final int f14545q;
    public final Object f14546r;

    public l1(int i7, Context context, Object obj) {
        super(context, 2);
        this.f14545q = i7;
        this.f14546r = obj;
    }

    @Override
    public void e() {
        switch (this.f14545q) {
            case 0:
                ((o1) this.f14546r).j3 = true;
                return;
            case 1:
                ((ly) this.f14546r).f36950g0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((n11) this.f14546r).f49421y1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f14545q) {
            case 0:
                ((o1) this.f14546r).j3 = false;
                return;
            case 1:
                ((ly) this.f14546r).f36950g0 = false;
                return;
            case 2:
                ((mw) this.f14546r).Q.f36950g0 = false;
                return;
            case 3:
                ((c01) this.f14546r).R.f49421y1 = false;
                return;
            case 4:
                ((n11) this.f14546r).f49421y1 = false;
                return;
            default:
                ((c01) this.f14546r).R.f49421y1 = false;
                return;
        }
    }
}
