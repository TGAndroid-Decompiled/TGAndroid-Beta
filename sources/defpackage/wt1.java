package defpackage;

import android.app.Activity;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
public final class wt1 extends yx4 {
    public final yv1 m1;

    public wt1(yv1 yv1Var, Activity activity, d dVar) {
        super(activity, dVar);
        this.m1 = yv1Var;
    }

    @Override
    public final void D0() {
        yv1 yv1Var = this.m1;
        yv1Var.i6();
        UndoView undoView = yv1Var.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        yv1Var.getMessagesController().p4(yv1Var.l6, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void E0() {
        yv1 yv1Var = this.m1;
        yv1Var.getMessagesController().O(yv1Var.getParentActivity(), yv1Var.e, yv1Var, new cd1(this, (byte) 11));
    }
}
