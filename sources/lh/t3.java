package lh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class t3 extends i51 {
    public static final int f12973a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        Typeface typeface;
        g90 g90Var = (g90) view;
        g90Var.setGravity(j51Var.f28027z);
        g90Var.setTextColor((int) j51Var.B);
        g90Var.setTextSize(1, j51Var.A);
        if (j51Var.f28019q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        g90Var.setTypeface(typeface);
        int i10 = j51Var.f28011i;
        g90Var.setPadding(i10, 0, i10, j51Var.f28013k);
        g90Var.setText(j51Var.f28014l);
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        return new fg.a2(context, 1, null);
    }
}
