package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ia0;
import w7.w5;
public final class d4 extends org.telegram.ui.Cells.m4 {
    public final ia0 f9013r;

    public d4(Context context, c6 c6Var) {
        super(context, c6Var);
        int i10;
        ia0 ia0Var = new ia0(context, c6Var);
        this.f9013r = ia0Var;
        ia0Var.setTextSize(1, 14.0f);
        ia0Var.setTextColor(h6.w0(h6.f20963z6, c6Var));
        ia0Var.setLinkTextColor(h6.w0(h6.L6, c6Var));
        ia0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(ia0Var, w5.a(-2.0f, 10.0f, 14.0f, 10.0f, 0.0f, -2, i10 | 48));
    }
}
