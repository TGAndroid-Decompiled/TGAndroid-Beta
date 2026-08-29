package ih;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.y80;
public final class t3 extends v41 {
    public static final int f9402a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        Typeface typeface;
        y80 y80Var = (y80) view;
        y80Var.setGravity(w41Var.f34313z);
        y80Var.setTextColor((int) w41Var.B);
        y80Var.setTextSize(1, w41Var.A);
        if (w41Var.f34305q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        y80Var.setTypeface(typeface);
        int i10 = w41Var.f34297i;
        y80Var.setPadding(i10, 0, i10, w41Var.f34299k);
        y80Var.setText(w41Var.f34300l);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new cg.c2(context, 1, null);
    }
}
