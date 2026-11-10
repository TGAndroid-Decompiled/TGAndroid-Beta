package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.wq;
public final class j3 extends v {
    public final org.telegram.ui.Components.v5 d;
    public final org.telegram.ui.Components.v5 f9159e;
    public final org.telegram.ui.Components.voip.n f9160f;
    public final org.telegram.ui.Components.v5 h;
    public final org.telegram.ui.Components.v5 f9161n;
    public boolean f9162r;
    public boolean f9163s;
    public final g4 f9164w;
    public final q9 f9165x;
    public final j4 f9166y;

    public j3(j4 j4Var, Context context, g4 g4Var, q9 q9Var) {
        super(context);
        this.f9166y = j4Var;
        this.f9164w = g4Var;
        this.f9165x = q9Var;
        wq wqVar = wq.f40046f;
        this.d = new org.telegram.ui.Components.v5(this, 150L, wqVar);
        this.f9159e = new org.telegram.ui.Components.v5(this, 150L, wqVar);
        this.f9160f = new org.telegram.ui.Components.voip.n(32, 102, 240);
        org.telegram.ui.Components.v5 v5Var = new org.telegram.ui.Components.v5(this);
        this.h = v5Var;
        org.telegram.ui.Components.v5 v5Var2 = new org.telegram.ui.Components.v5(this);
        this.f9161n = v5Var2;
        v5Var.f38857g = 500L;
        v5Var2.f38857g = 100L;
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
        j4 j4Var = this.f9166y;
        i4 i4Var = j4Var.f9243v2;
        if (j4Var.f9234t1 && !j4Var.L2 && ((org.telegram.ui.j4) i4Var.f9112e) != null && (g1Var = (g1) i4Var.f9110b) != null && g1Var.n() && ((org.telegram.ui.j4) i4Var.f9112e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f9166y.S0) {
            if (this.f9162r) {
                bc bcVar = bc.f32195w;
                if (bcVar != null && view == bcVar.f32199e) {
                    if (this.f9163s) {
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
        this.f9166y.T0.i();
        setTag(2131296351, new ch.v(this, 1));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j4 j4Var = this.f9166y;
        j4Var.T0.j();
        setTag(2131296351, null);
        c4 c4Var = j4Var.f9258z1;
        if (c4Var != null) {
            q9 q9Var = ((h9) c4Var).d;
            q9Var.X0 = false;
            q9Var.V();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9166y.f9189h0.getLayoutParams();
        layoutParams.rightMargin = org.telegram.messenger.g0.L(42.0f);
        layoutParams.topMargin = org.telegram.messenger.g0.L(15.0f);
        super.onMeasure(i7, i10);
    }
}
