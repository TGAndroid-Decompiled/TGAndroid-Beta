package ki;

import android.os.Handler;
public final class c implements Runnable {
    public final int f14855a;
    public final i f14856b;
    public final l f14857c;

    public c(i iVar, l lVar, int i10) {
        this.f14855a = i10;
        this.f14856b = iVar;
        this.f14857c = lVar;
    }

    @Override
    public final void run() {
        q qVar;
        switch (this.f14855a) {
            case 0:
                i iVar = this.f14856b;
                c cVar = new c(iVar, this.f14857c, 2);
                Handler handler = iVar.f14915n;
                if (handler != null) {
                    handler.post(cVar);
                    return;
                }
                return;
            case 1:
                i iVar2 = this.f14856b;
                c cVar2 = new c(iVar2, this.f14857c, 3);
                Handler handler2 = iVar2.f14915n;
                if (handler2 != null) {
                    handler2.post(cVar2);
                    return;
                }
                return;
            case 2:
                i iVar3 = this.f14856b;
                l lVar = this.f14857c;
                if (iVar3.S && !iVar3.Y && iVar3.f14932w == lVar && iVar3.f14938z != null && (qVar = iVar3.v) != null) {
                    try {
                        long j3 = lVar.A;
                        if (j3 > 0) {
                            qVar.h = j3;
                            qVar.A = -1L;
                            qVar.B = 0L;
                            qVar.C = -1L;
                            qVar.f15012i = Long.MAX_VALUE;
                            qVar.f15002a0 = true;
                            m mVar = iVar3.f14908j;
                            mVar.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + i.m(iVar3.f14902f0));
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
                i iVar4 = this.f14856b;
                l lVar2 = this.f14857c;
                if (iVar4.S && !iVar4.Y && iVar4.f14932w == lVar2) {
                    iVar4.d();
                    m mVar2 = iVar4.f14908j;
                    mVar2.b("common A/V start completed: segmentElapsedMs=" + i.m(iVar4.f14902f0));
                    s0 s0Var = (s0) iVar4.f14910k.f12543b;
                    s0Var.f15049i.post(new b0(s0Var, 2));
                    return;
                }
                return;
        }
    }
}
