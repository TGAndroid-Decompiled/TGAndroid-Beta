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
                hi.r3 r3Var = new hi.r3(i7, user, 3);
                bi.f2 f2Var = bi.f2.f3527t2;
                ?? obj = new Object();
                obj.f3402a = N0;
                obj.f3403b = N02;
                obj.f3404c = r3Var;
                bi.f2.k1(g2Var, false, null, obj);
                return;
            }
            lc.b0(g2Var).t(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131753049, q10)), null).j();
        }
    }
}
