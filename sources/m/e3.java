package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f15735a;
    public final Toolbar f15736b;

    public e3(Toolbar toolbar, int i10) {
        this.f15735a = i10;
        this.f15736b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f15735a) {
            case 0:
                g3 g3Var = this.f15736b.f2202e0;
                if (g3Var == null) {
                    mVar = null;
                } else {
                    mVar = g3Var.f15751b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f15736b.m();
                return;
        }
    }
}
