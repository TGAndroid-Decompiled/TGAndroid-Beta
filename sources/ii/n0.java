package ii;

import org.telegram.ui.Components.wc;
import org.telegram.ui.un;
public final class n0 implements Runnable {
    public final int f14387a = 0;
    public final un f14388b;
    public final boolean f14389c;
    public final int d;

    public n0(int i10, un unVar, boolean z10) {
        this.d = i10;
        this.f14388b = unVar;
        this.f14389c = z10;
    }

    @Override
    public final void run() {
        switch (this.f14387a) {
            case 0:
                int i10 = this.d;
                un unVar = this.f14388b;
                if (i10 != 2) {
                    unVar.ea();
                    unVar.kc();
                }
                s0.f(wc.b0(unVar), i10, this.f14389c);
                return;
            default:
                boolean z10 = this.f14389c;
                this.f14388b.Lc(this.d, z10);
                return;
        }
    }

    public n0(un unVar, boolean z10, int i10) {
        this.f14388b = unVar;
        this.f14389c = z10;
        this.d = i10;
    }
}
