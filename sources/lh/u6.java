package lh;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class u6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f16302a;
    public final View f16303b;
    public final TextView f16304c;
    public final w6 d;

    public u6(w6 w6Var, TextView textView, View view, TextView textView2) {
        this.d = w6Var;
        this.f16302a = textView;
        this.f16303b = view;
        this.f16304c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f16302a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f16303b.getMeasuredHeight();
        w6 w6Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(i7.f6.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f16304c.setLayoutParams(i7.f6.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            w6Var.requestLayout();
        }
        w6Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
