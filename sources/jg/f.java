package jg;

import org.telegram.ui.xw;
public final class f implements Runnable {
    public final int f17068a;
    public final m f17069b;

    public f(m mVar, int i7) {
        this.f17068a = i7;
        this.f17069b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f17068a) {
            case 0:
                for (xw xwVar : this.f17069b.S.f53638f0) {
                    ((v4.b0) xwVar.f53335a.getLayoutManager()).f58495u = false;
                }
                return;
            default:
                this.f17069b.K();
                return;
        }
    }
}
