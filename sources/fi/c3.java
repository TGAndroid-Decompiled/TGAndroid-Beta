package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.nr;
public final class c3 extends v {
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 f11796e;
    public final org.telegram.ui.Components.voip.n f11797f;
    public final org.telegram.ui.Components.d6 h;
    public final org.telegram.ui.Components.d6 f11798n;
    public boolean f11799r;
    public boolean f11800s;
    public final w3 f11801w;
    public final f9 f11802x;
    public final z3 f11803y;

    public c3(z3 z3Var, Context context, w3 w3Var, f9 f9Var) {
        super(context);
        this.f11803y = z3Var;
        this.f11801w = w3Var;
        this.f11802x = f9Var;
        nr nrVar = nr.f37917f;
        this.d = new org.telegram.ui.Components.d6(this, 150L, nrVar);
        this.f11796e = new org.telegram.ui.Components.d6(this, 150L, nrVar);
        this.f11797f = new org.telegram.ui.Components.voip.n(32, 102, 240);
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(this);
        this.h = d6Var;
        org.telegram.ui.Components.d6 d6Var2 = new org.telegram.ui.Components.d6(this);
        this.f11798n = d6Var2;
        d6Var.f34352g = 500L;
        d6Var2.f34352g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: fi.c3.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: fi.c3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        c1 c1Var;
        z3 z3Var = this.f11803y;
        y3 y3Var = z3Var.f12881w2;
        if (z3Var.f12872u1 && !z3Var.M2 && ((org.telegram.ui.j4) y3Var.f12768e) != null && (c1Var = (c1) y3Var.f12766b) != null && c1Var.n() && ((org.telegram.ui.j4) y3Var.f12768e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f11803y.T0) {
            if (this.f11799r) {
                gc gcVar = gc.f35481w;
                if (gcVar != null && view == gcVar.f35485e) {
                    if (this.f11800s) {
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
        this.f11803y.U0.i();
        setTag(2131296353, new bi.i1(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z3 z3Var = this.f11803y;
        z3Var.U0.j();
        setTag(2131296353, null);
        s3 s3Var = z3Var.A1;
        if (s3Var != null) {
            f9 f9Var = ((w8) s3Var).d;
            f9Var.Y0 = false;
            f9Var.V();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f11803y.f12827i0.getLayoutParams();
        layoutParams.rightMargin = org.telegram.messenger.g0.L(42.0f);
        layoutParams.topMargin = org.telegram.messenger.g0.L(15.0f);
        super.onMeasure(i7, i10);
    }
}
