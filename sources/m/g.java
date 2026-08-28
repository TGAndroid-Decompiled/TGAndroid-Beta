package m;

import android.view.View;
public final class g implements Runnable {
    public final e f16947a;
    public final i f16948b;

    public g(i iVar, e eVar) {
        this.f16948b = iVar;
        this.f16947a = eVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        i iVar2 = this.f16948b;
        l.k kVar = iVar2.f16964c;
        if (kVar != null && (iVar = kVar.f16557e) != null) {
            iVar.l(kVar);
        }
        View view = (View) iVar2.f16967n;
        if (view != null && view.getWindowToken() != null) {
            e eVar = this.f16947a;
            if (!eVar.b()) {
                if (eVar.f16614e != null) {
                    eVar.d(0, 0, false, false);
                }
            }
            iVar2.E = eVar;
        }
        iVar2.G = null;
    }
}
