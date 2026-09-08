package di;

import android.content.Context;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lx;
import org.telegram.ui.j71;
import org.telegram.ui.x51;
public final class m1 extends ki.p {
    public final int f7659q;
    public final Object f7660r;

    public m1(Object obj, Context context, int i10) {
        super(context, 2);
        this.f7659q = i10;
        this.f7660r = obj;
    }

    @Override
    public void e() {
        switch (this.f7659q) {
            case 0:
                ((p1) this.f7660r).f7842b3 = true;
                return;
            case 1:
                ((kz) this.f7660r).f27969f0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((j71) this.f7660r).f37706w1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f7659q) {
            case 0:
                ((p1) this.f7660r).f7842b3 = false;
                return;
            case 1:
                ((kz) this.f7660r).f27969f0 = false;
                return;
            case 2:
                ((lx) this.f7660r).Q.f27969f0 = false;
                return;
            case 3:
                ((x51) this.f7660r).R.f37706w1 = false;
                return;
            case 4:
                ((j71) this.f7660r).f37706w1 = false;
                return;
            default:
                ((x51) this.f7660r).R.f37706w1 = false;
                return;
        }
    }
}
