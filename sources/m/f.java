package m;

import android.view.View;
public final class f implements Runnable {
    public final d f14827a;
    public final i f14828b;

    public f(i iVar, d dVar) {
        this.f14828b = iVar;
        this.f14827a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        i iVar2 = this.f14828b;
        l.k kVar = iVar2.f14854c;
        if (kVar != null && (iVar = kVar.e) != null) {
            iVar.l(kVar);
        }
        View view = (View) iVar2.f14856n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f14827a;
            if (!dVar.b()) {
                if (dVar.e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            iVar2.I = dVar;
        }
        iVar2.K = null;
    }
}
