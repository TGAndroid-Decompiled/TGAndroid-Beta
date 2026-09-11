package bi;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class l6 extends org.telegram.ui.Cells.n6 {
    public final n6 K;

    public l6(int i10, Context context, b bVar, n6 n6Var) {
        super(1, i10, context, bVar, false, true);
        this.K = n6Var;
    }

    @Override
    public final void b(long j3) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        pb createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j3, d9.a(this.K.d.f3696r));
    }
}
