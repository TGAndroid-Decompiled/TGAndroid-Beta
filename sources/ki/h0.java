package ki;

import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
public abstract class h0 {
    public static void a(org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.User user) {
        if (g2Var != null && user != null) {
            String q10 = p10.q(user);
            if (user.bot && user.bot_can_edit) {
                String N0 = hd.N0(2131753048, null);
                String N02 = hd.N0(2131748981, null);
                ai.b2 b2Var = new ai.b2(i7, user, 4);
                bi.e2 e2Var = bi.e2.f3575t2;
                ?? obj = new Object();
                obj.f3398a = N0;
                obj.f3399b = N02;
                obj.f3400c = b2Var;
                bi.e2.k1(g2Var, false, null, obj);
                return;
            }
            lc.b0(g2Var).t(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131753049, q10)), null).j();
        }
    }
}
