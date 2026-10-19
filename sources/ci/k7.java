package ci;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class k7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f5567a;
    public final View f5568b;
    public final TextView f5569c;
    public final m7 d;

    public k7(m7 m7Var, TextView textView, View view, TextView textView2) {
        this.d = m7Var;
        this.f5567a = textView;
        this.f5568b = view;
        this.f5569c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f5567a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f5568b.getMeasuredHeight();
        m7 m7Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(w7.z5.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f5569c.setLayoutParams(w7.z5.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            m7Var.requestLayout();
        }
        m7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
