package li;

import android.os.Handler;
public final class a implements Runnable {
    public final int f14741a;
    public final l f14742b;

    public a(l lVar, int i10) {
        this.f14741a = i10;
        this.f14742b = lVar;
    }

    @Override
    public final void run() {
        o oVar;
        boolean z10;
        switch (this.f14741a) {
            case 0:
                this.f14742b.u();
                return;
            case 1:
                this.f14742b.d0();
                return;
            case 2:
                l lVar = this.f14742b;
                Handler handler = lVar.f14861n;
                if (handler != null) {
                    handler.post(new a(lVar, 3));
                    return;
                }
                return;
            case 3:
                l lVar2 = this.f14742b;
                if (lVar2.V && lVar2.A != null && (oVar = lVar2.f14887x) != null) {
                    synchronized (oVar) {
                        z10 = oVar.f14933z;
                    }
                    if (!z10) {
                        try {
                            o oVar2 = lVar2.f14887x;
                            lVar2.f14889y = oVar2;
                            Handler handler2 = lVar2.f14861n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(lVar2.f14860m1);
                                handler2.postDelayed(lVar2.f14860m1, 3000L);
                            }
                            oVar2.p(new d(lVar2, oVar2, 0), new d(lVar2, oVar2, 1));
                            p pVar = lVar2.f14851j;
                            pVar.b("first camera frame received; audio startup requested: segmentElapsedMs=" + l.z(lVar2.E0));
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
                l lVar3 = this.f14742b;
                o oVar3 = lVar3.f14889y;
                if (lVar3.V && !lVar3.f14831b0 && oVar3 != null && lVar3.f14887x == oVar3) {
                    lVar3.f14889y = null;
                    lVar3.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 5:
                this.f14742b.g();
                return;
            case 6:
                this.f14742b.I();
                return;
            case 7:
                l lVar4 = this.f14742b;
                lVar4.V = false;
                lVar4.k();
                o oVar4 = lVar4.f14887x;
                if (oVar4 != null) {
                    long l4 = oVar4.l();
                    u uVar = lVar4.f14885w;
                    if (uVar != null && l4 != Long.MAX_VALUE) {
                        uVar.f14989q = Math.max(0L, l4) * 1000;
                        Handler handler3 = uVar.f14997u;
                        if (handler3 != null) {
                            handler3.removeCallbacks(uVar.f15003x0);
                        }
                    }
                }
                lVar4.p();
                o oVar5 = lVar4.f14887x;
                if (oVar5 != null) {
                    oVar5.q();
                    lVar4.f14887x = null;
                }
                lVar4.f14831b0 = false;
                u0 u0Var = (u0) lVar4.f14854k.f13233b;
                u0Var.f15011i.post(new f0(u0Var, 3));
                return;
            default:
                this.f14742b.d0();
                return;
        }
    }
}
