package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.mo0;
public final class x2 extends mo0 {
    public final i4 R2;

    public x2(i4 i4Var, Context context, String str, String str2, boolean z9, m2 m2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z9, null, m2Var);
        this.R2 = i4Var;
    }

    @Override
    public final void K() {
        super.K();
        this.R2.I2 = null;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        String str;
        if (!z9) {
            return;
        }
        i4 i4Var = this.R2;
        hc hcVar = new hc(i4Var.L0, this.I0);
        if (hVar.m() == 1) {
            long j3 = hVar.j(0);
            if (j3 == p10.i(this.f28616a).f24489n) {
                cc G = hcVar.G(2131624190, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131744466, new Object[0])));
                G.f32553r = false;
                G.j();
            } else if (j3 < 0) {
                TLRPC.Chat M0 = qp.s1(this.f28616a).M0(Long.valueOf(-j3));
                if (tL_forumTopic != null) {
                    str = tL_forumTopic.title;
                } else {
                    str = M0.title;
                }
                cc G2 = hcVar.G(2131624028, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131744479, str)));
                G2.f32553r = false;
                G2.j();
            } else {
                cc G3 = hcVar.G(2131624028, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131744479, qp.s1(this.f28616a).a2(Long.valueOf(j3)).first_name)));
                G3.f32553r = false;
                G3.j();
            }
        } else {
            cc Q = hcVar.Q(2131624028, 36, org.telegram.messenger.g0.X2(id.G(hVar.m(), "StorySharedToManyChats", Integer.valueOf(hVar.m()))));
            Q.f32553r = false;
            Q.j();
        }
        try {
            i4Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void S0(View view) {
        this.R2.c1();
    }
}
