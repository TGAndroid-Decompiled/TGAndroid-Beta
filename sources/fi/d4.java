package fi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d90;
import w7.x5;
public final class d4 extends org.telegram.ui.Cells.l4 {
    public final d90 f9623r;

    public d4(Context context, f6 f6Var) {
        super(context, f6Var);
        int i10;
        d90 d90Var = new d90(context, f6Var);
        this.f9623r = d90Var;
        d90Var.setTextSize(1, 14.0f);
        d90Var.setTextColor(j6.v0(j6.f21061z6, f6Var));
        d90Var.setLinkTextColor(j6.v0(j6.L6, f6Var));
        d90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(d90Var, x5.d(-2, -2.0f, i10 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
