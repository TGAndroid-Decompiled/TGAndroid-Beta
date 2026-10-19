package m;

import androidx.appcompat.widget.Toolbar;
public final class h3 implements Runnable {
    public final int f16216a;
    public final Toolbar f16217b;

    public h3(Toolbar toolbar, int i10) {
        this.f16216a = i10;
        this.f16217b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f16216a) {
            case 0:
                j3 j3Var = this.f16217b.f2796e0;
                if (j3Var == null) {
                    mVar = null;
                } else {
                    mVar = j3Var.f16237b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f16217b.m();
                return;
        }
    }
}
