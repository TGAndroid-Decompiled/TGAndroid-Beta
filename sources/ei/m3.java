package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.xq;
public final class m3 extends w {
    public final org.telegram.ui.Components.u5 d;
    public final org.telegram.ui.Components.u5 f10630e;
    public final org.telegram.ui.Components.voip.g f10631f;
    public final org.telegram.ui.Components.u5 h;
    public final org.telegram.ui.Components.u5 f10632n;
    public boolean f10633r;
    public boolean f10634s;
    public final g4 f10635w;
    public final r9 f10636x;
    public final j4 f10637y;

    public m3(j4 j4Var, Context context, g4 g4Var, r9 r9Var) {
        super(context);
        this.f10637y = j4Var;
        this.f10635w = g4Var;
        this.f10636x = r9Var;
        xq xqVar = xq.f40452f;
        this.d = new org.telegram.ui.Components.u5(this, 150L, xqVar);
        this.f10630e = new org.telegram.ui.Components.u5(this, 150L, xqVar);
        this.f10631f = new org.telegram.ui.Components.voip.g(32, 102, 240);
        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(this);
        this.h = u5Var;
        org.telegram.ui.Components.u5 u5Var2 = new org.telegram.ui.Components.u5(this);
        this.f10632n = u5Var2;
        u5Var.f38648g = 500L;
        u5Var2.f38648g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: ei.m3.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: ei.m3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g1 g1Var;
        j4 j4Var = this.f10637y;
        i4 i4Var = j4Var.f10520w2;
        if (j4Var.f10511u1 && !j4Var.M2 && ((org.telegram.ui.l4) i4Var.f10405e) != null && (g1Var = (g1) i4Var.f10403b) != null && g1Var.n() && ((org.telegram.ui.l4) i4Var.f10405e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f10637y.T0) {
            if (this.f10633r) {
                ac acVar = ac.f31784w;
                if (acVar != null && view == acVar.f31788e) {
                    if (this.f10634s) {
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
        this.f10637y.U0.i();
        setTag(2131296351, new ai.h1(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j4 j4Var = this.f10637y;
        j4Var.U0.j();
        setTag(2131296351, null);
        c4 c4Var = j4Var.A1;
        if (c4Var != null) {
            r9 r9Var = ((i9) c4Var).d;
            r9Var.Z0 = false;
            r9Var.d0();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f10637y.f10466i0.getLayoutParams();
        layoutParams.rightMargin = org.telegram.messenger.g0.L(42.0f);
        layoutParams.topMargin = org.telegram.messenger.g0.L(15.0f);
        super.onMeasure(i3, i10);
    }
}
