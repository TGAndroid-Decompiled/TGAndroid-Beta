package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class b0a extends qz8 {
    public final c0a M;

    public b0a(int i, f53 f53Var, c0a c0aVar, Context context) {
        super(1, i, f53Var, context, false, true);
        this.M = c0aVar;
    }

    @Override
    public final void b(long j) {
        d Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        m8b createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.H(getContext(), j, p2b.a(this.M.d.r));
    }
}
