package defpackage;

import android.app.Activity;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
public final class xs1 extends by4 {
    public final zu1 m1;

    public xs1(zu1 zu1Var, Activity activity, e eVar) {
        super(activity, eVar);
        this.m1 = zu1Var;
    }

    @Override
    public final void E0() {
        zu1 zu1Var = this.m1;
        zu1Var.i6();
        UndoView undoView = zu1Var.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        zu1Var.getMessagesController().v4(zu1Var.l6, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void F0() {
        zu1 zu1Var = this.m1;
        zu1Var.getMessagesController().Q(zu1Var.getParentActivity(), zu1Var.e, zu1Var, new rd1(this, (byte) 10));
    }
}
