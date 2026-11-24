package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class s81 extends taa {
    public final fx0 U2;

    public s81(Context context, String str, String str2, wjb wjbVar, fx0 fx0Var) {
        super(context, null, str, false, str2, false, wjbVar);
        this.U2 = fx0Var;
    }

    @Override
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        int m;
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
            if (vf6Var == null) {
                m = 1;
            } else {
                m = vf6Var.m();
            }
            a0 = k96.a0(null, null, 2131748995, k96.G(m, "Chats", new Object[0]));
        }
        m21 Q = new u21(this.U2.F, this.J0).Q(2131624029, 36, gl.S2(a0));
        Q.r = false;
        Q.j();
    }
}
