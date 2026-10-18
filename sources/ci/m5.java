package ci;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class m5 extends org.telegram.ui.Cells.n6 {
    public final o5 L;

    public m5(int i10, Context context, b bVar, o5 o5Var) {
        super(1, i10, context, bVar, false, true);
        this.L = o5Var;
    }

    @Override
    public final void b(long j10) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        z9 createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j10, q7.a(this.L.d.f5952r));
    }
}
