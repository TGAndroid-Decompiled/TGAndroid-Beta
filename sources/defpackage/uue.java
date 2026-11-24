package defpackage;
public abstract class uue {
    public static void a(p99 p99Var, ylb ylbVar) {
        boolean o;
        if (ylbVar != null) {
            o = ylbVar.a();
        } else {
            o = cmb.I.o();
        }
        p99Var.p(cmb.v0(cmb.Ei, ylbVar), o);
    }

    public static int b(ll0 ll0Var) {
        int i = 0;
        if (ll0Var == null) {
            return 0;
        }
        int c = c(ll0Var);
        int max = Math.max(0, ll0Var.c);
        if (max > 0) {
            i = gm.L(aq1.h(max, 1, 24, 28));
        }
        return c + i;
    }

    public static int c(ll0 ll0Var) {
        int size;
        if (ll0Var == null) {
            size = 0;
        } else {
            size = ll0Var.k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return gm.L(((size - 1) << 4) + 12);
    }

    public static int d(ll0 ll0Var) {
        int size;
        if (ll0Var == null) {
            size = 0;
        } else {
            size = ll0Var.k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return gm.L(((size - 1) << 4) + 8);
    }
}
