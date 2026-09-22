package m;

import androidx.appcompat.widget.Toolbar;
public final class e3 implements Runnable {
    public final int f14165a;
    public final Toolbar f14166b;

    public e3(Toolbar toolbar, int i10) {
        this.f14165a = i10;
        this.f14166b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f14165a) {
            case 0:
                g3 g3Var = this.f14166b.f2029e0;
                if (g3Var == null) {
                    mVar = null;
                } else {
                    mVar = g3Var.f14180b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f14166b.m();
                return;
        }
    }
}
