package ai;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class d7 extends org.telegram.ui.Cells.o6 {
    public final f7 L;

    public d7(int i10, d dVar, f7 f7Var, Context context) {
        super(1, i10, context, dVar, false, true);
        this.L = f7Var;
    }

    @Override
    public final void b(long j3) {
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        kc createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j3, v9.a(this.L.d.f1340r));
    }
}
