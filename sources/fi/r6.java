package fi;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import c8.ma;
public final class r6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f12508a;
    public final View f12509b;
    public final TextView f12510c;
    public final t6 d;

    public r6(t6 t6Var, TextView textView, View view, TextView textView2) {
        this.d = t6Var;
        this.f12508a = textView;
        this.f12509b = view;
        this.f12510c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f12508a;
        textView.getLocationOnScreen(iArr);
        int L = org.telegram.messenger.g0.L(24.0f) + iArr[1];
        int measuredHeight = this.f12509b.getMeasuredHeight();
        t6 t6Var = this.d;
        if (L > measuredHeight) {
            textView.setLayoutParams(ma.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f12510c.setLayoutParams(ma.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            t6Var.requestLayout();
        }
        t6Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
