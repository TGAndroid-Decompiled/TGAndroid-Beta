package ii;

import org.telegram.ui.Components.wc;
import org.telegram.ui.wn;
public final class n0 implements Runnable {
    public final int f14386a = 0;
    public final wn f14387b;
    public final boolean f14388c;
    public final int d;

    public n0(int i10, wn wnVar, boolean z10) {
        this.d = i10;
        this.f14387b = wnVar;
        this.f14388c = z10;
    }

    @Override
    public final void run() {
        switch (this.f14386a) {
            case 0:
                int i10 = this.d;
                wn wnVar = this.f14387b;
                if (i10 != 2) {
                    wnVar.ha();
                    wnVar.oc();
                }
                s0.f(wc.b0(wnVar), i10, this.f14388c);
                return;
            default:
                boolean z10 = this.f14388c;
                this.f14387b.Pc(this.d, z10);
                return;
        }
    }

    public n0(wn wnVar, boolean z10, int i10) {
        this.f14387b = wnVar;
        this.f14388c = z10;
        this.d = i10;
    }
}
