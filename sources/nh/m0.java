package nh;

import org.telegram.ui.Components.oc;
import org.telegram.ui.qn;
public final class m0 implements Runnable {
    public final int f18678a = 0;
    public final qn f18679b;
    public final boolean f18680c;
    public final int d;

    public m0(int i9, qn qnVar, boolean z10) {
        this.d = i9;
        this.f18679b = qnVar;
        this.f18680c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18678a) {
            case 0:
                int i9 = this.d;
                qn qnVar = this.f18679b;
                if (i9 != 2) {
                    qnVar.U9();
                    qnVar.Yb();
                }
                r0.f(oc.a0(qnVar), i9, this.f18680c);
                return;
            default:
                boolean z10 = this.f18680c;
                this.f18679b.yc(this.d, z10);
                return;
        }
    }

    public m0(qn qnVar, boolean z10, int i9) {
        this.f18679b = qnVar;
        this.f18680c = z10;
        this.d = i9;
    }
}
