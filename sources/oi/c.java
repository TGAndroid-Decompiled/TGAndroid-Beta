package oi;

import m4.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class c implements Runnable {
    public final int f17170a;
    public final f f17171b;
    public final e f17172c;

    public c(f fVar, e eVar, int i10) {
        this.f17170a = i10;
        this.f17171b = fVar;
        this.f17172c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f17170a) {
            case 0:
                f fVar = this.f17171b;
                e eVar = (e) fVar.f17180b;
                e eVar2 = this.f17172c;
                if (eVar == eVar2) {
                    fVar.f17181c = null;
                    fVar.j(eVar2);
                    return;
                }
                return;
            case 1:
                f fVar2 = this.f17171b;
                e eVar3 = (e) fVar2.f17180b;
                e eVar4 = this.f17172c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.f17181c;
                    if (cVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        fVar2.f17181c = null;
                    }
                    int i10 = eVar4.d;
                    if (i10 == 0) {
                        fVar2.j(eVar4);
                        return;
                    }
                    c cVar2 = new c(fVar2, eVar4, 2);
                    fVar2.d = cVar2;
                    AndroidUtilities.runOnUIThread(cVar2, 20000L);
                    w wVar = eVar4.f17175a;
                    ((ConnectionsManager) wVar.f16248b).checkWebProxyInternal(eVar4.f17176b, i10, new d(fVar2, eVar4));
                    return;
                }
                return;
            default:
                f fVar3 = this.f17171b;
                e eVar5 = (e) fVar3.f17180b;
                e eVar6 = this.f17172c;
                if (eVar5 == eVar6) {
                    fVar3.d = null;
                    fVar3.j(eVar6);
                    return;
                }
                return;
        }
    }
}
