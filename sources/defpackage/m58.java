package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m58 extends kea {
    public final o68 U2;

    public m58(o68 o68Var, Context context, String str, String str2, boolean z, pu0 pu0Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z, null, pu0Var);
        this.U2 = o68Var;
    }

    @Override
    public final void H() {
        super.H();
        this.U2.J2 = null;
    }

    @Override
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String str;
        if (!z) {
            return;
        }
        o68 o68Var = this.U2;
        d31 d31Var = new d31(o68Var.M0, this.J0);
        if (zh6Var.m() == 1) {
            long j = zh6Var.j(0);
            if (j == yac.h(this.a).n) {
                v21 G = d31Var.G(2131624185, 5000, hl.S2(ob6.a0(null, null, 2131744117, new Object[0])));
                G.s = false;
                G.j();
            } else {
                int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                int i3 = this.a;
                if (i2 < 0) {
                    TLRPC.Chat M0 = uc7.s1(i3).M0(Long.valueOf(-j));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = M0.title;
                    }
                    v21 G2 = d31Var.G(2131624029, 5000, hl.S2(ob6.a0(null, null, 2131744130, str)));
                    G2.s = false;
                    G2.j();
                } else {
                    v21 G3 = d31Var.G(2131624029, 5000, hl.S2(ob6.a0(null, null, 2131744130, uc7.s1(i3).X1(Long.valueOf(j)).first_name)));
                    G3.s = false;
                    G3.j();
                }
            }
        } else {
            v21 Q = d31Var.Q(2131624029, 36, hl.S2(ob6.G(zh6Var.m(), "StorySharedToManyChats", Integer.valueOf(zh6Var.m()))));
            Q.s = false;
            Q.j();
        }
        try {
            o68Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void N0(View view) {
        this.U2.b1();
    }
}
