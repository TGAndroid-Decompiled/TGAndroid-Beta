package ki;

import android.os.Handler;
public final class c implements Runnable {
    public final int f14856a;
    public final i f14857b;
    public final l f14858c;

    public c(i iVar, l lVar, int i10) {
        this.f14856a = i10;
        this.f14857b = iVar;
        this.f14858c = lVar;
    }

    @Override
    public final void run() {
        q qVar;
        switch (this.f14856a) {
            case 0:
                i iVar = this.f14857b;
                c cVar = new c(iVar, this.f14858c, 2);
                Handler handler = iVar.f14916n;
                if (handler != null) {
                    handler.post(cVar);
                    return;
                }
                return;
            case 1:
                i iVar2 = this.f14857b;
                c cVar2 = new c(iVar2, this.f14858c, 3);
                Handler handler2 = iVar2.f14916n;
                if (handler2 != null) {
                    handler2.post(cVar2);
                    return;
                }
                return;
            case 2:
                i iVar3 = this.f14857b;
                l lVar = this.f14858c;
                if (iVar3.S && !iVar3.Y && iVar3.f14933w == lVar && iVar3.f14939z != null && (qVar = iVar3.v) != null) {
                    try {
                        long j3 = lVar.A;
                        if (j3 > 0) {
                            qVar.h = j3;
                            qVar.A = -1L;
                            qVar.B = 0L;
                            qVar.C = -1L;
                            qVar.f15013i = Long.MAX_VALUE;
                            qVar.f15003a0 = true;
                            m mVar = iVar3.f14909j;
                            mVar.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + i.m(iVar3.f14903f0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e7) {
                        iVar3.d();
                        iVar3.t(e7);
                        return;
                    }
                }
                return;
            default:
                i iVar4 = this.f14857b;
                l lVar2 = this.f14858c;
                if (iVar4.S && !iVar4.Y && iVar4.f14933w == lVar2) {
                    iVar4.d();
                    m mVar2 = iVar4.f14909j;
                    mVar2.b("common A/V start completed: segmentElapsedMs=" + i.m(iVar4.f14903f0));
                    s0 s0Var = (s0) iVar4.f14911k.f12544b;
                    s0Var.f15050i.post(new b0(s0Var, 2));
                    return;
                }
                return;
        }
    }
}
