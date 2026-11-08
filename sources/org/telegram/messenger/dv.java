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
    public final int f22119a0;
    public pb.b f22120b0;
    public Bitmap f22121c0;

    public dv(kv kvVar, Rect rect, int i7, int i10, int i11) {
        super(kvVar, rect, i7);
        this.Z = i10;
        this.f22119a0 = i11;
        s41 s41Var = new s41();
        this.W = s41Var;
        s41Var.setCallback(this);
        s41Var.f37910n = id.M0(2131743834, null);
        s41Var.f37911o = id.M0(2131743835, null);
        s41Var.f37912p = id.M0(2131743829, null);
        s41Var.f37906j = new ds(kvVar, 7);
        int i12 = this.f22471c;
        this.X = i12;
        this.Y = s41Var.a(i12);
    }

    @Override
    public final int I() {
        Rect rect = this.f22470b;
        return rect.top + this.Y + rect.bottom;
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.V;
        if (view != null) {
            return this.W.f37905i.a(view, motionEvent);
        }
        return false;
    }

    public final float i0(org.telegram.ui.Cells.x1 x1Var) {
        int i7;
        if (x1Var != null) {
            kv kvVar = this.f22469a;
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
            kv kvVar = this.f22469a;
            if (kvVar.f23779s || kvVar.f23781u) {
                return g0.T1(this.O, this.M, Math.max(0.0f, Math.min(1.0f, x1Var.L1)));
            }
        }
        return this.M;
    }

    @Override
    public final void q(Canvas canvas) {
        Rect rect = this.f22470b;
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
