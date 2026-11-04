package m;

import androidx.appcompat.widget.Toolbar;
public final class d3 implements Runnable {
    public final int f18569a;
    public final Toolbar f18570b;

    public d3(Toolbar toolbar, int i3) {
        this.f18569a = i3;
        this.f18570b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f18569a) {
            case 0:
                f3 f3Var = this.f18570b.f1406f0;
                if (f3Var == null) {
                    mVar = null;
                } else {
                    mVar = f3Var.f18577b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f18570b.m();
                return;
        }
    }
}
