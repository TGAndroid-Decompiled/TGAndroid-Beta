package fi;

import android.content.Context;
import org.telegram.ui.Components.hw;
import org.telegram.ui.Components.hy;
import org.telegram.ui.h01;
import org.telegram.ui.s11;
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
                ((m1) this.f12209r).f12408i3 = true;
                return;
            case 1:
                ((hy) this.f12209r).f34424f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((s11) this.f12209r).f49715x1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f12208q) {
            case 0:
                ((m1) this.f12209r).f12408i3 = false;
                return;
            case 1:
                ((hy) this.f12209r).f34424f0 = false;
                return;
            case 2:
                ((hw) this.f12209r).Q.f34424f0 = false;
                return;
            case 3:
                ((h01) this.f12209r).R.f49715x1 = false;
                return;
            case 4:
                ((s11) this.f12209r).f49715x1 = false;
                return;
            default:
                ((h01) this.f12209r).R.f49715x1 = false;
                return;
        }
    }
}
