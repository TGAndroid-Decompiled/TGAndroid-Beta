package dg;

import android.content.Context;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j6;
public final class b0 extends m4 {
    public final j6 f4497r;

    public b0(Context context, b6 b6Var) {
        super(context, b6Var);
        int i9;
        j6 j6Var = new j6(context, true, true, true);
        this.f4497r = j6Var;
        j6Var.b(0.45f, 240L, gr.h);
        if (LocaleController.isRTL) {
            i9 = 3;
        } else {
            i9 = 5;
        }
        j6Var.setGravity(i9);
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setTextColor(f6.v0(f6.L6, b6Var));
        addView(j6Var, e6.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(f6.v0(f6.f23072h5, b6Var));
    }
}
