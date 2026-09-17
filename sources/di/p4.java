package di;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d61;
public final class p4 extends d61 {
    public final fb f7852f3;

    public p4(fb fbVar, Context context, int i10, n4 n4Var, a1.c cVar, bi.b bVar) {
        super(context, i10, 0, false, n4Var, cVar, null, bVar, -1, 0);
        this.f7852f3 = fbVar;
    }

    @Override
    public final void G1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f7852f3.f8262b, (e2.h) new ah.m(this, 5));
    }

    @Override
    public final Integer V0(int i10) {
        return 0;
    }
}
