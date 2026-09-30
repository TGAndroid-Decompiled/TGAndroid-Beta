package ki;

import android.os.Handler;
public final class a implements Runnable {
    public final int f13652a;
    public final i f13653b;

    public a(i iVar, int i10) {
        this.f13652a = i10;
        this.f13653b = iVar;
    }

    @Override
    public final void run() {
        l lVar;
        boolean z10;
        switch (this.f13652a) {
            case 0:
                this.f13653b.j();
                return;
            case 1:
                i iVar = this.f13653b;
                Handler handler = iVar.f13735n;
                if (handler != null) {
                    handler.post(new a(iVar, 2));
                    return;
                }
                return;
            case 2:
                i iVar2 = this.f13653b;
                if (iVar2.S && iVar2.f13758z != null && (lVar = iVar2.f13752w) != null) {
                    synchronized (lVar) {
                        z10 = lVar.f13799z;
                    }
                    if (!z10) {
                        try {
                            l lVar2 = iVar2.f13752w;
                            iVar2.f13754x = lVar2;
                            Handler handler2 = iVar2.f13735n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(iVar2.N0);
                                handler2.postDelayed(iVar2.N0, 3000L);
                            }
                            lVar2.p(new c(iVar2, lVar2, 0), new c(iVar2, lVar2, 1));
                            m mVar = iVar2.f13728j;
                            mVar.b("first camera frame received; audio startup requested: segmentElapsedMs=" + i.m(iVar2.f13722f0));
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
                i iVar3 = this.f13653b;
                l lVar3 = iVar3.f13754x;
                if (iVar3.S && !iVar3.Y && lVar3 != null && iVar3.f13752w == lVar3) {
                    iVar3.f13754x = null;
                    iVar3.t(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 4:
                this.f13653b.a();
                return;
            case 5:
                this.f13653b.r();
                return;
            case 6:
                i iVar4 = this.f13653b;
                iVar4.S = false;
                iVar4.d();
                l lVar4 = iVar4.f13752w;
                if (lVar4 != null) {
                    long l4 = lVar4.l();
                    q qVar = iVar4.v;
                    if (qVar != null && l4 != Long.MAX_VALUE) {
                        qVar.f13828i = Math.max(0L, l4) * 1000;
                        Handler handler3 = qVar.f13832m;
                        if (handler3 != null) {
                            handler3.removeCallbacks(qVar.f13825e0);
                        }
                    }
                }
                iVar4.h();
                l lVar5 = iVar4.f13752w;
                if (lVar5 != null) {
                    lVar5.q();
                    iVar4.f13752w = null;
                }
                iVar4.Y = false;
                s0 s0Var = (s0) iVar4.f13730k.f13384b;
                s0Var.f13863i.post(new b0(s0Var, 3));
                return;
            default:
                this.f13653b.G();
                return;
        }
    }
}
