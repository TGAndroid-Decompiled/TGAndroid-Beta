package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f15510a;
    public final Toolbar f15511b;

    public e3(Toolbar toolbar, int i10) {
        this.f15510a = i10;
        this.f15511b = toolbar;
    }

    @Override
    public final void run() {
        l.n nVar;
        switch (this.f15510a) {
            case 0:
                g3 g3Var = this.f15511b.f1018e0;
                if (g3Var == null) {
                    nVar = null;
                } else {
                    nVar = g3Var.f15526b;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f15511b.m();
                return;
        }
    }
}
