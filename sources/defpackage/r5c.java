package defpackage;
public abstract class r5c {
    public static final du2 a = new du2("UNDEFINED", (byte) 2);
    public static final du2 b = new du2("REUSABLE_CLAIMED", (byte) 2);

    public static void a(int i, Object obj) {
        if (obj != null && !b(i, obj)) {
            ClassCastException classCastException = new ClassCastException(kt6.o(obj.getClass().getName(), " cannot be cast to ", hg9.j(i, "kotlin.jvm.functions.Function")));
            rr5.d(classCastException, r5c.class.getName());
            throw classCastException;
        }
    }

    public static boolean b(int i, Object obj) {
        int i2;
        if (obj instanceof gs4) {
            if (obj instanceof ps4) {
                i2 = ((ps4) obj).getArity();
            } else if (obj instanceof pr4) {
                i2 = 0;
            } else if (obj instanceof rr4) {
                i2 = 1;
            } else if (obj instanceof fs4) {
                i2 = 2;
            } else if (obj instanceof hs4) {
                i2 = 3;
            } else {
                i2 = -1;
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static final void c(px2 px2Var, Object obj) {
        Object qq2Var;
        y6c y6cVar;
        if (px2Var instanceof rp3) {
            rp3 rp3Var = (rp3) px2Var;
            fy2 fy2Var = rp3Var.d;
            qx2 qx2Var = rp3Var.e;
            Throwable a2 = tc9.a(obj);
            if (a2 == null) {
                qq2Var = obj;
            } else {
                qq2Var = new qq2(a2, false);
            }
            if (fy2Var.d(qx2Var.getContext())) {
                rp3Var.f = qq2Var;
                rp3Var.c = 1;
                fy2Var.c(qx2Var.getContext(), rp3Var);
                return;
            }
            o54 a3 = epb.a();
            if (a3.c >= 4294967296L) {
                rp3Var.f = qq2Var;
                rp3Var.c = 1;
                lt ltVar = a3.e;
                if (ltVar == null) {
                    ltVar = new lt();
                    a3.e = ltVar;
                }
                ltVar.addLast(rp3Var);
                return;
            }
            a3.g(true);
            try {
                av5 av5Var = (av5) qx2Var.getContext().get(nf5.c);
                if (av5Var != null && !av5Var.isActive()) {
                    rp3Var.resumeWith(tue.a(av5Var.getCancellationException()));
                } else {
                    Object obj2 = rp3Var.h;
                    cy2 context = qx2Var.getContext();
                    Object c = gfd.c(context, obj2);
                    if (c != gfd.a) {
                        y6cVar = t1e.c(qx2Var, context, c);
                    } else {
                        y6cVar = null;
                    }
                    qx2Var.resumeWith(obj);
                    if (y6cVar == null || y6cVar.S()) {
                        gfd.a(context, c);
                    }
                }
                do {
                } while (a3.i());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        px2Var.resumeWith(obj);
    }
}
