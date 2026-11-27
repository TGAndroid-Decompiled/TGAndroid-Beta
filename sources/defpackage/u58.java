package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class u58 extends si5 {
    public final mm d;
    public final mm e;
    public final fe1 f;
    public final mm h;
    public final mm n;
    public boolean r;
    public boolean s;
    public final m68 w;
    public final lcb x;
    public final o68 y;

    public u58(o68 o68Var, Context context, m68 m68Var, lcb lcbVar) {
        super(context);
        this.y = o68Var;
        this.w = m68Var;
        this.x = lcbVar;
        k43 k43Var = k43.f;
        this.d = new mm(150L, this, k43Var);
        this.e = new mm(150L, this, k43Var);
        this.f = new fe1(32, 102, 240);
        mm mmVar = new mm(this);
        this.h = mmVar;
        mm mmVar2 = new mm(this);
        this.n = mmVar2;
        mmVar.g = 500L;
        mmVar2.g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u58.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u58.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        w96 w96Var;
        o68 o68Var = this.y;
        d30 d30Var = o68Var.w2;
        if (o68Var.u1 && !o68Var.M2 && ((jx) d30Var.e) != null && (w96Var = (w96) d30Var.b) != null && w96Var.p() && ((jx) d30Var.e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.y.T0) {
            if (this.r) {
                v21 v21Var = v21.x;
                if (v21Var != null && view == v21Var.e) {
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
        this.y.U0.i();
        setTag(2131296353, new t10(this, (byte) 14));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o68 o68Var = this.y;
        o68Var.U0.j();
        setTag(2131296353, null);
        k68 k68Var = o68Var.A1;
        if (k68Var != null) {
            lcb lcbVar = ((ccb) k68Var).d;
            lcbVar.Y0 = false;
            lcbVar.U();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.y.i0.getLayoutParams();
        layoutParams.rightMargin = hl.L(42.0f);
        layoutParams.topMargin = hl.L(15.0f);
        super.onMeasure(i, i2);
    }
}
