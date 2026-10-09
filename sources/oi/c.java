package oi;

import m4.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class c implements Runnable {
    public final int f17166a;
    public final f f17167b;
    public final e f17168c;

    public c(f fVar, e eVar, int i10) {
        this.f17166a = i10;
        this.f17167b = fVar;
        this.f17168c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f17166a) {
            case 0:
                f fVar = this.f17167b;
                e eVar = (e) fVar.f17176b;
                e eVar2 = this.f17168c;
                if (eVar == eVar2) {
                    fVar.f17177c = null;
                    fVar.j(eVar2);
                    return;
                }
                return;
            case 1:
                f fVar2 = this.f17167b;
                e eVar3 = (e) fVar2.f17176b;
                e eVar4 = this.f17168c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.f17177c;
                    if (cVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        fVar2.f17177c = null;
                    }
                    int i10 = eVar4.d;
                    if (i10 == 0) {
                        fVar2.j(eVar4);
                        return;
                    }
                    c cVar2 = new c(fVar2, eVar4, 2);
                    fVar2.d = cVar2;
                    AndroidUtilities.runOnUIThread(cVar2, 20000L);
                    w wVar = eVar4.f17171a;
                    ((ConnectionsManager) wVar.f16244b).checkWebProxyInternal(eVar4.f17172b, i10, new d(fVar2, eVar4));
                    return;
                }
                return;
            default:
                f fVar3 = this.f17167b;
                e eVar5 = (e) fVar3.f17176b;
                e eVar6 = this.f17168c;
                if (eVar5 == eVar6) {
                    fVar3.d = null;
                    fVar3.j(eVar6);
                    return;
                }
                return;
        }
    }
}
