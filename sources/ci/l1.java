package ci;

import android.content.Context;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.dy;
import org.telegram.ui.b61;
import org.telegram.ui.n71;
public final class l1 extends ji.o {
    public final int f5375q;
    public final Object f5376r;

    public l1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f5375q = i10;
        this.f5376r = obj;
    }

    @Override
    public void e() {
        switch (this.f5375q) {
            case 0:
                ((o1) this.f5376r).Z2 = true;
                return;
            case 1:
                ((d00) this.f5376r).f25090f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((n71) this.f5376r).f40305w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f5375q) {
            case 0:
                ((o1) this.f5376r).Z2 = false;
                return;
            case 1:
                ((d00) this.f5376r).f25090f0 = false;
                return;
            case 2:
                ((dy) this.f5376r).Q.f25090f0 = false;
                return;
            case 3:
                ((b61) this.f5376r).R.f40305w1 = false;
                return;
            case 4:
                ((n71) this.f5376r).f40305w1 = false;
                return;
            default:
                ((b61) this.f5376r).R.f40305w1 = false;
                return;
        }
    }
}
