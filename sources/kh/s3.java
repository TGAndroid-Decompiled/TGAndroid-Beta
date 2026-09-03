package kh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
public final class s3 extends h51 {
    public static final int f10924a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        Typeface typeface;
        f90 f90Var = (f90) view;
        f90Var.setGravity(i51Var.f25598z);
        f90Var.setTextColor((int) i51Var.B);
        f90Var.setTextSize(1, i51Var.A);
        if (i51Var.f25590q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        f90Var.setTypeface(typeface);
        int i10 = i51Var.f25582i;
        f90Var.setPadding(i10, 0, i10, i51Var.f25584k);
        f90Var.setText(i51Var.f25585l);
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new eg.b2(context, 1, null);
    }
}
