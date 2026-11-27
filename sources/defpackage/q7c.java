package defpackage;
public abstract class q7c {
    public static final ow5 a = new ow5("UNDEFINED", (byte) 1);
    public static final ow5 b = new ow5("REUSABLE_CLAIMED", (byte) 1);

    public static void a(int i, Object obj) {
        if (obj != null && !b(i, obj)) {
            ClassCastException classCastException = new ClassCastException(qd4.y(obj.getClass().getName(), " cannot be cast to ", uh9.k(i, "kotlin.jvm.functions.Function")));
            ur5.d(classCastException, q7c.class.getName());
            throw classCastException;
        }
    }

    public static boolean b(int i, Object obj) {
        int i2;
        if (obj instanceof js4) {
            if (obj instanceof ss4) {
                i2 = ((ss4) obj).getArity();
            } else if (obj instanceof sr4) {
                i2 = 0;
            } else if (obj instanceof ur4) {
                i2 = 1;
            } else if (obj instanceof is4) {
                i2 = 2;
            } else if (obj instanceof ks4) {
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

    public static final void c(zw2 zw2Var, Object obj) {
        Object yp2Var;
        x8c x8cVar;
        if (zw2Var instanceof yo3) {
            yo3 yo3Var = (yo3) zw2Var;
            px2 px2Var = yo3Var.d;
            ax2 ax2Var = yo3Var.e;
            Throwable a2 = he9.a(obj);
            if (a2 == null) {
                yp2Var = obj;
            } else {
                yp2Var = new yp2(a2, false);
            }
            if (px2Var.d(ax2Var.getContext())) {
                yo3Var.f = yp2Var;
                yo3Var.c = 1;
                px2Var.c(ax2Var.getContext(), yo3Var);
                return;
            }
            z44 a3 = crb.a();
            if (a3.c >= 4294967296L) {
                yo3Var.f = yp2Var;
                yo3Var.c = 1;
                ls lsVar = a3.e;
                if (lsVar == null) {
                    lsVar = new ls();
                    a3.e = lsVar;
                }
                lsVar.addLast(yo3Var);
                return;
            }
            a3.g(true);
            try {
                ev5 ev5Var = (ev5) ax2Var.getContext().get(qf5.c);
                if (ev5Var != null && !ev5Var.isActive()) {
                    yo3Var.resumeWith(ixe.a(ev5Var.getCancellationException()));
                } else {
                    Object obj2 = yo3Var.h;
                    mx2 context = ax2Var.getContext();
                    Object c = xhd.c(context, obj2);
                    if (c != xhd.a) {
                        x8cVar = g4e.c(ax2Var, context, c);
                    } else {
                        x8cVar = null;
                    }
                    ax2Var.resumeWith(obj);
                    if (x8cVar == null || x8cVar.S()) {
                        xhd.a(context, c);
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
        zw2Var.resumeWith(obj);
    }
}
