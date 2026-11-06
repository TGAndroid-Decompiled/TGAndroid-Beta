package fi;

import android.content.Context;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.gy;
import org.telegram.ui.f01;
import org.telegram.ui.q11;
public final class j1 extends mi.m {
    public final int f12208q;
    public final Object f12209r;

    public j1(int i7, Context context, Object obj) {
        super(context, 2);
        this.f12208q = i7;
        this.f12209r = obj;
    }

    @Override
    public void e() {
        switch (this.f12208q) {
            case 0:
                ((m1) this.f12209r).f12407i3 = true;
                return;
            case 1:
                ((gy) this.f12209r).f34033f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((q11) this.f12209r).f49070x1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f12208q) {
            case 0:
                ((m1) this.f12209r).f12407i3 = false;
                return;
            case 1:
                ((gy) this.f12209r).f34033f0 = false;
                return;
            case 2:
                ((gw) this.f12209r).Q.f34033f0 = false;
                return;
            case 3:
                ((f01) this.f12209r).R.f49070x1 = false;
                return;
            case 4:
                ((q11) this.f12209r).f49070x1 = false;
                return;
            default:
                ((f01) this.f12209r).R.f49070x1 = false;
                return;
        }
    }
}
