package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.xq;
public final class j3 extends v {
    public final org.telegram.ui.Components.w5 d;
    public final org.telegram.ui.Components.w5 f9154e;
    public final org.telegram.ui.Components.voip.n f9155f;
    public final org.telegram.ui.Components.w5 h;
    public final org.telegram.ui.Components.w5 f9156n;
    public boolean f9157r;
    public boolean f9158s;
    public final g4 f9159w;
    public final q9 f9160x;
    public final j4 f9161y;

    public j3(j4 j4Var, Context context, g4 g4Var, q9 q9Var) {
        super(context);
        this.f9161y = j4Var;
        this.f9159w = g4Var;
        this.f9160x = q9Var;
        xq xqVar = xq.f40458f;
        this.d = new org.telegram.ui.Components.w5(this, 150L, xqVar);
        this.f9154e = new org.telegram.ui.Components.w5(this, 150L, xqVar);
        this.f9155f = new org.telegram.ui.Components.voip.n(32, 102, 240);
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(this);
        this.h = w5Var;
        org.telegram.ui.Components.w5 w5Var2 = new org.telegram.ui.Components.w5(this);
        this.f9156n = w5Var2;
        w5Var.f39913g = 500L;
        w5Var2.f39913g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: di.j3.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: di.j3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g1 g1Var;
        j4 j4Var = this.f9161y;
        i4 i4Var = j4Var.f9238v2;
        if (j4Var.f9229t1 && !j4Var.L2 && ((org.telegram.ui.j4) i4Var.f9107e) != null && (g1Var = (g1) i4Var.f9105b) != null && g1Var.n() && ((org.telegram.ui.j4) i4Var.f9107e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f9161y.S0) {
            if (this.f9157r) {
                cc ccVar = cc.f32619w;
                if (ccVar != null && view == ccVar.f32623e) {
                    if (this.f9158s) {
                        return super.drawChild(canvas, view, j3);
                    }
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            }
            return super.drawChild(canvas, view, j3);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9161y.T0.i();
        setTag(2131296351, new ch.v(this, 1));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j4 j4Var = this.f9161y;
        j4Var.T0.j();
        setTag(2131296351, null);
        c4 c4Var = j4Var.f9253z1;
        if (c4Var != null) {
            q9 q9Var = ((h9) c4Var).d;
            q9Var.X0 = false;
            q9Var.V();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9161y.f9184h0.getLayoutParams();
        layoutParams.rightMargin = org.telegram.messenger.g0.L(42.0f);
        layoutParams.topMargin = org.telegram.messenger.g0.L(15.0f);
        super.onMeasure(i7, i10);
    }
}
