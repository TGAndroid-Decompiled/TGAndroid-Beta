package lh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class t3 extends g51 {
    public static final int f12975a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        Typeface typeface;
        g90 g90Var = (g90) view;
        g90Var.setGravity(h51Var.f27388z);
        g90Var.setTextColor((int) h51Var.B);
        g90Var.setTextSize(1, h51Var.A);
        if (h51Var.f27380q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        g90Var.setTypeface(typeface);
        int i10 = h51Var.f27372i;
        g90Var.setPadding(i10, 0, i10, h51Var.f27374k);
        g90Var.setText(h51Var.f27375l);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new fg.a2(context, 1, null);
    }
}
