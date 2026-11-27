package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class q0a extends FrameLayout {
    public FrameLayout a;
    public si b;
    public ok8 c;
    public String d;
    public ValueAnimator e;
    public float f;
    public Boolean h;
    public ValueAnimator n;

    @Override
    public final void onMeasure(int i, int i2) {
        setPadding(hl.L(5.0f), hl.L(8.0f), hl.L(5.0f), hl.L(8.0f));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + hl.L(44.0f), 1073741824));
    }
}
