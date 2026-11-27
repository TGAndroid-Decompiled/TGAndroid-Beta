package defpackage;
public abstract class c2 extends sv5 implements zw2, ux2 {
    public final mx2 d;

    public c2(mx2 mx2Var, boolean z) {
        super(z);
        y((ev5) mx2Var.get(qf5.c));
        this.d = mx2Var.plus(this);
    }

    @Override
    public String D() {
        return super.D();
    }

    @Override
    public final void G(Object obj) {
        boolean z;
        if (obj instanceof yp2) {
            yp2 yp2Var = (yp2) obj;
            Throwable th = yp2Var.a;
            if (fx.a.getIntVolatile(yp2Var, yp2.b) != 0) {
                z = true;
            } else {
                z = false;
            }
            P(th, z);
            return;
        }
        Q(obj);
    }

    public final void R(xx2 xx2Var, c2 c2Var, is4 is4Var) {
        int ordinal = xx2Var.ordinal();
        g9c g9cVar = g9c.a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            mx2 mx2Var = this.d;
                            Object c = xhd.c(mx2Var, null);
                            q7c.a(2, is4Var);
                            Object invoke = is4Var.invoke(c2Var, this);
                            xhd.a(mx2Var, c);
                            if (invoke != vx2.a) {
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
                xpe.a(((qf0) is4Var).create(c2Var, this)).resumeWith(g9cVar);
                return;
            }
            return;
        }
        try {
            q7c.c(xpe.a(((qf0) is4Var).create(c2Var, this)), g9cVar);
        } finally {
            resumeWith(new ge9(th));
        }
    }

    @Override
    public final mx2 c() {
        return this.d;
    }

    @Override
    public final mx2 getContext() {
        return this.d;
    }

    @Override
    public final String l() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a = he9.a(obj);
        if (a != null) {
            obj = new yp2(a, false);
        }
        Object C = C(obj);
        if (C == yed.b) {
            return;
        }
        g(C);
    }

    @Override
    public final void x(zp2 zp2Var) {
        sde.a(this.d, zp2Var);
    }

    public void Q(Object obj) {
    }

    public void P(Throwable th, boolean z) {
    }
}
