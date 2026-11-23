package li;

import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;
public final class g0 implements Runnable {
    public final int f19966a = 0;
    public final bn f19967b;
    public final boolean f19968c;
    public final int d;

    public g0(int i7, bn bnVar, boolean z10) {
        this.d = i7;
        this.f19967b = bnVar;
        this.f19968c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19966a) {
            case 0:
                int i7 = this.d;
                bn bnVar = this.f19967b;
                if (i7 != 2) {
                    bnVar.xa();
                    bnVar.Fc();
                }
                l0.f(lc.b0(bnVar), i7, this.f19968c);
                return;
            default:
                boolean z10 = this.f19968c;
                this.f19967b.gd(this.d, z10);
                return;
        }
    }

    public g0(bn bnVar, boolean z10, int i7) {
        this.f19967b = bnVar;
        this.f19968c = z10;
        this.d = i7;
    }
}
