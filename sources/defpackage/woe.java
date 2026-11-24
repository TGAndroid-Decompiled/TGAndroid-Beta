package defpackage;
public abstract class woe {
    public static kc8 a(kc8 kc8Var, kc8 kc8Var2) {
        if (kc8Var != null) {
            gi4 gi4Var = kc8Var.a;
            if (kc8Var2 != null) {
                jc8 jc8Var = new jc8();
                for (int i = 0; i < gi4Var.a.size(); i++) {
                    if (kc8Var2.a(gi4Var.a(i))) {
                        jc8Var.a.b(gi4Var.a(i));
                    }
                }
                return jc8Var.b();
            }
        }
        return kc8.b;
    }

    public static void b(oc8 oc8Var, tu6 tu6Var) {
        int i = tu6Var.b;
        long j = tu6Var.c;
        mm5 mm5Var = tu6Var.a;
        if (i == -1) {
            if (oc8Var.m0(20)) {
                oc8Var.N0(mm5Var);
            } else if (!mm5Var.isEmpty()) {
                oc8Var.D0((br6) mm5Var.get(0));
            }
        } else if (oc8Var.m0(20)) {
            oc8Var.T(mm5Var, tu6Var.b, j);
        } else if (!mm5Var.isEmpty()) {
            oc8Var.r((br6) mm5Var.get(0), j);
        }
    }
}
