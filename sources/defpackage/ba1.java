package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class ba1 extends tca {
    public final my0 U2;

    public ba1(Context context, String str, String str2, ylb ylbVar, my0 my0Var) {
        super(context, null, str, false, str2, false, ylbVar);
        this.U2 = my0Var;
    }

    @Override
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        int m;
        String a0;
        if (!z) {
            return;
        }
        if (vh6Var != null && vh6Var.m() == 1) {
            long j = ((TLRPC.Dialog) vh6Var.n(0)).id;
            if (j != 0 && j != z8c.h(this.a).e()) {
                a0 = jb6.a0(null, null, 2131748941, oc7.r1(this.a).z1(j, true));
            } else {
                a0 = jb6.M0(2131748942, null);
            }
        } else {
            if (vh6Var == null) {
                m = 1;
            } else {
                m = vh6Var.m();
            }
            a0 = jb6.a0(null, null, 2131748944, jb6.G(m, "Chats", new Object[0]));
        }
        u31 Q = new c41(this.U2.F, this.J0).Q(2131624029, 36, gm.S2(a0));
        Q.s = false;
        Q.j();
    }
}
