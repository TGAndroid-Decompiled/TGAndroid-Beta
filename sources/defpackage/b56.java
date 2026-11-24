package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class b56 extends tca {
    public final f56 U2;

    public b56(f56 f56Var, Context context, String str, String str2, ylb ylbVar) {
        super(context, null, str, false, str2, false, ylbVar);
        this.U2 = f56Var;
    }

    @Override
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String a0;
        if (!z) {
            return;
        }
        if (vh6Var != null && vh6Var.m() == 1) {
            long j = ((TLRPC.Dialog) vh6Var.n(0)).id;
            if (j != 0 && j != z8c.h(this.a).e()) {
                a0 = jb6.a0(null, null, 2131748941, oc7.r1(this.a).z1(j, true));
            } else {
                a0 = jb6.M0(2131748942, null);
            }
        } else {
            a0 = jb6.a0(null, null, 2131748944, jb6.G(i, "Chats", new Object[0]));
        }
        this.U2.e(gm.S2(a0));
    }
}
