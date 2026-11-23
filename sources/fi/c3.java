package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kr;
public final class c3 extends v {
    public final org.telegram.ui.Components.c6 d;
    public final org.telegram.ui.Components.c6 f11809e;
    public final org.telegram.ui.Components.voip.n f11810f;
    public final org.telegram.ui.Components.c6 h;
    public final org.telegram.ui.Components.c6 f11811n;
    public boolean f11812r;
    public boolean f11813s;
    public final w3 f11814w;
    public final f9 f11815x;
    public final z3 f11816y;

    public c3(z3 z3Var, Context context, w3 w3Var, f9 f9Var) {
        super(context);
        this.f11816y = z3Var;
        this.f11814w = w3Var;
        this.f11815x = f9Var;
        kr krVar = kr.f36858f;
        this.d = new org.telegram.ui.Components.c6(this, 150L, krVar);
        this.f11809e = new org.telegram.ui.Components.c6(this, 150L, krVar);
        this.f11810f = new org.telegram.ui.Components.voip.n(32, 102, 240);
        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(this);
        this.h = c6Var;
        org.telegram.ui.Components.c6 c6Var2 = new org.telegram.ui.Components.c6(this);
        this.f11811n = c6Var2;
        c6Var.f33934g = 500L;
        c6Var2.f33934g = 100L;
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
        z3 z3Var = this.f11816y;
        y3 y3Var = z3Var.f12892w2;
        if (z3Var.f12883u1 && !z3Var.M2 && ((org.telegram.ui.j4) y3Var.f12778e) != null && (c1Var = (c1) y3Var.f12776b) != null && c1Var.n() && ((org.telegram.ui.j4) y3Var.f12778e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f11816y.T0) {
            if (this.f11812r) {
                fc fcVar = fc.f35083w;
                if (fcVar != null && view == fcVar.f35087e) {
                    if (this.f11813s) {
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
        this.f11816y.U0.i();
        setTag(2131296353, new bi.i1(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z3 z3Var = this.f11816y;
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
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f11816y.f12838i0.getLayoutParams();
        layoutParams.rightMargin = org.telegram.messenger.g0.L(42.0f);
        layoutParams.topMargin = org.telegram.messenger.g0.L(15.0f);
        super.onMeasure(i7, i10);
    }
}
