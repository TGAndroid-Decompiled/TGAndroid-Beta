package ci;

import android.content.Context;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.b00;
import org.telegram.ui.j71;
import org.telegram.ui.x51;
public final class l1 extends ji.o {
    public final int f5376q;
    public final Object f5377r;

    public l1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f5376q = i10;
        this.f5377r = obj;
    }

    @Override
    public void e() {
        switch (this.f5376q) {
            case 0:
                ((o1) this.f5377r).Z2 = true;
                return;
            case 1:
                ((b00) this.f5377r).f24741f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((j71) this.f5377r).f38961w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f5376q) {
            case 0:
                ((o1) this.f5377r).Z2 = false;
                return;
            case 1:
                ((b00) this.f5377r).f24741f0 = false;
                return;
            case 2:
                ((ay) this.f5377r).Q.f24741f0 = false;
                return;
            case 3:
                ((x51) this.f5377r).R.f38961w1 = false;
                return;
            case 4:
                ((j71) this.f5377r).f38961w1 = false;
                return;
            default:
                ((x51) this.f5377r).R.f38961w1 = false;
                return;
        }
    }
}
