package m;

import androidx.appcompat.widget.Toolbar;
public final class f3 implements Runnable {
    public final int f17711a;
    public final Toolbar f17712b;

    public f3(Toolbar toolbar, int i10) {
        this.f17711a = i10;
        this.f17712b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f17711a) {
            case 0:
                i3 i3Var = this.f17712b.f2247e0;
                if (i3Var == null) {
                    mVar = null;
                } else {
                    mVar = i3Var.f17744b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f17712b.m();
                return;
        }
    }
}
