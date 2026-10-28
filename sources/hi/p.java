package hi;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ds;
public final class p extends FrameLayout {
    public View[] f13185a;
    public int f13186b;
    public float f13187c;
    public ValueAnimator d;

    public final void a() {
        int i10;
        float f7;
        int i11;
        View[] viewArr = this.f13185a;
        if (getMeasuredWidth() > 0) {
            i10 = getMeasuredWidth();
        } else {
            i10 = AndroidUtilities.displaySize.x;
        }
        float f10 = i10;
        if (LocaleController.isRTL) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        int i12 = 0;
        View view = viewArr[0];
        if (view != null) {
            view.setTranslationX((-this.f13187c) * f10 * f7);
            View view2 = viewArr[0];
            if (this.f13187c < 1.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view2.setVisibility(i11);
        }
        View view3 = viewArr[1];
        if (view3 != null) {
            view3.setTranslationX((1.0f - this.f13187c) * f10 * f7);
            View view4 = viewArr[1];
            if (this.f13187c <= 0.0f) {
                i12 = 8;
            }
            view4.setVisibility(i12);
        }
    }

    public final void b(int i10, boolean z10) {
        this.f13186b = i10;
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.d = null;
        }
        if (!z10) {
            this.f13187c = i10;
            a();
            requestLayout();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f13187c, i10);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new fi.e4(this, 7));
        this.d.addListener(new bh.b(this, 26));
        this.d.setDuration(320L);
        this.d.setInterpolator(ds.h);
        this.d.start();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        View[] viewArr = this.f13185a;
        View view = viewArr[0];
        if (view != null && view.getVisibility() == 0) {
            viewArr[0].measure(i10, makeMeasureSpec);
            i12 = viewArr[0].getMeasuredHeight();
        } else {
            i12 = 0;
        }
        View view2 = viewArr[1];
        if (view2 != null && view2.getVisibility() == 0) {
            viewArr[1].measure(i10, makeMeasureSpec);
            i13 = viewArr[1].getMeasuredHeight();
        }
        float f7 = this.f13187c;
        if (f7 > 0.0f) {
            if (f7 >= 1.0f) {
                i12 = i13;
            } else {
                i12 = AndroidUtilities.lerp(i12, i13, f7);
            }
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }
}
