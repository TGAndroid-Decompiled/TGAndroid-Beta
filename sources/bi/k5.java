package bi;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r61;
public final class k5 extends r61 {
    public final oc f2987f3;

    public k5(oc ocVar, Context context, int i10, h5 h5Var, a1.c cVar, zh.b bVar) {
        super(context, i10, 0, false, h5Var, cVar, null, bVar, -1, 0);
        this.f2987f3 = ocVar;
    }

    @Override
    public final void G1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f2987f3.f3388b, (e2.h) new i5(this, 1));
    }

    @Override
    public final Integer V0(int i10) {
        return 0;
    }
}
