package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class z8 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f4069a;
    public final View f4070b;
    public final TextView f4071c;
    public final b9 d;

    public z8(b9 b9Var, TextView textView, View view, TextView textView2) {
        this.d = b9Var;
        this.f4069a = textView;
        this.f4070b = view;
        this.f4071c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f4069a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f4070b.getMeasuredHeight();
        b9 b9Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(w7.a6.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f4071c.setLayoutParams(w7.a6.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            b9Var.requestLayout();
        }
        b9Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
