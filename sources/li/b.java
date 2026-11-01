package li;

import android.os.Handler;
import j$.util.Objects;
public final class b implements Runnable {
    public final int f12028a;
    public final l f12029b;
    public final q0 f12030c;
    public final long d;

    public b(l lVar, q0 q0Var, long j10, int i10) {
        this.f12028a = i10;
        this.f12029b = lVar;
        this.f12030c = q0Var;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f12028a) {
            case 0:
                l lVar = this.f12029b;
                lVar.f12112c.post(new b(lVar, this.f12030c, this.d, 1));
                return;
            default:
                l lVar2 = this.f12029b;
                q0 q0Var = this.f12030c;
                long j10 = this.d;
                if (lVar2.V && lVar2.G == q0Var) {
                    p pVar = lVar2.f12130j;
                    pVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + l.z(j10));
                    x0 x0Var = (x0) lVar2.f12133k.f279b;
                    Handler handler = x0Var.f12313i;
                    k2.m0 m0Var = x0Var.d;
                    Objects.requireNonNull(m0Var);
                    handler.post(new lg.s(m0Var, 3));
                    return;
                }
                return;
        }
    }
}
