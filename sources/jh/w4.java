package jh;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

public final class w4 extends org.telegram.ui.Cells.k6 {
    public final y4 G;

    public w4(int i10, Context context, b bVar, y4 y4Var) {
        super(1, i10, context, bVar, false, true);
        this.G = y4Var;
    }

    @Override
    public final void b(long j10) {
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (n2VarR == null) {
            return;
        }
        i9 i9VarCreateOverlayStoryViewer = n2VarR.createOverlayStoryViewer();
        i9VarCreateOverlayStoryViewer.getClass();
        i9VarCreateOverlayStoryViewer.D(getContext(), j10, b7.a(this.G.d.f13156r));
    }
}
