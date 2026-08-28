package fh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c extends FrameLayout {
    public static final int f6387c = 0;
    public final org.telegram.ui.ActionBar.b6 f6388a;
    public final int f6389b;

    public c(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f6389b = i9;
        this.f6388a = b6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
