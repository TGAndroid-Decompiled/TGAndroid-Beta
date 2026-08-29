package ih;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c extends FrameLayout {
    public static final int f9064c = 0;
    public final org.telegram.ui.ActionBar.c6 f9065a;
    public final int f9066b;

    public c(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f9066b = i10;
        this.f9065a = c6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
