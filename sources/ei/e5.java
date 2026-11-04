package ei;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class e5 extends org.telegram.ui.Cells.l6 {
    public final g5 M;

    public e5(int i3, Context context, b bVar, g5 g5Var) {
        super(1, i3, context, bVar, false, true);
        this.M = g5Var;
    }

    @Override
    public final void b(long j10) {
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        r9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.R(getContext(), j10, i7.a(this.M.d.f10577r));
    }
}
