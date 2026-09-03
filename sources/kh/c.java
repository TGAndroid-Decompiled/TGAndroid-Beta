package kh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class c extends FrameLayout {
    public static final int f10620c = 0;
    public final f6 f10621a;
    public final int f10622b;

    public c(Context context, int i10, f6 f6Var) {
        super(context);
        this.f10622b = i10;
        this.f10621a = f6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
