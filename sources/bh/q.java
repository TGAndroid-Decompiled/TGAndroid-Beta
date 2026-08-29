package bh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.v41;
public final class q extends v41 {
    public static final int f2695a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        p00 p00Var = new p00(context, null);
        p00Var.setViewType(16);
        p00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return p00Var;
    }
}
