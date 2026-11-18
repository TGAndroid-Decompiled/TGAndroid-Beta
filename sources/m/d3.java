package m;

import androidx.appcompat.widget.Toolbar;
public final class d3 implements Runnable {
    public final int f20045a;
    public final Toolbar f20046b;

    public d3(Toolbar toolbar, int i7) {
        this.f20045a = i7;
        this.f20046b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f20045a) {
            case 0:
                f3 f3Var = this.f20046b.f1926f0;
                if (f3Var == null) {
                    mVar = null;
                } else {
                    mVar = f3Var.f20053b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f20046b.m();
                return;
        }
    }
}
