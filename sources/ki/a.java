package ki;

import android.os.Handler;
public final class a implements Runnable {
    public final int f14827a;
    public final i f14828b;

    public a(i iVar, int i10) {
        this.f14827a = i10;
        this.f14828b = iVar;
    }

    @Override
    public final void run() {
        l lVar;
        boolean z10;
        switch (this.f14827a) {
            case 0:
                this.f14828b.j();
                return;
            case 1:
                i iVar = this.f14828b;
                Handler handler = iVar.f14915n;
                if (handler != null) {
                    handler.post(new a(iVar, 2));
                    return;
                }
                return;
            case 2:
                i iVar2 = this.f14828b;
                if (iVar2.S && iVar2.f14938z != null && (lVar = iVar2.f14932w) != null) {
                    synchronized (lVar) {
                        z10 = lVar.f14981z;
                    }
                    if (!z10) {
                        try {
                            l lVar2 = iVar2.f14932w;
                            iVar2.f14934x = lVar2;
                            Handler handler2 = iVar2.f14915n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(iVar2.N0);
                                handler2.postDelayed(iVar2.N0, 3000L);
                            }
                            lVar2.p(new c(iVar2, lVar2, 0), new c(iVar2, lVar2, 1));
                            m mVar = iVar2.f14908j;
                            mVar.b("first camera frame received; audio startup requested: segmentElapsedMs=" + i.m(iVar2.f14902f0));
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
                i iVar3 = this.f14828b;
                l lVar3 = iVar3.f14934x;
                if (iVar3.S && !iVar3.Y && lVar3 != null && iVar3.f14932w == lVar3) {
                    iVar3.f14934x = null;
                    iVar3.t(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 4:
                this.f14828b.a();
                return;
            case 5:
                this.f14828b.r();
                return;
            case 6:
                i iVar4 = this.f14828b;
                iVar4.S = false;
                iVar4.d();
                l lVar4 = iVar4.f14932w;
                if (lVar4 != null) {
                    long l4 = lVar4.l();
                    q qVar = iVar4.v;
                    if (qVar != null && l4 != Long.MAX_VALUE) {
                        qVar.f15012i = Math.max(0L, l4) * 1000;
                        Handler handler3 = qVar.f15016m;
                        if (handler3 != null) {
                            handler3.removeCallbacks(qVar.f15009e0);
                        }
                    }
                }
                iVar4.h();
                l lVar5 = iVar4.f14932w;
                if (lVar5 != null) {
                    lVar5.q();
                    iVar4.f14932w = null;
                }
                iVar4.Y = false;
                s0 s0Var = (s0) iVar4.f14910k.f12543b;
                s0Var.f15049i.post(new b0(s0Var, 3));
                return;
            default:
                this.f14828b.G();
                return;
        }
    }
}
