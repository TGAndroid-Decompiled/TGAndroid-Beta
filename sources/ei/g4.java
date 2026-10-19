package ei;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b71;
public final class g4 extends b71 {
    public final ma f9065d3;

    public g4(ma maVar, Context context, int i10, f4 f4Var, e1.c cVar, ci.b bVar) {
        super(context, i10, 0, false, f4Var, cVar, null, bVar, -1, 0);
        this.f9065d3 = maVar;
    }

    @Override
    public final void I1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f9065d3.f9365b, (Utilities.Callback<View>) new ai.r0(this, 17));
    }

    @Override
    public final Integer W0(int i10) {
        return 0;
    }
}
