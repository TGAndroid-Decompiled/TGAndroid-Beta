package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ea0;
import w7.x5;
public final class d4 extends org.telegram.ui.Cells.m4 {
    public final ea0 f9016r;

    public d4(Context context, e6 e6Var) {
        super(context, e6Var);
        int i10;
        ea0 ea0Var = new ea0(context, e6Var);
        this.f9016r = ea0Var;
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setTextColor(i6.w0(i6.f21199z6, e6Var));
        ea0Var.setLinkTextColor(i6.w0(i6.L6, e6Var));
        ea0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(ea0Var, x5.a(-2.0f, 10.0f, 14.0f, 10.0f, 0.0f, -2, i10 | 48));
    }
}
