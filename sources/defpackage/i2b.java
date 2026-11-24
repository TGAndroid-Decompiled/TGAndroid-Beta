package defpackage;

import android.view.ViewTreeObserver;
import android.widget.TextView;
public final class i2b implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView a;
    public final a8b b;
    public final TextView c;
    public final k2b d;

    public i2b(k2b k2bVar, TextView textView, a8b a8bVar, TextView textView2) {
        this.d = k2bVar;
        this.a = textView;
        this.b = a8bVar;
        this.c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.a;
        textView.getLocationOnScreen(iArr);
        int L = gl.L(24.0f) + iArr[1];
        int measuredHeight = this.b.getMeasuredHeight();
        k2b k2bVar = this.d;
        if (L > measuredHeight) {
            textView.setLayoutParams(nme.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.c.setLayoutParams(nme.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            k2bVar.requestLayout();
        }
        k2bVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
