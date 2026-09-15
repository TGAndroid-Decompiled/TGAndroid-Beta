package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class n9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f1299a;
    public final View f1300b;
    public final TextView f1301c;
    public final p9 d;

    public n9(p9 p9Var, TextView textView, View view, TextView textView2) {
        this.d = p9Var;
        this.f1299a = textView;
        this.f1300b = view;
        this.f1301c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f1299a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f1300b.getMeasuredHeight();
        p9 p9Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(w7.x5.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f1301c.setLayoutParams(w7.x5.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            p9Var.requestLayout();
        }
        p9Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
