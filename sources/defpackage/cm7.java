package defpackage;

import android.view.MotionEvent;
import android.view.View;
public final class cm7 extends fg4 {
    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        bg4 bg4Var;
        int paddingRight = getPaddingRight() + getPaddingLeft() + (hl.L(11.5f) << 1);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < getTabsCount(); i5++) {
            if (i5 >= 0 && i5 < getTabsCount()) {
                bg4Var = (bg4) this.h.get(i5);
            } else {
                bg4Var = null;
            }
            i4 = uh9.w(24.0f, bg4Var.a(false), i4);
        }
        if (getTabsCount() > 0) {
            i3 = Math.round((i4 * 0.25f) / getTabsCount());
        }
        setExtraTabWidth(i3);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((getTabsCount() * i3) + i4 + paddingRight, 1073741824), i2);
    }
}
