package defpackage;

import sun.misc.Unsafe;
public abstract class fud {
    public static sd3 a(ux2 ux2Var, is4 is4Var) {
        ?? c2Var = new c2(g4e.b(ux2Var, u24.a), true);
        c2Var.R(xx2.a, c2Var, is4Var);
        return c2Var;
    }

    public static uqa b(ux2 ux2Var, is4 is4Var) {
        ?? c2Var = new c2(g4e.b(ux2Var, u24.a), true);
        c2Var.R(xx2.a, c2Var, is4Var);
        return c2Var;
    }

    public static final Object c(mx2 mx2Var, is4 is4Var, zw2 zw2Var) {
        mx2 a;
        Unsafe unsafe;
        long j;
        mx2 context = zw2Var.getContext();
        if (!((Boolean) mx2Var.fold(Boolean.FALSE, new xm2((byte) 2))).booleanValue()) {
            a = context.plus(mx2Var);
        } else {
            a = g4e.a(context, mx2Var, false);
        }
        gqe.a(a);
        if (a == context) {
            ju9 ju9Var = new ju9(zw2Var, a);
            return x1f.a(ju9Var, ju9Var, is4Var);
        }
        rj2 rj2Var = rj2.b;
        if (ur5.a(a.get(rj2Var), context.get(rj2Var))) {
            x8c x8cVar = new x8c(zw2Var, a);
            mx2 mx2Var2 = x8cVar.d;
            Object c = xhd.c(mx2Var2, null);
            try {
                return x1f.a(x8cVar, x8cVar, is4Var);
            } finally {
                xhd.a(mx2Var2, c);
            }
        }
        ju9 ju9Var2 = new ju9(zw2Var, a);
        try {
            q7c.c(xpe.a(((qf0) is4Var).create(ju9Var2, ju9Var2)), f9c.a);
            do {
                unsafe = fx.a;
                j = zo3.f;
                int intVolatile = unsafe.getIntVolatile(ju9Var2, j);
                if (intVolatile != 0) {
                    if (intVolatile == 2) {
                        Object a2 = yed.a(ju9Var2.v());
                        if (a2 instanceof yp2) {
                            throw ((yp2) a2).a;
                        }
                        return a2;
                    }
                    grb.i("Already suspended");
                    return null;
                }
            } while (!unsafe.compareAndSwapInt(ju9Var2, j, 0, 1));
            return vx2.a;
        } catch (Throwable th) {
            ju9Var2.resumeWith(new ge9(th));
            throw th;
        }
    }
}
