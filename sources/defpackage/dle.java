package defpackage;
public abstract class dle {
    public static fw2 a(fw2 fw2Var) {
        gw2 gw2Var;
        fw2 intercepted;
        fw2Var.getClass();
        if (fw2Var instanceof gw2) {
            gw2Var = (gw2) fw2Var;
        } else {
            gw2Var = null;
        }
        if (gw2Var != null && (intercepted = gw2Var.intercepted()) != null) {
            return intercepted;
        }
        return fw2Var;
    }
}
