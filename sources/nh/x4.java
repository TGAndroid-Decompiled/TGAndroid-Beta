package nh;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class x4 extends org.telegram.ui.Cells.n6 {
    public final z4 H;

    public x4(int i10, Context context, b bVar, z4 z4Var) {
        super(1, i10, context, bVar, false, true);
        this.H = z4Var;
    }

    @Override
    public final void b(long j10) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        i9 createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j10, c7.a(this.H.d.f15270r));
    }
}
