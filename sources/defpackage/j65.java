package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class j65 extends taa {
    public final h75 U2;

    public j65(h75 h75Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.U2 = h75Var;
    }

    @Override
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        int m = vf6Var.m();
        h75 h75Var = this.U2;
        if (m == 1) {
            h75Var.c1().m(Integer.valueOf(i), 41, ((TLRPC.Dialog) vf6Var.n(0)).id);
            return;
        }
        h75Var.c1().k(0L, 41, Integer.valueOf(i), Integer.valueOf(vf6Var.m()), null, null);
    }
}
