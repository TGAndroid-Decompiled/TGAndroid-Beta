package ei;

import org.telegram.ui.Components.wc;
import org.telegram.ui.eo;
public final class p0 implements Runnable {
    public final int f7606a = 0;
    public final eo f7607b;
    public final boolean f7608c;
    public final int d;

    public p0(int i10, eo eoVar, boolean z10) {
        this.d = i10;
        this.f7607b = eoVar;
        this.f7608c = z10;
    }

    @Override
    public final void run() {
        switch (this.f7606a) {
            case 0:
                int i10 = this.d;
                eo eoVar = this.f7607b;
                if (i10 != 2) {
                    eoVar.U9();
                    eoVar.Yb();
                }
                u0.f(wc.a0(eoVar), i10, this.f7608c);
                return;
            default:
                boolean z10 = this.f7608c;
                this.f7607b.yc(this.d, z10);
                return;
        }
    }

    public p0(eo eoVar, boolean z10, int i10) {
        this.f7607b = eoVar;
        this.f7608c = z10;
        this.d = i10;
    }
}
