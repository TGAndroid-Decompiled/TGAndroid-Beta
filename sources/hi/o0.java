package hi;

import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;
public final class o0 implements Runnable {
    public final int f12202a = 0;
    public final sn f12203b;
    public final boolean f12204c;
    public final int d;

    public o0(int i10, sn snVar, boolean z10) {
        this.d = i10;
        this.f12203b = snVar;
        this.f12204c = z10;
    }

    @Override
    public final void run() {
        switch (this.f12202a) {
            case 0:
                int i10 = this.d;
                sn snVar = this.f12203b;
                if (i10 != 2) {
                    snVar.Z9();
                    snVar.cc();
                }
                t0.f(xc.a0(snVar), i10, this.f12204c);
                return;
            default:
                boolean z10 = this.f12204c;
                this.f12203b.Cc(this.d, z10);
                return;
        }
    }

    public o0(sn snVar, boolean z10, int i10) {
        this.f12203b = snVar;
        this.f12204c = z10;
        this.d = i10;
    }
}
