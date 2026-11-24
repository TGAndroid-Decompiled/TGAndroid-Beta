package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class df1 extends lf1 {
    public final nqc n0;
    public final nf1 o0;

    public df1(nf1 nf1Var, Context context) {
        super(nf1Var, context);
        this.o0 = nf1Var;
        this.n0 = new nqc();
    }

    @Override
    public final void T(Drawable drawable) {
        if (drawable instanceof ye7) {
            ((ye7) drawable).o();
        }
        nqc nqcVar = this.n0;
        gx4 c = nqcVar.c(drawable);
        nqcVar.a(c);
        Typeface typeface = gl.a;
        nf1 nf1Var = this.o0;
        nf1Var.a.a = c;
        ry1 ry1Var = nf1Var.X;
        if (ry1Var != null) {
            ry1Var.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xf4 xf4Var = xf4.f;
        if (xf4Var != null && xf4Var.a) {
            rb0 rb0Var = (rb0) xf4.t().d;
            if (rb0Var != null) {
                rb0Var.onTouchEvent(motionEvent);
                return true;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null && k27Var.g4() && k27Var.T != 0) {
            long B0 = k27.B0(k27Var.k);
            nf1 nf1Var = this.o0;
            if (B0 == (-nf1Var.f.id)) {
                MediaController.w().o0(nf1Var.M0(false), nf1Var.f0, nf1Var.e0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        nf1 nf1Var = this.o0;
        gx4 gx4Var = nf1Var.a.a;
        if (gx4Var instanceof hx4) {
            ((hx4) gx4Var).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        aVar = ((d) nf1Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        aVar2 = ((d) nf1Var).actionBar;
        int measuredHeight = aVar2.getMeasuredHeight();
        aVar3 = ((d) nf1Var).actionBar;
        if (aVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar4 = ((d) nf1Var).actionBar;
                if (childAt != aVar4) {
                    if (childAt != nf1Var.w && childAt != nf1Var.n) {
                        if (childAt == nf1Var.I) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i, 0, i2, 0);
                        }
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(gl.L(10.0f), View.MeasureSpec.getSize(i2)) + (nf1Var.e << 1), 1073741824));
                    }
                }
            }
        }
    }
}
