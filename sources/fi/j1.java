package fi;

import android.content.Context;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.gy;
import org.telegram.ui.i01;
import org.telegram.ui.t11;
public final class j1 extends mi.m {
    public final int f12212q;
    public final Object f12213r;

    public j1(int i7, Context context, Object obj) {
        super(context, 2);
        this.f12212q = i7;
        this.f12213r = obj;
    }

    @Override
    public void e() {
        switch (this.f12212q) {
            case 0:
                ((m1) this.f12213r).f12409i3 = true;
                return;
            case 1:
                ((gy) this.f12213r).f34025f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((t11) this.f12213r).f50071x1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f12212q) {
            case 0:
                ((m1) this.f12213r).f12409i3 = false;
                return;
            case 1:
                ((gy) this.f12213r).f34025f0 = false;
                return;
            case 2:
                ((gw) this.f12213r).Q.f34025f0 = false;
                return;
            case 3:
                ((i01) this.f12213r).R.f50071x1 = false;
                return;
            case 4:
                ((t11) this.f12213r).f50071x1 = false;
                return;
            default:
                ((i01) this.f12213r).R.f50071x1 = false;
                return;
        }
    }
}
