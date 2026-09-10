package ki;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class c implements Runnable {
    public final int f12530a;
    public final f f12531b;
    public final e f12532c;

    public c(f fVar, e eVar, int i10) {
        this.f12530a = i10;
        this.f12531b = fVar;
        this.f12532c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f12530a) {
            case 0:
                f fVar = this.f12531b;
                e eVar = (e) fVar.f12539b;
                e eVar2 = this.f12532c;
                if (eVar == eVar2) {
                    fVar.f12540c = null;
                    fVar.j(eVar2);
                    return;
                }
                return;
            case 1:
                f fVar2 = this.f12531b;
                e eVar3 = (e) fVar2.f12539b;
                e eVar4 = this.f12532c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.f12540c;
                    if (cVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        fVar2.f12540c = null;
                    }
                    int i10 = eVar4.d;
                    if (i10 == 0) {
                        fVar2.j(eVar4);
                        return;
                    }
                    c cVar2 = new c(fVar2, eVar4, 2);
                    fVar2.d = cVar2;
                    AndroidUtilities.runOnUIThread(cVar2, 20000L);
                    org.telegram.tgnet.j jVar = eVar4.f12535a;
                    ((ConnectionsManager) jVar.f17386b).checkWebProxyInternal(eVar4.f12536b, i10, new d(fVar2, eVar4));
                    return;
                }
                return;
            default:
                f fVar3 = this.f12531b;
                e eVar5 = (e) fVar3.f12539b;
                e eVar6 = this.f12532c;
                if (eVar5 == eVar6) {
                    fVar3.d = null;
                    fVar3.j(eVar6);
                    return;
                }
                return;
        }
    }
}
