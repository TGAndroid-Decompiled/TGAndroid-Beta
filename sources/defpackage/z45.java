package defpackage;

import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
public final class z45 extends UndoView {
    public final h75 k0;

    public z45(h75 h75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = h75Var;
    }

    @Override
    public final void k(long j, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.k0.t2 != null) {
            return;
        }
        super.k(j, i, obj, obj2, runnable, runnable2);
    }
}
