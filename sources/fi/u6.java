package fi;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import c8.ja;
public final class u6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f12401a;
    public final View f12402b;
    public final TextView f12403c;
    public final w6 d;

    public u6(w6 w6Var, TextView textView, View view, TextView textView2) {
        this.d = w6Var;
        this.f12401a = textView;
        this.f12402b = view;
        this.f12403c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f12401a;
        textView.getLocationOnScreen(iArr);
        int L = org.telegram.messenger.g0.L(24.0f) + iArr[1];
        int measuredHeight = this.f12402b.getMeasuredHeight();
        w6 w6Var = this.d;
        if (L > measuredHeight) {
            textView.setLayoutParams(ja.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f12403c.setLayoutParams(ja.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            w6Var.requestLayout();
        }
        w6Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
