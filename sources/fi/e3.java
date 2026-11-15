package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.xb;
public final class e3 extends v {
    public final org.telegram.ui.Components.u5 d;
    public final org.telegram.ui.Components.u5 f11664e;
    public final org.telegram.ui.Components.voip.n f11665f;
    public final org.telegram.ui.Components.u5 h;
    public final org.telegram.ui.Components.u5 f11666n;
    public boolean f11667r;
    public boolean f11668s;
    public final y3 f11669w;
    public final i9 f11670x;
    public final b4 f11671y;

    public e3(b4 b4Var, Context context, y3 y3Var, i9 i9Var) {
        super(context);
        this.f11671y = b4Var;
        this.f11669w = y3Var;
        this.f11670x = i9Var;
        er erVar = er.f34419f;
        this.d = new org.telegram.ui.Components.u5(this, 150L, erVar);
        this.f11664e = new org.telegram.ui.Components.u5(this, 150L, erVar);
        this.f11665f = new org.telegram.ui.Components.voip.n(32, 102, 240);
        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(this);
        this.h = u5Var;
        org.telegram.ui.Components.u5 u5Var2 = new org.telegram.ui.Components.u5(this);
        this.f11666n = u5Var2;
        u5Var.f39903g = 500L;
        u5Var2.f39903g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: fi.e3.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: fi.e3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e1 e1Var;
        b4 b4Var = this.f11671y;
        a4 a4Var = b4Var.f11536w2;
        if (b4Var.f11527u1 && !b4Var.M2 && ((org.telegram.ui.j4) a4Var.f11408e) != null && (e1Var = (e1) a4Var.f11406b) != null && e1Var.n() && ((org.telegram.ui.j4) a4Var.f11408e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f11671y.T0) {
            if (this.f11667r) {
                xb xbVar = xb.f41627w;
                if (xbVar != null && view == xbVar.f41631e) {
                    if (this.f11668s) {
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
        this.f11671y.U0.i();
        setTag(2131296351, new bi.e1(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b4 b4Var = this.f11671y;
        b4Var.U0.j();
        setTag(2131296351, null);
        u3 u3Var = b4Var.A1;
        if (u3Var != null) {
            i9 i9Var = ((z8) u3Var).d;
            i9Var.Y0 = false;
            i9Var.V();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f11671y.f11482i0.getLayoutParams();
        layoutParams.rightMargin = org.telegram.messenger.g0.L(42.0f);
        layoutParams.topMargin = org.telegram.messenger.g0.L(15.0f);
        super.onMeasure(i7, i10);
    }
}
