package fi;

import org.telegram.ui.Components.xc;
import org.telegram.ui.xn;
public final class p0 implements Runnable {
    public final int f9145a = 0;
    public final xn f9146b;
    public final boolean f9147c;
    public final int d;

    public p0(int i10, xn xnVar, boolean z10) {
        this.d = i10;
        this.f9146b = xnVar;
        this.f9147c = z10;
    }

    @Override
    public final void run() {
        switch (this.f9145a) {
            case 0:
                int i10 = this.d;
                xn xnVar = this.f9146b;
                if (i10 != 2) {
                    xnVar.U9();
                    xnVar.Yb();
                }
                u0.f(xc.a0(xnVar), i10, this.f9147c);
                return;
            default:
                boolean z10 = this.f9147c;
                this.f9146b.yc(this.d, z10);
                return;
        }
    }

    public p0(xn xnVar, boolean z10, int i10) {
        this.f9146b = xnVar;
        this.f9147c = z10;
        this.d = i10;
    }
}
