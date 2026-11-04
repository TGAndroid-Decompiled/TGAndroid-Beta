package ei;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.oo0;
public final class a3 extends oo0 {
    public final j4 S2;

    public a3(j4 j4Var, Context context, String str, String str2, boolean z10, q2 q2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, q2Var);
        this.S2 = j4Var;
    }

    @Override
    public final void K() {
        super.K();
        this.S2.J2 = null;
    }

    @Override
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (!z10) {
            return;
        }
        j4 j4Var = this.S2;
        fc fcVar = new fc(j4Var.M0, this.J0);
        if (hVar.m() == 1) {
            long j10 = hVar.j(0);
            if (j10 == h10.i(this.f28583a).f22848n) {
                ac G = fcVar.G(2131624190, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131744473, new Object[0])));
                G.f31800r = false;
                G.j();
            } else if (j10 < 0) {
                TLRPC.Chat M0 = hp.s1(this.f28583a).M0(Long.valueOf(-j10));
                if (tL_forumTopic != null) {
                    str = tL_forumTopic.title;
                } else {
                    str = M0.title;
                }
                ac G2 = fcVar.G(2131624028, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131744486, str)));
                G2.f31800r = false;
                G2.j();
            } else {
                ac G3 = fcVar.G(2131624028, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131744486, hp.s1(this.f28583a).a2(Long.valueOf(j10)).first_name)));
                G3.f31800r = false;
                G3.j();
            }
        } else {
            ac Q = fcVar.Q(2131624028, 36, org.telegram.messenger.g0.X2(bd.G(hVar.m(), "StorySharedToManyChats", Integer.valueOf(hVar.m()))));
            Q.f31800r = false;
            Q.j();
        }
        try {
            j4Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void S0(View view) {
        this.S2.c1();
    }
}
