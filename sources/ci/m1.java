package ci;

import android.content.Context;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.mz;
import org.telegram.ui.c71;
import org.telegram.ui.q51;
public final class m1 extends ji.o {
    public final int f5159q;
    public final Object f5160r;

    public m1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f5159q = i10;
        this.f5160r = obj;
    }

    @Override
    public void e() {
        switch (this.f5159q) {
            case 0:
                ((p1) this.f5160r).f5276b3 = true;
                return;
            case 1:
                ((mz) this.f5160r).f26583f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((c71) this.f5160r).f32618w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f5159q) {
            case 0:
                ((p1) this.f5160r).f5276b3 = false;
                return;
            case 1:
                ((mz) this.f5160r).f26583f0 = false;
                return;
            case 2:
                ((lx) this.f5160r).Q.f26583f0 = false;
                return;
            case 3:
                ((q51) this.f5160r).R.f32618w1 = false;
                return;
            case 4:
                ((c71) this.f5160r).f32618w1 = false;
                return;
            default:
                ((q51) this.f5160r).R.f32618w1 = false;
                return;
        }
    }
}
