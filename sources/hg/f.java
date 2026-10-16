package hg;

import org.telegram.ui.xy;
public final class f implements Runnable {
    public final int f10553a;
    public final m f10554b;

    public f(m mVar, int i10) {
        this.f10553a = i10;
        this.f10554b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f10553a) {
            case 0:
                for (xy xyVar : this.f10554b.R.f42004e0) {
                    ((s4.b0) xyVar.f41679a.getLayoutManager()).f44832u = false;
                }
                return;
            default:
                this.f10554b.J();
                return;
        }
    }
}
