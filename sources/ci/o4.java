package ci;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u61;
public final class o4 extends u61 {
    public final cb f5246m3;

    public o4(cb cbVar, Context context, int i10, m4 m4Var, a1.c cVar, ai.d dVar) {
        super(context, i10, 0, false, m4Var, cVar, null, dVar, -1, 0);
        this.f5246m3 = cbVar;
    }

    @Override
    public final void J1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f5246m3.f5544b, (Utilities.Callback<View>) new ai.y1(this, 11));
    }

    @Override
    public final Integer X0(int i10) {
        return 0;
    }
}
