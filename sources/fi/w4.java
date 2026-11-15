package fi;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class w4 extends org.telegram.ui.Cells.l6 {
    public final y4 M;

    public w4(int i7, Context context, b bVar, y4 y4Var) {
        super(1, i7, context, bVar, false, true);
        this.M = y4Var;
    }

    @Override
    public final void b(long j3) {
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        i9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.J(getContext(), j3, b7.a(this.M.d.f11603r));
    }
}
