package oh;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class y4 extends org.telegram.ui.Cells.n6 {
    public final a5 H;

    public y4(int i10, Context context, b bVar, a5 a5Var) {
        super(1, i10, context, bVar, false, true);
        this.H = a5Var;
    }

    @Override
    public final void b(long j10) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        i9 createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j10, c7.a(this.H.d.f17033r));
    }
}
