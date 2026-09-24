package nh;

import ai.s1;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.r61;
public abstract class a extends r61 {
    public a(Context context, int i10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, d6 d6Var) {
        super(context, i10, -1, false, callback2, callback5, null, d6Var, -1, 0);
        this.f30114z2 = true;
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
                AndroidUtilities.doOnLayout(this, new s1(this, view, i10, 17));
            }
        }
    }
}
