package a8;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xm0;
public abstract class zd {
    public static void a(xm0 xm0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        boolean q5;
        if (u6Var != null) {
            q5 = u6Var.a();
        } else {
            q5 = org.telegram.ui.ActionBar.y6.I.q();
        }
        xm0Var.r(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var), q5);
    }

    public static int b(li.a aVar) {
        int i10 = 0;
        if (aVar == null) {
            return 0;
        }
        int c10 = c(aVar);
        int max = Math.max(0, aVar.f17054c);
        if (max > 0) {
            i10 = AndroidUtilities.dp(c3.h0.w(max, 1, 24, 28));
        }
        return c10 + i10;
    }

    public static int c(li.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f17059k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(c3.h0.w(size, 1, 16, 12));
    }

    public static int d(li.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f17059k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(c3.h0.w(size, 1, 16, 8));
    }
}
