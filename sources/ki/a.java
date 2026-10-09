package ki;

import android.os.Handler;
public final class a implements Runnable {
    public final int f14875a;
    public final j f14876b;

    public a(j jVar, int i10) {
        this.f14875a = i10;
        this.f14876b = jVar;
    }

    @Override
    public final void run() {
        m mVar;
        boolean z10;
        switch (this.f14875a) {
            case 0:
                this.f14876b.o();
                return;
            case 1:
                j jVar = this.f14876b;
                Handler handler = jVar.f14985n;
                if (handler != null) {
                    handler.post(new a(jVar, 2));
                    return;
                }
                return;
            case 2:
                j jVar2 = this.f14876b;
                if (jVar2.S && jVar2.f15008z != null && (mVar = jVar2.f15002w) != null) {
                    synchronized (mVar) {
                        z10 = mVar.f15051z;
                    }
                    if (!z10) {
                        try {
                            m mVar2 = jVar2.f15002w;
                            jVar2.f15004x = mVar2;
                            Handler handler2 = jVar2.f14985n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(jVar2.f14957a1);
                                handler2.postDelayed(jVar2.f14957a1, 3000L);
                            }
                            mVar2.p(new c(jVar2, mVar2, 0), new c(jVar2, mVar2, 1));
                            n nVar = jVar2.f14978j;
                            nVar.b("first camera frame received; audio startup requested: segmentElapsedMs=" + j.s(jVar2.f14996s0));
                            return;
                        } catch (RuntimeException e7) {
                            jVar2.g();
                            jVar2.C(e7);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                j jVar3 = this.f14876b;
                m mVar3 = jVar3.f15004x;
                if (jVar3.S && !jVar3.Y && mVar3 != null && jVar3.f15002w == mVar3) {
                    jVar3.f15004x = null;
                    jVar3.C(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 4:
                this.f14876b.c();
                return;
            case 5:
                this.f14876b.y();
                return;
            case 6:
                j jVar4 = this.f14876b;
                jVar4.S = false;
                jVar4.g();
                m mVar4 = jVar4.f15002w;
                if (mVar4 != null) {
                    long l4 = mVar4.l();
                    r rVar = jVar4.v;
                    if (rVar != null && l4 != Long.MAX_VALUE) {
                        rVar.f15082i = Math.max(0L, l4) * 1000;
                        Handler handler3 = rVar.f15086m;
                        if (handler3 != null) {
                            handler3.removeCallbacks(rVar.f15079e0);
                        }
                    }
                }
                jVar4.l();
                m mVar5 = jVar4.f15002w;
                if (mVar5 != null) {
                    mVar5.q();
                    jVar4.f15002w = null;
                }
                jVar4.Y = false;
                t0 t0Var = (t0) jVar4.f14980k.f51107b;
                t0Var.f15119i.post(new c0(t0Var, 3));
                return;
            default:
                this.f14876b.Q();
                return;
        }
    }
}
