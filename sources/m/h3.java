package m;

import androidx.appcompat.widget.Toolbar;
public final class h3 implements Runnable {
    public final int f16559a;
    public final Toolbar f16560b;

    public h3(Toolbar toolbar, int i10) {
        this.f16559a = i10;
        this.f16560b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f16559a) {
            case 0:
                j3 j3Var = this.f16560b.f1005a0;
                if (j3Var == null) {
                    mVar = null;
                } else {
                    mVar = j3Var.f16581b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f16560b.m();
                return;
        }
    }
}
