package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class d28 extends qg5 {
    public final lm d;
    public final lm e;
    public final wd1 f;
    public final lm h;
    public final lm n;
    public boolean r;
    public boolean s;
    public final w28 w;
    public final m8b x;
    public final y28 y;

    public d28(y28 y28Var, Context context, w28 w28Var, m8b m8bVar) {
        super(context);
        this.y = y28Var;
        this.w = w28Var;
        this.x = m8bVar;
        s33 s33Var = s33.f;
        this.d = new lm(150L, this, s33Var);
        this.e = new lm(150L, this, s33Var);
        this.f = new wd1(32, 102, 240);
        lm lmVar = new lm(this);
        this.h = lmVar;
        lm lmVar2 = new lm(this);
        this.n = lmVar2;
        lmVar.g = 500L;
        lmVar2.g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d28.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d28.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        t76 t76Var;
        y28 y28Var = this.y;
        c30 c30Var = y28Var.C2;
        if (y28Var.A1 && !y28Var.S2 && ((ix) c30Var.e) != null && (t76Var = (t76) c30Var.b) != null && t76Var.p() && ((ix) c30Var.e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.y.Z0) {
            if (this.r) {
                m21 m21Var = m21.w;
                if (m21Var != null && view == m21Var.e) {
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
        setTag(2131296353, new s10(this, (byte) 13));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y28 y28Var = this.y;
        y28Var.a1.j();
        setTag(2131296353, null);
        t28 t28Var = y28Var.G1;
        if (t28Var != null) {
            m8b m8bVar = ((d8b) t28Var).d;
            m8bVar.Y0 = false;
            m8bVar.U();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.y.o0.getLayoutParams();
        layoutParams.rightMargin = gl.L(42.0f);
        layoutParams.topMargin = gl.L(15.0f);
        super.onMeasure(i, i2);
    }
}
