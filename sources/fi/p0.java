package fi;

import org.telegram.ui.Components.yc;
import org.telegram.ui.wn;
public final class p0 implements Runnable {
    public final int f9144a = 0;
    public final wn f9145b;
    public final boolean f9146c;
    public final int d;

    public p0(int i10, wn wnVar, boolean z10) {
        this.d = i10;
        this.f9145b = wnVar;
        this.f9146c = z10;
    }

    @Override
    public final void run() {
        switch (this.f9144a) {
            case 0:
                int i10 = this.d;
                wn wnVar = this.f9145b;
                if (i10 != 2) {
                    wnVar.U9();
                    wnVar.Yb();
                }
                u0.f(yc.a0(wnVar), i10, this.f9146c);
                return;
            default:
                boolean z10 = this.f9146c;
                this.f9145b.yc(this.d, z10);
                return;
        }
    }

    public p0(wn wnVar, boolean z10, int i10) {
        this.f9145b = wnVar;
        this.f9146c = z10;
        this.d = i10;
    }
}
