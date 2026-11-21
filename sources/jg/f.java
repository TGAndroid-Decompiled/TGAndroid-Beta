package jg;

import org.telegram.ui.bx;
public final class f implements Runnable {
    public final int f17476a;
    public final m f17477b;

    public f(m mVar, int i7) {
        this.f17476a = i7;
        this.f17477b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f17476a) {
            case 0:
                for (bx bxVar : this.f17477b.S.f46719f0) {
                    ((v4.c0) bxVar.f46321a.getLayoutManager()).f59119u = false;
                }
                return;
            default:
                this.f17477b.K();
                return;
        }
    }
}
