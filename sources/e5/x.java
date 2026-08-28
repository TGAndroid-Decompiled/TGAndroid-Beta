package e5;

import d5.f0;
import gh.i3;
import h3.h0;
import h3.k0;
import j4.d0;
public final class x implements Runnable {
    public final int f4946a;
    public final we.b f4947b;
    public final k3.f f4948c;

    public x(we.b bVar, k3.f fVar, int i9) {
        this.f4946a = i9;
        this.f4947b = bVar;
        this.f4948c = fVar;
    }

    @Override
    public final void run() {
        switch (this.f4946a) {
            case 0:
                we.b bVar = this.f4947b;
                k3.f fVar = this.f4948c;
                synchronized (fVar) {
                }
                int i9 = f0.f4349a;
                k0 k0Var = ((h0) bVar.f48794c).f9440a;
                i3.f fVar2 = k0Var.f9557r;
                i3.a i10 = fVar2.i((d0) fVar2.d.f4163e);
                fVar2.l(i10, 1020, new i3(i10, fVar, 17));
                k0Var.P = null;
                return;
            default:
                we.b bVar2 = this.f4947b;
                k3.f fVar3 = this.f4948c;
                int i11 = f0.f4349a;
                i3.f fVar4 = ((h0) bVar2.f48794c).f9440a.f9557r;
                i3.a k10 = fVar4.k();
                fVar4.l(k10, 1015, new i3.d(k10, fVar3, 0));
                return;
        }
    }
}
