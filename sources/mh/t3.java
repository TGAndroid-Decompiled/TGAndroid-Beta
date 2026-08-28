package mh;

import android.content.Context;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l80;
public final class t3 extends org.telegram.ui.Cells.m4 {
    public final l80 f18133r;

    public t3(Context context, b6 b6Var) {
        super(context, b6Var);
        int i9;
        l80 l80Var = new l80(context, b6Var);
        this.f18133r = l80Var;
        l80Var.setTextSize(1, 14.0f);
        l80Var.setTextColor(f6.v0(f6.f23386z6, b6Var));
        l80Var.setLinkTextColor(f6.v0(f6.L6, b6Var));
        l80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i9 = 3;
        } else {
            i9 = 5;
        }
        addView(l80Var, e6.d(-2, -2.0f, i9 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
