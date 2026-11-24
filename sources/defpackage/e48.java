package defpackage;

import android.content.Context;
import android.view.View;
public final class e48 extends cja {
    public int m0;
    public boolean n0;
    public final g48 o0;

    public e48(g48 g48Var, Context context) {
        super(context, null);
        this.o0 = g48Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e48.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        e48 e48Var;
        int i3;
        float f;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int L = gl.L(20.0f);
        int i4 = 0;
        g48 g48Var = this.o0;
        if (L >= 0) {
            if (!gl.E) {
                size2 -= g48Var.N.getEmojiPadding();
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
        } else {
            this.n0 = true;
            g48Var.N.j();
            this.n0 = false;
        }
        int i5 = i2;
        int childCount = getChildCount();
        while (i4 < childCount) {
            View childAt = this.getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                rt3 rt3Var = g48Var.N;
                if (rt3Var != null && rt3Var.l(childAt)) {
                    if (!gl.E && !gl.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (gl.O1()) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        if (gl.O1()) {
                            f = 200.0f;
                        } else {
                            f = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(f), this.getPaddingTop() + (size2 - gl.m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.getPaddingTop() + (size2 - gl.m), 1073741824));
                    }
                } else {
                    e48Var = this;
                    i3 = i;
                    e48Var.measureChildWithMargins(childAt, i3, 0, i5, 0);
                    i4++;
                    this = e48Var;
                    i = i3;
                }
            }
            e48Var = this;
            i3 = i;
            i4++;
            this = e48Var;
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
