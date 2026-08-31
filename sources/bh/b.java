package bh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.i61;
public abstract class b extends i61 {
    public b(Context context, int i10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, g6 g6Var) {
        super(context, i10, -1, false, callback2, callback5, null, g6Var, -1, 0);
        this.f31403w2 = true;
        setOverScrollMode(2);
    }

    public final void I1(View view) {
        int i10;
        if (view != null) {
            float dp = AndroidUtilities.dp(92.0f);
            float width = getWidth() - dp;
            float x10 = view.getX();
            float width2 = view.getWidth() + x10;
            if (x10 < dp) {
                i10 = (int) (x10 - dp);
            } else if (width2 > width) {
                i10 = (int) (width2 - width);
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                AndroidUtilities.doOnLayout(this, new a(this, view, i10, 0));
            }
        }
    }
}
