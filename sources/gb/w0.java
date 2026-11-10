package gb;
public final class w0 implements ib.b {
    public final int f13772a;
    public final ib.c f13773b;
    public final ib.c f13774c;

    public w0(ib.c cVar, ib.c cVar2, int i7) {
        this.f13772a = i7;
        this.f13773b = cVar;
        this.f13774c = cVar2;
    }

    @Override
    public final Object mo24get() {
        switch (this.f13772a) {
            case 0:
                return new v0((j1) this.f13773b.mo24get(), (k1) this.f13774c.mo24get());
            default:
                return new jb.l((jb.q) this.f13773b.mo24get(), (jb.q) this.f13774c.mo24get());
        }
    }
}
