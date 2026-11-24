package defpackage;
public final class di6 {
    public static ci6 a(Object obj, Object obj2) {
        ci6 ci6Var = (ci6) obj;
        ci6 ci6Var2 = (ci6) obj2;
        if (!ci6Var2.isEmpty()) {
            if (!ci6Var.a) {
                ci6Var = ci6Var.c();
            }
            ci6Var.b();
            if (!ci6Var2.isEmpty()) {
                ci6Var.putAll(ci6Var2);
            }
        }
        return ci6Var;
    }
}
