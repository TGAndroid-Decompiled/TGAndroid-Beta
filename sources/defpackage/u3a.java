package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class u3a extends e39 {
    public final v3a M;

    public u3a(int i, x53 x53Var, v3a v3aVar, Context context) {
        super(1, i, x53Var, context, false, true);
        this.M = v3aVar;
    }

    @Override
    public final void b(long j) {
        e Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        lcb createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.H(getContext(), j, l6b.a(this.M.d.r));
    }
}
