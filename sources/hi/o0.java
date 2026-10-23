package hi;

import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;
public final class o0 implements Runnable {
    public final int f12232a = 0;
    public final sn f12233b;
    public final boolean f12234c;
    public final int d;

    public o0(int i10, sn snVar, boolean z10) {
        this.d = i10;
        this.f12233b = snVar;
        this.f12234c = z10;
    }

    @Override
    public final void run() {
        switch (this.f12232a) {
            case 0:
                int i10 = this.d;
                sn snVar = this.f12233b;
                if (i10 != 2) {
                    snVar.Z9();
                    snVar.ec();
                }
                t0.f(xc.a0(snVar), i10, this.f12234c);
                return;
            default:
                boolean z10 = this.f12234c;
                this.f12233b.Fc(this.d, z10);
                return;
        }
    }

    public o0(sn snVar, boolean z10, int i10) {
        this.f12233b = snVar;
        this.f12234c = z10;
        this.d = i10;
    }
}
