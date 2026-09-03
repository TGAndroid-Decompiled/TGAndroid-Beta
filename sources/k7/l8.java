package k7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.am0;
public abstract class l8 {
    public static void a(am0 am0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        boolean q10;
        if (g6Var != null) {
            q10 = g6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        am0Var.q(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var), q10);
    }

    public static int b(wh.a aVar) {
        int i10 = 0;
        if (aVar == null) {
            return 0;
        }
        int c3 = c(aVar);
        int max = Math.max(0, aVar.f49654c);
        if (max > 0) {
            i10 = AndroidUtilities.dp(e2.c.e(max, 1, 24, 28));
        }
        return c3 + i10;
    }

    public static int c(wh.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f49660k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(e2.c.e(size, 1, 16, 12));
    }

    public static int d(wh.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f49660k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(e2.c.e(size, 1, 16, 8));
    }
}
