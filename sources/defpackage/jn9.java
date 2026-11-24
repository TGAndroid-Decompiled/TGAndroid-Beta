package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class jn9 extends taa {
    public final on9 U2;

    public jn9(on9 on9Var, Context context, String str, String str2) {
        super(context, null, str, null, false, str2, null, true);
        this.U2 = on9Var;
    }

    @Override
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        int m = vf6Var.m();
        UndoView undoView = this.U2.J;
        if (m == 1) {
            undoView.m(Integer.valueOf(i), 41, ((TLRPC.Dialog) vf6Var.n(0)).id);
            return;
        }
        undoView.k(0L, 41, Integer.valueOf(i), Integer.valueOf(vf6Var.m()), null, null);
    }
}
