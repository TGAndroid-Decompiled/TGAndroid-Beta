package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.js;
public final class b5 extends i0 {
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Components.g6 f702e;
    public final org.telegram.ui.Components.voip.h f703f;
    public final org.telegram.ui.Components.g6 h;
    public final org.telegram.ui.Components.g6 f704n;
    public boolean f705r;
    public boolean f706s;
    public final c6 v;
    public final kc f707w;
    public final f6 f708x;

    public b5(f6 f6Var, Context context, c6 c6Var, kc kcVar) {
        super(context);
        this.f708x = f6Var;
        this.v = c6Var;
        this.f707w = kcVar;
        js jsVar = js.f27634f;
        this.d = new org.telegram.ui.Components.g6(this, 150L, jsVar);
        this.f702e = new org.telegram.ui.Components.g6(this, 150L, jsVar);
        this.f703f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(this);
        this.h = g6Var;
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(this);
        this.f704n = g6Var2;
        g6Var.f26304g = 500L;
        g6Var2.f26304g = 100L;
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
        f6 f6Var = this.f708x;
        e6 e6Var = f6Var.M2;
        if (f6Var.K1 && !f6Var.f955c3 && ((org.telegram.ui.l4) e6Var.f883e) != null && (d2Var = (d2) e6Var.f881b) != null && d2Var.n() && ((org.telegram.ui.l4) e6Var.f883e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f708x.f976j1) {
            if (this.f705r) {
                org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f30528w;
                if (scVar != null && view == scVar.f30532e) {
                    if (this.f706s) {
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
        this.f708x.f978k1.i();
        org.telegram.ui.Components.sc.a(this, new x4(this, 0));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f6 f6Var = this.f708x;
        f6Var.f978k1.j();
        org.telegram.ui.Components.sc.h(this);
        y5 y5Var = f6Var.Q1;
        if (y5Var != null) {
            kc kcVar = ((bc) y5Var).d;
            kcVar.Y0 = false;
            kcVar.P();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f708x.f1021y0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
