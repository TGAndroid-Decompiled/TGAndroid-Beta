package m;

import android.view.View;
public final class f implements Runnable {
    public final d f15665a;
    public final h f15666b;

    public f(h hVar, d dVar) {
        this.f15666b = hVar;
        this.f15665a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f15666b;
        l.k kVar = hVar.f15682c;
        if (kVar != null && (iVar = kVar.f15238e) != null) {
            iVar.n(kVar);
        }
        View view = (View) hVar.f15685n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f15665a;
            if (!dVar.b()) {
                if (dVar.f15295e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.I = dVar;
        }
        hVar.K = null;
    }
}
