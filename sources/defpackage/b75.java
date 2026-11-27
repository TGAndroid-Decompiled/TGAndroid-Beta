package defpackage;

import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
public final class b75 extends UndoView {
    public final j95 k0;

    public b75(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = j95Var;
    }

    @Override
    public final void k(long j, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.k0.t2 != null) {
            return;
        }
        super.k(j, i, obj, obj2, runnable, runnable2);
    }
}
