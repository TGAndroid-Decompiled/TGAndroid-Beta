package k2;
public final class r implements Runnable {
    public final int f16259a;
    public final rf.b f16260b;
    public final Exception f16261c;

    public r(rf.b bVar, Exception exc, int i10) {
        this.f16259a = i10;
        this.f16260b = bVar;
        this.f16261c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f16259a;
        Exception exc = this.f16261c;
        rf.b bVar = this.f16260b;
        switch (i10) {
            case 0:
                String str = e2.n0.f9691a;
                j2.e eVar = ((i2.d0) ((v) bVar.f47371c)).f13508a.f13613s;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1029, new ig.g(p10, exc, 18));
                return;
            default:
                String str2 = e2.n0.f9691a;
                j2.e eVar2 = ((i2.d0) ((v) bVar.f47371c)).f13508a.f13613s;
                j2.a p11 = eVar2.p();
                eVar2.q(p11, 1014, new j2.d(p11, exc, 10));
                return;
        }
    }
}
