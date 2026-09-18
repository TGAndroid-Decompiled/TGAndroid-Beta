package ai;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class c7 extends org.telegram.ui.Cells.n6 {
    public final e7 K;

    public c7(int i10, d dVar, e7 e7Var, Context context) {
        super(1, i10, context, dVar, false, true);
        this.K = e7Var;
    }

    @Override
    public final void b(long j3) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        jc createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j3, u9.a(this.K.d.f1052r));
    }
}
