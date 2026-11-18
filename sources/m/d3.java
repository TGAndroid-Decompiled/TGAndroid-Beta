package m;

import androidx.appcompat.widget.Toolbar;
public final class d3 implements Runnable {
    public final int f20048a;
    public final Toolbar f20049b;

    public d3(Toolbar toolbar, int i7) {
        this.f20048a = i7;
        this.f20049b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f20048a) {
            case 0:
                f3 f3Var = this.f20049b.f1925f0;
                if (f3Var == null) {
                    mVar = null;
                } else {
                    mVar = f3Var.f20056b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f20049b.m();
                return;
        }
    }
}
