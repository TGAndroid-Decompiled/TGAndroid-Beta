package ae;
public final class p implements fd.c, hd.d {
    public final fd.c f411a;
    public final fd.h f412b;

    public p(fd.c cVar, fd.h hVar) {
        this.f411a = cVar;
        this.f412b = hVar;
    }

    @Override
    public final hd.d getCallerFrame() {
        fd.c cVar = this.f411a;
        if (cVar instanceof hd.d) {
            return (hd.d) cVar;
        }
        return null;
    }

    @Override
    public final fd.h getContext() {
        return this.f412b;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f411a.resumeWith(obj);
    }
}
