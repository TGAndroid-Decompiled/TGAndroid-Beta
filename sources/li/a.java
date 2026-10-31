package li;

import android.os.Handler;
public final class a implements Runnable {
    public final int f12025a;
    public final l f12026b;

    public a(l lVar, int i10) {
        this.f12025a = i10;
        this.f12026b = lVar;
    }

    @Override
    public final void run() {
        o oVar;
        boolean z10;
        switch (this.f12025a) {
            case 0:
                this.f12026b.u();
                return;
            case 1:
                this.f12026b.d0();
                return;
            case 2:
                l lVar = this.f12026b;
                Handler handler = lVar.f12139n;
                if (handler != null) {
                    handler.post(new a(lVar, 3));
                    return;
                }
                return;
            case 3:
                l lVar2 = this.f12026b;
                if (lVar2.V && lVar2.A != null && (oVar = lVar2.f12166x) != null) {
                    synchronized (oVar) {
                        z10 = oVar.E;
                    }
                    if (!z10) {
                        try {
                            o oVar2 = lVar2.f12166x;
                            lVar2.f12168y = oVar2;
                            Handler handler2 = lVar2.f12139n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(lVar2.f12141n1);
                                handler2.postDelayed(lVar2.f12141n1, 3000L);
                            }
                            oVar2.t(new d(lVar2, oVar2, 0), new d(lVar2, oVar2, 1));
                            p pVar = lVar2.f12129j;
                            pVar.b("first camera frame received; audio startup requested: segmentElapsedMs=" + l.z(lVar2.F0));
                            return;
                        } catch (RuntimeException e) {
                            lVar2.k();
                            lVar2.N(e);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                l lVar3 = this.f12026b;
                o oVar3 = lVar3.f12168y;
                if (lVar3.V && !lVar3.f12109b0 && oVar3 != null && lVar3.f12166x == oVar3) {
                    lVar3.f12168y = null;
                    lVar3.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 5:
                this.f12026b.g();
                return;
            case 6:
                l lVar4 = this.f12026b;
                lVar4.V = false;
                lVar4.k();
                o oVar4 = lVar4.f12166x;
                if (oVar4 != null) {
                    long p5 = oVar4.p();
                    v vVar = lVar4.f12164w;
                    if (vVar != null && p5 != Long.MAX_VALUE) {
                        vVar.f12278q = Math.max(0L, p5) * 1000;
                        Handler handler3 = vVar.f12286u;
                        if (handler3 != null) {
                            handler3.removeCallbacks(vVar.f12292x0);
                        }
                    }
                }
                lVar4.p();
                o oVar5 = lVar4.f12166x;
                if (oVar5 != null) {
                    oVar5.u();
                    lVar4.f12166x = null;
                }
                lVar4.f12109b0 = false;
                x0 x0Var = (x0) lVar4.f12132k.f279b;
                x0Var.f12312i.post(new l0(x0Var, 3));
                return;
            case 7:
                this.f12026b.I();
                return;
            default:
                this.f12026b.d0();
                return;
        }
    }
}
