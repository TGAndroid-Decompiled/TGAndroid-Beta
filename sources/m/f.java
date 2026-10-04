package m;

import android.view.View;
public final class f implements Runnable {
    public final d f15727a;
    public final h f15728b;

    public f(h hVar, d dVar) {
        this.f15728b = hVar;
        this.f15727a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f15728b;
        l.k kVar = hVar.f15745c;
        if (kVar != null && (iVar = kVar.f15172e) != null) {
            iVar.y(kVar);
        }
        View view = (View) hVar.f15748n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f15727a;
            if (!dVar.b()) {
                if (dVar.f15229e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.I = dVar;
        }
        hVar.K = null;
    }
}
