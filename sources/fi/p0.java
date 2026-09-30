package fi;

import org.telegram.ui.Components.yc;
import org.telegram.ui.wn;
public final class p0 implements Runnable {
    public final int f9156a = 0;
    public final wn f9157b;
    public final boolean f9158c;
    public final int d;

    public p0(int i10, wn wnVar, boolean z10) {
        this.d = i10;
        this.f9157b = wnVar;
        this.f9158c = z10;
    }

    @Override
    public final void run() {
        switch (this.f9156a) {
            case 0:
                int i10 = this.d;
                wn wnVar = this.f9157b;
                if (i10 != 2) {
                    wnVar.U9();
                    wnVar.Yb();
                }
                u0.f(yc.a0(wnVar), i10, this.f9158c);
                return;
            default:
                boolean z10 = this.f9158c;
                this.f9157b.yc(this.d, z10);
                return;
        }
    }

    public p0(wn wnVar, boolean z10, int i10) {
        this.f9157b = wnVar;
        this.f9158c = z10;
        this.d = i10;
    }
}
