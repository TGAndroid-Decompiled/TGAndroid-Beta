package m;

import androidx.appcompat.widget.Toolbar;
public final class d3 implements Runnable {
    public final int f20076a;
    public final Toolbar f20077b;

    public d3(Toolbar toolbar, int i7) {
        this.f20076a = i7;
        this.f20077b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f20076a) {
            case 0:
                f3 f3Var = this.f20077b.f1945f0;
                if (f3Var == null) {
                    mVar = null;
                } else {
                    mVar = f3Var.f20084b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f20077b.m();
                return;
        }
    }
}
