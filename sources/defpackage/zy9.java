package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class zy9 extends FrameLayout {
    public FrameLayout a;
    public rj b;
    public cj8 c;
    public String d;
    public ValueAnimator e;
    public float f;
    public Boolean h;
    public ValueAnimator n;

    @Override
    public final void onMeasure(int i, int i2) {
        setPadding(gm.L(5.0f), gm.L(8.0f), gm.L(5.0f), gm.L(8.0f));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + gm.L(44.0f), 1073741824));
    }
}
