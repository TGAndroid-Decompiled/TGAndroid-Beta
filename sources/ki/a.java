package ki;

import android.os.Handler;
public final class a implements Runnable {
    public final int f13637a;
    public final i f13638b;

    public a(i iVar, int i10) {
        this.f13637a = i10;
        this.f13638b = iVar;
    }

    @Override
    public final void run() {
        l lVar;
        boolean z10;
        switch (this.f13637a) {
            case 0:
                this.f13638b.j();
                return;
            case 1:
                i iVar = this.f13638b;
                Handler handler = iVar.f13720n;
                if (handler != null) {
                    handler.post(new a(iVar, 2));
                    return;
                }
                return;
            case 2:
                i iVar2 = this.f13638b;
                if (iVar2.S && iVar2.f13743z != null && (lVar = iVar2.f13737w) != null) {
                    synchronized (lVar) {
                        z10 = lVar.f13783z;
                    }
                    if (!z10) {
                        try {
                            l lVar2 = iVar2.f13737w;
                            iVar2.f13739x = lVar2;
                            Handler handler2 = iVar2.f13720n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(iVar2.N0);
                                handler2.postDelayed(iVar2.N0, 3000L);
                            }
                            lVar2.p(new c(iVar2, lVar2, 0), new c(iVar2, lVar2, 1));
                            m mVar = iVar2.f13713j;
                            mVar.b("first camera frame received; audio startup requested: segmentElapsedMs=" + i.m(iVar2.f13707f0));
                            return;
                        } catch (RuntimeException e) {
                            iVar2.d();
                            iVar2.t(e);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                i iVar3 = this.f13638b;
                l lVar3 = iVar3.f13739x;
                if (iVar3.S && !iVar3.Y && lVar3 != null && iVar3.f13737w == lVar3) {
                    iVar3.f13739x = null;
                    iVar3.t(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 4:
                this.f13638b.a();
                return;
            case 5:
                this.f13638b.r();
                return;
            case 6:
                i iVar4 = this.f13638b;
                iVar4.S = false;
                iVar4.d();
                l lVar4 = iVar4.f13737w;
                if (lVar4 != null) {
                    long l4 = lVar4.l();
                    q qVar = iVar4.v;
                    if (qVar != null && l4 != Long.MAX_VALUE) {
                        qVar.f13812i = Math.max(0L, l4) * 1000;
                        Handler handler3 = qVar.f13816m;
                        if (handler3 != null) {
                            handler3.removeCallbacks(qVar.f13809e0);
                        }
                    }
                }
                iVar4.h();
                l lVar5 = iVar4.f13737w;
                if (lVar5 != null) {
                    lVar5.q();
                    iVar4.f13737w = null;
                }
                iVar4.Y = false;
                s0 s0Var = (s0) iVar4.f13715k.f13369b;
                s0Var.h.post(new b0(s0Var, 3));
                return;
            default:
                this.f13638b.G();
                return;
        }
    }
}
