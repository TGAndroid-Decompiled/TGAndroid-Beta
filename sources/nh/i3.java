package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mr;
public final class i3 extends u {
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Components.z5 e;
    public final org.telegram.ui.Components.voip.h f15382f;
    public final org.telegram.ui.Components.z5 h;
    public final org.telegram.ui.Components.z5 f15383n;
    public boolean f15384r;
    public boolean f15385s;
    public final a4 v;
    public final i9 f15386w;
    public final d4 f15387x;

    public i3(d4 d4Var, Context context, a4 a4Var, i9 i9Var) {
        super(context);
        this.f15387x = d4Var;
        this.v = a4Var;
        this.f15386w = i9Var;
        mr mrVar = mr.f27122f;
        this.d = new org.telegram.ui.Components.z5(this, 150L, mrVar);
        this.e = new org.telegram.ui.Components.z5(this, 150L, mrVar);
        this.f15382f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(this);
        this.h = z5Var;
        org.telegram.ui.Components.z5 z5Var2 = new org.telegram.ui.Components.z5(this);
        this.f15383n = z5Var2;
        z5Var.f31255g = 500L;
        z5Var2.f31255g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: nh.i3.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: nh.i3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e1 e1Var;
        d4 d4Var = this.f15387x;
        c4 c4Var = d4Var.J2;
        if (d4Var.H1 && !d4Var.Z2 && c4Var.d != null && (e1Var = c4Var.f15121a) != null && e1Var.n() && c4Var.d.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f15387x.f15179g1) {
            if (this.f15384r) {
                ic icVar = ic.f25664w;
                if (icVar != null && view == icVar.e) {
                    if (this.f15385s) {
                        return super.drawChild(canvas, view, j10);
                    }
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            }
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15387x.f15182h1.j();
        ic.a(this, new kh.t0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d4 d4Var = this.f15387x;
        d4Var.f15182h1.k();
        ic.h(this);
        x3 x3Var = d4Var.N1;
        if (x3Var != null) {
            i9 i9Var = ((z8) x3Var).d;
            i9Var.V0 = false;
            i9Var.P();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f15387x.f15225v0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
