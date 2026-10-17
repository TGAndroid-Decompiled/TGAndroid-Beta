package m;

import androidx.appcompat.widget.Toolbar;
public final class h3 implements Runnable {
    public final int f16208a;
    public final Toolbar f16209b;

    public h3(Toolbar toolbar, int i10) {
        this.f16208a = i10;
        this.f16209b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f16208a) {
            case 0:
                j3 j3Var = this.f16209b.f2797e0;
                if (j3Var == null) {
                    mVar = null;
                } else {
                    mVar = j3Var.f16229b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f16209b.m();
                return;
        }
    }
}
