package defpackage;

import sun.misc.Unsafe;
public abstract class ppd {
    public static ad3 a(ax2 ax2Var, eq4 eq4Var) {
        ?? b2Var = new b2(qzd.b(ax2Var, z14.a), true);
        b2Var.R(dx2.a, b2Var, eq4Var);
        return b2Var;
    }

    public static xma b(ax2 ax2Var, eq4 eq4Var) {
        ?? b2Var = new b2(qzd.b(ax2Var, z14.a), true);
        b2Var.R(dx2.a, b2Var, eq4Var);
        return b2Var;
    }

    public static final Object c(sw2 sw2Var, eq4 eq4Var, fw2 fw2Var) {
        sw2 a;
        Unsafe unsafe;
        long j;
        sw2 context = fw2Var.getContext();
        if (!((Boolean) sw2Var.fold(Boolean.FALSE, new dm2((byte) 2))).booleanValue()) {
            a = context.plus(sw2Var);
        } else {
            a = qzd.a(context, sw2Var, false);
        }
        nle.a(a);
        if (a == context) {
            rq9 rq9Var = new rq9(fw2Var, a);
            return dxe.a(rq9Var, rq9Var, eq4Var);
        }
        vi2 vi2Var = vi2.b;
        if (rp5.a(a.get(vi2Var), context.get(vi2Var))) {
            y4c y4cVar = new y4c(fw2Var, a);
            sw2 sw2Var2 = y4cVar.d;
            Object c = edd.c(sw2Var2, null);
            try {
                return dxe.a(y4cVar, y4cVar, eq4Var);
            } finally {
                edd.a(sw2Var2, c);
            }
        }
        rq9 rq9Var2 = new rq9(fw2Var, a);
        try {
            r3c.c(dle.a(((of0) eq4Var).create(rq9Var2, rq9Var2)), g5c.a);
            do {
                unsafe = ex.a;
                j = io3.f;
                int intVolatile = unsafe.getIntVolatile(rq9Var2, j);
                if (intVolatile != 0) {
                    if (intVolatile == 2) {
                        Object a2 = fad.a(rq9Var2.v());
                        if (a2 instanceof fp2) {
                            throw ((fp2) a2).a;
                        }
                        return a2;
                    }
                    sc8.j("Already suspended");
                    return null;
                }
            } while (!unsafe.compareAndSwapInt(rq9Var2, j, 0, 1));
            return bx2.a;
        } catch (Throwable th) {
            rq9Var2.resumeWith(new sa9(th));
            throw th;
        }
    }
}
