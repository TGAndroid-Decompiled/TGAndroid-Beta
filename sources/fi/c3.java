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
    public final org.telegram.ui.Components.d6 f11844e;
    public final org.telegram.ui.Components.voip.n f11845f;
    public final org.telegram.ui.Components.d6 h;
    public final org.telegram.ui.Components.d6 f11846n;
    public boolean f11847r;
    public boolean f11848s;
    public final w3 f11849w;
    public final f9 f11850x;
    public final z3 f11851y;

    public c3(z3 z3Var, Context context, w3 w3Var, f9 f9Var) {
        super(context);
        this.f11851y = z3Var;
        this.f11849w = w3Var;
        this.f11850x = f9Var;
        nr nrVar = nr.f37956f;
        this.d = new org.telegram.ui.Components.d6(this, 150L, nrVar);
        this.f11844e = new org.telegram.ui.Components.d6(this, 150L, nrVar);
        this.f11845f = new org.telegram.ui.Components.voip.n(32, 102, 240);
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(this);
        this.h = d6Var;
        org.telegram.ui.Components.d6 d6Var2 = new org.telegram.ui.Components.d6(this);
        this.f11846n = d6Var2;
        d6Var.f34394g = 500L;
        d6Var2.f34394g = 100L;
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
        z3 z3Var = this.f11851y;
        y3 y3Var = z3Var.f12927w2;
        if (z3Var.f12918u1 && !z3Var.M2 && ((org.telegram.ui.j4) y3Var.f12813e) != null && (c1Var = (c1) y3Var.f12811b) != null && c1Var.n() && ((org.telegram.ui.j4) y3Var.f12813e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f11851y.T0) {
            if (this.f11847r) {
                gc gcVar = gc.f35500w;
                if (gcVar != null && view == gcVar.f35504e) {
                    if (this.f11848s) {
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
        this.f11851y.U0.i();
        setTag(2131296353, new bi.i1(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z3 z3Var = this.f11851y;
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
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f11851y.f12873i0.getLayoutParams();
        layoutParams.rightMargin = org.telegram.messenger.g0.L(42.0f);
        layoutParams.topMargin = org.telegram.messenger.g0.L(15.0f);
        super.onMeasure(i7, i10);
    }
}
