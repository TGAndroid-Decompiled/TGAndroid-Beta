package di;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import c8.ha;
public final class b7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f8853a;
    public final View f8854b;
    public final TextView f8855c;
    public final d7 d;

    public b7(d7 d7Var, TextView textView, View view, TextView textView2) {
        this.d = d7Var;
        this.f8853a = textView;
        this.f8854b = view;
        this.f8855c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f8853a;
        textView.getLocationOnScreen(iArr);
        int L = org.telegram.messenger.g0.L(24.0f) + iArr[1];
        int measuredHeight = this.f8854b.getMeasuredHeight();
        d7 d7Var = this.d;
        if (L > measuredHeight) {
            textView.setLayoutParams(ha.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f8855c.setLayoutParams(ha.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            d7Var.requestLayout();
        }
        d7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
