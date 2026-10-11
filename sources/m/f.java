package m;

import android.view.View;
public final class f implements Runnable {
    public final d f15726a;
    public final h f15727b;

    public f(h hVar, d dVar) {
        this.f15727b = hVar;
        this.f15726a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f15727b;
        l.k kVar = hVar.f15743c;
        if (kVar != null && (iVar = kVar.f15277e) != null) {
            iVar.n(kVar);
        }
        View view = (View) hVar.f15746n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f15726a;
            if (!dVar.b()) {
                if (dVar.f15334e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.I = dVar;
        }
        hVar.K = null;
    }
}
