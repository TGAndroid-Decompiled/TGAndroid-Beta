package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
public final class bl9 extends dk9 implements Drawable.Callback {
    public final fac X;
    public final int Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public sjf c0;
    public Bitmap d0;

    public bl9(hl9 hl9Var, Rect rect, int i, int i2, int i3) {
        super(hl9Var, rect, i);
        this.a0 = i2;
        this.b0 = i3;
        fac facVar = new fac();
        this.X = facVar;
        facVar.setCallback(this);
        facVar.n = ob6.M0(2131743486, null);
        facVar.o = ob6.M0(2131743487, null);
        facVar.p = ob6.M0(2131743481, null);
        facVar.j = new v59(hl9Var, (byte) 12);
        int i4 = this.c;
        this.Y = i4;
        this.Z = facVar.a(i4);
    }

    @Override
    public final int H() {
        Rect rect = this.b;
        return rect.top + this.Z + rect.bottom;
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        View view = this.W;
        if (view != null) {
            return this.X.i.a(view, motionEvent);
        }
        return false;
    }

    public final float h0(dc2 dc2Var) {
        int i;
        if (dc2Var != null) {
            hl9 hl9Var = this.a;
            if (hl9Var.s || hl9Var.u) {
                i = hl.U1(Math.max(0.0f, Math.min(1.0f, dc2Var.L1)), this.Q, this.O);
                return i;
            }
        }
        i = this.O;
        return i;
    }

    public final float i0(dc2 dc2Var) {
        if (dc2Var != null) {
            hl9 hl9Var = this.a;
            if (hl9Var.s || hl9Var.u) {
                return hl.R1(this.P, this.N, Math.max(0.0f, Math.min(1.0f, dc2Var.L1)));
            }
        }
        return this.N;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void p(Canvas canvas) {
        Rect rect = this.b;
        int i = rect.left;
        int i2 = rect.top;
        fac facVar = this.X;
        facVar.setBounds(i, i2, this.Y + i, this.Z + i2);
        facVar.draw(canvas);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}
