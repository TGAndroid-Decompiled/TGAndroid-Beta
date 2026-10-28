package di;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kb1;
public final class j7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f8700a;
    public final View f8701b;
    public final TextView f8702c;
    public final l7 d;

    public j7(l7 l7Var, TextView textView, View view, TextView textView2) {
        this.d = l7Var;
        this.f8700a = textView;
        this.f8701b = view;
        this.f8702c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f8700a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f8701b.getMeasuredHeight();
        l7 l7Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(kb1.o(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f8702c.setLayoutParams(kb1.o(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            l7Var.requestLayout();
        }
        l7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
