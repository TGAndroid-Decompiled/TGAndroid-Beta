package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
public final class r78 extends ela {
    public int m0;
    public boolean n0;
    public int o0;
    public final w78 p0;

    public r78(w78 w78Var, Context context) {
        super(context, null);
        this.p0 = w78Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r78.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        cv3 cv3Var;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        boolean O1 = gm.O1();
        w78 w78Var = this.p0;
        if (O1) {
            w78Var.h0 = (byte) 4;
        } else {
            Point point = gm.q;
            if (point.x > point.y) {
                w78Var.h0 = (byte) 4;
            } else {
                w78Var.h0 = (byte) 3;
            }
        }
        this.n0 = true;
        int L = ((size2 - gm.L(4.0f)) - gm.L(4.0f)) / w78Var.h0;
        w78Var.S = L;
        if (this.o0 != L) {
            this.o0 = L;
            gm.c3(new q78(this, (byte) 0));
        }
        boolean z = w78Var.Z;
        s78 s78Var = w78Var.N;
        if (z) {
            s78Var.x1(1);
        } else {
            s78Var.x1(Math.max(1, ((w78Var.h0 - 1) * gm.L(2.0f)) + (w78Var.S * w78Var.h0)));
        }
        this.n0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (gm.L(20.0f) >= 0 && !gm.E && w78Var.e0 != null && w78Var.a0.getParent() == this) {
            size4 -= w78Var.e0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i3 = size4;
        if (Q > gm.L(20.0f) && (cv3Var = w78Var.e0) != null) {
            this.n0 = true;
            cv3Var.j();
            this.n0 = false;
        }
        cv3 cv3Var2 = w78Var.e0;
        if (cv3Var2 != null && cv3Var2.e) {
            w78Var.fragmentView.setTranslationY(0.0f);
            w78Var.L.setTranslationY(0.0f);
            w78Var.O.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            int i5 = makeMeasureSpec;
            View childAt = getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                cv3 cv3Var3 = w78Var.e0;
                if (cv3Var3 != null && cv3Var3.l(childAt)) {
                    if (!gm.E && !gm.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (gm.O1()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        if (gm.O1()) {
                            f = 200.0f;
                        } else {
                            f = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(f), getPaddingTop() + (i3 - gm.m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i3 - gm.m), 1073741824));
                    }
                } else {
                    measureChildWithMargins(childAt, i, 0, i5, 0);
                }
            }
            i4++;
            makeMeasureSpec = i5;
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
