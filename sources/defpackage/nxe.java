package defpackage;
public abstract class nxe {
    public static void a(ab9 ab9Var, vnb vnbVar) {
        boolean o;
        if (vnbVar != null) {
            o = vnbVar.a();
        } else {
            o = aob.I.o();
        }
        ab9Var.p(aob.v0(aob.Fi, vnbVar), o);
    }

    public static int b(mk0 mk0Var) {
        int i = 0;
        if (mk0Var == null) {
            return 0;
        }
        int c = c(mk0Var);
        int max = Math.max(0, mk0Var.c);
        if (max > 0) {
            i = hl.L(bp1.h(max, 1, 24, 28));
        }
        return c + i;
    }

    public static int c(mk0 mk0Var) {
        int size;
        if (mk0Var == null) {
            size = 0;
        } else {
            size = mk0Var.k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return hl.L(((size - 1) << 4) + 12);
    }

    public static int d(mk0 mk0Var) {
        int size;
        if (mk0Var == null) {
            size = 0;
        } else {
            size = mk0Var.k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return hl.L(((size - 1) << 4) + 8);
    }
}
