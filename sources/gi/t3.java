package gi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.x90;
import w7.z5;
public final class t3 extends org.telegram.ui.Cells.l4 {
    public final x90 f11464r;

    public t3(Context context, d6 d6Var) {
        super(context, d6Var);
        int i10;
        x90 x90Var = new x90(context, d6Var);
        this.f11464r = x90Var;
        x90Var.setTextSize(1, 14.0f);
        x90Var.setTextColor(h6.w0(h6.f21392z6, d6Var));
        x90Var.setLinkTextColor(h6.w0(h6.L6, d6Var));
        x90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(x90Var, z5.d(-2, -2.0f, i10 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
