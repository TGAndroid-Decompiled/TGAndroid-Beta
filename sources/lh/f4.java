package lh;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k51;

public final class f4 extends k51 {

    public final ka f15956b3;

    public f4(ka kaVar, Context context, int i10, e4 e4Var, p pVar, jh.b bVar) {
        super(context, i10, 0, false, e4Var, pVar, null, bVar, -1, 0);
        this.f15956b3 = kaVar;
    }

    @Override
    public final void H1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f15956b3.f16228b, (d5.d) new ig.i(this, 5));
    }

    @Override
    public final Integer W0(int i10) {
        return 0;
    }
}
