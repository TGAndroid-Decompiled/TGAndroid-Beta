package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.n90;
import w7.y5;
public final class d4 extends org.telegram.ui.Cells.n4 {
    public final n90 f8301r;

    public d4(Context context, f6 f6Var) {
        super(context, f6Var);
        int i10;
        n90 n90Var = new n90(context, f6Var);
        this.f8301r = n90Var;
        n90Var.setTextSize(1, 14.0f);
        n90Var.setTextColor(j6.v0(j6.f19511z6, f6Var));
        n90Var.setLinkTextColor(j6.v0(j6.L6, f6Var));
        n90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(n90Var, y5.d(-2, -2.0f, i10 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
