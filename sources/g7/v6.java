package g7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dl0;
public abstract class v6 {
    public static void a(dl0 dl0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        boolean q10;
        if (b6Var != null) {
            q10 = b6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.f6.I.q();
        }
        dl0Var.q(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var), q10);
    }

    public static int b(qh.a aVar) {
        int i9 = 0;
        if (aVar == null) {
            return 0;
        }
        int c10 = c(aVar);
        int max = Math.max(0, aVar.f46270c);
        if (max > 0) {
            i9 = AndroidUtilities.dp(e2.c.e(max, 1, 24, 28));
        }
        return c10 + i9;
    }

    public static int c(qh.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f46276k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(e2.c.e(size, 1, 16, 12));
    }

    public static int d(qh.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f46276k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(e2.c.e(size, 1, 16, 8));
    }
}
