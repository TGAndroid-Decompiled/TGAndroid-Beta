package k2;
public final class r implements Runnable {
    public final int f16260a;
    public final rf.b f16261b;
    public final Exception f16262c;

    public r(rf.b bVar, Exception exc, int i10) {
        this.f16260a = i10;
        this.f16261b = bVar;
        this.f16262c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f16260a;
        Exception exc = this.f16262c;
        rf.b bVar = this.f16261b;
        switch (i10) {
            case 0:
                String str = e2.n0.f9692a;
                j2.e eVar = ((i2.d0) ((v) bVar.f47333c)).f13509a.f13614s;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1029, new ig.g(p10, exc, 18));
                return;
            default:
                String str2 = e2.n0.f9692a;
                j2.e eVar2 = ((i2.d0) ((v) bVar.f47333c)).f13509a.f13614s;
                j2.a p11 = eVar2.p();
                eVar2.q(p11, 1014, new j2.d(p11, exc, 10));
                return;
        }
    }
}
