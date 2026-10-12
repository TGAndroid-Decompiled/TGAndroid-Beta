package oi;

import m4.x;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class c implements Runnable {
    public final int f16917a;
    public final f f16918b;
    public final e f16919c;

    public c(f fVar, e eVar, int i10) {
        this.f16917a = i10;
        this.f16918b = fVar;
        this.f16919c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f16917a) {
            case 0:
                f fVar = this.f16918b;
                e eVar = (e) fVar.f16927b;
                e eVar2 = this.f16919c;
                if (eVar == eVar2) {
                    fVar.f16928c = null;
                    fVar.j(eVar2);
                    return;
                }
                return;
            case 1:
                f fVar2 = this.f16918b;
                e eVar3 = (e) fVar2.f16927b;
                e eVar4 = this.f16919c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.f16928c;
                    if (cVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        fVar2.f16928c = null;
                    }
                    int i10 = eVar4.d;
                    if (i10 == 0) {
                        fVar2.j(eVar4);
                        return;
                    }
                    c cVar2 = new c(fVar2, eVar4, 2);
                    fVar2.d = cVar2;
                    AndroidUtilities.runOnUIThread(cVar2, 20000L);
                    x xVar = eVar4.f16922a;
                    ((ConnectionsManager) xVar.f15996b).checkWebProxyInternal(eVar4.f16923b, i10, new d(fVar2, eVar4));
                    return;
                }
                return;
            default:
                f fVar3 = this.f16918b;
                e eVar5 = (e) fVar3.f16927b;
                e eVar6 = this.f16919c;
                if (eVar5 == eVar6) {
                    fVar3.d = null;
                    fVar3.j(eVar6);
                    return;
                }
                return;
        }
    }
}
