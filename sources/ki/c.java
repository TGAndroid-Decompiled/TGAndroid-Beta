package ki;

import android.os.Handler;
public final class c implements Runnable {
    public final int f13679a;
    public final i f13680b;
    public final l f13681c;

    public c(i iVar, l lVar, int i10) {
        this.f13679a = i10;
        this.f13680b = iVar;
        this.f13681c = lVar;
    }

    @Override
    public final void run() {
        q qVar;
        switch (this.f13679a) {
            case 0:
                i iVar = this.f13680b;
                c cVar = new c(iVar, this.f13681c, 2);
                Handler handler = iVar.f13735n;
                if (handler != null) {
                    handler.post(cVar);
                    return;
                }
                return;
            case 1:
                i iVar2 = this.f13680b;
                c cVar2 = new c(iVar2, this.f13681c, 3);
                Handler handler2 = iVar2.f13735n;
                if (handler2 != null) {
                    handler2.post(cVar2);
                    return;
                }
                return;
            case 2:
                i iVar3 = this.f13680b;
                l lVar = this.f13681c;
                if (iVar3.S && !iVar3.Y && iVar3.f13752w == lVar && iVar3.f13758z != null && (qVar = iVar3.v) != null) {
                    try {
                        long j3 = lVar.A;
                        if (j3 > 0) {
                            qVar.h = j3;
                            qVar.A = -1L;
                            qVar.B = 0L;
                            qVar.C = -1L;
                            qVar.f13828i = Long.MAX_VALUE;
                            qVar.f13819a0 = true;
                            m mVar = iVar3.f13728j;
                            mVar.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + i.m(iVar3.f13722f0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e) {
                        iVar3.d();
                        iVar3.t(e);
                        return;
                    }
                }
                return;
            default:
                i iVar4 = this.f13680b;
                l lVar2 = this.f13681c;
                if (iVar4.S && !iVar4.Y && iVar4.f13752w == lVar2) {
                    iVar4.d();
                    m mVar2 = iVar4.f13728j;
                    mVar2.b("common A/V start completed: segmentElapsedMs=" + i.m(iVar4.f13722f0));
                    s0 s0Var = (s0) iVar4.f13730k.f13384b;
                    s0Var.f13863i.post(new b0(s0Var, 2));
                    return;
                }
                return;
        }
    }
}
