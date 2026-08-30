package dh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.t00;
public final class r extends h51 {
    public static final int f4930a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        t00 t00Var = new t00(context, null);
        t00Var.setViewType(16);
        t00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return t00Var;
    }
}
