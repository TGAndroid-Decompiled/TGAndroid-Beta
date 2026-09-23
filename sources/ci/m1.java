package ci;

import android.content.Context;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.lz;
import org.telegram.ui.n51;
import org.telegram.ui.z61;
public final class m1 extends ji.o {
    public final int f5158q;
    public final Object f5159r;

    public m1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f5158q = i10;
        this.f5159r = obj;
    }

    @Override
    public void e() {
        switch (this.f5158q) {
            case 0:
                ((p1) this.f5159r).f5277b3 = true;
                return;
            case 1:
                ((lz) this.f5159r).f25977f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((z61) this.f5159r).f40054w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f5158q) {
            case 0:
                ((p1) this.f5159r).f5277b3 = false;
                return;
            case 1:
                ((lz) this.f5159r).f25977f0 = false;
                return;
            case 2:
                ((kx) this.f5159r).Q.f25977f0 = false;
                return;
            case 3:
                ((n51) this.f5159r).R.f40054w1 = false;
                return;
            case 4:
                ((z61) this.f5159r).f40054w1 = false;
                return;
            default:
                ((n51) this.f5159r).R.f40054w1 = false;
                return;
        }
    }
}
