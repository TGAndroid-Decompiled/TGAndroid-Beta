package ci;

import android.content.Context;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.zx;
import org.telegram.ui.k71;
import org.telegram.ui.y51;
public final class l1 extends ji.o {
    public final int f5377q;
    public final Object f5378r;

    public l1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f5377q = i10;
        this.f5378r = obj;
    }

    @Override
    public void e() {
        switch (this.f5377q) {
            case 0:
                ((o1) this.f5378r).Z2 = true;
                return;
            case 1:
                ((a00) this.f5378r).f24411f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((k71) this.f5378r).f39165w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f5377q) {
            case 0:
                ((o1) this.f5378r).Z2 = false;
                return;
            case 1:
                ((a00) this.f5378r).f24411f0 = false;
                return;
            case 2:
                ((zx) this.f5378r).Q.f24411f0 = false;
                return;
            case 3:
                ((y51) this.f5378r).R.f39165w1 = false;
                return;
            case 4:
                ((k71) this.f5378r).f39165w1 = false;
                return;
            default:
                ((y51) this.f5378r).R.f39165w1 = false;
                return;
        }
    }
}
