package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class o9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f1536a;
    public final View f1537b;
    public final TextView f1538c;
    public final q9 d;

    public o9(q9 q9Var, TextView textView, View view, TextView textView2) {
        this.d = q9Var;
        this.f1536a = textView;
        this.f1537b = view;
        this.f1538c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f1536a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f1537b.getMeasuredHeight();
        q9 q9Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(w7.w5.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f1538c.setLayoutParams(w7.w5.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            q9Var.requestLayout();
        }
        q9Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
