package m;

import androidx.appcompat.widget.Toolbar;
public final class d3 implements Runnable {
    public final int f20042a;
    public final Toolbar f20043b;

    public d3(Toolbar toolbar, int i7) {
        this.f20042a = i7;
        this.f20043b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f20042a) {
            case 0:
                f3 f3Var = this.f20043b.f1896f0;
                if (f3Var == null) {
                    mVar = null;
                } else {
                    mVar = f3Var.f20050b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f20043b.m();
                return;
        }
    }
}
