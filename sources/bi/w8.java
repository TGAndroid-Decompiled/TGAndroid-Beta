package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w8 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f3989a;
    public final View f3990b;
    public final TextView f3991c;
    public final y8 d;

    public w8(y8 y8Var, TextView textView, View view, TextView textView2) {
        this.d = y8Var;
        this.f3989a = textView;
        this.f3990b = view;
        this.f3991c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f3989a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f3990b.getMeasuredHeight();
        y8 y8Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(w7.x5.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f3991c.setLayoutParams(w7.x5.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            y8Var.requestLayout();
        }
        y8Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
