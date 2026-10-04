package fi;

import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;
public final class p0 implements Runnable {
    public final int f9956a = 0;
    public final yn f9957b;
    public final boolean f9958c;
    public final int d;

    public p0(int i10, yn ynVar, boolean z10) {
        this.d = i10;
        this.f9957b = ynVar;
        this.f9958c = z10;
    }

    @Override
    public final void run() {
        switch (this.f9956a) {
            case 0:
                int i10 = this.d;
                yn ynVar = this.f9957b;
                if (i10 != 2) {
                    ynVar.T9();
                    ynVar.Xb();
                }
                u0.f(yc.a0(ynVar), i10, this.f9958c);
                return;
            default:
                boolean z10 = this.f9958c;
                this.f9957b.xc(this.d, z10);
                return;
        }
    }

    public p0(yn ynVar, boolean z10, int i10) {
        this.f9957b = ynVar;
        this.f9958c = z10;
        this.d = i10;
    }
}
