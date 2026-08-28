package e5;

import d5.f0;
import h3.h0;
import j4.d0;
public final class v implements Runnable {
    public final int f4940a = 0;
    public final we.b f4941b;
    public final long f4942c;
    public final int d;

    public v(we.b bVar, int i9, long j10) {
        this.f4941b = bVar;
        this.d = i9;
        this.f4942c = j10;
    }

    @Override
    public final void run() {
        int i9 = this.f4940a;
        int i10 = this.d;
        long j10 = this.f4942c;
        we.b bVar = this.f4941b;
        switch (i9) {
            case 0:
                int i11 = f0.f4349a;
                i3.f fVar = ((h0) bVar.f48794c).f9440a.f9557r;
                i3.a i12 = fVar.i((d0) fVar.d.f4163e);
                fVar.l(i12, 1018, new i3.d(i12, i10, j10));
                return;
            default:
                int i13 = f0.f4349a;
                i3.f fVar2 = ((h0) bVar.f48794c).f9440a.f9557r;
                i3.a i14 = fVar2.i((d0) fVar2.d.f4163e);
                fVar2.l(i14, 1021, new i3.d(i14, j10, i10));
                return;
        }
    }

    public v(we.b bVar, long j10, int i9) {
        this.f4941b = bVar;
        this.f4942c = j10;
        this.d = i9;
    }
}
