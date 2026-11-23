package bi;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.zo0;
public final class v5 extends zo0 {
    public final org.telegram.ui.ActionBar.g2 V2;
    public final fq0 W2;

    public v5(fq0 fq0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.W2 = fq0Var;
        this.V2 = g2Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        kc b02;
        String str;
        if (z10 && (b02 = kc.b0(this.V2)) != null) {
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == i10.i(this.f30223a).f24656n) {
                    fc G = b02.G(2131624191, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749785, new Object[0])));
                    G.f35099r = false;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat O0 = mp.u1(this.f30223a).O0(Long.valueOf(-j3));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = O0.title;
                    }
                    fc G2 = b02.G(2131624029, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749789, str)));
                    G2.f35099r = false;
                    G2.j();
                } else {
                    fc G3 = b02.G(2131624029, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749789, mp.u1(this.f30223a).c2(Long.valueOf(j3)).first_name)));
                    G3.f35099r = false;
                    G3.j();
                }
            } else {
                fc Q = b02.Q(2131624029, 36, org.telegram.messenger.g0.W2(gd.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f35099r = false;
                Q.j();
            }
            try {
                this.W2.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
