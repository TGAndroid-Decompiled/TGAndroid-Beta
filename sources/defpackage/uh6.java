package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class uh6 extends taa {
    public final vh6 U2;

    public uh6(vh6 vh6Var, Context context, String str, String str2, wjb wjbVar) {
        super(context, null, str, false, str2, false, wjbVar);
        this.U2 = vh6Var;
    }

    @Override
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String a0;
        yh6 yh6Var = this.U2.L;
        if (!z) {
            return;
        }
        if (vf6Var != null && vf6Var.m() == 1) {
            long j = ((TLRPC.Dialog) vf6Var.n(0)).id;
            if (j != 0 && j != yh6Var.getUserConfig().e()) {
                a0 = k96.a0(null, null, 2131748992, yh6Var.getMessagesController().y1(j, true));
            } else {
                a0 = k96.M0(2131748993, null);
            }
        } else {
            a0 = k96.a0(null, null, 2131748995, k96.G(i, "Chats", new Object[0]));
        }
        m21 Q = u21.b0(yh6Var).Q(2131624029, 36, gl.S2(a0));
        Q.r = false;
        Q.k(true);
    }
}
