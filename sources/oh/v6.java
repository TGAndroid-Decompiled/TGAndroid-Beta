package oh;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class v6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f17855a;
    public final View f17856b;
    public final TextView f17857c;
    public final x6 d;

    public v6(x6 x6Var, TextView textView, View view, TextView textView2) {
        this.d = x6Var;
        this.f17855a = textView;
        this.f17856b = view;
        this.f17857c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f17855a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f17856b.getMeasuredHeight();
        x6 x6Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(k7.c6.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f17857c.setLayoutParams(k7.c6.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            x6Var.requestLayout();
        }
        x6Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
