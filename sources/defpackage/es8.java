package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class es8 extends tca {
    public final d U2;
    public final lea V2;

    public es8(lea leaVar, Context context, String str, String str2, ylb ylbVar, d dVar) {
        super(context, null, str, false, str2, false, ylbVar);
        this.V2 = leaVar;
        this.U2 = dVar;
    }

    @Override
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        c41 b0;
        String str;
        if (z && (b0 = c41.b0(this.U2)) != null) {
            if (vh6Var.m() == 1) {
                long j = vh6Var.j(0);
                if (j == z8c.h(this.a).n) {
                    u31 G = b0.G(2131624185, 5000, gm.S2(jb6.a0(null, null, 2131749735, new Object[0])));
                    G.s = false;
                    G.j();
                } else {
                    int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    int i3 = this.a;
                    if (i2 < 0) {
                        TLRPC.Chat L0 = oc7.r1(i3).L0(Long.valueOf(-j));
                        if (tL_forumTopic != null) {
                            str = tL_forumTopic.title;
                        } else {
                            str = L0.title;
                        }
                        u31 G2 = b0.G(2131624029, 5000, gm.S2(jb6.a0(null, null, 2131749739, str)));
                        G2.s = false;
                        G2.j();
                    } else {
                        u31 G3 = b0.G(2131624029, 5000, gm.S2(jb6.a0(null, null, 2131749739, oc7.r1(i3).W1(Long.valueOf(j)).first_name)));
                        G3.s = false;
                        G3.j();
                    }
                }
            } else {
                u31 Q = b0.Q(2131624029, 36, gm.S2(jb6.G(vh6Var.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(vh6Var.m()))));
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
