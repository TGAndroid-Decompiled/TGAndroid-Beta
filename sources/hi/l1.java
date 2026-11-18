package hi;

import android.content.Context;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sw;
import org.telegram.ui.g01;
import org.telegram.ui.r11;
public final class l1 extends pi.l {
    public final int f14885q;
    public final Object f14886r;

    public l1(int i7, Context context, Object obj) {
        super(context, 2);
        this.f14885q = i7;
        this.f14886r = obj;
    }

    @Override
    public void e() {
        switch (this.f14885q) {
            case 0:
                ((o1) this.f14886r).j3 = true;
                return;
            case 1:
                ((ry) this.f14886r).f39354g0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((r11) this.f14886r).f51434y1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f14885q) {
            case 0:
                ((o1) this.f14886r).j3 = false;
                return;
            case 1:
                ((ry) this.f14886r).f39354g0 = false;
                return;
            case 2:
                ((sw) this.f14886r).Q.f39354g0 = false;
                return;
            case 3:
                ((g01) this.f14886r).R.f51434y1 = false;
                return;
            case 4:
                ((r11) this.f14886r).f51434y1 = false;
                return;
            default:
                ((g01) this.f14886r).R.f51434y1 = false;
                return;
        }
    }
}
