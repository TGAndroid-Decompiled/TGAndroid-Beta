package fi;

import org.telegram.ui.Components.xc;
import org.telegram.ui.zn;
public final class p0 implements Runnable {
    public final int f9161a = 0;
    public final zn f9162b;
    public final boolean f9163c;
    public final int d;

    public p0(int i10, zn znVar, boolean z10) {
        this.d = i10;
        this.f9162b = znVar;
        this.f9163c = z10;
    }

    @Override
    public final void run() {
        switch (this.f9161a) {
            case 0:
                int i10 = this.d;
                zn znVar = this.f9162b;
                if (i10 != 2) {
                    znVar.U9();
                    znVar.Yb();
                }
                u0.f(xc.a0(znVar), i10, this.f9163c);
                return;
            default:
                boolean z10 = this.f9163c;
                this.f9162b.yc(this.d, z10);
                return;
        }
    }

    public p0(zn znVar, boolean z10, int i10) {
        this.f9162b = znVar;
        this.f9163c = z10;
        this.d = i10;
    }
}
