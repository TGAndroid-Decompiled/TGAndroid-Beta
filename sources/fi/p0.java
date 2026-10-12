package fi;

import org.telegram.ui.Components.zc;
import org.telegram.ui.eo;
public final class p0 implements Runnable {
    public final int f10030a = 0;
    public final eo f10031b;
    public final boolean f10032c;
    public final int d;

    public p0(int i10, eo eoVar, boolean z10) {
        this.d = i10;
        this.f10031b = eoVar;
        this.f10032c = z10;
    }

    @Override
    public final void run() {
        switch (this.f10030a) {
            case 0:
                int i10 = this.d;
                eo eoVar = this.f10031b;
                if (i10 != 2) {
                    eoVar.Z9();
                    eoVar.cc();
                }
                u0.f(zc.a0(eoVar), i10, this.f10032c);
                return;
            default:
                boolean z10 = this.f10032c;
                this.f10031b.Cc(this.d, z10);
                return;
        }
    }

    public p0(eo eoVar, boolean z10, int i10) {
        this.f10031b = eoVar;
        this.f10032c = z10;
        this.d = i10;
    }
}
