package defpackage;

import android.content.Context;
import android.view.View;
public final class g68 extends ela {
    public int m0;
    public boolean n0;
    public final j68 o0;

    public g68(j68 j68Var, Context context) {
        super(context, null);
        this.o0 = j68Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g68.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        g68 g68Var;
        int i3;
        float f;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int L = gm.L(20.0f);
        int i4 = 0;
        j68 j68Var = this.o0;
        if (L >= 0) {
            if (!gm.E) {
                size2 -= j68Var.N.getEmojiPadding();
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
        } else {
            this.n0 = true;
            j68Var.N.j();
            this.n0 = false;
        }
        int i5 = i2;
        int childCount = getChildCount();
        while (i4 < childCount) {
            View childAt = this.getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                cv3 cv3Var = j68Var.N;
                if (cv3Var != null && cv3Var.l(childAt)) {
                    if (!gm.E && !gm.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (gm.O1()) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        if (gm.O1()) {
                            f = 200.0f;
                        } else {
                            f = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(f), this.getPaddingTop() + (size2 - gm.m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.getPaddingTop() + (size2 - gm.m), 1073741824));
                    }
                } else {
                    g68Var = this;
                    i3 = i;
                    g68Var.measureChildWithMargins(childAt, i3, 0, i5, 0);
                    i4++;
                    this = g68Var;
                    i = i3;
                }
            }
            g68Var = this;
            i3 = i;
            i4++;
            this = g68Var;
            i = i3;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.n0) {
            return;
        }
        super.requestLayout();
    }
}
