package defpackage;

import j$.util.Objects;
public abstract class sqe {
    public static boolean a(l38 l38Var, l38 l38Var2) {
        if (l38Var == null) {
            if (l38Var2 == null) {
                return true;
            }
        } else if (l38Var2 != null) {
            String str = l38Var.d;
            String str2 = l38Var2.d;
            if (str == null && str2 == null) {
                if (!Objects.equals(Objects.toString(l38Var.a), Objects.toString(l38Var2.a)) || !Objects.equals(l38Var.c, l38Var2.c) || !Boolean.valueOf(l38Var.e).equals(Boolean.valueOf(l38Var2.e)) || !Boolean.valueOf(l38Var.f).equals(Boolean.valueOf(l38Var2.f))) {
                    return false;
                }
                return true;
            }
            return Objects.equals(str, str2);
        }
        return false;
    }

    public static int b(l38 l38Var) {
        if (l38Var == null) {
            return 0;
        }
        String str = l38Var.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(l38Var.a, l38Var.c, Boolean.valueOf(l38Var.e), Boolean.valueOf(l38Var.f));
    }
}
