package bi;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.yo0;
public final class q5 extends yo0 {
    public final org.telegram.ui.ActionBar.h2 V2;
    public final eq0 W2;

    public q5(eq0 eq0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h2 h2Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.W2 = eq0Var;
        this.V2 = h2Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        lc b02;
        String str;
        if (z10 && (b02 = lc.b0(this.V2)) != null) {
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == j10.i(this.f30189a).f24792n) {
                    gc G = b02.G(2131624191, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749786, new Object[0])));
                    G.f35469r = false;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat O0 = mp.u1(this.f30189a).O0(Long.valueOf(-j3));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = O0.title;
                    }
                    gc G2 = b02.G(2131624029, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749790, str)));
                    G2.f35469r = false;
                    G2.j();
                } else {
                    gc G3 = b02.G(2131624029, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749790, mp.u1(this.f30189a).c2(Long.valueOf(j3)).first_name)));
                    G3.f35469r = false;
                    G3.j();
                }
            } else {
                gc Q = b02.Q(2131624029, 36, org.telegram.messenger.g0.W2(gd.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f35469r = false;
                Q.j();
            }
            try {
                this.W2.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
