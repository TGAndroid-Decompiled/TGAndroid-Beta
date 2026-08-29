package gg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.jq;
public final class f0 extends y8 {
    public final c6 v;

    public f0(Context context, c6 c6Var) {
        super(context, c6Var);
        this.v = c6Var;
    }

    public void setBackground(boolean z10) {
        int i10;
        Context context = getContext();
        if (z10) {
            i10 = R.drawable.greydivider_bottom;
        } else {
            i10 = R.drawable.greydivider;
        }
        int i11 = g6.f23028b7;
        c6 c6Var = this.v;
        jq jqVar = new jq(new ColorDrawable(g6.v0(g6.f23009a7, c6Var)), g6.U0(context, i10, g6.v0(i11, c6Var)), 0, 0);
        jqVar.f29792w = true;
        setBackground(jqVar);
    }
}
