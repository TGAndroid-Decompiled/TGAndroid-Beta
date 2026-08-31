package lh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class c extends FrameLayout {
    public static final int f12639c = 0;
    public final g6 f12640a;
    public final int f12641b;

    public c(Context context, int i10, g6 g6Var) {
        super(context);
        this.f12641b = i10;
        this.f12640a = g6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
