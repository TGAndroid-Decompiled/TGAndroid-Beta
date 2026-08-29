package gg;

import android.content.Context;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.o6;
public final class z extends k4 {
    public final o6 f7357r;

    public z(Context context, c6 c6Var) {
        super(context, c6Var);
        int i10;
        o6 o6Var = new o6(context, true, true, true);
        this.f7357r = o6Var;
        o6Var.b(0.45f, 240L, jr.h);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        o6Var.setGravity(i10);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextColor(g6.v0(g6.L6, c6Var));
        addView(o6Var, f6.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(g6.v0(g6.f23133h5, c6Var));
    }
}
