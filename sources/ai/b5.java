package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.is;
public final class b5 extends i0 {
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Components.g6 f704e;
    public final org.telegram.ui.Components.voip.h f705f;
    public final org.telegram.ui.Components.g6 h;
    public final org.telegram.ui.Components.g6 f706n;
    public boolean f707r;
    public boolean f708s;
    public final c6 v;
    public final kc f709w;
    public final f6 f710x;

    public b5(f6 f6Var, Context context, c6 c6Var, kc kcVar) {
        super(context);
        this.f710x = f6Var;
        this.v = c6Var;
        this.f709w = kcVar;
        is isVar = is.f27443f;
        this.d = new org.telegram.ui.Components.g6(this, 150L, isVar);
        this.f704e = new org.telegram.ui.Components.g6(this, 150L, isVar);
        this.f705f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(this);
        this.h = g6Var;
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(this);
        this.f706n = g6Var2;
        g6Var.f26619g = 500L;
        g6Var2.f26619g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: ai.b5.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: ai.b5.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d2 d2Var;
        f6 f6Var = this.f710x;
        e6 e6Var = f6Var.M2;
        if (f6Var.K1 && !f6Var.f957c3 && ((org.telegram.ui.l4) e6Var.f885e) != null && (d2Var = (d2) e6Var.f883b) != null && d2Var.n() && ((org.telegram.ui.l4) e6Var.f885e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f710x.f978j1) {
            if (this.f707r) {
                org.telegram.ui.Components.tc tcVar = org.telegram.ui.Components.tc.f31088w;
                if (tcVar != null && view == tcVar.f31092e) {
                    if (this.f708s) {
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
        this.f710x.f980k1.i();
        org.telegram.ui.Components.tc.a(this, new x4(this, 0));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f6 f6Var = this.f710x;
        f6Var.f980k1.j();
        org.telegram.ui.Components.tc.h(this);
        y5 y5Var = f6Var.Q1;
        if (y5Var != null) {
            kc kcVar = ((bc) y5Var).d;
            kcVar.Y0 = false;
            kcVar.P();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f710x.f1023y0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
