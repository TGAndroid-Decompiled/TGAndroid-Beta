package m;

import android.view.View;
public final class f implements Runnable {
    public final d f15420a;
    public final h f15421b;

    public f(h hVar, d dVar) {
        this.f15421b = hVar;
        this.f15420a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f15421b;
        l.k kVar = hVar.f15429c;
        if (kVar != null && (iVar = kVar.f14986e) != null) {
            iVar.u(kVar);
        }
        View view = (View) hVar.f15432n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f15420a;
            if (!dVar.b()) {
                if (dVar.f15043e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.I = dVar;
        }
        hVar.K = null;
    }
}
