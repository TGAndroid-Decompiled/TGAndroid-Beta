package h7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gl0;

public abstract class z6 {
    public static void a(gl0 gl0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        gl0Var.q(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q());
    }

    public static int b(rh.a aVar) {
        if (aVar == null) {
            return 0;
        }
        int iC = c(aVar);
        int iMax = Math.max(0, aVar.f47029c);
        return iC + (iMax > 0 ? AndroidUtilities.dp(i0.a.e(iMax, 1, 24, 28)) : 0);
    }

    public static int c(rh.a aVar) {
        int size = aVar == null ? 0 : aVar.f47035k.size();
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(i0.a.e(size, 1, 16, 12));
    }

    public static int d(rh.a aVar) {
        int size = aVar == null ? 0 : aVar.f47035k.size();
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(i0.a.e(size, 1, 16, 8));
    }
}
