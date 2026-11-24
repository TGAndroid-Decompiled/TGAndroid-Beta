package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class wj6 extends tca {
    public final xj6 U2;

    public wj6(xj6 xj6Var, Context context, String str, String str2, ylb ylbVar) {
        super(context, null, str, false, str2, false, ylbVar);
        this.U2 = xj6Var;
    }

    @Override
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String a0;
        ak6 ak6Var = this.U2.L;
        if (!z) {
            return;
        }
        if (vh6Var != null && vh6Var.m() == 1) {
            long j = ((TLRPC.Dialog) vh6Var.n(0)).id;
            if (j != 0 && j != ak6Var.getUserConfig().e()) {
                a0 = jb6.a0(null, null, 2131748941, ak6Var.getMessagesController().z1(j, true));
            } else {
                a0 = jb6.M0(2131748942, null);
            }
        } else {
            a0 = jb6.a0(null, null, 2131748944, jb6.G(i, "Chats", new Object[0]));
        }
        u31 Q = c41.b0(ak6Var).Q(2131624029, 36, gm.S2(a0));
        Q.s = false;
        Q.k(true);
    }
}
