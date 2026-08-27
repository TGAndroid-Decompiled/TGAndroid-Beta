package oh;

import org.telegram.ui.Components.mc;
import org.telegram.ui.rn;

public final class m0 implements Runnable {

    public final int f19527a = 0;

    public final rn f19528b;

    public final boolean f19529c;
    public final int d;

    public m0(int i10, rn rnVar, boolean z10) {
        this.d = i10;
        this.f19528b = rnVar;
        this.f19529c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19527a) {
            case 0:
                int i10 = this.d;
                rn rnVar = this.f19528b;
                if (i10 != 2) {
                    rnVar.U9();
                    rnVar.Yb();
                }
                r0.f(mc.a0(rnVar), i10, this.f19529c);
                break;
            default:
                boolean z10 = this.f19529c;
                this.f19528b.yc(this.d, z10);
                break;
        }
    }

    public m0(rn rnVar, boolean z10, int i10) {
        this.f19528b = rnVar;
        this.f19529c = z10;
        this.d = i10;
    }
}
