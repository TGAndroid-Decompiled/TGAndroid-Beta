package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public abstract class kq0 {
    public static void a(d dVar, int i, TLRPC.User user) {
        if (dVar != null && user != null) {
            String q = l7c.q(user);
            if (user.bot && user.bot_can_edit) {
                String M0 = k96.M0(2131753048, null);
                String M02 = k96.M0(2131748982, null);
                jq0 jq0Var = new jq0(i, user, (byte) 0);
                xu4 xu4Var = xu4.s2;
                ?? obj = new Object();
                obj.a = M0;
                obj.b = M02;
                obj.c = jq0Var;
                xu4.e1(dVar, false, null, obj);
                return;
            }
            u21.b0(dVar).t(gl.T2(k96.a0(null, null, 2131753049, q)), null).j();
        }
    }
}
