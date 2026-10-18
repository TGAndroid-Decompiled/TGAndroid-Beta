package ci;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class j7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f5474a;
    public final View f5475b;
    public final TextView f5476c;
    public final l7 d;

    public j7(l7 l7Var, TextView textView, View view, TextView textView2) {
        this.d = l7Var;
        this.f5474a = textView;
        this.f5475b = view;
        this.f5476c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f5474a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f5475b.getMeasuredHeight();
        l7 l7Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(w7.z5.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f5476c.setLayoutParams(w7.z5.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            l7Var.requestLayout();
        }
        l7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
