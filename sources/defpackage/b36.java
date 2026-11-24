package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class b36 extends taa {
    public final f36 U2;

    public b36(f36 f36Var, Context context, String str, String str2, wjb wjbVar) {
        super(context, null, str, false, str2, false, wjbVar);
        this.U2 = f36Var;
    }

    @Override
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String a0;
        if (!z) {
            return;
        }
        if (vf6Var != null && vf6Var.m() == 1) {
            long j = ((TLRPC.Dialog) vf6Var.n(0)).id;
            if (j != 0 && j != y6c.h(this.a).e()) {
                a0 = k96.a0(null, null, 2131748992, na7.q1(this.a).y1(j, true));
            } else {
                a0 = k96.M0(2131748993, null);
            }
        } else {
            a0 = k96.a0(null, null, 2131748995, k96.G(i, "Chats", new Object[0]));
        }
        this.U2.e(gl.S2(a0));
    }
}
