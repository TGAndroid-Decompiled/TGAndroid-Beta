package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class e56 extends kea {
    public final i56 U2;

    public e56(i56 i56Var, Context context, String str, String str2, vnb vnbVar) {
        super(context, null, str, false, str2, false, vnbVar);
        this.U2 = i56Var;
    }

    @Override
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String a0;
        if (!z) {
            return;
        }
        if (zh6Var != null && zh6Var.m() == 1) {
            long j = ((TLRPC.Dialog) zh6Var.n(0)).id;
            if (j != 0 && j != yac.h(this.a).e()) {
                a0 = ob6.a0(null, null, 2131748938, uc7.s1(this.a).A1(j, true));
            } else {
                a0 = ob6.M0(2131748939, null);
            }
        } else {
            a0 = ob6.a0(null, null, 2131748941, ob6.G(i, "Chats", new Object[0]));
        }
        this.U2.e(hl.S2(a0));
    }
}
