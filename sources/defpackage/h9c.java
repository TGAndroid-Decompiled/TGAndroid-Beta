package defpackage;

import android.view.View;
import android.widget.FrameLayout;
public final class h9c extends FrameLayout {
    public int a;
    public boolean b;

    @Override
    public final void onMeasure(int i, int i2) {
        View view;
        int i3 = this.a;
        if (getParent() instanceof View) {
            view = (View) getParent();
        } else {
            view = null;
        }
        if (this.b && view != null) {
            i3 = view.getPaddingBottom() + view.getPaddingTop() + i3;
        }
        if (view != null && view.getMeasuredHeight() > 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight() - i3, 1073741824));
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - i3, 1073741824));
        } else {
            int size = View.MeasureSpec.getSize(i2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
            measureChildren(makeMeasureSpec, i2);
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                i4 = Math.max(i4, getChildAt(i5).getMeasuredHeight());
            }
            if (size > 0) {
                i4 = Math.min(i4, size - i3);
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        }
    }

    public void setMinusHeight(int i) {
        this.a = i;
    }

    public void setMinusPadding(boolean z) {
        this.b = z;
    }
}
