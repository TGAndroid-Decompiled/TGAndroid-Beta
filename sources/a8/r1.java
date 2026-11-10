package a8;

import j$.util.Objects;
public abstract class r1 {
    public static boolean a(e0.j0 j0Var, e0.j0 j0Var2) {
        if (j0Var == null && j0Var2 == null) {
            return true;
        }
        if (j0Var == null || j0Var2 == null) {
            return false;
        }
        String str = j0Var.d;
        String str2 = j0Var2.d;
        if (str == null && str2 == null) {
            if (Objects.equals(Objects.toString(j0Var.f10082a), Objects.toString(j0Var2.f10082a)) && Objects.equals(j0Var.f10084c, j0Var2.f10084c) && Boolean.valueOf(j0Var.f10085e).equals(Boolean.valueOf(j0Var2.f10085e)) && Boolean.valueOf(j0Var.f10086f).equals(Boolean.valueOf(j0Var2.f10086f))) {
                return true;
            }
            return false;
        }
        return Objects.equals(str, str2);
    }

    public static int b(e0.j0 j0Var) {
        if (j0Var == null) {
            return 0;
        }
        String str = j0Var.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(j0Var.f10082a, j0Var.f10084c, Boolean.valueOf(j0Var.f10085e), Boolean.valueOf(j0Var.f10086f));
    }
}
