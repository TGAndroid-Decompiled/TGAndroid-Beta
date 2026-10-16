package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class z8 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f4073a;
    public final View f4074b;
    public final TextView f4075c;
    public final b9 d;

    public z8(b9 b9Var, TextView textView, View view, TextView textView2) {
        this.d = b9Var;
        this.f4073a = textView;
        this.f4074b = view;
        this.f4075c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f4073a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f4074b.getMeasuredHeight();
        b9 b9Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(w7.z5.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f4075c.setLayoutParams(w7.z5.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            b9Var.requestLayout();
        }
        b9Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
