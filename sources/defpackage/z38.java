package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z38 extends tca {
    public final a58 U2;

    public z38(a58 a58Var, Context context, String str, String str2, boolean z, pv0 pv0Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z, null, pv0Var);
        this.U2 = a58Var;
    }

    @Override
    public final void H() {
        super.H();
        this.U2.P2 = null;
    }

    @Override
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String str;
        if (!z) {
            return;
        }
        a58 a58Var = this.U2;
        c41 c41Var = new c41(a58Var.S0, this.J0);
        if (vh6Var.m() == 1) {
            long j = vh6Var.j(0);
            if (j == z8c.h(this.a).n) {
                u31 G = c41Var.G(2131624185, 5000, gm.S2(jb6.a0(null, null, 2131744149, new Object[0])));
                G.s = false;
                G.j();
            } else {
                int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                int i3 = this.a;
                if (i2 < 0) {
                    TLRPC.Chat L0 = oc7.r1(i3).L0(Long.valueOf(-j));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = L0.title;
                    }
                    u31 G2 = c41Var.G(2131624029, 5000, gm.S2(jb6.a0(null, null, 2131744162, str)));
                    G2.s = false;
                    G2.j();
                } else {
                    u31 G3 = c41Var.G(2131624029, 5000, gm.S2(jb6.a0(null, null, 2131744162, oc7.r1(i3).W1(Long.valueOf(j)).first_name)));
                    G3.s = false;
                    G3.j();
                }
            }
        } else {
            u31 Q = c41Var.Q(2131624029, 36, gm.S2(jb6.G(vh6Var.m(), "StorySharedToManyChats", Integer.valueOf(vh6Var.m()))));
            Q.s = false;
            Q.j();
        }
        try {
            a58Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void M0(View view) {
        this.U2.b1();
    }
}
