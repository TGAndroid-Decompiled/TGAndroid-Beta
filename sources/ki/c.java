package ki;

import android.os.Handler;
public final class c implements Runnable {
    public final int f14905a;
    public final j f14906b;
    public final m f14907c;

    public c(j jVar, m mVar, int i10) {
        this.f14905a = i10;
        this.f14906b = jVar;
        this.f14907c = mVar;
    }

    @Override
    public final void run() {
        r rVar;
        switch (this.f14905a) {
            case 0:
                j jVar = this.f14906b;
                c cVar = new c(jVar, this.f14907c, 2);
                Handler handler = jVar.f14988n;
                if (handler != null) {
                    handler.post(cVar);
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f14906b;
                c cVar2 = new c(jVar2, this.f14907c, 3);
                Handler handler2 = jVar2.f14988n;
                if (handler2 != null) {
                    handler2.post(cVar2);
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f14906b;
                m mVar = this.f14907c;
                if (jVar3.S && !jVar3.Y && jVar3.f15005w == mVar && jVar3.f15011z != null && (rVar = jVar3.v) != null) {
                    try {
                        long j3 = mVar.A;
                        if (j3 > 0) {
                            rVar.h = j3;
                            rVar.A = -1L;
                            rVar.B = 0L;
                            rVar.C = -1L;
                            rVar.f15085i = Long.MAX_VALUE;
                            rVar.f15075a0 = true;
                            n nVar = jVar3.f14979j;
                            nVar.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + j.u(jVar3.f15006w0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e7) {
                        jVar3.i();
                        jVar3.H(e7);
                        return;
                    }
                }
                return;
            default:
                j jVar4 = this.f14906b;
                m mVar2 = this.f14907c;
                if (jVar4.S && !jVar4.Y && jVar4.f15005w == mVar2) {
                    jVar4.i();
                    n nVar2 = jVar4.f14979j;
                    nVar2.b("common A/V start completed: segmentElapsedMs=" + j.u(jVar4.f15006w0));
                    t0 t0Var = (t0) jVar4.f14982k.f51194b;
                    t0Var.f15122i.post(new c0(t0Var, 2));
                    return;
                }
                return;
        }
    }
}
