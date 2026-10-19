package m;

import android.view.View;
public final class g implements Runnable {
    public final e f16201a;
    public final i f16202b;

    public g(i iVar, e eVar) {
        this.f16202b = iVar;
        this.f16201a = eVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        i iVar2 = this.f16202b;
        l.k kVar = iVar2.f16220c;
        if (kVar != null && (iVar = kVar.e) != null) {
            iVar.n(kVar);
        }
        View view = (View) iVar2.f16222n;
        if (view != null && view.getWindowToken() != null) {
            e eVar = this.f16201a;
            if (!eVar.b()) {
                if (eVar.e != null) {
                    eVar.d(0, 0, false, false);
                }
            }
            iVar2.I = eVar;
        }
        iVar2.K = null;
    }
}
