package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class w18 extends taa {
    public final y28 U2;

    public w18(y28 y28Var, Context context, String str, String str2, boolean z, gu0 gu0Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z, null, gu0Var);
        this.U2 = y28Var;
    }

    @Override
    public final void I() {
        super.I();
        this.U2.P2 = null;
    }

    @Override
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String str;
        if (!z) {
            return;
        }
        y28 y28Var = this.U2;
        u21 u21Var = new u21(y28Var.S0, this.J0);
        if (vf6Var.m() == 1) {
            long j = vf6Var.j(0);
            if (j == y6c.h(this.a).n) {
                m21 G = u21Var.G(2131624186, 5000, gl.T2(k96.a0(null, null, 2131744223, new Object[0])));
                G.r = false;
                G.j();
            } else {
                int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                int i3 = this.a;
                if (i2 < 0) {
                    TLRPC.Chat K0 = na7.q1(i3).K0(Long.valueOf(-j));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = K0.title;
                    }
                    m21 G2 = u21Var.G(2131624029, 5000, gl.T2(k96.a0(null, null, 2131744236, str)));
                    G2.r = false;
                    G2.j();
                } else {
                    m21 G3 = u21Var.G(2131624029, 5000, gl.T2(k96.a0(null, null, 2131744236, na7.q1(i3).V1(Long.valueOf(j)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            }
        } else {
            m21 Q = u21Var.Q(2131624029, 36, gl.T2(k96.G(vf6Var.m(), "StorySharedToManyChats", Integer.valueOf(vf6Var.m()))));
            Q.r = false;
            Q.j();
        }
        try {
            y28Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void M0(View view) {
        this.U2.b1();
    }
}
