package li;

import org.telegram.ui.Components.kc;
import org.telegram.ui.bn;
public final class f0 implements Runnable {
    public final int f20029a = 0;
    public final bn f20030b;
    public final boolean f20031c;
    public final int d;

    public f0(int i7, bn bnVar, boolean z10) {
        this.d = i7;
        this.f20030b = bnVar;
        this.f20031c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20029a) {
            case 0:
                int i7 = this.d;
                bn bnVar = this.f20030b;
                if (i7 != 2) {
                    bnVar.xa();
                    bnVar.Fc();
                }
                k0.f(kc.b0(bnVar), i7, this.f20031c);
                return;
            default:
                boolean z10 = this.f20031c;
                this.f20030b.gd(this.d, z10);
                return;
        }
    }

    public f0(bn bnVar, boolean z10, int i7) {
        this.f20030b = bnVar;
        this.f20031c = z10;
        this.d = i7;
    }
}
