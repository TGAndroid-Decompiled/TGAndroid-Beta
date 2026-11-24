package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class g48 extends pi5 {
    public final ln d;
    public final ln e;
    public final ef1 f;
    public final ln h;
    public final ln n;
    public boolean r;
    public boolean s;
    public final y48 w;
    public final oab x;
    public final a58 y;

    public g48(a58 a58Var, Context context, y48 y48Var, oab oabVar) {
        super(context);
        this.y = a58Var;
        this.w = y48Var;
        this.x = oabVar;
        d53 d53Var = d53.f;
        this.d = new ln(150L, this, d53Var);
        this.e = new ln(150L, this, d53Var);
        this.f = new ef1(32, 102, 240);
        ln lnVar = new ln(this);
        this.h = lnVar;
        ln lnVar2 = new ln(this);
        this.n = lnVar2;
        lnVar.g = 500L;
        lnVar2.g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g48.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g48.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        s96 s96Var;
        a58 a58Var = this.y;
        c40 c40Var = a58Var.C2;
        if (a58Var.A1 && !a58Var.S2 && ((jy) c40Var.e) != null && (s96Var = (s96) c40Var.b) != null && s96Var.p() && ((jy) c40Var.e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.y.Z0) {
            if (this.r) {
                u31 u31Var = u31.x;
                if (u31Var != null && view == u31Var.e) {
                    if (this.s) {
                        return super.drawChild(canvas, view, j);
                    }
                    return true;
                }
                return super.drawChild(canvas, view, j);
            }
            return super.drawChild(canvas, view, j);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y.a1.i();
        setTag(2131296353, new s20(this, (byte) 13));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a58 a58Var = this.y;
        a58Var.a1.j();
        setTag(2131296353, null);
        w48 w48Var = a58Var.G1;
        if (w48Var != null) {
            oab oabVar = ((fab) w48Var).d;
            oabVar.Y0 = false;
            oabVar.U();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.y.o0.getLayoutParams();
        layoutParams.rightMargin = gm.L(42.0f);
        layoutParams.topMargin = gm.L(15.0f);
        super.onMeasure(i, i2);
    }
}
