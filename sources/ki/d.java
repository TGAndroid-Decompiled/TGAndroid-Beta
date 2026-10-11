package ki;

import android.os.Handler;
public final class d implements Runnable {
    public final int f14891a;
    public final k f14892b;
    public final n f14893c;

    public d(k kVar, n nVar, int i10) {
        this.f14891a = i10;
        this.f14892b = kVar;
        this.f14893c = nVar;
    }

    @Override
    public final void run() {
        t tVar;
        switch (this.f14891a) {
            case 0:
                k kVar = this.f14892b;
                d dVar = new d(kVar, this.f14893c, 2);
                Handler handler = kVar.f14996n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                k kVar2 = this.f14892b;
                d dVar2 = new d(kVar2, this.f14893c, 3);
                Handler handler2 = kVar2.f14996n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                k kVar3 = this.f14892b;
                n nVar = this.f14893c;
                if (kVar3.V && !kVar3.f14965b0 && kVar3.f15022x == nVar && kVar3.A != null && (tVar = kVar3.f15020w) != null) {
                    try {
                        long j3 = nVar.A;
                        if (j3 > 0) {
                            tVar.f15125p = j3;
                            tVar.Q = -1L;
                            tVar.R = 0L;
                            tVar.S = -1L;
                            tVar.f15127q = Long.MAX_VALUE;
                            tVar.f15132s0 = true;
                            o oVar = kVar3.f14986j;
                            oVar.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + k.z(kVar3.E0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e7) {
                        kVar3.k();
                        kVar3.N(e7);
                        return;
                    }
                }
                return;
            default:
                k kVar4 = this.f14892b;
                n nVar2 = this.f14893c;
                if (kVar4.V && !kVar4.f14965b0 && kVar4.f15022x == nVar2) {
                    kVar4.k();
                    o oVar2 = kVar4.f14986j;
                    oVar2.b("common A/V start completed: segmentElapsedMs=" + k.z(kVar4.E0));
                    v0 v0Var = (v0) kVar4.f14989k.f51228b;
                    v0Var.f15164i.post(new e0(v0Var, 2));
                    return;
                }
                return;
        }
    }
}
