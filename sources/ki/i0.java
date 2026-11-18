package ki;

import org.telegram.messenger.gd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
public abstract class i0 {
    public static void a(org.telegram.ui.ActionBar.h2 h2Var, int i7, TLRPC.User user) {
        if (h2Var != null && user != null) {
            String q10 = o10.q(user);
            if (user.bot && user.bot_can_edit) {
                String M0 = gd.M0(2131753049, null);
                String M02 = gd.M0(2131748982, null);
                ai.y1 y1Var = new ai.y1(i7, user, 4);
                bi.a2 a2Var = bi.a2.f3379t2;
                ?? obj = new Object();
                obj.f4173a = M0;
                obj.f4174b = M02;
                obj.f4175c = y1Var;
                bi.a2.k1(h2Var, false, null, obj);
                return;
            }
            lc.b0(h2Var).t(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753050, q10)), null).j();
        }
    }
}
