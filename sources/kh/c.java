package kh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c extends FrameLayout {
    public static final int f10502c = 0;
    public final org.telegram.ui.ActionBar.f6 f10503a;
    public final int f10504b;

    public c(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f10504b = i10;
        this.f10503a = f6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
