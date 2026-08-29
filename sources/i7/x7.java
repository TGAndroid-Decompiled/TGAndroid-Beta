package i7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ql0;
public abstract class x7 {
    public static void a(ql0 ql0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        boolean q6;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        ql0Var.q(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), q6);
    }

    public static int b(th.a aVar) {
        int i10 = 0;
        if (aVar == null) {
            return 0;
        }
        int c3 = c(aVar);
        int max = Math.max(0, aVar.f48329c);
        if (max > 0) {
            i10 = AndroidUtilities.dp(com.google.android.recaptcha.internal.a.f(max, 1, 24, 28));
        }
        return c3 + i10;
    }

    public static int c(th.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f48335k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(com.google.android.recaptcha.internal.a.f(size, 1, 16, 12));
    }

    public static int d(th.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f48335k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(com.google.android.recaptcha.internal.a.f(size, 1, 16, 8));
    }
}
