package jg;

import org.telegram.ui.bx;
public final class f implements Runnable {
    public final int f17479a;
    public final m f17480b;

    public f(m mVar, int i7) {
        this.f17479a = i7;
        this.f17480b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f17479a) {
            case 0:
                for (bx bxVar : this.f17480b.S.f46722f0) {
                    ((v4.c0) bxVar.f46325a.getLayoutManager()).f59123u = false;
                }
                return;
            default:
                this.f17480b.K();
                return;
        }
    }
}
