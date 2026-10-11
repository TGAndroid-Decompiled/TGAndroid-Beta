package fi;

import org.telegram.ui.Components.ad;
import org.telegram.ui.zn;
public final class p0 implements Runnable {
    public final int f10031a = 0;
    public final zn f10032b;
    public final boolean f10033c;
    public final int d;

    public p0(int i10, zn znVar, boolean z10) {
        this.d = i10;
        this.f10032b = znVar;
        this.f10033c = z10;
    }

    @Override
    public final void run() {
        switch (this.f10031a) {
            case 0:
                int i10 = this.d;
                zn znVar = this.f10032b;
                if (i10 != 2) {
                    znVar.Z9();
                    znVar.cc();
                }
                u0.f(ad.a0(znVar), i10, this.f10033c);
                return;
            default:
                boolean z10 = this.f10033c;
                this.f10032b.Cc(this.d, z10);
                return;
        }
    }

    public p0(zn znVar, boolean z10, int i10) {
        this.f10032b = znVar;
        this.f10033c = z10;
        this.d = i10;
    }
}
