package jg;

import android.content.Context;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.pr;
public final class z extends m4 {
    public final k6 f10087r;

    public z(Context context, g6 g6Var) {
        super(context, g6Var);
        int i10;
        k6 k6Var = new k6(context, true, true, true);
        this.f10087r = k6Var;
        k6Var.b(0.45f, 240L, pr.h);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        k6Var.setGravity(i10);
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.L6, g6Var));
        addView(k6Var, c6.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, g6Var));
    }
}
