package ai;

import android.content.Context;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.vp0;
public final class t3 extends oo0 {
    public final org.telegram.ui.ActionBar.d2 S2;
    public final vp0 T2;

    public t3(vp0 vp0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.d2 d2Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.T2 = vp0Var;
        this.S2 = d2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        fc a02;
        String str;
        if (z10 && (a02 = fc.a0(this.S2)) != null) {
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == h10.i(this.f28583a).f22848n) {
                    ac G = a02.G(2131624190, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749810, new Object[0])));
                    G.f31800r = false;
                    G.j();
                } else if (j10 < 0) {
                    TLRPC.Chat M0 = hp.s1(this.f28583a).M0(Long.valueOf(-j10));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = M0.title;
                    }
                    ac G2 = a02.G(2131624028, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749814, str)));
                    G2.f31800r = false;
                    G2.j();
                } else {
                    ac G3 = a02.G(2131624028, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749814, hp.s1(this.f28583a).a2(Long.valueOf(j10)).first_name)));
                    G3.f31800r = false;
                    G3.j();
                }
            } else {
                ac Q = a02.Q(2131624028, 36, org.telegram.messenger.g0.X2(bd.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f31800r = false;
                Q.j();
            }
            try {
                this.T2.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
