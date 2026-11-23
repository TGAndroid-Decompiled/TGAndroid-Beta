package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
public final class q2 extends ap0 {
    public final z3 V2;

    public q2(z3 z3Var, Context context, String str, String str2, boolean z10, g2 g2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, g2Var);
        this.V2 = z3Var;
    }

    @Override
    public final void L() {
        super.L();
        this.V2.J2 = null;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (!z10) {
            return;
        }
        z3 z3Var = this.V2;
        lc lcVar = new lc(z3Var.M0, this.J0);
        if (hVar.m() == 1) {
            long j3 = hVar.j(0);
            if (j3 == k10.i(this.f30139a).f24951n) {
                gc G = lcVar.G(2131624191, 5000, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131744222, new Object[0])));
                G.f35497r = false;
                G.j();
            } else if (j3 < 0) {
                TLRPC.Chat O0 = np.u1(this.f30139a).O0(Long.valueOf(-j3));
                if (tL_forumTopic != null) {
                    str = tL_forumTopic.title;
                } else {
                    str = O0.title;
                }
                gc G2 = lcVar.G(2131624029, 5000, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131744235, str)));
                G2.f35497r = false;
                G2.j();
            } else {
                gc G3 = lcVar.G(2131624029, 5000, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131744235, np.u1(this.f30139a).c2(Long.valueOf(j3)).first_name)));
                G3.f35497r = false;
                G3.j();
            }
        } else {
            gc Q = lcVar.Q(2131624029, 36, org.telegram.messenger.g0.W2(hd.G(hVar.m(), "StorySharedToManyChats", Integer.valueOf(hVar.m()))));
            Q.f35497r = false;
            Q.j();
        }
        try {
            z3Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void T0(View view) {
        this.V2.c1();
    }
}
