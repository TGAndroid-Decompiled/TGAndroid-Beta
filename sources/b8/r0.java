package b8;

import j$.util.Objects;
public abstract class r0 {
    public static boolean a(e0.k0 k0Var, e0.k0 k0Var2) {
        if (k0Var == null && k0Var2 == null) {
            return true;
        }
        if (k0Var == null || k0Var2 == null) {
            return false;
        }
        String str = k0Var.d;
        String str2 = k0Var2.d;
        if (str == null && str2 == null) {
            if (Objects.equals(Objects.toString(k0Var.f9264a), Objects.toString(k0Var2.f9264a)) && Objects.equals(k0Var.f9266c, k0Var2.f9266c) && Boolean.valueOf(k0Var.f9267e).equals(Boolean.valueOf(k0Var2.f9267e)) && Boolean.valueOf(k0Var.f9268f).equals(Boolean.valueOf(k0Var2.f9268f))) {
                return true;
            }
            return false;
        }
        return Objects.equals(str, str2);
    }

    public static int b(e0.k0 k0Var) {
        if (k0Var == null) {
            return 0;
        }
        String str = k0Var.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(k0Var.f9264a, k0Var.f9266c, Boolean.valueOf(k0Var.f9267e), Boolean.valueOf(k0Var.f9268f));
    }
}
