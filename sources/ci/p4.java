package ci;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e61;
public final class p4 extends e61 {
    public final fb f5302f3;

    public p4(fb fbVar, Context context, int i10, n4 n4Var, a1.c cVar, ai.d dVar) {
        super(context, i10, 0, false, n4Var, cVar, null, dVar, -1, 0);
        this.f5302f3 = fbVar;
    }

    @Override
    public final void H1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f5302f3.f5608b, (e2.h) new ai.f3(this, 4));
    }

    @Override
    public final Integer W0(int i10) {
        return 0;
    }
}
