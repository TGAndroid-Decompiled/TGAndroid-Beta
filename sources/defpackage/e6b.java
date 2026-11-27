package defpackage;

import android.view.ViewTreeObserver;
import android.widget.TextView;
public final class e6b implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView a;
    public final zbb b;
    public final TextView c;
    public final g6b d;

    public e6b(g6b g6bVar, TextView textView, zbb zbbVar, TextView textView2) {
        this.d = g6bVar;
        this.a = textView;
        this.b = zbbVar;
        this.c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.a;
        textView.getLocationOnScreen(iArr);
        int L = hl.L(24.0f) + iArr[1];
        int measuredHeight = this.b.getMeasuredHeight();
        g6b g6bVar = this.d;
        if (L > measuredHeight) {
            textView.setLayoutParams(tre.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.c.setLayoutParams(tre.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            g6bVar.requestLayout();
        }
        g6bVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
