package hi;

import org.telegram.ui.Components.xc;
import org.telegram.ui.qn;
public final class o0 implements Runnable {
    public final int f12203a = 0;
    public final qn f12204b;
    public final boolean f12205c;
    public final int d;

    public o0(int i10, qn qnVar, boolean z10) {
        this.d = i10;
        this.f12204b = qnVar;
        this.f12205c = z10;
    }

    @Override
    public final void run() {
        switch (this.f12203a) {
            case 0:
                int i10 = this.d;
                qn qnVar = this.f12204b;
                if (i10 != 2) {
                    qnVar.Z9();
                    qnVar.cc();
                }
                t0.f(xc.a0(qnVar), i10, this.f12205c);
                return;
            default:
                boolean z10 = this.f12205c;
                this.f12204b.Cc(this.d, z10);
                return;
        }
    }

    public o0(qn qnVar, boolean z10, int i10) {
        this.f12204b = qnVar;
        this.f12205c = z10;
        this.d = i10;
    }
}
