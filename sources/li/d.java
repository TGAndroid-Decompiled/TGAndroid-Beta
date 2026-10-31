package li;

import android.os.Handler;
public final class d implements Runnable {
    public final int f12035a;
    public final l f12036b;
    public final o f12037c;

    public d(l lVar, o oVar, int i10) {
        this.f12035a = i10;
        this.f12036b = lVar;
        this.f12037c = oVar;
    }

    @Override
    public final void run() {
        v vVar;
        switch (this.f12035a) {
            case 0:
                l lVar = this.f12036b;
                d dVar = new d(lVar, this.f12037c, 3);
                Handler handler = lVar.f12139n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                l lVar2 = this.f12036b;
                d dVar2 = new d(lVar2, this.f12037c, 2);
                Handler handler2 = lVar2.f12139n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                l lVar3 = this.f12036b;
                o oVar = this.f12037c;
                if (lVar3.V && !lVar3.f12109b0 && lVar3.f12166x == oVar) {
                    lVar3.k();
                    if (lVar3.f12127i0 == 0) {
                        lVar3.f12127i0 = oVar.e;
                    }
                    p pVar = lVar3.f12129j;
                    pVar.b("common A/V start completed: segmentElapsedMs=" + l.z(lVar3.F0));
                    x0 x0Var = (x0) lVar3.f12132k.f279b;
                    x0Var.f12312i.post(new l0(x0Var, 2));
                    return;
                }
                return;
            default:
                l lVar4 = this.f12036b;
                o oVar2 = this.f12037c;
                if (lVar4.V && !lVar4.f12109b0 && lVar4.f12166x == oVar2 && lVar4.A != null && (vVar = lVar4.f12164w) != null) {
                    try {
                        long j10 = oVar2.F;
                        if (j10 > 0) {
                            vVar.f12276p = j10;
                            vVar.Q = -1L;
                            vVar.R = 0L;
                            vVar.S = -1L;
                            vVar.f12278q = Long.MAX_VALUE;
                            vVar.f12283s0 = true;
                            p pVar2 = lVar4.f12129j;
                            pVar2.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + l.z(lVar4.F0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e) {
                        lVar4.k();
                        lVar4.N(e);
                        return;
                    }
                }
                return;
        }
    }
}
