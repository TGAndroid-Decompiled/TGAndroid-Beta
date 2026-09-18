package ci;

import android.content.Context;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.kz;
import org.telegram.ui.g71;
import org.telegram.ui.u51;
public final class m1 extends ji.o {
    public final int f5032q;
    public final Object f5033r;

    public m1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f5032q = i10;
        this.f5033r = obj;
    }

    @Override
    public void e() {
        switch (this.f5032q) {
            case 0:
                ((p1) this.f5033r).f5295b3 = true;
                return;
            case 1:
                ((kz) this.f5033r).f25901f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((g71) this.f5033r).f33761w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f5032q) {
            case 0:
                ((p1) this.f5033r).f5295b3 = false;
                return;
            case 1:
                ((kz) this.f5033r).f25901f0 = false;
                return;
            case 2:
                ((kx) this.f5033r).Q.f25901f0 = false;
                return;
            case 3:
                ((u51) this.f5033r).R.f33761w1 = false;
                return;
            case 4:
                ((g71) this.f5033r).f33761w1 = false;
                return;
            default:
                ((u51) this.f5033r).R.f33761w1 = false;
                return;
        }
    }
}
