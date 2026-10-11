package m;

import android.view.View;
public final class f implements Runnable {
    public final d f15690a;
    public final h f15691b;

    public f(h hVar, d dVar) {
        this.f15691b = hVar;
        this.f15690a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f15691b;
        l.k kVar = hVar.f15707c;
        if (kVar != null && (iVar = kVar.f15241e) != null) {
            iVar.n(kVar);
        }
        View view = (View) hVar.f15710n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f15690a;
            if (!dVar.b()) {
                if (dVar.f15298e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.I = dVar;
        }
        hVar.K = null;
    }
}
