package defpackage;
public abstract class b2 extends pt5 implements fw2, ax2 {
    public final sw2 d;

    public b2(sw2 sw2Var, boolean z) {
        super(z);
        y((bt5) sw2Var.get(pd5.c));
        this.d = sw2Var.plus(this);
    }

    @Override
    public String D() {
        return super.D();
    }

    @Override
    public final void G(Object obj) {
        boolean z;
        if (obj instanceof fp2) {
            fp2 fp2Var = (fp2) obj;
            Throwable th = fp2Var.a;
            if (ex.a.getIntVolatile(fp2Var, fp2.b) != 0) {
                z = true;
            } else {
                z = false;
            }
            P(th, z);
            return;
        }
        Q(obj);
    }

    public final void R(dx2 dx2Var, b2 b2Var, eq4 eq4Var) {
        int ordinal = dx2Var.ordinal();
        g5c g5cVar = g5c.a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            sw2 sw2Var = this.d;
                            Object c = edd.c(sw2Var, null);
                            r3c.a(2, eq4Var);
                            Object invoke = eq4Var.invoke(b2Var, this);
                            edd.a(sw2Var, c);
                            if (invoke != bx2.a) {
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
                dle.a(((of0) eq4Var).create(b2Var, this)).resumeWith(g5cVar);
                return;
            }
            return;
        }
        try {
            r3c.c(dle.a(((of0) eq4Var).create(b2Var, this)), g5cVar);
        } finally {
            resumeWith(new sa9(th));
        }
    }

    @Override
    public final sw2 c() {
        return this.d;
    }

    @Override
    public final sw2 getContext() {
        return this.d;
    }

    @Override
    public final String l() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a = ta9.a(obj);
        if (a != null) {
            obj = new fp2(a, false);
        }
        Object C = C(obj);
        if (C == fad.b) {
            return;
        }
        g(C);
    }

    @Override
    public final void x(gp2 gp2Var) {
        c9e.a(this.d, gp2Var);
    }

    public void Q(Object obj) {
    }

    public void P(Throwable th, boolean z) {
    }
}
