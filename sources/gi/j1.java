package gi;

import android.content.Context;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.fw;
import org.telegram.ui.g11;
import org.telegram.ui.vz0;
public final class j1 extends ni.m {
    public final int f12999q;
    public final Object f13000r;

    public j1(int i3, Context context, Object obj) {
        super(context, 2);
        this.f12999q = i3;
        this.f13000r = obj;
    }

    @Override
    public void e() {
        switch (this.f12999q) {
            case 0:
                ((m1) this.f13000r).f13185j3 = true;
                return;
            case 1:
                ((ey) this.f13000r).f33539g0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((g11) this.f13000r).f45492y1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f12999q) {
            case 0:
                ((m1) this.f13000r).f13185j3 = false;
                return;
            case 1:
                ((ey) this.f13000r).f33539g0 = false;
                return;
            case 2:
                ((fw) this.f13000r).Q.f33539g0 = false;
                return;
            case 3:
                ((vz0) this.f13000r).R.f45492y1 = false;
                return;
            case 4:
                ((g11) this.f13000r).f45492y1 = false;
                return;
            default:
                ((vz0) this.f13000r).R.f45492y1 = false;
                return;
        }
    }
}
