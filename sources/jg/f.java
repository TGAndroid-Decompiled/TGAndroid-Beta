package jg;

import org.telegram.ui.ax;
public final class f implements Runnable {
    public final int f17547a;
    public final m f17548b;

    public f(m mVar, int i7) {
        this.f17547a = i7;
        this.f17548b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f17547a) {
            case 0:
                for (ax axVar : this.f17548b.S.f46549f0) {
                    ((v4.c0) axVar.f45822a.getLayoutManager()).f59205u = false;
                }
                return;
            default:
                this.f17548b.K();
                return;
        }
    }
}
