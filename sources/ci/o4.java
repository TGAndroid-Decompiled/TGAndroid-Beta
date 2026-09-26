package ci;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.s61;
public final class o4 extends s61 {
    public final cb f5239f3;

    public o4(cb cbVar, Context context, int i10, m4 m4Var, a1.c cVar, ai.d dVar) {
        super(context, i10, 0, false, m4Var, cVar, null, dVar, -1, 0);
        this.f5239f3 = cbVar;
    }

    @Override
    public final void H1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f5239f3.f5535b, (Utilities.Callback<View>) new ai.y1(this, 11));
    }

    @Override
    public final Integer W0(int i10) {
        return 0;
    }
}
