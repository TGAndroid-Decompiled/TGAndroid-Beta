package nh;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u51;
public final class b4 extends u51 {
    public final y9 f17413b3;

    public b4(y9 y9Var, Context context, int i10, a4 a4Var, l4.s0 s0Var, lh.b bVar) {
        super(context, i10, 0, false, a4Var, s0Var, null, bVar, -1, 0);
        this.f17413b3 = y9Var;
    }

    @Override
    public final void H1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f17413b3.f17694b, (f5.d) new kg.i(this, 5));
    }

    @Override
    public final Integer W0(int i10) {
        return 0;
    }
}
