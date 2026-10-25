package di;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gb1;
public final class j7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f8701a;
    public final View f8702b;
    public final TextView f8703c;
    public final l7 d;

    public j7(l7 l7Var, TextView textView, View view, TextView textView2) {
        this.d = l7Var;
        this.f8701a = textView;
        this.f8702b = view;
        this.f8703c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f8701a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f8702b.getMeasuredHeight();
        l7 l7Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(gb1.o(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f8703c.setLayoutParams(gb1.o(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            l7Var.requestLayout();
        }
        l7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
