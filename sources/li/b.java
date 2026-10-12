package li;

import android.os.Handler;
import j$.util.Objects;
public final class b implements Runnable {
    public final int f14746a;
    public final l f14747b;
    public final n0 f14748c;
    public final long d;

    public b(l lVar, n0 n0Var, long j10, int i10) {
        this.f14746a = i10;
        this.f14747b = lVar;
        this.f14748c = n0Var;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f14746a) {
            case 0:
                l lVar = this.f14747b;
                lVar.f14833c.post(new b(lVar, this.f14748c, this.d, 1));
                return;
            default:
                l lVar2 = this.f14747b;
                n0 n0Var = this.f14748c;
                long j10 = this.d;
                if (lVar2.V && lVar2.G == n0Var) {
                    p pVar = lVar2.f14851j;
                    pVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + l.z(j10));
                    u0 u0Var = (u0) lVar2.f14854k.f13233b;
                    Handler handler = u0Var.f15011i;
                    l2.f fVar = u0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new ig.t0(fVar, 16));
                    return;
                }
                return;
        }
    }
}
