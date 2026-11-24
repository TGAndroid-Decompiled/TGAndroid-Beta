package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class mfc extends FrameLayout {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    public mfc(Context context) {
        super(context);
        this.d = 68;
        this.e = true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (this.e) {
            int childCount = (int) (((getChildCount() - this.a) / 2.0f) * (this.b + (this.c << 1)));
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() != 8) {
                    int i7 = this.c;
                    childAt.layout(childCount + i7, 0, childAt.getMeasuredWidth() + i7 + childCount, childAt.getMeasuredHeight());
                    childCount = childAt.getMeasuredWidth() + (this.c << 1) + childCount;
                }
            }
            return;
        }
        if (this.a > 0) {
            i5 = (getMeasuredWidth() - this.b) / (this.a - 1);
        } else {
            i5 = 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt2 = getChildAt(i9);
            if (childAt2.getVisibility() != 8) {
                int i10 = i8 * i5;
                childAt2.layout(i10, 0, childAt2.getMeasuredWidth() + i10, childAt2.getMeasuredHeight());
                i8++;
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.a = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3).getVisibility() != 8) {
                this.a++;
            }
        }
        this.b = gl.L(this.d);
        this.c = ((size / getChildCount()) - this.b) / 2;
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5).getVisibility() != 8) {
                getChildAt(i5).measure(View.MeasureSpec.makeMeasureSpec(this.b, 1073741824), i2);
                if (getChildAt(i5).getMeasuredHeight() > i4) {
                    i4 = getChildAt(i5).getMeasuredHeight();
                }
            }
        }
        setMeasuredDimension(size, Math.max(i4, gl.L(80.0f)));
    }

    public void setChildSize(int i) {
        this.d = i;
    }

    public void setUseStartPadding(boolean z) {
        this.e = z;
    }
}
