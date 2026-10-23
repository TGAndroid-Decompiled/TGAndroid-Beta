package gi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.y90;
import w7.z5;
public final class t3 extends org.telegram.ui.Cells.l4 {
    public final y90 f11490r;

    public t3(Context context, g6 g6Var) {
        super(context, g6Var);
        int i10;
        y90 y90Var = new y90(context, g6Var);
        this.f11490r = y90Var;
        y90Var.setTextSize(1, 14.0f);
        r6.W(y90Var, k6.f21588z6, g6Var);
        r6.I(y90Var, k6.L6, g6Var);
        y90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(y90Var, z5.d(-2, -2.0f, i10 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
