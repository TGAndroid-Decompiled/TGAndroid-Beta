package ci;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class k7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f5570a;
    public final View f5571b;
    public final TextView f5572c;
    public final m7 d;

    public k7(m7 m7Var, TextView textView, View view, TextView textView2) {
        this.d = m7Var;
        this.f5570a = textView;
        this.f5571b = view;
        this.f5572c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f5570a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f5571b.getMeasuredHeight();
        m7 m7Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(w7.z5.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f5572c.setLayoutParams(w7.z5.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            m7Var.requestLayout();
        }
        m7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
