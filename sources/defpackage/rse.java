package defpackage;
public abstract class rse {
    public static void a(n79 n79Var, wjb wjbVar) {
        boolean o;
        if (wjbVar != null) {
            o = wjbVar.a();
        } else {
            o = bkb.I.o();
        }
        n79Var.p(bkb.v0(bkb.Ei, wjbVar), o);
    }

    public static int b(lk0 lk0Var) {
        int i = 0;
        if (lk0Var == null) {
            return 0;
        }
        int c = c(lk0Var);
        int max = Math.max(0, lk0Var.c);
        if (max > 0) {
            i = gl.L(oo1.h(max, 1, 24, 28));
        }
        return c + i;
    }

    public static int c(lk0 lk0Var) {
        int size;
        if (lk0Var == null) {
            size = 0;
        } else {
            size = lk0Var.k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return gl.L(((size - 1) << 4) + 12);
    }

    public static int d(lk0 lk0Var) {
        int size;
        if (lk0Var == null) {
            size = 0;
        } else {
            size = lk0Var.k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return gl.L(((size - 1) << 4) + 8);
    }
}
