package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f14177a;
    public final Toolbar f14178b;

    public e3(Toolbar toolbar, int i10) {
        this.f14177a = i10;
        this.f14178b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f14177a) {
            case 0:
                g3 g3Var = this.f14178b.f2032e0;
                if (g3Var == null) {
                    mVar = null;
                } else {
                    mVar = g3Var.f14192b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f14178b.m();
                return;
        }
    }
}
