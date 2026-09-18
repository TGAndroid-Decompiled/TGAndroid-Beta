package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class n9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f1304a;
    public final View f1305b;
    public final TextView f1306c;
    public final p9 d;

    public n9(p9 p9Var, TextView textView, View view, TextView textView2) {
        this.d = p9Var;
        this.f1304a = textView;
        this.f1305b = view;
        this.f1306c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f1304a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f1305b.getMeasuredHeight();
        p9 p9Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(w7.y5.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f1306c.setLayoutParams(w7.y5.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            p9Var.requestLayout();
        }
        p9Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
