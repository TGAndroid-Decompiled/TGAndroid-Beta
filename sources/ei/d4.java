package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l90;
import w7.y5;
public final class d4 extends org.telegram.ui.Cells.m4 {
    public final l90 f8301r;

    public d4(Context context, e6 e6Var) {
        super(context, e6Var);
        int i10;
        l90 l90Var = new l90(context, e6Var);
        this.f8301r = l90Var;
        l90Var.setTextSize(1, 14.0f);
        l90Var.setTextColor(j6.v0(j6.f19464z6, e6Var));
        l90Var.setLinkTextColor(j6.v0(j6.L6, e6Var));
        l90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(l90Var, y5.d(-2, -2.0f, i10 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
