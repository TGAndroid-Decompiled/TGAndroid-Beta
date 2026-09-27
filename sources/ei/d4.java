package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.p90;
import w7.y5;
public final class d4 extends org.telegram.ui.Cells.m4 {
    public final p90 f8286r;

    public d4(Context context, e6 e6Var) {
        super(context, e6Var);
        int i10;
        p90 p90Var = new p90(context, e6Var);
        this.f8286r = p90Var;
        p90Var.setTextSize(1, 14.0f);
        p90Var.setTextColor(i6.v0(i6.f19461z6, e6Var));
        p90Var.setLinkTextColor(i6.v0(i6.L6, e6Var));
        p90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(p90Var, y5.d(-2, -2.0f, i10 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
