package ki;

import android.os.Handler;
import j$.util.Objects;
public final class b implements Runnable {
    public final int f14878a;
    public final k f14879b;
    public final o0 f14880c;
    public final long d;

    public b(k kVar, o0 o0Var, long j3, int i10) {
        this.f14878a = i10;
        this.f14879b = kVar;
        this.f14880c = o0Var;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f14878a) {
            case 0:
                k kVar = this.f14879b;
                kVar.f14967c.post(new b(kVar, this.f14880c, this.d, 1));
                return;
            default:
                k kVar2 = this.f14879b;
                o0 o0Var = this.f14880c;
                long j3 = this.d;
                if (kVar2.V && kVar2.G == o0Var) {
                    o oVar = kVar2.f14986j;
                    oVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.z(j3));
                    v0 v0Var = (v0) kVar2.f14989k.f51228b;
                    Handler handler = v0Var.f15164i;
                    m2.t tVar = v0Var.d;
                    Objects.requireNonNull(tVar);
                    handler.post(new i2.h0(tVar, 10));
                    return;
                }
                return;
        }
    }
}
