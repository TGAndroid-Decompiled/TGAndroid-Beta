package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class ot8 extends kea {
    public final e U2;
    public final cga V2;

    public ot8(cga cgaVar, Context context, String str, String str2, vnb vnbVar, e eVar) {
        super(context, null, str, false, str2, false, vnbVar);
        this.V2 = cgaVar;
        this.U2 = eVar;
    }

    @Override
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        d31 b0;
        String str;
        if (z && (b0 = d31.b0(this.U2)) != null) {
            if (zh6Var.m() == 1) {
                long j = zh6Var.j(0);
                if (j == yac.h(this.a).n) {
                    v21 G = b0.G(2131624185, 5000, hl.S2(ob6.a0(null, null, 2131749748, new Object[0])));
                    G.s = false;
                    G.j();
                } else {
                    int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    int i3 = this.a;
                    if (i2 < 0) {
                        TLRPC.Chat M0 = uc7.s1(i3).M0(Long.valueOf(-j));
                        if (tL_forumTopic != null) {
                            str = tL_forumTopic.title;
                        } else {
                            str = M0.title;
                        }
                        v21 G2 = b0.G(2131624029, 5000, hl.S2(ob6.a0(null, null, 2131749752, str)));
                        G2.s = false;
                        G2.j();
                    } else {
                        v21 G3 = b0.G(2131624029, 5000, hl.S2(ob6.a0(null, null, 2131749752, uc7.s1(i3).X1(Long.valueOf(j)).first_name)));
                        G3.s = false;
                        G3.j();
                    }
                }
            } else {
                v21 Q = b0.Q(2131624029, 36, hl.S2(ob6.G(zh6Var.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(zh6Var.m()))));
                Q.s = false;
                Q.j();
            }
            try {
                this.V2.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
