package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.s41;
public final class dv extends fu implements Drawable.Callback {
    public final s41 W;
    public final int X;
    public final int Y;
    public final int Z;
    public final int f22101a0;
    public pb.b f22102b0;
    public Bitmap f22103c0;

    public dv(kv kvVar, Rect rect, int i7, int i10, int i11) {
        super(kvVar, rect, i7);
        this.Z = i10;
        this.f22101a0 = i11;
        s41 s41Var = new s41();
        this.W = s41Var;
        s41Var.setCallback(this);
        s41Var.f37894n = hd.M0(2131743832, null);
        s41Var.f37895o = hd.M0(2131743833, null);
        s41Var.f37896p = hd.M0(2131743827, null);
        s41Var.f37890j = new ds(kvVar, 7);
        int i12 = this.f22452c;
        this.X = i12;
        this.Y = s41Var.a(i12);
    }

    @Override
    public final int I() {
        Rect rect = this.f22451b;
        return rect.top + this.Y + rect.bottom;
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.V;
        if (view != null) {
            return this.W.f37889i.a(view, motionEvent);
        }
        return false;
    }

    public final float i0(org.telegram.ui.Cells.x1 x1Var) {
        int i7;
        if (x1Var != null) {
            kv kvVar = this.f22450a;
            if (kvVar.f23779s || kvVar.f23781u) {
                i7 = g0.W1(Math.max(0.0f, Math.min(1.0f, x1Var.L1)), this.P, this.N);
                return i7;
            }
        }
        i7 = this.N;
        return i7;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    public final float j0(org.telegram.ui.Cells.x1 x1Var) {
        if (x1Var != null) {
            kv kvVar = this.f22450a;
            if (kvVar.f23779s || kvVar.f23781u) {
                return g0.T1(this.O, this.M, Math.max(0.0f, Math.min(1.0f, x1Var.L1)));
            }
        }
        return this.M;
    }

    @Override
    public final void q(Canvas canvas) {
        Rect rect = this.f22451b;
        int i7 = rect.left;
        int i10 = rect.top;
        s41 s41Var = this.W;
        s41Var.setBounds(i7, i10, this.X + i7, this.Y + i10);
        s41Var.draw(canvas);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
