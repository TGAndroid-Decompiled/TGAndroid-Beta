package bi;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class o6 extends org.telegram.ui.Cells.o6 {
    public final q6 L;

    public o6(int i10, Context context, b bVar, q6 q6Var) {
        super(1, i10, context, bVar, false, true);
        this.L = q6Var;
    }

    @Override
    public final void b(long j10) {
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        sb createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j10, g9.a(this.L.d.f3909r));
    }
}
