package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class d2a extends r19 {
    public final e2a M;

    public d2a(int i, r63 r63Var, e2a e2aVar, Context context) {
        super(1, i, r63Var, context, false, true);
        this.M = e2aVar;
    }

    @Override
    public final void b(long j) {
        d Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        oab createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.H(getContext(), j, q4b.a(this.M.d.r));
    }
}
