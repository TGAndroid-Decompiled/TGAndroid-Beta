package kh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class t3 extends h51 {
    public static final int f10828a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        Typeface typeface;
        e90 e90Var = (e90) view;
        e90Var.setGravity(i51Var.f25578z);
        e90Var.setTextColor((int) i51Var.B);
        e90Var.setTextSize(1, i51Var.A);
        if (i51Var.f25570q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        e90Var.setTypeface(typeface);
        int i10 = i51Var.f25562i;
        e90Var.setPadding(i10, 0, i10, i51Var.f25564k);
        e90Var.setText(i51Var.f25565l);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new eg.b2(context, 1, null);
    }
}
