package ih;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class a5 extends org.telegram.ui.Cells.n6 {
    public final c5 G;

    public a5(int i9, Context context, b bVar, c5 c5Var) {
        super(1, i9, context, bVar, false, true);
        this.G = c5Var;
    }

    @Override
    public final void b(long j10) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        m9 createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j10, e7.a(this.G.d.f11481r));
    }
}
