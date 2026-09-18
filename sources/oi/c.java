package oi;

import k2.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class c implements Runnable {
    public final int f15708a;
    public final f f15709b;
    public final e f15710c;

    public c(f fVar, e eVar, int i10) {
        this.f15708a = i10;
        this.f15709b = fVar;
        this.f15710c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f15708a) {
            case 0:
                f fVar = this.f15709b;
                e eVar = (e) fVar.f15717b;
                e eVar2 = this.f15710c;
                if (eVar == eVar2) {
                    fVar.f15718c = null;
                    fVar.j(eVar2);
                    return;
                }
                return;
            case 1:
                f fVar2 = this.f15709b;
                e eVar3 = (e) fVar2.f15717b;
                e eVar4 = this.f15710c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.f15718c;
                    if (cVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        fVar2.f15718c = null;
                    }
                    int i10 = eVar4.d;
                    if (i10 == 0) {
                        fVar2.j(eVar4);
                        return;
                    }
                    c cVar2 = new c(fVar2, eVar4, 2);
                    fVar2.d = cVar2;
                    AndroidUtilities.runOnUIThread(cVar2, 20000L);
                    v vVar = eVar4.f15713a;
                    ((ConnectionsManager) vVar.f13385b).checkWebProxyInternal(eVar4.f15714b, i10, new d(fVar2, eVar4));
                    return;
                }
                return;
            default:
                f fVar3 = this.f15709b;
                e eVar5 = (e) fVar3.f15717b;
                e eVar6 = this.f15710c;
                if (eVar5 == eVar6) {
                    fVar3.d = null;
                    fVar3.j(eVar6);
                    return;
                }
                return;
        }
    }
}
