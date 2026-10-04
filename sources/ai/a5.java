package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
public final class a5 extends i0 {
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Components.e6 f561e;
    public final org.telegram.ui.Components.voip.h f562f;
    public final org.telegram.ui.Components.e6 h;
    public final org.telegram.ui.Components.e6 f563n;
    public boolean f564r;
    public boolean f565s;
    public final b6 v;
    public final jc f566w;
    public final e6 f567x;

    public a5(e6 e6Var, Context context, b6 b6Var, jc jcVar) {
        super(context);
        this.f567x = e6Var;
        this.v = b6Var;
        this.f566w = jcVar;
        tr trVar = tr.f31141f;
        this.d = new org.telegram.ui.Components.e6(this, 150L, trVar);
        this.f561e = new org.telegram.ui.Components.e6(this, 150L, trVar);
        this.f562f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(this);
        this.h = e6Var2;
        org.telegram.ui.Components.e6 e6Var3 = new org.telegram.ui.Components.e6(this);
        this.f563n = e6Var3;
        e6Var2.f25937g = 500L;
        e6Var3.f25937g = 100L;
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
        e6 e6Var = this.f567x;
        d6 d6Var = e6Var.M2;
        if (e6Var.K1 && !e6Var.f846c3 && ((org.telegram.ui.l4) d6Var.f775e) != null && (d2Var = (d2) d6Var.f773b) != null && d2Var.n() && ((org.telegram.ui.l4) d6Var.f775e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f567x.f867j1) {
            if (this.f564r) {
                org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.f30331w;
                if (rcVar != null && view == rcVar.f30335e) {
                    if (this.f565s) {
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
        this.f567x.f869k1.j();
        org.telegram.ui.Components.rc.a(this, new w4(this, 0));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e6 e6Var = this.f567x;
        e6Var.f869k1.k();
        org.telegram.ui.Components.rc.h(this);
        x5 x5Var = e6Var.Q1;
        if (x5Var != null) {
            jc jcVar = ((ac) x5Var).d;
            jcVar.Y0 = false;
            jcVar.P();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f567x.f912y0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
