package li;

import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;
public final class g0 implements Runnable {
    public final int f19963a = 0;
    public final bn f19964b;
    public final boolean f19965c;
    public final int d;

    public g0(int i7, bn bnVar, boolean z10) {
        this.d = i7;
        this.f19964b = bnVar;
        this.f19965c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19963a) {
            case 0:
                int i7 = this.d;
                bn bnVar = this.f19964b;
                if (i7 != 2) {
                    bnVar.xa();
                    bnVar.Fc();
                }
                l0.f(lc.b0(bnVar), i7, this.f19965c);
                return;
            default:
                boolean z10 = this.f19965c;
                this.f19964b.gd(this.d, z10);
                return;
        }
    }

    public g0(bn bnVar, boolean z10, int i7) {
        this.f19964b = bnVar;
        this.f19965c = z10;
        this.d = i7;
    }
}
