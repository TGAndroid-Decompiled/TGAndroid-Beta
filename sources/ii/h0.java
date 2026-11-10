package ii;

import org.telegram.ui.Components.gc;
import org.telegram.ui.cn;
public final class h0 implements Runnable {
    public final int f15543a = 0;
    public final cn f15544b;
    public final boolean f15545c;
    public final int d;

    public h0(int i7, cn cnVar, boolean z9) {
        this.d = i7;
        this.f15544b = cnVar;
        this.f15545c = z9;
    }

    @Override
    public final void run() {
        switch (this.f15543a) {
            case 0:
                int i7 = this.d;
                cn cnVar = this.f15544b;
                if (i7 != 2) {
                    cnVar.wa();
                    cnVar.Ec();
                }
                m0.f(gc.a0(cnVar), i7, this.f15545c);
                return;
            default:
                boolean z9 = this.f15545c;
                this.f15544b.fd(this.d, z9);
                return;
        }
    }

    public h0(cn cnVar, boolean z9, int i7) {
        this.f15544b = cnVar;
        this.f15545c = z9;
        this.d = i7;
    }
}
