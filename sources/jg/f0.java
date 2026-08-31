package jg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Components.pq;
public final class f0 extends a9 {
    public final g6 v;

    public f0(Context context, g6 g6Var) {
        super(context, g6Var);
        this.v = g6Var;
    }

    public void setBackground(boolean z4) {
        int i10;
        Context context = getContext();
        if (z4) {
            i10 = R.drawable.greydivider_bottom;
        } else {
            i10 = R.drawable.greydivider;
        }
        int i11 = k6.f21624b7;
        g6 g6Var = this.v;
        pq pqVar = new pq(new ColorDrawable(k6.v0(k6.f21605a7, g6Var)), k6.U0(context, i10, k6.v0(i11, g6Var)), 0, 0);
        pqVar.f30173w = true;
        setBackground(pqVar);
    }
}
