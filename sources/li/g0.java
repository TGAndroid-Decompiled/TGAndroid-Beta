package li;

import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;
public final class g0 implements Runnable {
    public final int f19938a = 0;
    public final bn f19939b;
    public final boolean f19940c;
    public final int d;

    public g0(int i7, bn bnVar, boolean z10) {
        this.d = i7;
        this.f19939b = bnVar;
        this.f19940c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19938a) {
            case 0:
                int i7 = this.d;
                bn bnVar = this.f19939b;
                if (i7 != 2) {
                    bnVar.xa();
                    bnVar.Fc();
                }
                l0.f(lc.b0(bnVar), i7, this.f19940c);
                return;
            default:
                boolean z10 = this.f19940c;
                this.f19939b.gd(this.d, z10);
                return;
        }
    }

    public g0(bn bnVar, boolean z10, int i7) {
        this.f19939b = bnVar;
        this.f19940c = z10;
        this.d = i7;
    }
}
