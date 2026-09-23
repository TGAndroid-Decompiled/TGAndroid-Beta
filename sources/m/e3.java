package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f14155a;
    public final Toolbar f14156b;

    public e3(Toolbar toolbar, int i10) {
        this.f14155a = i10;
        this.f14156b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f14155a) {
            case 0:
                g3 g3Var = this.f14156b.f2024e0;
                if (g3Var == null) {
                    mVar = null;
                } else {
                    mVar = g3Var.f14170b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f14156b.m();
                return;
        }
    }
}
