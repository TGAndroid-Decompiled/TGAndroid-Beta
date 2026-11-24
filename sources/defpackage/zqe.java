package defpackage;
public abstract class zqe {
    public static ne8 a(ne8 ne8Var, ne8 ne8Var2) {
        if (ne8Var != null) {
            lk4 lk4Var = ne8Var.a;
            if (ne8Var2 != null) {
                me8 me8Var = new me8();
                for (int i = 0; i < lk4Var.a.size(); i++) {
                    if (ne8Var2.a(lk4Var.a(i))) {
                        me8Var.a.b(lk4Var.a(i));
                    }
                }
                return me8Var.b();
            }
        }
        return ne8.b;
    }

    public static void b(re8 re8Var, tw6 tw6Var) {
        int i = tw6Var.b;
        long j = tw6Var.c;
        mo5 mo5Var = tw6Var.a;
        if (i == -1) {
            if (re8Var.m0(20)) {
                re8Var.N0(mo5Var);
            } else if (!mo5Var.isEmpty()) {
                re8Var.D0((bt6) mo5Var.get(0));
            }
        } else if (re8Var.m0(20)) {
            re8Var.T(mo5Var, tw6Var.b, j);
        } else if (!mo5Var.isEmpty()) {
            re8Var.r((bt6) mo5Var.get(0), j);
        }
    }
}
