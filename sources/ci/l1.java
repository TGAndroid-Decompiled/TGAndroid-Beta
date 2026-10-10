package ci;

import android.content.Context;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.b00;
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
                ((b00) this.f5378r).f24699f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((k71) this.f5378r).f39209w1 = true;
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
                ((b00) this.f5378r).f24699f0 = false;
                return;
            case 2:
                ((ay) this.f5378r).Q.f24699f0 = false;
                return;
            case 3:
                ((y51) this.f5378r).R.f39209w1 = false;
                return;
            case 4:
                ((k71) this.f5378r).f39209w1 = false;
                return;
            default:
                ((y51) this.f5378r).R.f39209w1 = false;
                return;
        }
    }
}
