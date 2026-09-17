package ci;

import android.content.Context;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.kz;
import org.telegram.ui.i71;
import org.telegram.ui.w51;
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
                ((kz) this.f5033r).f25722f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((i71) this.f5033r).f34494w1 = true;
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
                ((kz) this.f5033r).f25722f0 = false;
                return;
            case 2:
                ((jx) this.f5033r).Q.f25722f0 = false;
                return;
            case 3:
                ((w51) this.f5033r).R.f34494w1 = false;
                return;
            case 4:
                ((i71) this.f5033r).f34494w1 = false;
                return;
            default:
                ((w51) this.f5033r).R.f34494w1 = false;
                return;
        }
    }
}
