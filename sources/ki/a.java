package ki;

import android.os.Handler;
public final class a implements Runnable {
    public final int f14828a;
    public final i f14829b;

    public a(i iVar, int i10) {
        this.f14828a = i10;
        this.f14829b = iVar;
    }

    @Override
    public final void run() {
        l lVar;
        boolean z10;
        switch (this.f14828a) {
            case 0:
                this.f14829b.j();
                return;
            case 1:
                i iVar = this.f14829b;
                Handler handler = iVar.f14916n;
                if (handler != null) {
                    handler.post(new a(iVar, 2));
                    return;
                }
                return;
            case 2:
                i iVar2 = this.f14829b;
                if (iVar2.S && iVar2.f14939z != null && (lVar = iVar2.f14933w) != null) {
                    synchronized (lVar) {
                        z10 = lVar.f14982z;
                    }
                    if (!z10) {
                        try {
                            l lVar2 = iVar2.f14933w;
                            iVar2.f14935x = lVar2;
                            Handler handler2 = iVar2.f14916n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(iVar2.N0);
                                handler2.postDelayed(iVar2.N0, 3000L);
                            }
                            lVar2.p(new c(iVar2, lVar2, 0), new c(iVar2, lVar2, 1));
                            m mVar = iVar2.f14909j;
                            mVar.b("first camera frame received; audio startup requested: segmentElapsedMs=" + i.m(iVar2.f14903f0));
                            return;
                        } catch (RuntimeException e7) {
                            iVar2.d();
                            iVar2.t(e7);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                i iVar3 = this.f14829b;
                l lVar3 = iVar3.f14935x;
                if (iVar3.S && !iVar3.Y && lVar3 != null && iVar3.f14933w == lVar3) {
                    iVar3.f14935x = null;
                    iVar3.t(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 4:
                this.f14829b.a();
                return;
            case 5:
                this.f14829b.r();
                return;
            case 6:
                i iVar4 = this.f14829b;
                iVar4.S = false;
                iVar4.d();
                l lVar4 = iVar4.f14933w;
                if (lVar4 != null) {
                    long l4 = lVar4.l();
                    q qVar = iVar4.v;
                    if (qVar != null && l4 != Long.MAX_VALUE) {
                        qVar.f15013i = Math.max(0L, l4) * 1000;
                        Handler handler3 = qVar.f15017m;
                        if (handler3 != null) {
                            handler3.removeCallbacks(qVar.f15010e0);
                        }
                    }
                }
                iVar4.h();
                l lVar5 = iVar4.f14933w;
                if (lVar5 != null) {
                    lVar5.q();
                    iVar4.f14933w = null;
                }
                iVar4.Y = false;
                s0 s0Var = (s0) iVar4.f14911k.f12544b;
                s0Var.f15050i.post(new b0(s0Var, 3));
                return;
            default:
                this.f14829b.G();
                return;
        }
    }
}
