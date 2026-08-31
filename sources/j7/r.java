package j7;

import j$.util.Objects;
public abstract class r {
    public static boolean a(e0.o0 o0Var, e0.o0 o0Var2) {
        if (o0Var == null && o0Var2 == null) {
            return true;
        }
        if (o0Var == null || o0Var2 == null) {
            return false;
        }
        String str = o0Var.d;
        String str2 = o0Var2.d;
        if (str == null && str2 == null) {
            if (Objects.equals(Objects.toString(o0Var.f4835a), Objects.toString(o0Var2.f4835a)) && Objects.equals(o0Var.f4837c, o0Var2.f4837c) && Boolean.valueOf(o0Var.f4838e).equals(Boolean.valueOf(o0Var2.f4838e)) && Boolean.valueOf(o0Var.f4839f).equals(Boolean.valueOf(o0Var2.f4839f))) {
                return true;
            }
            return false;
        }
        return Objects.equals(str, str2);
    }

    public static int b(e0.o0 o0Var) {
        if (o0Var == null) {
            return 0;
        }
        String str = o0Var.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(o0Var.f4835a, o0Var.f4837c, Boolean.valueOf(o0Var.f4838e), Boolean.valueOf(o0Var.f4839f));
    }
}
