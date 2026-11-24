package defpackage;

import sun.misc.Unsafe;
public abstract class srd {
    public static me3 a(ky2 ky2Var, fs4 fs4Var) {
        ?? b2Var = new b2(t1e.b(ky2Var, k34.a), true);
        b2Var.R(ny2.a, b2Var, fs4Var);
        return b2Var;
    }

    public static yoa b(ky2 ky2Var, fs4 fs4Var) {
        ?? b2Var = new b2(t1e.b(ky2Var, k34.a), true);
        b2Var.R(ny2.a, b2Var, fs4Var);
        return b2Var;
    }

    public static final Object c(cy2 cy2Var, fs4 fs4Var, px2 px2Var) {
        cy2 a;
        Unsafe unsafe;
        long j;
        cy2 context = px2Var.getContext();
        if (!((Boolean) cy2Var.fold(Boolean.FALSE, new qn2((byte) 2))).booleanValue()) {
            a = context.plus(cy2Var);
        } else {
            a = t1e.a(context, cy2Var, false);
        }
        pne.a(a);
        if (a == context) {
            ss9 ss9Var = new ss9(px2Var, a);
            return fze.a(ss9Var, ss9Var, fs4Var);
        }
        jk2 jk2Var = jk2.b;
        if (rr5.a(a.get(jk2Var), context.get(jk2Var))) {
            y6c y6cVar = new y6c(px2Var, a);
            cy2 cy2Var2 = y6cVar.d;
            Object c = gfd.c(cy2Var2, null);
            try {
                return fze.a(y6cVar, y6cVar, fs4Var);
            } finally {
                gfd.a(cy2Var2, c);
            }
        }
        ss9 ss9Var2 = new ss9(px2Var, a);
        try {
            r5c.c(fne.a(((og0) fs4Var).create(ss9Var2, ss9Var2)), g7c.a);
            do {
                unsafe = fy.a;
                j = sp3.f;
                int intVolatile = unsafe.getIntVolatile(ss9Var2, j);
                if (intVolatile != 0) {
                    if (intVolatile == 2) {
                        Object a2 = hcd.a(ss9Var2.v());
                        if (a2 instanceof qq2) {
                            throw ((qq2) a2).a;
                        }
                        return a2;
                    }
                    dq9.m("Already suspended");
                    return null;
                }
            } while (!unsafe.compareAndSwapInt(ss9Var2, j, 0, 1));
            return ly2.a;
        } catch (Throwable th) {
            ss9Var2.resumeWith(new sc9(th));
            throw th;
        }
    }
}
