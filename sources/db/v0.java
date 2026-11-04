package db;
public final class v0 implements fb.b {
    public final int f8740a;
    public final fb.c f8741b;
    public final fb.c f8742c;

    public v0(fb.c cVar, fb.c cVar2, int i3) {
        this.f8740a = i3;
        this.f8741b = cVar;
        this.f8742c = cVar2;
    }

    @Override
    public final Object mo5get() {
        switch (this.f8740a) {
            case 0:
                return new u0((i1) this.f8741b.mo5get(), (j1) this.f8742c.mo5get());
            default:
                return new gb.l((gb.q) this.f8741b.mo5get(), (gb.q) this.f8742c.mo5get());
        }
    }
}
