package k2;
public final class r implements Runnable {
    public final int f13986a;
    public final qf.b f13987b;
    public final i2.e f13988c;

    public r(qf.b bVar, i2.e eVar, int i10) {
        this.f13986a = i10;
        this.f13987b = bVar;
        this.f13988c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f13986a) {
            case 0:
                qf.b bVar = this.f13987b;
                i2.e eVar = this.f13988c;
                synchronized (eVar) {
                }
                String str = e2.m0.f8375a;
                j2.f fVar = ((i2.b0) ((u) bVar.f43098c)).f10929a.f11016s;
                j2.a n10 = fVar.n((u2.g0) fVar.d.e);
                fVar.q(n10, 1013, new j2.c(n10, eVar, 24));
                return;
            default:
                qf.b bVar2 = this.f13987b;
                i2.e eVar2 = this.f13988c;
                String str2 = e2.m0.f8375a;
                j2.f fVar2 = ((i2.b0) ((u) bVar2.f43098c)).f10929a.f11016s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, eVar2, 19));
                return;
        }
    }
}
