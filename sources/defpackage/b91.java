package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class b91 extends kea {
    public final nx0 U2;

    public b91(Context context, String str, String str2, vnb vnbVar, nx0 nx0Var) {
        super(context, null, str, false, str2, false, vnbVar);
        this.U2 = nx0Var;
    }

    @Override
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        int m;
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
            if (zh6Var == null) {
                m = 1;
            } else {
                m = zh6Var.m();
            }
            a0 = ob6.a0(null, null, 2131748941, ob6.G(m, "Chats", new Object[0]));
        }
        v21 Q = new d31(this.U2.F, this.J0).Q(2131624029, 36, hl.S2(a0));
        Q.s = false;
        Q.j();
    }
}
