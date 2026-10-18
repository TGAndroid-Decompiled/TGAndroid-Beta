package m;

import androidx.appcompat.widget.Toolbar;
public final class h3 implements Runnable {
    public final int f16215a;
    public final Toolbar f16216b;

    public h3(Toolbar toolbar, int i10) {
        this.f16215a = i10;
        this.f16216b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f16215a) {
            case 0:
                j3 j3Var = this.f16216b.f2798e0;
                if (j3Var == null) {
                    mVar = null;
                } else {
                    mVar = j3Var.f16236b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f16216b.m();
                return;
        }
    }
}
