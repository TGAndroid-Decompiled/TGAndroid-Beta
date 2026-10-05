package m;

import android.view.View;
public final class f implements Runnable {
    public final d f15737a;
    public final h f15738b;

    public f(h hVar, d dVar) {
        this.f15738b = hVar;
        this.f15737a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f15738b;
        l.k kVar = hVar.f15755c;
        if (kVar != null && (iVar = kVar.f15174e) != null) {
            iVar.w(kVar);
        }
        View view = (View) hVar.f15758n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f15737a;
            if (!dVar.b()) {
                if (dVar.f15231e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.I = dVar;
        }
        hVar.K = null;
    }
}
