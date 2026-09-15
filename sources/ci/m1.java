package ci;

import android.content.Context;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.kz;
import org.telegram.ui.g71;
import org.telegram.ui.u51;
public final class m1 extends ji.o {
    public final int f5027q;
    public final Object f5028r;

    public m1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f5027q = i10;
        this.f5028r = obj;
    }

    @Override
    public void e() {
        switch (this.f5027q) {
            case 0:
                ((p1) this.f5028r).f5290b3 = true;
                return;
            case 1:
                ((kz) this.f5028r).f25712f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((g71) this.f5028r).f33829w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f5027q) {
            case 0:
                ((p1) this.f5028r).f5290b3 = false;
                return;
            case 1:
                ((kz) this.f5028r).f25712f0 = false;
                return;
            case 2:
                ((jx) this.f5028r).Q.f25712f0 = false;
                return;
            case 3:
                ((u51) this.f5028r).R.f33829w1 = false;
                return;
            case 4:
                ((g71) this.f5028r).f33829w1 = false;
                return;
            default:
                ((u51) this.f5028r).R.f33829w1 = false;
                return;
        }
    }
}
