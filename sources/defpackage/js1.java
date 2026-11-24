package defpackage;

import android.app.Activity;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
public final class js1 extends wv4 {
    public final mu1 m1;

    public js1(mu1 mu1Var, Activity activity, d dVar) {
        super(activity, dVar);
        this.m1 = mu1Var;
    }

    @Override
    public final void D0() {
        mu1 mu1Var = this.m1;
        mu1Var.b6();
        UndoView undoView = mu1Var.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        mu1Var.getMessagesController().n4(mu1Var.l6, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void E0() {
        mu1 mu1Var = this.m1;
        mu1Var.getMessagesController().O(mu1Var.getParentActivity(), mu1Var.e, mu1Var, new rh1(this, (byte) 8));
    }
}
