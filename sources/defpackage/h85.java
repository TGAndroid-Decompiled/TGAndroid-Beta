package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class h85 extends tca {
    public final g95 U2;

    public h85(g95 g95Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.U2 = g95Var;
    }

    @Override
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        int m = vh6Var.m();
        g95 g95Var = this.U2;
        if (m == 1) {
            g95Var.c1().m(Integer.valueOf(i), 41, ((TLRPC.Dialog) vh6Var.n(0)).id);
            return;
        }
        g95Var.c1().k(0L, 41, Integer.valueOf(i), Integer.valueOf(vh6Var.m()), null, null);
    }
}
