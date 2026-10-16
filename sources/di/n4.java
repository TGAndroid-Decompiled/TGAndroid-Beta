package di;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i71;
public final class n4 extends i71 {
    public final bb f7455d3;

    public n4(bb bbVar, Context context, int i10, l4 l4Var, a1.c cVar, bi.b bVar) {
        super(context, i10, 0, false, l4Var, cVar, null, bVar, -1, 0);
        this.f7455d3 = bbVar;
    }

    @Override
    public final void I1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f7455d3.f7756b, (Utilities.Callback<View>) new bi.o1(this, 11));
    }

    @Override
    public final Integer W0(int i10) {
        return 0;
    }
}
