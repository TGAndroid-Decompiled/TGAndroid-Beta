package k7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zl0;
public abstract class i8 {
    public static void a(zl0 zl0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        boolean q10;
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        zl0Var.q(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), q10);
    }

    public static int b(vh.a aVar) {
        int i10 = 0;
        if (aVar == null) {
            return 0;
        }
        int c3 = c(aVar);
        int max = Math.max(0, aVar.f45854c);
        if (max > 0) {
            i10 = AndroidUtilities.dp(e2.c.e(max, 1, 24, 28));
        }
        return c3 + i10;
    }

    public static int c(vh.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f45859k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(e2.c.e(size, 1, 16, 12));
    }

    public static int d(vh.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f45859k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(e2.c.e(size, 1, 16, 8));
    }
}
