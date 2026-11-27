package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class zq9 extends kea {
    public final er9 U2;

    public zq9(er9 er9Var, Context context, String str, String str2) {
        super(context, null, str, null, false, str2, null, true);
        this.U2 = er9Var;
    }

    @Override
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        int m = zh6Var.m();
        UndoView undoView = this.U2.J;
        if (m == 1) {
            undoView.m(((TLRPC.Dialog) zh6Var.n(0)).id, Integer.valueOf(i), 41);
        } else {
            undoView.k(0L, 41, Integer.valueOf(i), Integer.valueOf(zh6Var.m()), null, null);
        }
    }
}
