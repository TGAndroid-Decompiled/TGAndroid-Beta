package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public abstract class kr0 {
    public static void a(d dVar, int i, TLRPC.User user) {
        if (dVar != null && user != null) {
            String r = m9c.r(user);
            if (user.bot && user.bot_can_edit) {
                String M0 = jb6.M0(2131753016, null);
                String M02 = jb6.M0(2131748931, null);
                jr0 jr0Var = new jr0(i, user, (byte) 0);
                yw4 yw4Var = yw4.s2;
                ?? obj = new Object();
                obj.a = M0;
                obj.b = M02;
                obj.c = jr0Var;
                yw4.e1(dVar, false, null, obj);
                return;
            }
            c41.b0(dVar).t(gm.S2(jb6.a0(null, null, 2131753017, r)), null).j();
        }
    }
}
