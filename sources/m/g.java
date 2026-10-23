package m;

import android.view.View;
public final class g implements Runnable {
    public final e f16262a;
    public final i f16263b;

    public g(i iVar, e eVar) {
        this.f16263b = iVar;
        this.f16262a = eVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        i iVar2 = this.f16263b;
        l.k kVar = iVar2.f16281c;
        if (kVar != null && (iVar = kVar.e) != null) {
            iVar.i(kVar);
        }
        View view = (View) iVar2.f16283n;
        if (view != null && view.getWindowToken() != null) {
            e eVar = this.f16262a;
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
