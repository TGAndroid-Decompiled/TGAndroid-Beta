package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class dmb extends taa {
    public final fmb U2;

    public dmb(fmb fmbVar, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.U2 = fmbVar;
    }

    @Override
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        int m = vf6Var.m();
        qmb qmbVar = this.U2.a;
        if (m == 1) {
            qmbVar.n0.m(Integer.valueOf(i), 61, ((TLRPC.Dialog) vf6Var.n(0)).id);
            return;
        }
        qmbVar.n0.k(0L, 61, Integer.valueOf(i), Integer.valueOf(vf6Var.m()), null, null);
    }
}
