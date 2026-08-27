package jh;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class u6 implements ViewTreeObserver.OnGlobalLayoutListener {

    public final TextView f14031a;

    public final View f14032b;

    public final TextView f14033c;
    public final w6 d;

    public u6(w6 w6Var, TextView textView, View view, TextView textView2) {
        this.d = w6Var;
        this.f14031a = textView;
        this.f14032b = view;
        this.f14033c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f14031a;
        textView.getLocationOnScreen(iArr);
        int iDp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f14032b.getMeasuredHeight();
        w6 w6Var = this.d;
        if (iDp > measuredHeight) {
            textView.setLayoutParams(h7.z5.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f14033c.setLayoutParams(h7.z5.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            w6Var.requestLayout();
        }
        w6Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
