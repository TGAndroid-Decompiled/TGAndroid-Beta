package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f14352a;
    public final Toolbar f14353b;

    public e3(Toolbar toolbar, int i10) {
        this.f14352a = i10;
        this.f14353b = toolbar;
    }

    @Override
    public final void run() {
        l.n nVar;
        switch (this.f14352a) {
            case 0:
                g3 g3Var = this.f14353b.f2032e0;
                if (g3Var == null) {
                    nVar = null;
                } else {
                    nVar = g3Var.f14367b;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f14353b.m();
                return;
        }
    }
}
