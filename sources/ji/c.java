package ji;

import mg.l;
import org.telegram.messenger.i0;
import org.telegram.tgnet.ConnectionsManager;
public final class c implements Runnable {
    public final int f10431a;
    public final f f10432b;
    public final e f10433c;

    public c(f fVar, e eVar, int i10) {
        this.f10431a = i10;
        this.f10432b = fVar;
        this.f10433c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f10431a) {
            case 0:
                f fVar = this.f10432b;
                e eVar = (e) fVar.f10442c;
                e eVar2 = this.f10433c;
                if (eVar == eVar2) {
                    fVar.d = null;
                    fVar.k(eVar2);
                    return;
                }
                return;
            case 1:
                f fVar2 = this.f10432b;
                e eVar3 = (e) fVar2.f10442c;
                e eVar4 = this.f10433c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.d;
                    if (cVar != null) {
                        i0.r(cVar);
                        fVar2.d = null;
                    }
                    int i10 = eVar4.d;
                    if (i10 == 0) {
                        fVar2.k(eVar4);
                        return;
                    }
                    c cVar2 = new c(fVar2, eVar4, 2);
                    fVar2.e = cVar2;
                    i0.h3(cVar2, 20000L);
                    l lVar = eVar4.f10436a;
                    ((ConnectionsManager) lVar.f13182b).checkWebProxyInternal(eVar4.f10437b, i10, new d(fVar2, eVar4));
                    return;
                }
                return;
            default:
                f fVar3 = this.f10432b;
                e eVar5 = (e) fVar3.f10442c;
                e eVar6 = this.f10433c;
                if (eVar5 == eVar6) {
                    fVar3.e = null;
                    fVar3.k(eVar6);
                    return;
                }
                return;
        }
    }
}
