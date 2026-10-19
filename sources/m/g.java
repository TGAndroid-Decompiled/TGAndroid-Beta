package m;

import android.view.View;
public final class g implements Runnable {
    public final e f16199a;
    public final i f16200b;

    public g(i iVar, e eVar) {
        this.f16200b = iVar;
        this.f16199a = eVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        i iVar2 = this.f16200b;
        l.k kVar = iVar2.f16218c;
        if (kVar != null && (iVar = kVar.e) != null) {
            iVar.n(kVar);
        }
        View view = (View) iVar2.f16220n;
        if (view != null && view.getWindowToken() != null) {
            e eVar = this.f16199a;
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
