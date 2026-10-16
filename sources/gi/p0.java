package gi;

import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
public final class p0 implements Runnable {
    public final int f10241a = 0;
    public final fo f10242b;
    public final boolean f10243c;
    public final int d;

    public p0(int i10, fo foVar, boolean z10) {
        this.d = i10;
        this.f10242b = foVar;
        this.f10243c = z10;
    }

    @Override
    public final void run() {
        switch (this.f10241a) {
            case 0:
                int i10 = this.d;
                fo foVar = this.f10242b;
                if (i10 != 2) {
                    foVar.Z9();
                    foVar.cc();
                }
                u0.f(zc.a0(foVar), i10, this.f10243c);
                return;
            default:
                boolean z10 = this.f10243c;
                this.f10242b.Cc(this.d, z10);
                return;
        }
    }

    public p0(fo foVar, boolean z10, int i10) {
        this.f10242b = foVar;
        this.f10243c = z10;
        this.d = i10;
    }
}
