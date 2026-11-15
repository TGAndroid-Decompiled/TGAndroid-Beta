package m;

import android.view.View;
public final class f implements Runnable {
    public final d f19686a;
    public final h f19687b;

    public f(h hVar, d dVar) {
        this.f19687b = hVar;
        this.f19686a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f19687b;
        l.k kVar = hVar.f19706c;
        if (kVar != null && (iVar = kVar.f18816e) != null) {
            iVar.i(kVar);
        }
        View view = (View) hVar.f19709n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f19686a;
            if (!dVar.b()) {
                if (dVar.f18873e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.J = dVar;
        }
        hVar.L = null;
    }
}
