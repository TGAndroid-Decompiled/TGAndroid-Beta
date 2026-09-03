package dh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.u00;
public final class q extends h51 {
    public static final int f4935a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        u00 u00Var = new u00(context, null);
        u00Var.setViewType(16);
        u00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return u00Var;
    }
}
