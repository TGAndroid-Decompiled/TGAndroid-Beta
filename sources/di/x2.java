package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.mo0;
public final class x2 extends mo0 {
    public final j4 U2;

    public x2(j4 j4Var, Context context, String str, String str2, boolean z9, m2 m2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z9, null, m2Var);
        this.U2 = j4Var;
    }

    @Override
    public final void K() {
        super.K();
        this.U2.I2 = null;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        String str;
        if (!z9) {
            return;
        }
        j4 j4Var = this.U2;
        gc gcVar = new gc(j4Var.L0, this.I0);
        if (hVar.m() == 1) {
            long j3 = hVar.j(0);
            if (j3 == p10.i(this.f28669a).f24493n) {
                bc G = gcVar.G(2131624190, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131744463, new Object[0])));
                G.f32211r = false;
                G.j();
            } else if (j3 < 0) {
                TLRPC.Chat M0 = qp.s1(this.f28669a).M0(Long.valueOf(-j3));
                if (tL_forumTopic != null) {
                    str = tL_forumTopic.title;
                } else {
                    str = M0.title;
                }
                bc G2 = gcVar.G(2131624028, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131744476, str)));
                G2.f32211r = false;
                G2.j();
            } else {
                bc G3 = gcVar.G(2131624028, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131744476, qp.s1(this.f28669a).a2(Long.valueOf(j3)).first_name)));
                G3.f32211r = false;
                G3.j();
            }
        } else {
            bc Q = gcVar.Q(2131624028, 36, org.telegram.messenger.g0.X2(id.G(hVar.m(), "StorySharedToManyChats", Integer.valueOf(hVar.m()))));
            Q.f32211r = false;
            Q.j();
        }
        try {
            j4Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void S0(View view) {
        this.U2.c1();
    }
}
