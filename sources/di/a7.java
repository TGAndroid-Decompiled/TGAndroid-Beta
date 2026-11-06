package di;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import c8.ha;
public final class a7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f8819a;
    public final View f8820b;
    public final TextView f8821c;
    public final c7 d;

    public a7(c7 c7Var, TextView textView, View view, TextView textView2) {
        this.d = c7Var;
        this.f8819a = textView;
        this.f8820b = view;
        this.f8821c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f8819a;
        textView.getLocationOnScreen(iArr);
        int L = org.telegram.messenger.g0.L(24.0f) + iArr[1];
        int measuredHeight = this.f8820b.getMeasuredHeight();
        c7 c7Var = this.d;
        if (L > measuredHeight) {
            textView.setLayoutParams(ha.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f8821c.setLayoutParams(ha.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            c7Var.requestLayout();
        }
        c7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
