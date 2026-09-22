package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f14403a;
    public final Toolbar f14404b;

    public e3(Toolbar toolbar, int i10) {
        this.f14403a = i10;
        this.f14404b = toolbar;
    }

    @Override
    public final void run() {
        l.n nVar;
        switch (this.f14403a) {
            case 0:
                g3 g3Var = this.f14404b.f2031e0;
                if (g3Var == null) {
                    nVar = null;
                } else {
                    nVar = g3Var.f14418b;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f14404b.m();
                return;
        }
    }
}
