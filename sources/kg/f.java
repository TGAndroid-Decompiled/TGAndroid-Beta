package kg;

import org.telegram.ui.tw;
public final class f implements Runnable {
    public final int f17024a;
    public final m f17025b;

    public f(m mVar, int i3) {
        this.f17024a = i3;
        this.f17025b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f17024a) {
            case 0:
                for (tw twVar : this.f17025b.S.f50230f0) {
                    ((u4.b0) twVar.f49897a.getLayoutManager()).f55515u = false;
                }
                return;
            default:
                this.f17025b.K();
                return;
        }
    }
}
