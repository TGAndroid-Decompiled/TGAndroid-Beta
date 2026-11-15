package m;

import androidx.appcompat.widget.Toolbar;
public final class d3 implements Runnable {
    public final int f19681a;
    public final Toolbar f19682b;

    public d3(Toolbar toolbar, int i7) {
        this.f19681a = i7;
        this.f19682b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f19681a) {
            case 0:
                f3 f3Var = this.f19682b.f1934f0;
                if (f3Var == null) {
                    mVar = null;
                } else {
                    mVar = f3Var.f19689b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f19682b.m();
                return;
        }
    }
}
