package di;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.m90;
import w7.a6;
public final class g4 extends org.telegram.ui.Cells.m4 {
    public final m90 f6644r;

    public g4(Context context, f6 f6Var) {
        super(context, f6Var);
        int i10;
        m90 m90Var = new m90(context, f6Var);
        this.f6644r = m90Var;
        m90Var.setTextSize(1, 14.0f);
        m90Var.setTextColor(j6.v0(j6.f18325z6, f6Var));
        m90Var.setLinkTextColor(j6.v0(j6.L6, f6Var));
        m90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(m90Var, a6.d(-2, -2.0f, i10 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
