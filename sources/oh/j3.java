package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.pr;
public final class j3 extends t {
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Components.z5 f17323e;
    public final org.telegram.ui.Components.voip.h f17324f;
    public final org.telegram.ui.Components.z5 h;
    public final org.telegram.ui.Components.z5 f17325n;
    public boolean f17326r;
    public boolean f17327s;
    public final c4 v;
    public final i9 f17328w;
    public final f4 f17329x;

    public j3(f4 f4Var, Context context, c4 c4Var, i9 i9Var) {
        super(context);
        this.f17329x = f4Var;
        this.v = c4Var;
        this.f17328w = i9Var;
        pr prVar = pr.f30183f;
        this.d = new org.telegram.ui.Components.z5(this, 150L, prVar);
        this.f17323e = new org.telegram.ui.Components.z5(this, 150L, prVar);
        this.f17324f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(this);
        this.h = z5Var;
        org.telegram.ui.Components.z5 z5Var2 = new org.telegram.ui.Components.z5(this);
        this.f17325n = z5Var2;
        z5Var.f33728g = 500L;
        z5Var2.f33728g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: oh.j3.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: oh.j3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e1 e1Var;
        f4 f4Var = this.f17329x;
        e4 e4Var = f4Var.J2;
        if (f4Var.H1 && !f4Var.Z2 && e4Var.d != null && (e1Var = e4Var.f17019a) != null && e1Var.n() && e4Var.d.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f17329x.f17069g1) {
            if (this.f17326r) {
                ic icVar = ic.f27737w;
                if (icVar != null && view == icVar.f27741e) {
                    if (this.f17327s) {
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
        this.f17329x.f17072h1.j();
        ic.a(this, new lh.t0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f4 f4Var = this.f17329x;
        f4Var.f17072h1.k();
        ic.h(this);
        z3 z3Var = f4Var.N1;
        if (z3Var != null) {
            i9 i9Var = ((z8) z3Var).d;
            i9Var.V0 = false;
            i9Var.P();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f17329x.f17115v0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
