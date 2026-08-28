package ih;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class x6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f12325a;
    public final View f12326b;
    public final TextView f12327c;
    public final z6 d;

    public x6(z6 z6Var, TextView textView, View view, TextView textView2) {
        this.d = z6Var;
        this.f12325a = textView;
        this.f12326b = view;
        this.f12327c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f12325a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f12326b.getMeasuredHeight();
        z6 z6Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(g7.e6.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f12327c.setLayoutParams(g7.e6.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            z6Var.requestLayout();
        }
        z6Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
