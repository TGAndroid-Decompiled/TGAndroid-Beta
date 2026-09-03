package eh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.u00;
public final class s extends g51 {
    public static final int f5667a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        u00 u00Var = new u00(context, null);
        u00Var.setViewType(16);
        u00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return u00Var;
    }
}
