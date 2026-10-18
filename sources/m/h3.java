package m;

import androidx.appcompat.widget.Toolbar;
public final class h3 implements Runnable {
    public final int f16213a;
    public final Toolbar f16214b;

    public h3(Toolbar toolbar, int i10) {
        this.f16213a = i10;
        this.f16214b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f16213a) {
            case 0:
                j3 j3Var = this.f16214b.f2798e0;
                if (j3Var == null) {
                    mVar = null;
                } else {
                    mVar = j3Var.f16234b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f16214b.m();
                return;
        }
    }
}
