package gi;

import org.telegram.ui.Components.yc;
import org.telegram.ui.co;
public final class p0 implements Runnable {
    public final int f10779a = 0;
    public final co f10780b;
    public final boolean f10781c;
    public final int d;

    public p0(int i10, co coVar, boolean z10) {
        this.d = i10;
        this.f10780b = coVar;
        this.f10781c = z10;
    }

    @Override
    public final void run() {
        switch (this.f10779a) {
            case 0:
                int i10 = this.d;
                co coVar = this.f10780b;
                if (i10 != 2) {
                    coVar.U9();
                    coVar.Yb();
                }
                u0.f(yc.a0(coVar), i10, this.f10781c);
                return;
            default:
                boolean z10 = this.f10781c;
                this.f10780b.yc(this.d, z10);
                return;
        }
    }

    public p0(co coVar, boolean z10, int i10) {
        this.f10780b = coVar;
        this.f10781c = z10;
        this.d = i10;
    }
}
