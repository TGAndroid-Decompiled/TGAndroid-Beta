package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
public final class l4 extends b0 {
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Components.e6 f3268e;
    public final org.telegram.ui.Components.voip.h f3269f;
    public final org.telegram.ui.Components.e6 h;
    public final org.telegram.ui.Components.e6 f3270n;
    public boolean f3271r;
    public boolean f3272s;
    public final l5 v;
    public final pb f3273w;
    public final o5 f3274x;

    public l4(o5 o5Var, Context context, l5 l5Var, pb pbVar) {
        super(context);
        this.f3274x = o5Var;
        this.v = l5Var;
        this.f3273w = pbVar;
        pr prVar = pr.f29493f;
        this.d = new org.telegram.ui.Components.e6(this, 150L, prVar);
        this.f3268e = new org.telegram.ui.Components.e6(this, 150L, prVar);
        this.f3269f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(this);
        this.h = e6Var;
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(this);
        this.f3270n = e6Var2;
        e6Var.f25595g = 500L;
        e6Var2.f25595g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: bi.l4.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: bi.l4.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        t1 t1Var;
        o5 o5Var = this.f3274x;
        n5 n5Var = o5Var.M2;
        if (o5Var.K1 && !o5Var.f3438c3 && ((org.telegram.ui.l4) n5Var.f3394e) != null && (t1Var = (t1) n5Var.f3392b) != null && t1Var.n() && ((org.telegram.ui.l4) n5Var.f3394e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f3274x.f3459j1) {
            if (this.f3271r) {
                qc qcVar = qc.f29698w;
                if (qcVar != null && view == qcVar.f29702e) {
                    if (this.f3272s) {
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
        this.f3274x.f3461k1.j();
        qc.a(this, new ah.n0(this, 1));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o5 o5Var = this.f3274x;
        o5Var.f3461k1.k();
        qc.h(this);
        h5 h5Var = o5Var.Q1;
        if (h5Var != null) {
            pb pbVar = ((gb) h5Var).d;
            pbVar.Y0 = false;
            pbVar.P();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f3274x.f3504y0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
