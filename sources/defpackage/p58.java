package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
public final class p58 extends cja {
    public int m0;
    public boolean n0;
    public int o0;
    public final u58 p0;

    public p58(u58 u58Var, Context context) {
        super(context, null);
        this.p0 = u58Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p58.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        rt3 rt3Var;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        boolean O1 = gl.O1();
        u58 u58Var = this.p0;
        if (O1) {
            u58Var.h0 = (byte) 4;
        } else {
            Point point = gl.q;
            if (point.x > point.y) {
                u58Var.h0 = (byte) 4;
            } else {
                u58Var.h0 = (byte) 3;
            }
        }
        this.n0 = true;
        int L = ((size2 - gl.L(4.0f)) - gl.L(4.0f)) / u58Var.h0;
        u58Var.S = L;
        if (this.o0 != L) {
            this.o0 = L;
            gl.d3(new oq7(this, (byte) 23));
        }
        boolean z = u58Var.Z;
        q58 q58Var = u58Var.N;
        if (z) {
            q58Var.x1(1);
        } else {
            q58Var.x1(Math.max(1, ((u58Var.h0 - 1) * gl.L(2.0f)) + (u58Var.S * u58Var.h0)));
        }
        this.n0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (gl.L(20.0f) >= 0 && !gl.E && u58Var.e0 != null && u58Var.a0.getParent() == this) {
            size4 -= u58Var.e0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i3 = size4;
        int i4 = makeMeasureSpec;
        if (Q > gl.L(20.0f) && (rt3Var = u58Var.e0) != null) {
            this.n0 = true;
            rt3Var.j();
            this.n0 = false;
        }
        rt3 rt3Var2 = u58Var.e0;
        if (rt3Var2 != null && rt3Var2.e) {
            u58Var.fragmentView.setTranslationY(0.0f);
            u58Var.L.setTranslationY(0.0f);
            u58Var.O.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt.getVisibility() != 8) {
                rt3 rt3Var3 = u58Var.e0;
                if (rt3Var3 != null && rt3Var3.l(childAt)) {
                    if (!gl.E && !gl.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (gl.O1()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        if (gl.O1()) {
                            f = 200.0f;
                        } else {
                            f = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(f), getPaddingTop() + (i3 - gl.m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i3 - gl.m), 1073741824));
                    }
                } else {
                    measureChildWithMargins(childAt, i, 0, i4, 0);
                }
            }
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
