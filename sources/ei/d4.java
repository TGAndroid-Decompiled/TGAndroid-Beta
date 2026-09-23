package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.d90;
import w7.x5;
public final class d4 extends org.telegram.ui.Cells.m4 {
    public final d90 f8285r;

    public d4(Context context, d6 d6Var) {
        super(context, d6Var);
        int i10;
        d90 d90Var = new d90(context, d6Var);
        this.f8285r = d90Var;
        d90Var.setTextSize(1, 14.0f);
        d90Var.setTextColor(h6.v0(h6.f19189z6, d6Var));
        d90Var.setLinkTextColor(h6.v0(h6.L6, d6Var));
        d90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(d90Var, x5.d(-2, -2.0f, i10 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
