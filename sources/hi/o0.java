package hi;

import org.telegram.ui.Components.xc;
import org.telegram.ui.qn;
public final class o0 implements Runnable {
    public final int f12201a = 0;
    public final qn f12202b;
    public final boolean f12203c;
    public final int d;

    public o0(int i10, qn qnVar, boolean z10) {
        this.d = i10;
        this.f12202b = qnVar;
        this.f12203c = z10;
    }

    @Override
    public final void run() {
        switch (this.f12201a) {
            case 0:
                int i10 = this.d;
                qn qnVar = this.f12202b;
                if (i10 != 2) {
                    qnVar.Z9();
                    qnVar.cc();
                }
                t0.f(xc.a0(qnVar), i10, this.f12203c);
                return;
            default:
                boolean z10 = this.f12203c;
                this.f12202b.Cc(this.d, z10);
                return;
        }
    }

    public o0(qn qnVar, boolean z10, int i10) {
        this.f12202b = qnVar;
        this.f12203c = z10;
        this.d = i10;
    }
}
