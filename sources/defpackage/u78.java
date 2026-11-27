package defpackage;

import android.content.Context;
import android.view.View;
public final class u78 extends wma {
    public int g0;
    public boolean h0;
    public final w78 i0;

    public u78(w78 w78Var, Context context) {
        super(context, null);
        this.i0 = w78Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u78.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        u78 u78Var;
        int i3;
        float f;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int L = hl.L(20.0f);
        int i4 = 0;
        w78 w78Var = this.i0;
        if (L >= 0) {
            if (!hl.E) {
                size2 -= w78Var.N.getEmojiPadding();
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
        } else {
            this.h0 = true;
            w78Var.N.j();
            this.h0 = false;
        }
        int i5 = i2;
        int childCount = getChildCount();
        while (i4 < childCount) {
            View childAt = this.getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                iu3 iu3Var = w78Var.N;
                if (iu3Var != null && iu3Var.l(childAt)) {
                    if (!hl.E && !hl.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (hl.O1()) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        if (hl.O1()) {
                            f = 200.0f;
                        } else {
                            f = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(f), this.getPaddingTop() + (size2 - hl.m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.getPaddingTop() + (size2 - hl.m), 1073741824));
                    }
                } else {
                    u78Var = this;
                    i3 = i;
                    u78Var.measureChildWithMargins(childAt, i3, 0, i5, 0);
                    i4++;
                    this = u78Var;
                    i = i3;
                }
            }
            u78Var = this;
            i3 = i;
            i4++;
            this = u78Var;
            i = i3;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.h0) {
            return;
        }
        super.requestLayout();
    }
}
