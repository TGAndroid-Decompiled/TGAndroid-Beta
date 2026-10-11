package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.fa0;
import w7.x5;
public final class d4 extends org.telegram.ui.Cells.m4 {
    public final fa0 f9015r;

    public d4(Context context, d6 d6Var) {
        super(context, d6Var);
        int i10;
        fa0 fa0Var = new fa0(context, d6Var);
        this.f9015r = fa0Var;
        fa0Var.setTextSize(1, 14.0f);
        fa0Var.setTextColor(h6.w0(h6.f21189z6, d6Var));
        fa0Var.setLinkTextColor(h6.w0(h6.L6, d6Var));
        fa0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(fa0Var, x5.a(-2.0f, 10.0f, 14.0f, 10.0f, 0.0f, -2, i10 | 48));
    }
}
