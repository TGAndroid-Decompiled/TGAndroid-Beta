package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.qc;
public final class q3 extends w {
    public final org.telegram.ui.Components.h6 d;
    public final org.telegram.ui.Components.h6 e;
    public final org.telegram.ui.Components.voip.h f8958f;
    public final org.telegram.ui.Components.h6 h;
    public final org.telegram.ui.Components.h6 f8959n;
    public boolean f8960r;
    public boolean f8961s;
    public final n4 v;
    public final y9 f8962w;
    public final q4 f8963x;

    public q3(q4 q4Var, Context context, n4 n4Var, y9 y9Var) {
        super(context);
        this.f8963x = q4Var;
        this.v = n4Var;
        this.f8962w = y9Var;
        ds dsVar = ds.f27530f;
        this.d = new org.telegram.ui.Components.h6(this, 150L, dsVar);
        this.e = new org.telegram.ui.Components.h6(this, 150L, dsVar);
        this.f8958f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(this);
        this.h = h6Var;
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(this);
        this.f8959n = h6Var2;
        h6Var.f28866g = 500L;
        h6Var2.f28866g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: di.q3.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: di.q3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        h1 h1Var;
        q4 q4Var = this.f8963x;
        p4 p4Var = q4Var.B2;
        if (q4Var.f9050z1 && !q4Var.R2 && ((org.telegram.ui.m4) p4Var.e) != null && (h1Var = (h1) p4Var.f8900b) != null && h1Var.n() && ((org.telegram.ui.m4) p4Var.e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f8963x.Y0) {
            if (this.f8960r) {
                qc qcVar = qc.f31854x;
                if (qcVar != null && view == qcVar.e) {
                    if (this.f8961s) {
                        return super.drawChild(canvas, view, j10);
                    }
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            }
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8963x.Z0.i();
        qc.a(this, new bh.c0(this, 1));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q4 q4Var = this.f8963x;
        q4Var.Z0.j();
        qc.h(this);
        j4 j4Var = q4Var.F1;
        if (j4Var != null) {
            y9 y9Var = ((p9) j4Var).d;
            y9Var.Y0 = false;
            y9Var.Q();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8963x.f9002n0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
