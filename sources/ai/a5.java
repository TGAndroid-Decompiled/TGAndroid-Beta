package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class a5 extends i0 {
    public final org.telegram.ui.Components.c6 d;
    public final org.telegram.ui.Components.c6 e;
    public final org.telegram.ui.Components.voip.h f514f;
    public final org.telegram.ui.Components.c6 h;
    public final org.telegram.ui.Components.c6 f515n;
    public boolean f516r;
    public boolean f517s;
    public final c6 v;
    public final jc f518w;
    public final f6 f519x;

    public a5(f6 f6Var, Context context, c6 c6Var, jc jcVar) {
        super(context);
        this.f519x = f6Var;
        this.v = c6Var;
        this.f518w = jcVar;
        qr qrVar = qr.f27420f;
        this.d = new org.telegram.ui.Components.c6(this, 150L, qrVar);
        this.e = new org.telegram.ui.Components.c6(this, 150L, qrVar);
        this.f514f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.c6 c6Var2 = new org.telegram.ui.Components.c6(this);
        this.h = c6Var2;
        org.telegram.ui.Components.c6 c6Var3 = new org.telegram.ui.Components.c6(this);
        this.f515n = c6Var3;
        c6Var2.f22953g = 500L;
        c6Var3.f22953g = 100L;
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
        f6 f6Var = this.f519x;
        e6 e6Var = f6Var.M2;
        if (f6Var.K1 && !f6Var.f802c3 && ((org.telegram.ui.k4) e6Var.e) != null && (d2Var = (d2) e6Var.f762b) != null && d2Var.n() && ((org.telegram.ui.k4) e6Var.e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f519x.f823j1) {
            if (this.f516r) {
                org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f26744w;
                if (ocVar != null && view == ocVar.e) {
                    if (this.f517s) {
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
        this.f519x.f825k1.j();
        org.telegram.ui.Components.oc.a(this, new w4(this, 0));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f6 f6Var = this.f519x;
        f6Var.f825k1.k();
        org.telegram.ui.Components.oc.h(this);
        y5 y5Var = f6Var.Q1;
        if (y5Var != null) {
            jc jcVar = ((ac) y5Var).d;
            jcVar.Y0 = false;
            jcVar.P();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f519x.f868y0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
