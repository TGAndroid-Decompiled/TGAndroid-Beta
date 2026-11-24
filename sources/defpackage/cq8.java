package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class cq8 extends taa {
    public final d U2;
    public final lca V2;

    public cq8(lca lcaVar, Context context, String str, String str2, wjb wjbVar, d dVar) {
        super(context, null, str, false, str2, false, wjbVar);
        this.V2 = lcaVar;
        this.U2 = dVar;
    }

    @Override
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        u21 b0;
        String str;
        if (z && (b0 = u21.b0(this.U2)) != null) {
            if (vf6Var.m() == 1) {
                long j = vf6Var.j(0);
                if (j == y6c.h(this.a).n) {
                    m21 G = b0.G(2131624185, 5000, gl.S2(k96.a0(null, null, 2131749786, new Object[0])));
                    G.r = false;
                    G.j();
                } else {
                    int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    int i3 = this.a;
                    if (i2 < 0) {
                        TLRPC.Chat K0 = na7.q1(i3).K0(Long.valueOf(-j));
                        if (tL_forumTopic != null) {
                            str = tL_forumTopic.title;
                        } else {
                            str = K0.title;
                        }
                        m21 G2 = b0.G(2131624029, 5000, gl.S2(k96.a0(null, null, 2131749790, str)));
                        G2.r = false;
                        G2.j();
                    } else {
                        m21 G3 = b0.G(2131624029, 5000, gl.S2(k96.a0(null, null, 2131749790, na7.q1(i3).V1(Long.valueOf(j)).first_name)));
                        G3.r = false;
                        G3.j();
                    }
                }
            } else {
                m21 Q = b0.Q(2131624029, 36, gl.S2(k96.G(vf6Var.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(vf6Var.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                this.V2.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
