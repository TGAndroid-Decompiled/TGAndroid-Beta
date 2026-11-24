package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
public final class lh9 extends mg9 implements Drawable.Callback {
    public final f6c X;
    public final int Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public cff c0;
    public Bitmap d0;

    public lh9(rh9 rh9Var, Rect rect, int i, int i2, int i3) {
        super(rh9Var, rect, i);
        this.a0 = i2;
        this.b0 = i3;
        f6c f6cVar = new f6c();
        this.X = f6cVar;
        f6cVar.setCallback(this);
        f6cVar.n = k96.M0(2131743592, null);
        f6cVar.o = k96.M0(2131743593, null);
        f6cVar.p = k96.M0(2131743587, null);
        f6cVar.j = new sr8(rh9Var, (byte) 26);
        int i4 = this.c;
        this.Y = i4;
        this.Z = f6cVar.a(i4);
    }

    @Override
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.Z + rect.bottom;
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view != null) {
            return this.X.i.a(view, motionEvent);
        }
        return false;
    }

    public final float i0(nb2 nb2Var) {
        int i;
        if (nb2Var != null) {
            rh9 rh9Var = this.a;
            if (rh9Var.s || rh9Var.u) {
                i = gl.U1(Math.max(0.0f, Math.min(1.0f, nb2Var.L1)), this.Q, this.O);
                return i;
            }
        }
        i = this.O;
        return i;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    public final float j0(nb2 nb2Var) {
        if (nb2Var != null) {
            rh9 rh9Var = this.a;
            if (rh9Var.s || rh9Var.u) {
                return gl.R1(this.P, this.N, Math.max(0.0f, Math.min(1.0f, nb2Var.L1)));
            }
        }
        return this.N;
    }

    @Override
    public final void q(Canvas canvas) {
        Rect rect = this.b;
        int i = rect.left;
        int i2 = rect.top;
        f6c f6cVar = this.X;
        f6cVar.setBounds(i, i2, this.Y + i, this.Z + i2);
        f6cVar.draw(canvas);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}
