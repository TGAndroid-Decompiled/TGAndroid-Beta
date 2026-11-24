package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class eob extends tca {
    public final gob U2;

    public eob(gob gobVar, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.U2 = gobVar;
    }

    @Override
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        int m = vh6Var.m();
        rob robVar = this.U2.a;
        if (m == 1) {
            robVar.n0.m(Integer.valueOf(i), 61, ((TLRPC.Dialog) vh6Var.n(0)).id);
            return;
        }
        robVar.n0.k(0L, 61, Integer.valueOf(i), Integer.valueOf(vh6Var.m()), null, null);
    }
}
