package gb;
public final class w0 implements ib.b {
    public final int f13770a;
    public final ib.c f13771b;
    public final ib.c f13772c;

    public w0(ib.c cVar, ib.c cVar2, int i7) {
        this.f13770a = i7;
        this.f13771b = cVar;
        this.f13772c = cVar2;
    }

    @Override
    public final Object mo24get() {
        switch (this.f13770a) {
            case 0:
                return new v0((j1) this.f13771b.mo24get(), (k1) this.f13772c.mo24get());
            default:
                return new jb.l((jb.q) this.f13771b.mo24get(), (jb.q) this.f13772c.mo24get());
        }
    }
}
