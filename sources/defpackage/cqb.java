package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class cqb extends kea {
    public final eqb U2;

    public cqb(eqb eqbVar, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.U2 = eqbVar;
    }

    @Override
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        int m = zh6Var.m();
        pqb pqbVar = this.U2.a;
        if (m == 1) {
            pqbVar.n0.m(((TLRPC.Dialog) zh6Var.n(0)).id, Integer.valueOf(i), 61);
        } else {
            pqbVar.n0.k(0L, 61, Integer.valueOf(i), Integer.valueOf(zh6Var.m()), null, null);
        }
    }
}
