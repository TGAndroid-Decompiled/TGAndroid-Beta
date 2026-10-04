package fi;

import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;
public final class p0 implements Runnable {
    public final int f9957a = 0;
    public final yn f9958b;
    public final boolean f9959c;
    public final int d;

    public p0(int i10, yn ynVar, boolean z10) {
        this.d = i10;
        this.f9958b = ynVar;
        this.f9959c = z10;
    }

    @Override
    public final void run() {
        switch (this.f9957a) {
            case 0:
                int i10 = this.d;
                yn ynVar = this.f9958b;
                if (i10 != 2) {
                    ynVar.T9();
                    ynVar.Xb();
                }
                u0.f(yc.a0(ynVar), i10, this.f9959c);
                return;
            default:
                boolean z10 = this.f9959c;
                this.f9958b.xc(this.d, z10);
                return;
        }
    }

    public p0(yn ynVar, boolean z10, int i10) {
        this.f9958b = ynVar;
        this.f9959c = z10;
        this.d = i10;
    }
}
