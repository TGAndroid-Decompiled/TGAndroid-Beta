package gh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class c extends FrameLayout {

    public static final int f7174c = 0;

    public final org.telegram.ui.ActionBar.c6 f7175a;

    public final int f7176b;

    public c(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f7176b = i10;
        this.f7175a = c6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
