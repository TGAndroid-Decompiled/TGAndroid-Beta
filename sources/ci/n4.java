package ci;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k71;
public final class n4 extends k71 {
    public final cb f5633d3;

    public n4(cb cbVar, Context context, int i10, l4 l4Var, a1.c cVar, ai.d dVar) {
        super(context, i10, 0, false, l4Var, cVar, null, dVar, -1, 0);
        this.f5633d3 = cbVar;
    }

    @Override
    public final void I1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f5633d3.f5942b, (Utilities.Callback<View>) new ai.y1(this, 11));
    }

    @Override
    public final Integer W0(int i10) {
        return 0;
    }
}
