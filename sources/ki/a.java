package ki;

import android.os.Handler;
public final class a implements Runnable {
    public final int f14874a;
    public final j f14875b;

    public a(j jVar, int i10) {
        this.f14874a = i10;
        this.f14875b = jVar;
    }

    @Override
    public final void run() {
        m mVar;
        boolean z10;
        switch (this.f14874a) {
            case 0:
                this.f14875b.q();
                return;
            case 1:
                j jVar = this.f14875b;
                Handler handler = jVar.f14988n;
                if (handler != null) {
                    handler.post(new a(jVar, 2));
                    return;
                }
                return;
            case 2:
                j jVar2 = this.f14875b;
                if (jVar2.S && jVar2.f15011z != null && (mVar = jVar2.f15005w) != null) {
                    synchronized (mVar) {
                        z10 = mVar.f15054z;
                    }
                    if (!z10) {
                        try {
                            m mVar2 = jVar2.f15005w;
                            jVar2.f15007x = mVar2;
                            Handler handler2 = jVar2.f14988n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(jVar2.f14967e1);
                                handler2.postDelayed(jVar2.f14967e1, 3000L);
                            }
                            mVar2.p(new c(jVar2, mVar2, 0), new c(jVar2, mVar2, 1));
                            n nVar = jVar2.f14979j;
                            nVar.b("first camera frame received; audio startup requested: segmentElapsedMs=" + j.u(jVar2.f15006w0));
                            return;
                        } catch (RuntimeException e7) {
                            jVar2.i();
                            jVar2.H(e7);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                j jVar3 = this.f14875b;
                m mVar3 = jVar3.f15007x;
                if (jVar3.S && !jVar3.Y && mVar3 != null && jVar3.f15005w == mVar3) {
                    jVar3.f15007x = null;
                    jVar3.H(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 4:
                this.f14875b.e();
                return;
            case 5:
                this.f14875b.C();
                return;
            case 6:
                j jVar4 = this.f14875b;
                jVar4.S = false;
                jVar4.i();
                m mVar4 = jVar4.f15005w;
                if (mVar4 != null) {
                    long l4 = mVar4.l();
                    r rVar = jVar4.v;
                    if (rVar != null && l4 != Long.MAX_VALUE) {
                        rVar.f15085i = Math.max(0L, l4) * 1000;
                        Handler handler3 = rVar.f15089m;
                        if (handler3 != null) {
                            handler3.removeCallbacks(rVar.f15082e0);
                        }
                    }
                }
                jVar4.n();
                m mVar5 = jVar4.f15005w;
                if (mVar5 != null) {
                    mVar5.q();
                    jVar4.f15005w = null;
                }
                jVar4.Y = false;
                t0 t0Var = (t0) jVar4.f14982k.f51194b;
                t0Var.f15122i.post(new c0(t0Var, 3));
                return;
            default:
                this.f14875b.W();
                return;
        }
    }
}
