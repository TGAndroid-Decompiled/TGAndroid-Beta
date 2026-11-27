package defpackage;

import j$.util.Objects;
public abstract class nve {
    public static boolean a(b78 b78Var, b78 b78Var2) {
        if (b78Var == null) {
            if (b78Var2 == null) {
                return true;
            }
        } else if (b78Var2 != null) {
            String str = b78Var.d;
            String str2 = b78Var2.d;
            if (str == null && str2 == null) {
                if (!Objects.equals(Objects.toString(b78Var.a), Objects.toString(b78Var2.a)) || !Objects.equals(b78Var.c, b78Var2.c) || !Boolean.valueOf(b78Var.e).equals(Boolean.valueOf(b78Var2.e)) || !Boolean.valueOf(b78Var.f).equals(Boolean.valueOf(b78Var2.f))) {
                    return false;
                }
                return true;
            }
            return Objects.equals(str, str2);
        }
        return false;
    }

    public static int b(b78 b78Var) {
        if (b78Var == null) {
            return 0;
        }
        String str = b78Var.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(b78Var.a, b78Var.c, Boolean.valueOf(b78Var.e), Boolean.valueOf(b78Var.f));
    }
}
