package m;

import androidx.appcompat.widget.Toolbar;
public final class f3 implements Runnable {
    public final int f15100a;
    public final Toolbar f15101b;

    public f3(Toolbar toolbar, int i10) {
        this.f15100a = i10;
        this.f15101b = toolbar;
    }

    @Override
    public final void run() {
        l.m mVar;
        switch (this.f15100a) {
            case 0:
                h3 h3Var = this.f15101b.f1175e0;
                if (h3Var == null) {
                    mVar = null;
                } else {
                    mVar = h3Var.f15126b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f15101b.m();
                return;
        }
    }
}
