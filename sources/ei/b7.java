package ei;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import b8.mf;
public final class b7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f10134a;
    public final View f10135b;
    public final TextView f10136c;
    public final d7 d;

    public b7(d7 d7Var, TextView textView, View view, TextView textView2) {
        this.d = d7Var;
        this.f10134a = textView;
        this.f10135b = view;
        this.f10136c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f10134a;
        textView.getLocationOnScreen(iArr);
        int L = org.telegram.messenger.g0.L(24.0f) + iArr[1];
        int measuredHeight = this.f10135b.getMeasuredHeight();
        d7 d7Var = this.d;
        if (L > measuredHeight) {
            textView.setLayoutParams(mf.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f10136c.setLayoutParams(mf.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            d7Var.requestLayout();
        }
        d7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
