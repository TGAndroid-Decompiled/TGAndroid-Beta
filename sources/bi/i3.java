package bi;

import android.content.Context;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.xb;
public final class i3 extends po0 {
    public final org.telegram.ui.ActionBar.e2 V2;
    public final wp0 W2;

    public i3(wp0 wp0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.e2 e2Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.W2 = wp0Var;
        this.V2 = e2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        cc a02;
        String str;
        if (z10 && (a02 = cc.a0(this.V2)) != null) {
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == m10.i(this.f29679a).f24953n) {
                    xb G = a02.G(2131624191, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749802, new Object[0])));
                    G.f41651r = false;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat M0 = np.s1(this.f29679a).M0(Long.valueOf(-j3));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = M0.title;
                    }
                    xb G2 = a02.G(2131624029, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749806, str)));
                    G2.f41651r = false;
                    G2.j();
                } else {
                    xb G3 = a02.G(2131624029, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749806, np.s1(this.f29679a).a2(Long.valueOf(j3)).first_name)));
                    G3.f41651r = false;
                    G3.j();
                }
            } else {
                xb Q = a02.Q(2131624029, 36, org.telegram.messenger.g0.X2(hd.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f41651r = false;
                Q.j();
            }
            try {
                this.W2.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
