package di;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class e5 extends org.telegram.ui.Cells.m6 {
    public final g5 L;

    public e5(int i7, Context context, b bVar, g5 g5Var) {
        super(1, i7, context, bVar, false, true);
        this.L = g5Var;
    }

    @Override
    public final void b(long j3) {
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        p9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.J(getContext(), j3, h7.a(this.L.d.f9305r));
    }
}
