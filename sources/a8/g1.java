package a8;

import j$.util.Objects;
public abstract class g1 {
    public static boolean a(e0.l0 l0Var, e0.l0 l0Var2) {
        if (l0Var == null && l0Var2 == null) {
            return true;
        }
        if (l0Var == null || l0Var2 == null) {
            return false;
        }
        String str = l0Var.d;
        String str2 = l0Var2.d;
        if (str == null && str2 == null) {
            if (Objects.equals(Objects.toString(l0Var.f9565a), Objects.toString(l0Var2.f9565a)) && Objects.equals(l0Var.f9567c, l0Var2.f9567c) && Boolean.valueOf(l0Var.e).equals(Boolean.valueOf(l0Var2.e)) && Boolean.valueOf(l0Var.f9568f).equals(Boolean.valueOf(l0Var2.f9568f))) {
                return true;
            }
            return false;
        }
        return Objects.equals(str, str2);
    }

    public static int b(e0.l0 l0Var) {
        if (l0Var == null) {
            return 0;
        }
        String str = l0Var.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(l0Var.f9565a, l0Var.f9567c, Boolean.valueOf(l0Var.e), Boolean.valueOf(l0Var.f9568f));
    }
}
