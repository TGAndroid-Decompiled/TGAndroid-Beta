package ci;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class n5 extends org.telegram.ui.Cells.n6 {
    public final p5 L;

    public n5(int i10, Context context, b bVar, p5 p5Var) {
        super(1, i10, context, bVar, false, true);
        this.L = p5Var;
    }

    @Override
    public final void b(long j10) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        aa createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j10, r7.a(this.L.d.f6051r));
    }
}
