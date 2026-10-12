package li;

import android.os.Handler;
public final class d implements Runnable {
    public final int f14755a;
    public final l f14756b;
    public final o f14757c;

    public d(l lVar, o oVar, int i10) {
        this.f14755a = i10;
        this.f14756b = lVar;
        this.f14757c = oVar;
    }

    @Override
    public final void run() {
        u uVar;
        switch (this.f14755a) {
            case 0:
                l lVar = this.f14756b;
                d dVar = new d(lVar, this.f14757c, 2);
                Handler handler = lVar.f14861n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                l lVar2 = this.f14756b;
                d dVar2 = new d(lVar2, this.f14757c, 3);
                Handler handler2 = lVar2.f14861n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                l lVar3 = this.f14756b;
                o oVar = this.f14757c;
                if (lVar3.V && !lVar3.f14831b0 && lVar3.f14887x == oVar && lVar3.A != null && (uVar = lVar3.f14885w) != null) {
                    try {
                        long j10 = oVar.A;
                        if (j10 > 0) {
                            uVar.f14987p = j10;
                            uVar.Q = -1L;
                            uVar.R = 0L;
                            uVar.S = -1L;
                            uVar.f14989q = Long.MAX_VALUE;
                            uVar.f14994s0 = true;
                            p pVar = lVar3.f14851j;
                            pVar.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + l.z(lVar3.E0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e) {
                        lVar3.k();
                        lVar3.N(e);
                        return;
                    }
                }
                return;
            default:
                l lVar4 = this.f14756b;
                o oVar2 = this.f14757c;
                if (lVar4.V && !lVar4.f14831b0 && lVar4.f14887x == oVar2) {
                    lVar4.k();
                    p pVar2 = lVar4.f14851j;
                    pVar2.b("common A/V start completed: segmentElapsedMs=" + l.z(lVar4.E0));
                    u0 u0Var = (u0) lVar4.f14854k.f13233b;
                    u0Var.f15011i.post(new f0(u0Var, 2));
                    return;
                }
                return;
        }
    }
}
