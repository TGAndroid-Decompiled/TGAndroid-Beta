package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class w extends taa {
    public final a1 U2;

    public w(a1 a1Var, Context context, String str, String str2, wjb wjbVar) {
        super(context, null, str, false, str2, false, wjbVar);
        this.U2 = a1Var;
    }

    @Override
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String str;
        FrameLayout frameLayout = this.U2.D2;
        if (z) {
            u21 u21Var = new u21(frameLayout, this.J0);
            if (vf6Var.m() == 1) {
                long j = vf6Var.j(0);
                if (j == y6c.h(this.a).n) {
                    m21 G = u21Var.G(2131624185, 5000, gl.S2(k96.a0(null, null, 2131754967, new Object[0])));
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
                        m21 G2 = u21Var.G(2131624029, 5000, gl.S2(k96.a0(null, null, 2131754971, str)));
                        G2.r = false;
                        G2.j();
                    } else {
                        m21 G3 = u21Var.G(2131624029, 5000, gl.S2(k96.a0(null, null, 2131754971, na7.q1(i3).V1(Long.valueOf(j)).first_name)));
                        G3.r = false;
                        G3.j();
                    }
                }
            } else {
                m21 Q = u21Var.Q(2131624029, 36, gl.S2(k96.G(vf6Var.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(vf6Var.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                frameLayout.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
