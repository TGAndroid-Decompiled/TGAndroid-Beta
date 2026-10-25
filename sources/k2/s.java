package k2;
public final class s implements Runnable {
    public final int f16267a;
    public final rf.b f16268b;
    public final i2.e f16269c;

    public s(rf.b bVar, i2.e eVar, int i10) {
        this.f16267a = i10;
        this.f16268b = bVar;
        this.f16269c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f16267a) {
            case 0:
                rf.b bVar = this.f16268b;
                i2.e eVar = this.f16269c;
                synchronized (eVar) {
                }
                String str = e2.n0.f9692a;
                j2.e eVar2 = ((i2.d0) ((v) bVar.f47333c)).f13509a.f13614s;
                j2.a n10 = eVar2.n((u2.g0) eVar2.d.e);
                eVar2.q(n10, 1013, new ig.g(n10, eVar, 28));
                return;
            default:
                rf.b bVar2 = this.f16268b;
                i2.e eVar3 = this.f16269c;
                String str2 = e2.n0.f9692a;
                j2.e eVar4 = ((i2.d0) ((v) bVar2.f47333c)).f13509a.f13614s;
                j2.a p10 = eVar4.p();
                eVar4.q(p10, 1007, new ig.g(p10, eVar3, 23));
                return;
        }
    }
}
