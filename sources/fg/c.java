package fg;

import ji.k5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class c implements Runnable {
    public final int f9483a;
    public final f f9484b;
    public final e f9485c;

    public c(f fVar, e eVar, int i10) {
        this.f9483a = i10;
        this.f9484b = fVar;
        this.f9485c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f9483a) {
            case 0:
                f fVar = this.f9484b;
                e eVar = (e) fVar.f9493b;
                e eVar2 = this.f9485c;
                if (eVar == eVar2) {
                    fVar.f9494c = null;
                    fVar.k(eVar2);
                    return;
                }
                return;
            case 1:
                f fVar2 = this.f9484b;
                e eVar3 = (e) fVar2.f9493b;
                e eVar4 = this.f9485c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.f9494c;
                    if (cVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        fVar2.f9494c = null;
                    }
                    int i10 = eVar4.d;
                    if (i10 == 0) {
                        fVar2.k(eVar4);
                        return;
                    }
                    c cVar2 = new c(fVar2, eVar4, 2);
                    fVar2.d = cVar2;
                    AndroidUtilities.runOnUIThread(cVar2, 20000L);
                    k5 k5Var = eVar4.f9488a;
                    ((ConnectionsManager) k5Var.f14022b).checkWebProxyInternal(eVar4.f9489b, i10, new d(fVar2, eVar4));
                    return;
                }
                return;
            default:
                f fVar3 = this.f9484b;
                e eVar5 = (e) fVar3.f9493b;
                e eVar6 = this.f9485c;
                if (eVar5 == eVar6) {
                    fVar3.d = null;
                    fVar3.k(eVar6);
                    return;
                }
                return;
        }
    }
}
