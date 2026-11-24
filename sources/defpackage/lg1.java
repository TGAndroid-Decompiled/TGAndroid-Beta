package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class lg1 extends tg1 {
    public final psc n0;
    public final vg1 o0;

    public lg1(vg1 vg1Var, Context context) {
        super(vg1Var, context);
        this.o0 = vg1Var;
        this.n0 = new psc();
    }

    @Override
    public final void T(Drawable drawable) {
        if (drawable instanceof ah7) {
            ((ah7) drawable).o();
        }
        psc pscVar = this.n0;
        iz4 c = pscVar.c(drawable);
        pscVar.a(c);
        Typeface typeface = gm.a;
        vg1 vg1Var = this.o0;
        vg1Var.a.a = c;
        e02 e02Var = vg1Var.X;
        if (e02Var != null) {
            e02Var.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        yh4 yh4Var = yh4.f;
        if (yh4Var != null && yh4Var.a) {
            rc0 rc0Var = (rc0) yh4.t().d;
            if (rc0Var != null) {
                rc0Var.onTouchEvent(motionEvent);
                return true;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k47 k47Var = MediaController.w().v0;
        if (k47Var != null && k47Var.g4() && k47Var.T != 0) {
            long B0 = k47.B0(k47Var.k);
            vg1 vg1Var = this.o0;
            if (B0 == (-vg1Var.f.id)) {
                MediaController.w().o0(vg1Var.N0(false), vg1Var.f0, vg1Var.e0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        vg1 vg1Var = this.o0;
        iz4 iz4Var = vg1Var.a.a;
        if (iz4Var instanceof jz4) {
            ((jz4) iz4Var).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        aVar = ((d) vg1Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        aVar2 = ((d) vg1Var).actionBar;
        int measuredHeight = aVar2.getMeasuredHeight();
        aVar3 = ((d) vg1Var).actionBar;
        if (aVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar4 = ((d) vg1Var).actionBar;
                if (childAt != aVar4) {
                    if (childAt != vg1Var.w && childAt != vg1Var.n) {
                        if (childAt == vg1Var.I) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i, 0, i2, 0);
                        }
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(gm.L(10.0f), View.MeasureSpec.getSize(i2)) + (vg1Var.e << 1), 1073741824));
                    }
                }
            }
        }
    }
}
