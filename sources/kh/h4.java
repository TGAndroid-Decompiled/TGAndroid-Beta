package kh;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i51;
public final class h4 extends i51 {
    public final na f15393b3;

    public h4(na naVar, Context context, int i9, f4 f4Var, p pVar, ih.b bVar) {
        super(context, i9, 0, false, f4Var, pVar, null, bVar, -1, 0);
        this.f15393b3 = naVar;
    }

    @Override
    public final void H1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f15393b3.f15689b, (d5.d) new hg.i(this, 5));
    }

    @Override
    public final Integer W0(int i9) {
        return 0;
    }
}
