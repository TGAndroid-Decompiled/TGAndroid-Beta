package defpackage;

import j$.util.Objects;
public abstract class vse {
    public static boolean a(n58 n58Var, n58 n58Var2) {
        if (n58Var == null) {
            if (n58Var2 == null) {
                return true;
            }
        } else if (n58Var2 != null) {
            String str = n58Var.d;
            String str2 = n58Var2.d;
            if (str == null && str2 == null) {
                if (!Objects.equals(Objects.toString(n58Var.a), Objects.toString(n58Var2.a)) || !Objects.equals(n58Var.c, n58Var2.c) || !Boolean.valueOf(n58Var.e).equals(Boolean.valueOf(n58Var2.e)) || !Boolean.valueOf(n58Var.f).equals(Boolean.valueOf(n58Var2.f))) {
                    return false;
                }
                return true;
            }
            return Objects.equals(str, str2);
        }
        return false;
    }

    public static int b(n58 n58Var) {
        if (n58Var == null) {
            return 0;
        }
        String str = n58Var.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(n58Var.a, n58Var.c, Boolean.valueOf(n58Var.e), Boolean.valueOf(n58Var.f));
    }
}
