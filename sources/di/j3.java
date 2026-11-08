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
    public final org.telegram.ui.Components.w5 f9245e;
    public final org.telegram.ui.Components.voip.n f9246f;
    public final org.telegram.ui.Components.w5 h;
    public final org.telegram.ui.Components.w5 f9247n;
    public boolean f9248r;
    public boolean f9249s;
    public final f4 f9250w;
    public final p9 f9251x;
    public final i4 f9252y;

    public j3(i4 i4Var, Context context, f4 f4Var, p9 p9Var) {
        super(context);
        this.f9252y = i4Var;
        this.f9250w = f4Var;
        this.f9251x = p9Var;
        xq xqVar = xq.f40366f;
        this.d = new org.telegram.ui.Components.w5(this, 150L, xqVar);
        this.f9245e = new org.telegram.ui.Components.w5(this, 150L, xqVar);
        this.f9246f = new org.telegram.ui.Components.voip.n(32, 102, 240);
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(this);
        this.h = w5Var;
        org.telegram.ui.Components.w5 w5Var2 = new org.telegram.ui.Components.w5(this);
        this.f9247n = w5Var2;
        w5Var.f39808g = 500L;
        w5Var2.f39808g = 100L;
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
        i4 i4Var = this.f9252y;
        h4 h4Var = i4Var.f9206v2;
        if (i4Var.f9197t1 && !i4Var.L2 && ((org.telegram.ui.j4) h4Var.f9077e) != null && (g1Var = (g1) h4Var.f9075b) != null && g1Var.n() && ((org.telegram.ui.j4) h4Var.f9077e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f9252y.S0) {
            if (this.f9248r) {
                cc ccVar = cc.f32537w;
                if (ccVar != null && view == ccVar.f32541e) {
                    if (this.f9249s) {
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
        this.f9252y.T0.i();
        setTag(2131296351, new ch.v(this, 1));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i4 i4Var = this.f9252y;
        i4Var.T0.j();
        setTag(2131296351, null);
        b4 b4Var = i4Var.f9221z1;
        if (b4Var != null) {
            p9 p9Var = ((g9) b4Var).d;
            p9Var.X0 = false;
            p9Var.V();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9252y.f9152h0.getLayoutParams();
        layoutParams.rightMargin = org.telegram.messenger.g0.L(42.0f);
        layoutParams.topMargin = org.telegram.messenger.g0.L(15.0f);
        super.onMeasure(i7, i10);
    }
}
