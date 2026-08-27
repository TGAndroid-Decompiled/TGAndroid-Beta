package e5;

import d5.g0;
import h3.h0;
import j4.c0;

public final class t implements Runnable {

    public final int f5294a = 0;

    public final xe.b f5295b;

    public final long f5296c;
    public final int d;

    public t(xe.b bVar, int i10, long j10) {
        this.f5295b = bVar;
        this.d = i10;
        this.f5296c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f5294a;
        int i11 = this.d;
        long j10 = this.f5296c;
        xe.b bVar = this.f5295b;
        switch (i10) {
            case 0:
                h0 h0Var = (h0) bVar.f49393c;
                int i12 = g0.f4795a;
                i3.f fVar = h0Var.f7870a.f7987r;
                i3.a aVarI = fVar.i((c0) fVar.d.f4605e);
                fVar.l(aVarI, 1018, new i3.d(aVarI, i11, j10));
                break;
            default:
                h0 h0Var2 = (h0) bVar.f49393c;
                int i13 = g0.f4795a;
                i3.f fVar2 = h0Var2.f7870a.f7987r;
                i3.a aVarI2 = fVar2.i((c0) fVar2.d.f4605e);
                fVar2.l(aVarI2, 1021, new i3.d(aVarI2, j10, i11));
                break;
        }
    }

    public t(xe.b bVar, long j10, int i10) {
        this.f5295b = bVar;
        this.f5296c = j10;
        this.d = i10;
    }
}
