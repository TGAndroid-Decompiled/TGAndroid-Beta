package m;

import androidx.appcompat.widget.Toolbar;
public final class h3 implements Runnable {
    public final int f16214a;
    public final Toolbar f16215b;

    public h3(Toolbar toolbar, int i10) {
        this.f16214a = i10;
        this.f16215b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f16214a) {
            case 0:
                j3 j3Var = this.f16215b.f2794e0;
                if (j3Var == null) {
                    mVar = null;
                } else {
                    mVar = j3Var.f16235b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f16215b.m();
                return;
        }
    }
}
