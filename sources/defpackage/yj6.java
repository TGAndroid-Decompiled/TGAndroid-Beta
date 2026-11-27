package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class yj6 extends kea {
    public final zj6 U2;

    public yj6(zj6 zj6Var, Context context, String str, String str2, vnb vnbVar) {
        super(context, null, str, false, str2, false, vnbVar);
        this.U2 = zj6Var;
    }

    @Override
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String a0;
        ck6 ck6Var = this.U2.L;
        if (!z) {
            return;
        }
        if (zh6Var != null && zh6Var.m() == 1) {
            long j = ((TLRPC.Dialog) zh6Var.n(0)).id;
            if (j != 0 && j != ck6Var.getUserConfig().e()) {
                a0 = ob6.a0(null, null, 2131748938, ck6Var.getMessagesController().A1(j, true));
            } else {
                a0 = ob6.M0(2131748939, null);
            }
        } else {
            a0 = ob6.a0(null, null, 2131748941, ob6.G(i, "Chats", new Object[0]));
        }
        v21 Q = d31.b0(ck6Var).Q(2131624029, 36, hl.S2(a0));
        Q.s = false;
        Q.k(true);
    }
}
