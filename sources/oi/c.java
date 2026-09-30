package oi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class c implements Runnable {
    public final int f15768a;
    public final f f15769b;
    public final e f15770c;

    public c(f fVar, e eVar, int i10) {
        this.f15768a = i10;
        this.f15769b = fVar;
        this.f15770c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f15768a) {
            case 0:
                f fVar = this.f15769b;
                e eVar = (e) fVar.f15777b;
                e eVar2 = this.f15770c;
                if (eVar == eVar2) {
                    fVar.f15778c = null;
                    fVar.j(eVar2);
                    return;
                }
                return;
            case 1:
                f fVar2 = this.f15769b;
                e eVar3 = (e) fVar2.f15777b;
                e eVar4 = this.f15770c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.f15778c;
                    if (cVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        fVar2.f15778c = null;
                    }
                    int i10 = eVar4.d;
                    if (i10 == 0) {
                        fVar2.j(eVar4);
                        return;
                    }
                    c cVar2 = new c(fVar2, eVar4, 2);
                    fVar2.d = cVar2;
                    AndroidUtilities.runOnUIThread(cVar2, 20000L);
                    le.b bVar = eVar4.f15773a;
                    ((ConnectionsManager) bVar.f14213b).checkWebProxyInternal(eVar4.f15774b, i10, new d(fVar2, eVar4));
                    return;
                }
                return;
            default:
                f fVar3 = this.f15769b;
                e eVar5 = (e) fVar3.f15777b;
                e eVar6 = this.f15770c;
                if (eVar5 == eVar6) {
                    fVar3.d = null;
                    fVar3.j(eVar6);
                    return;
                }
                return;
        }
    }
}
