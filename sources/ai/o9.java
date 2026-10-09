package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class o9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f1538a;
    public final View f1539b;
    public final TextView f1540c;
    public final q9 d;

    public o9(q9 q9Var, TextView textView, View view, TextView textView2) {
        this.d = q9Var;
        this.f1538a = textView;
        this.f1539b = view;
        this.f1540c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f1538a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f1539b.getMeasuredHeight();
        q9 q9Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(w7.x5.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f1540c.setLayoutParams(w7.x5.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            q9Var.requestLayout();
        }
        q9Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
