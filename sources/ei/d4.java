package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.k90;
import w7.y5;
public final class d4 extends org.telegram.ui.Cells.n4 {
    public final k90 f8302r;

    public d4(Context context, f6 f6Var) {
        super(context, f6Var);
        int i10;
        k90 k90Var = new k90(context, f6Var);
        this.f8302r = k90Var;
        k90Var.setTextSize(1, 14.0f);
        k90Var.setTextColor(j6.v0(j6.f19496z6, f6Var));
        k90Var.setLinkTextColor(j6.v0(j6.L6, f6Var));
        k90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(k90Var, y5.d(-2, -2.0f, i10 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
