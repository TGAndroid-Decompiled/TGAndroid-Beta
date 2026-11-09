package di;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class f5 extends org.telegram.ui.Cells.m6 {
    public final h5 L;

    public f5(int i7, Context context, b bVar, h5 h5Var) {
        super(1, i7, context, bVar, false, true);
        this.L = h5Var;
    }

    @Override
    public final void b(long j3) {
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        q9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.J(getContext(), j3, i7.a(this.L.d.f9329r));
    }
}
