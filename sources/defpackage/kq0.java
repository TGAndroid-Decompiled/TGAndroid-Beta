package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public abstract class kq0 {
    public static void a(e eVar, int i, TLRPC.User user) {
        if (eVar != null && user != null) {
            String r = lbc.r(user);
            if (user.bot && user.bot_can_edit) {
                String M0 = ob6.M0(2131753044, null);
                String M02 = ob6.M0(2131748928, null);
                jq0 jq0Var = new jq0(i, user, (byte) 0);
                bx4 bx4Var = bx4.s2;
                ?? obj = new Object();
                obj.a = M0;
                obj.b = M02;
                obj.c = jq0Var;
                bx4.f1(eVar, false, null, obj);
                return;
            }
            d31.b0(eVar).t(hl.S2(ob6.a0(null, null, 2131753045, r)), null).j();
        }
    }
}
