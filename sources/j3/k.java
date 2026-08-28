package j3;
public final class k implements Runnable {
    public final int f13284a;
    public final m f13285b;
    public final Exception f13286c;

    public k(m mVar, Exception exc, int i9) {
        this.f13284a = i9;
        this.f13285b = mVar;
        this.f13286c = exc;
    }

    @Override
    public final void run() {
        int i9 = this.f13284a;
        Exception exc = this.f13286c;
        m mVar = this.f13285b;
        switch (i9) {
            case 0:
                n nVar = mVar.f13292b;
                int i10 = d5.f0.f4349a;
                i3.f fVar = ((h3.h0) nVar).f9440a.f9557r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1029, new h9.a(k10, exc, 16));
                return;
            default:
                n nVar2 = mVar.f13292b;
                int i11 = d5.f0.f4349a;
                i3.f fVar2 = ((h3.h0) nVar2).f9440a.f9557r;
                i3.a k11 = fVar2.k();
                fVar2.l(k11, 1014, new i3.d(k11, exc, 13));
                return;
        }
    }
}
