package dg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Components.fq;
public final class h0 extends b9 {
    public final b6 v;

    public h0(Context context, b6 b6Var) {
        super(context, b6Var);
        this.v = b6Var;
    }

    public void setBackground(boolean z10) {
        int i9;
        Context context = getContext();
        if (z10) {
            i9 = R.drawable.greydivider_bottom;
        } else {
            i9 = R.drawable.greydivider;
        }
        int i10 = f6.f22966b7;
        b6 b6Var = this.v;
        fq fqVar = new fq(new ColorDrawable(f6.v0(f6.f22947a7, b6Var)), f6.U0(context, i9, f6.v0(i10, b6Var)), 0, 0);
        fqVar.f28550w = true;
        setBackground(fqVar);
    }
}
