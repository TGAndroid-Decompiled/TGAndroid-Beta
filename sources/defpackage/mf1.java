package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class mf1 extends uf1 {
    public final bvc h0;
    public final wf1 i0;

    public mf1(wf1 wf1Var, Context context) {
        super(wf1Var, context);
        this.i0 = wf1Var;
        this.h0 = new bvc();
    }

    @Override
    public final void T(Drawable drawable) {
        if (drawable instanceof hh7) {
            ((hh7) drawable).o();
        }
        bvc bvcVar = this.h0;
        mz4 c = bvcVar.c(drawable);
        bvcVar.a(c);
        Typeface typeface = hl.a;
        wf1 wf1Var = this.i0;
        wf1Var.a.a = c;
        jz1 jz1Var = wf1Var.X;
        if (jz1Var != null) {
            jz1Var.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        vh4 vh4Var = vh4.f;
        if (vh4Var != null && vh4Var.a) {
            tb0 tb0Var = (tb0) vh4.r().d;
            if (tb0Var != null) {
                tb0Var.onTouchEvent(motionEvent);
                return true;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null && r47Var.g4() && r47Var.T != 0) {
            long B0 = r47.B0(r47Var.k);
            wf1 wf1Var = this.i0;
            if (B0 == (-wf1Var.f.id)) {
                MediaController.z().s0(wf1Var.N0(false), wf1Var.f0, wf1Var.e0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mf1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        wf1 wf1Var = this.i0;
        mz4 mz4Var = wf1Var.a.a;
        if (mz4Var instanceof nz4) {
            ((nz4) mz4Var).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        aVar = ((e) wf1Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        aVar2 = ((e) wf1Var).actionBar;
        int measuredHeight = aVar2.getMeasuredHeight();
        aVar3 = ((e) wf1Var).actionBar;
        if (aVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar4 = ((e) wf1Var).actionBar;
                if (childAt != aVar4) {
                    if (childAt != wf1Var.w && childAt != wf1Var.n) {
                        if (childAt == wf1Var.I) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i, 0, i2, 0);
                        }
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(hl.L(10.0f), View.MeasureSpec.getSize(i2)) + (wf1Var.e << 1), 1073741824));
                    }
                }
            }
        }
    }
}
