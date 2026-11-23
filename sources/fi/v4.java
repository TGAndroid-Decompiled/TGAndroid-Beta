package fi;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class v4 extends org.telegram.ui.Cells.n6 {
    public final x4 M;

    public v4(int i7, Context context, b bVar, x4 x4Var) {
        super(1, i7, context, bVar, false, true);
        this.M = x4Var;
    }

    @Override
    public final void b(long j3) {
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        f9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.J(getContext(), j3, y6.a(this.M.d.f11818r));
    }
}
