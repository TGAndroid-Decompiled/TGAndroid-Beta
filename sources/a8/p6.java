package a8;

import j$.util.Objects;
public abstract class p6 {
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
            if (Objects.equals(Objects.toString(j0Var.f10260a), Objects.toString(j0Var2.f10260a)) && Objects.equals(j0Var.f10262c, j0Var2.f10262c) && Boolean.valueOf(j0Var.f10263e).equals(Boolean.valueOf(j0Var2.f10263e)) && Boolean.valueOf(j0Var.f10264f).equals(Boolean.valueOf(j0Var2.f10264f))) {
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
        return Objects.hash(j0Var.f10260a, j0Var.f10262c, Boolean.valueOf(j0Var.f10263e), Boolean.valueOf(j0Var.f10264f));
    }
}
