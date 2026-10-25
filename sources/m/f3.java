package m;

import androidx.appcompat.widget.Toolbar;
public final class f3 implements Runnable {
    public final int f17712a;
    public final Toolbar f17713b;

    public f3(Toolbar toolbar, int i10) {
        this.f17712a = i10;
        this.f17713b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f17712a) {
            case 0:
                i3 i3Var = this.f17713b.f2247e0;
                if (i3Var == null) {
                    mVar = null;
                } else {
                    mVar = i3Var.f17745b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f17713b.m();
                return;
        }
    }
}
