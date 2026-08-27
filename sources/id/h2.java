package id;

public final class h2 extends nd.s {

    public final ThreadLocal f11158e;
    private volatile boolean threadLocalIsSet;

    public h2(rc.c cVar, rc.h hVar) {
        i2 i2Var = i2.f11160a;
        super(cVar, hVar.get(i2Var) == null ? hVar.plus(i2Var) : hVar);
        this.f11158e = new ThreadLocal();
        if (cVar.getContext().get(rc.d.f46898a) instanceof a0) {
            return;
        }
        Object objK = nd.a.k(hVar, null);
        nd.a.f(hVar, objK);
        N(hVar, objK);
    }

    public final boolean M() {
        boolean z10 = this.threadLocalIsSet && this.f11158e.get() == null;
        this.f11158e.remove();
        return !z10;
    }

    public final void N(rc.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f11158e.set(new pc.d(hVar, obj));
    }

    @Override
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            pc.d dVar = (pc.d) this.f11158e.get();
            if (dVar != null) {
                nd.a.f((rc.h) dVar.f45688a, dVar.f45689b);
            }
            this.f11158e.remove();
        }
        Object objR = f0.r(obj);
        rc.c cVar = this.d;
        rc.h context = cVar.getContext();
        Object objK = nd.a.k(context, null);
        h2 h2VarV = objK != nd.a.f18478f ? f0.v(cVar, context, objK) : null;
        try {
            this.d.resumeWith(objR);
        } finally {
            if (h2VarV == null || h2VarV.M()) {
                nd.a.f(context, objK);
            }
        }
    }
}
