package hg;

import org.telegram.ui.xy;
public final class f implements Runnable {
    public final int f10549a;
    public final m f10550b;

    public f(m mVar, int i10) {
        this.f10549a = i10;
        this.f10550b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f10549a) {
            case 0:
                for (xy xyVar : this.f10550b.R.f42325e0) {
                    ((s4.b0) xyVar.f41980a.getLayoutManager()).f44832u = false;
                }
                return;
            default:
                this.f10550b.J();
                return;
        }
    }
}
