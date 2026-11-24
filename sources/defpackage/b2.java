package defpackage;
public abstract class b2 extends ov5 implements px2, ky2 {
    public final cy2 d;

    public b2(cy2 cy2Var, boolean z) {
        super(z);
        y((av5) cy2Var.get(nf5.c));
        this.d = cy2Var.plus(this);
    }

    @Override
    public String D() {
        return super.D();
    }

    @Override
    public final void G(Object obj) {
        boolean z;
        if (obj instanceof qq2) {
            qq2 qq2Var = (qq2) obj;
            Throwable th = qq2Var.a;
            if (fy.a.getIntVolatile(qq2Var, qq2.b) != 0) {
                z = true;
            } else {
                z = false;
            }
            P(th, z);
            return;
        }
        Q(obj);
    }

    public final void R(ny2 ny2Var, b2 b2Var, fs4 fs4Var) {
        int ordinal = ny2Var.ordinal();
        g7c g7cVar = g7c.a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            cy2 cy2Var = this.d;
                            Object c = gfd.c(cy2Var, null);
                            r5c.a(2, fs4Var);
                            Object invoke = fs4Var.invoke(b2Var, this);
                            gfd.a(cy2Var, c);
                            if (invoke != ly2.a) {
                                resumeWith(invoke);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                fne.a(((og0) fs4Var).create(b2Var, this)).resumeWith(g7cVar);
                return;
            }
            return;
        }
        try {
            r5c.c(fne.a(((og0) fs4Var).create(b2Var, this)), g7cVar);
        } finally {
            resumeWith(new sc9(th));
        }
    }

    @Override
    public final cy2 c() {
        return this.d;
    }

    @Override
    public final cy2 getContext() {
        return this.d;
    }

    @Override
    public final String l() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a = tc9.a(obj);
        if (a != null) {
            obj = new qq2(a, false);
        }
        Object C = C(obj);
        if (C == hcd.b) {
            return;
        }
        g(C);
    }

    @Override
    public final void x(rq2 rq2Var) {
        dbe.a(this.d, rq2Var);
    }

    public void Q(Object obj) {
    }

    public void P(Throwable th, boolean z) {
    }
}
