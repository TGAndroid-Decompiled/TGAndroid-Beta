package of;

import org.telegram.ui.cy;
public final class f implements Runnable {
    public final int f19284a;
    public final m f19285b;

    public f(m mVar, int i9) {
        this.f19284a = i9;
        this.f19285b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f19284a) {
            case 0:
                for (cy cyVar : this.f19285b.N.f37629a0) {
                    ((f2.m0) cyVar.f37350a.getLayoutManager()).f5438u = false;
                }
                return;
            default:
                this.f19285b.J();
                return;
        }
    }
}
