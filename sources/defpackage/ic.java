package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ic extends FrameLayout {
    public View[] a;
    public boolean b;
    public float c;
    public ValueAnimator d;

    public final void a() {
        int i;
        float f;
        int i2;
        View[] viewArr = this.a;
        if (getMeasuredWidth() > 0) {
            i = getMeasuredWidth();
        } else {
            i = gm.q.x;
        }
        float f2 = i;
        if (jb6.a0) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        int i3 = 0;
        View view = viewArr[0];
        if (view != null) {
            view.setTranslationX((-this.c) * f2 * f);
            View view2 = viewArr[0];
            if (this.c < 1.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        View view3 = viewArr[1];
        if (view3 != null) {
            view3.setTranslationX((1.0f - this.c) * f2 * f);
            View view4 = viewArr[1];
            if (this.c <= 0.0f) {
                i3 = 8;
            }
            view4.setVisibility(i3);
        }
    }

    public final void b(int i, boolean z) {
        this.b = i;
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.d = null;
        }
        if (!z) {
            this.c = i;
            a();
            requestLayout();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c, i);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new f0(this, (byte) 5));
        this.d.addListener(new g0(this, (byte) 6));
        this.d.setDuration(320L);
        this.d.setInterpolator(d53.h);
        this.d.start();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        View[] viewArr = this.a;
        int i4 = 0;
        View view = viewArr[0];
        if (view != null && view.getVisibility() == 0) {
            viewArr[0].measure(i, 0);
            i3 = viewArr[0].getMeasuredHeight();
        } else {
            i3 = 0;
        }
        View view2 = viewArr[1];
        if (view2 != null && view2.getVisibility() == 0) {
            viewArr[1].measure(i, 0);
            i4 = viewArr[1].getMeasuredHeight();
        }
        float f = this.c;
        if (f > 0.0f) {
            if (f >= 1.0f) {
                i3 = i4;
            } else {
                i3 = gm.U1(f, i3, i4);
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }
}
