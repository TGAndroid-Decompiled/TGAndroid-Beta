package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.sc;
public final class o4 extends b0 {
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Components.g6 e;
    public final org.telegram.ui.Components.voip.h f3407f;
    public final org.telegram.ui.Components.g6 h;
    public final org.telegram.ui.Components.g6 f3408n;
    public boolean f3409r;
    public boolean f3410s;
    public final n5 v;
    public final sb f3411w;
    public final q5 f3412x;

    public o4(q5 q5Var, Context context, n5 n5Var, sb sbVar) {
        super(context);
        this.f3412x = q5Var;
        this.v = n5Var;
        this.f3411w = sbVar;
        es esVar = es.f24771f;
        this.d = new org.telegram.ui.Components.g6(this, 150L, esVar);
        this.e = new org.telegram.ui.Components.g6(this, 150L, esVar);
        this.f3407f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(this);
        this.h = g6Var;
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(this);
        this.f3408n = g6Var2;
        g6Var.f25192g = 500L;
        g6Var2.f25192g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: bi.o4.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: bi.o4.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        t1 t1Var;
        q5 q5Var = this.f3412x;
        p5 p5Var = q5Var.M2;
        if (q5Var.K1 && !q5Var.f3513c3 && ((org.telegram.ui.n4) p5Var.e) != null && (t1Var = (t1) p5Var.f3465b) != null && t1Var.n() && ((org.telegram.ui.n4) p5Var.e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f3412x.f3534j1) {
            if (this.f3409r) {
                sc scVar = sc.f29095w;
                if (scVar != null && view == scVar.e) {
                    if (this.f3410s) {
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
        this.f3412x.f3537k1.i();
        sc.a(this, new ah.m0(this, 1));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q5 q5Var = this.f3412x;
        q5Var.f3537k1.j();
        sc.h(this);
        j5 j5Var = q5Var.Q1;
        if (j5Var != null) {
            sb sbVar = ((jb) j5Var).d;
            sbVar.Y0 = false;
            sbVar.P();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f3412x.f3580y0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
