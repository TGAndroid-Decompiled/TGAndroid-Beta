package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class a5 extends i0 {
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 e;
    public final org.telegram.ui.Components.voip.h f517f;
    public final org.telegram.ui.Components.d6 h;
    public final org.telegram.ui.Components.d6 f518n;
    public boolean f519r;
    public boolean f520s;
    public final c6 v;
    public final jc f521w;
    public final f6 f522x;

    public a5(f6 f6Var, Context context, c6 c6Var, jc jcVar) {
        super(context);
        this.f522x = f6Var;
        this.v = c6Var;
        this.f521w = jcVar;
        qr qrVar = qr.f27642f;
        this.d = new org.telegram.ui.Components.d6(this, 150L, qrVar);
        this.e = new org.telegram.ui.Components.d6(this, 150L, qrVar);
        this.f517f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(this);
        this.h = d6Var;
        org.telegram.ui.Components.d6 d6Var2 = new org.telegram.ui.Components.d6(this);
        this.f518n = d6Var2;
        d6Var.f23503g = 500L;
        d6Var2.f23503g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: ai.a5.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: ai.a5.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d2 d2Var;
        f6 f6Var = this.f522x;
        e6 e6Var = f6Var.M2;
        if (f6Var.K1 && !f6Var.f805c3 && ((org.telegram.ui.k4) e6Var.e) != null && (d2Var = (d2) e6Var.f765b) != null && d2Var.n() && ((org.telegram.ui.k4) e6Var.e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f522x.f826j1) {
            if (this.f519r) {
                org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f27245w;
                if (pcVar != null && view == pcVar.e) {
                    if (this.f520s) {
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
        this.f522x.f828k1.j();
        org.telegram.ui.Components.pc.a(this, new w4(this, 0));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f6 f6Var = this.f522x;
        f6Var.f828k1.k();
        org.telegram.ui.Components.pc.h(this);
        y5 y5Var = f6Var.Q1;
        if (y5Var != null) {
            jc jcVar = ((ac) y5Var).d;
            jcVar.Y0 = false;
            jcVar.P();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f522x.f871y0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
