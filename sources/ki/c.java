package ki;

import android.os.Handler;
public final class c implements Runnable {
    public final int f14906a;
    public final j f14907b;
    public final m f14908c;

    public c(j jVar, m mVar, int i10) {
        this.f14906a = i10;
        this.f14907b = jVar;
        this.f14908c = mVar;
    }

    @Override
    public final void run() {
        r rVar;
        switch (this.f14906a) {
            case 0:
                j jVar = this.f14907b;
                c cVar = new c(jVar, this.f14908c, 2);
                Handler handler = jVar.f14985n;
                if (handler != null) {
                    handler.post(cVar);
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f14907b;
                c cVar2 = new c(jVar2, this.f14908c, 3);
                Handler handler2 = jVar2.f14985n;
                if (handler2 != null) {
                    handler2.post(cVar2);
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f14907b;
                m mVar = this.f14908c;
                if (jVar3.S && !jVar3.Y && jVar3.f15002w == mVar && jVar3.f15008z != null && (rVar = jVar3.v) != null) {
                    try {
                        long j3 = mVar.A;
                        if (j3 > 0) {
                            rVar.h = j3;
                            rVar.A = -1L;
                            rVar.B = 0L;
                            rVar.C = -1L;
                            rVar.f15082i = Long.MAX_VALUE;
                            rVar.f15072a0 = true;
                            n nVar = jVar3.f14978j;
                            nVar.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + j.s(jVar3.f14996s0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e7) {
                        jVar3.g();
                        jVar3.C(e7);
                        return;
                    }
                }
                return;
            default:
                j jVar4 = this.f14907b;
                m mVar2 = this.f14908c;
                if (jVar4.S && !jVar4.Y && jVar4.f15002w == mVar2) {
                    jVar4.g();
                    n nVar2 = jVar4.f14978j;
                    nVar2.b("common A/V start completed: segmentElapsedMs=" + j.s(jVar4.f14996s0));
                    t0 t0Var = (t0) jVar4.f14980k.f51105b;
                    t0Var.f15119i.post(new c0(t0Var, 2));
                    return;
                }
                return;
        }
    }
}
