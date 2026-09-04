package gi;

import org.telegram.ui.Components.yc;
import org.telegram.ui.co;
public final class p0 implements Runnable {
    public final int f10751a = 0;
    public final co f10752b;
    public final boolean f10753c;
    public final int d;

    public p0(int i10, co coVar, boolean z10) {
        this.d = i10;
        this.f10752b = coVar;
        this.f10753c = z10;
    }

    @Override
    public final void run() {
        switch (this.f10751a) {
            case 0:
                int i10 = this.d;
                co coVar = this.f10752b;
                if (i10 != 2) {
                    coVar.U9();
                    coVar.Yb();
                }
                u0.f(yc.a0(coVar), i10, this.f10753c);
                return;
            default:
                boolean z10 = this.f10753c;
                this.f10752b.yc(this.d, z10);
                return;
        }
    }

    public p0(co coVar, boolean z10, int i10) {
        this.f10752b = coVar;
        this.f10753c = z10;
        this.d = i10;
    }
}
