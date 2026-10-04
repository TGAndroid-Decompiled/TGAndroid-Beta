package m;

import android.view.View;
public final class f implements Runnable {
    public final d f15732a;
    public final h f15733b;

    public f(h hVar, d dVar) {
        this.f15733b = hVar;
        this.f15732a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f15733b;
        l.k kVar = hVar.f15750c;
        if (kVar != null && (iVar = kVar.f15174e) != null) {
            iVar.y(kVar);
        }
        View view = (View) hVar.f15753n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f15732a;
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
