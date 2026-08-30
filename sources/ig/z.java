package ig;

import android.content.Context;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.nr;
public final class z extends m4 {
    public final k6 f7561r;

    public z(Context context, f6 f6Var) {
        super(context, f6Var);
        int i10;
        k6 k6Var = new k6(context, true, true, true);
        this.f7561r = k6Var;
        k6Var.b(0.45f, 240L, nr.h);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        k6Var.setGravity(i10);
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setTextColor(j6.v0(j6.L6, f6Var));
        addView(k6Var, b6.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(j6.v0(j6.f19977h5, f6Var));
    }
}
