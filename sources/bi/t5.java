package bi;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.lc;
public final class t5 extends ap0 {
    public final org.telegram.ui.ActionBar.g2 V2;
    public final gq0 W2;

    public t5(gq0 gq0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.W2 = gq0Var;
        this.V2 = g2Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        lc b02;
        String str;
        if (z10 && (b02 = lc.b0(this.V2)) != null) {
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == j10.i(this.f30170a).f24817n) {
                    gc G = b02.G(2131624191, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749785, new Object[0])));
                    G.f35516r = false;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat O0 = mp.u1(this.f30170a).O0(Long.valueOf(-j3));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = O0.title;
                    }
                    gc G2 = b02.G(2131624029, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749789, str)));
                    G2.f35516r = false;
                    G2.j();
                } else {
                    gc G3 = b02.G(2131624029, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749789, mp.u1(this.f30170a).c2(Long.valueOf(j3)).first_name)));
                    G3.f35516r = false;
                    G3.j();
                }
            } else {
                gc Q = b02.Q(2131624029, 36, org.telegram.messenger.g0.W2(gd.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f35516r = false;
                Q.j();
            }
            try {
                this.W2.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
