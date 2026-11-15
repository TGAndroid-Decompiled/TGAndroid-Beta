package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.xb;
public final class s2 extends po0 {
    public final b4 V2;

    public s2(b4 b4Var, Context context, String str, String str2, boolean z10, i2 i2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, i2Var);
        this.V2 = b4Var;
    }

    @Override
    public final void L() {
        super.L();
        this.V2.J2 = null;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (!z10) {
            return;
        }
        b4 b4Var = this.V2;
        cc ccVar = new cc(b4Var.M0, this.J0);
        if (hVar.m() == 1) {
            long j3 = hVar.j(0);
            if (j3 == m10.i(this.f29679a).f24959n) {
                xb G = ccVar.G(2131624191, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131744463, new Object[0])));
                G.f41643r = false;
                G.j();
            } else if (j3 < 0) {
                TLRPC.Chat M0 = np.s1(this.f29679a).M0(Long.valueOf(-j3));
                if (tL_forumTopic != null) {
                    str = tL_forumTopic.title;
                } else {
                    str = M0.title;
                }
                xb G2 = ccVar.G(2131624029, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131744476, str)));
                G2.f41643r = false;
                G2.j();
            } else {
                xb G3 = ccVar.G(2131624029, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131744476, np.s1(this.f29679a).a2(Long.valueOf(j3)).first_name)));
                G3.f41643r = false;
                G3.j();
            }
        } else {
            xb Q = ccVar.Q(2131624029, 36, org.telegram.messenger.g0.X2(hd.G(hVar.m(), "StorySharedToManyChats", Integer.valueOf(hVar.m()))));
            Q.f41643r = false;
            Q.j();
        }
        try {
            b4Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void S0(View view) {
        this.V2.c1();
    }
}
