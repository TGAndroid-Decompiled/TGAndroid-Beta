package j3;
public final class l implements Runnable {
    public final int f13288a;
    public final m f13289b;
    public final k3.f f13290c;

    public l(m mVar, k3.f fVar, int i9) {
        this.f13288a = i9;
        this.f13289b = mVar;
        this.f13290c = fVar;
    }

    @Override
    public final void run() {
        switch (this.f13288a) {
            case 0:
                m mVar = this.f13289b;
                k3.f fVar = this.f13290c;
                n nVar = mVar.f13292b;
                int i9 = d5.f0.f4349a;
                i3.f fVar2 = ((h3.h0) nVar).f9440a.f9557r;
                i3.a k10 = fVar2.k();
                fVar2.l(k10, 1007, new i3.d(k10, fVar, 16));
                return;
            default:
                m mVar2 = this.f13289b;
                k3.f fVar3 = this.f13290c;
                synchronized (fVar3) {
                }
                n nVar2 = mVar2.f13292b;
                int i10 = d5.f0.f4349a;
                i3.f fVar4 = ((h3.h0) nVar2).f9440a.f9557r;
                i3.a i11 = fVar4.i((j4.d0) fVar4.d.f4163e);
                fVar4.l(i11, 1013, new i3.d(i11, fVar3, 4));
                return;
        }
    }
}
