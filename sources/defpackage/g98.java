package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
public final class g98 extends wma {
    public int g0;
    public boolean h0;
    public int i0;
    public final l98 j0;

    public g98(l98 l98Var, Context context) {
        super(context, null);
        this.j0 = l98Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g98.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        iu3 iu3Var;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        boolean O1 = hl.O1();
        l98 l98Var = this.j0;
        if (O1) {
            l98Var.h0 = (byte) 4;
        } else {
            Point point = hl.q;
            if (point.x > point.y) {
                l98Var.h0 = (byte) 4;
            } else {
                l98Var.h0 = (byte) 3;
            }
        }
        this.h0 = true;
        int L = ((size2 - hl.L(4.0f)) - hl.L(4.0f)) / l98Var.h0;
        l98Var.S = L;
        if (this.i0 != L) {
            this.i0 = L;
            hl.c3(new x38(this, (byte) 8));
        }
        boolean z = l98Var.Z;
        h98 h98Var = l98Var.N;
        if (z) {
            h98Var.x1(1);
        } else {
            h98Var.x1(Math.max(1, ((l98Var.h0 - 1) * hl.L(2.0f)) + (l98Var.S * l98Var.h0)));
        }
        this.h0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (hl.L(20.0f) >= 0 && !hl.E && l98Var.e0 != null && l98Var.a0.getParent() == this) {
            size4 -= l98Var.e0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i3 = size4;
        int i4 = makeMeasureSpec;
        if (Q > hl.L(20.0f) && (iu3Var = l98Var.e0) != null) {
            this.h0 = true;
            iu3Var.j();
            this.h0 = false;
        }
        iu3 iu3Var2 = l98Var.e0;
        if (iu3Var2 != null && iu3Var2.e) {
            l98Var.fragmentView.setTranslationY(0.0f);
            l98Var.L.setTranslationY(0.0f);
            l98Var.O.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt.getVisibility() != 8) {
                iu3 iu3Var3 = l98Var.e0;
                if (iu3Var3 != null && iu3Var3.l(childAt)) {
                    if (!hl.E && !hl.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (hl.O1()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        if (hl.O1()) {
                            f = 200.0f;
                        } else {
                            f = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(f), getPaddingTop() + (i3 - hl.m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i3 - hl.m), 1073741824));
                    }
                } else {
                    measureChildWithMargins(childAt, i, 0, i4, 0);
                }
            }
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
