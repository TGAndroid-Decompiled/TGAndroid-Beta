package defpackage;
public abstract class xpe {
    public static zw2 a(zw2 zw2Var) {
        ax2 ax2Var;
        zw2 intercepted;
        zw2Var.getClass();
        if (zw2Var instanceof ax2) {
            ax2Var = (ax2) zw2Var;
        } else {
            ax2Var = null;
        }
        if (ax2Var != null && (intercepted = ax2Var.intercepted()) != null) {
            return intercepted;
        }
        return zw2Var;
    }
}
