package defpackage;

import android.view.ViewTreeObserver;
import android.widget.TextView;
public final class j4b implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView a;
    public final cab b;
    public final TextView c;
    public final l4b d;

    public j4b(l4b l4bVar, TextView textView, cab cabVar, TextView textView2) {
        this.d = l4bVar;
        this.a = textView;
        this.b = cabVar;
        this.c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.a;
        textView.getLocationOnScreen(iArr);
        int L = gm.L(24.0f) + iArr[1];
        int measuredHeight = this.b.getMeasuredHeight();
        l4b l4bVar = this.d;
        if (L > measuredHeight) {
            textView.setLayoutParams(qoe.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.c.setLayoutParams(qoe.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            l4bVar.requestLayout();
        }
        l4bVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
