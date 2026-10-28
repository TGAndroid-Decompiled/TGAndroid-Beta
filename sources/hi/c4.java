package hi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.kb1;
public final class c4 extends org.telegram.ui.Cells.q4 {
    public final aa0 f12913r;

    public c4(Context context, u6 u6Var) {
        super(context, u6Var);
        int i10;
        aa0 aa0Var = new aa0(context, u6Var);
        this.f12913r = aa0Var;
        aa0Var.setTextSize(1, 14.0f);
        f7.V(aa0Var, y6.f23768z6, u6Var);
        f7.H(aa0Var, y6.L6, u6Var);
        aa0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(aa0Var, kb1.h(-2, -2.0f, i10 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
