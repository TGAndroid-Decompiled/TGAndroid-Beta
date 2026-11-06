package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.r41;
public final class dv extends fu implements Drawable.Callback {
    public final r41 W;
    public final int X;
    public final int Y;
    public final int Z;
    public final int f22094a0;
    public pb.b f22095b0;
    public Bitmap f22096c0;

    public dv(kv kvVar, Rect rect, int i7, int i10, int i11) {
        super(kvVar, rect, i7);
        this.Z = i10;
        this.f22094a0 = i11;
        r41 r41Var = new r41();
        this.W = r41Var;
        r41Var.setCallback(this);
        r41Var.f37542n = hd.M0(2131743832, null);
        r41Var.f37543o = hd.M0(2131743833, null);
        r41Var.f37544p = hd.M0(2131743827, null);
        r41Var.f37538j = new ds(kvVar, 7);
        int i12 = this.f22445c;
        this.X = i12;
        this.Y = r41Var.a(i12);
    }

    @Override
    public final int I() {
        Rect rect = this.f22444b;
        return rect.top + this.Y + rect.bottom;
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.V;
        if (view != null) {
            return this.W.f37537i.a(view, motionEvent);
        }
        return false;
    }

    public final float i0(org.telegram.ui.Cells.x1 x1Var) {
        int i7;
        if (x1Var != null) {
            kv kvVar = this.f22443a;
            if (kvVar.f23772s || kvVar.f23774u) {
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
            kv kvVar = this.f22443a;
            if (kvVar.f23772s || kvVar.f23774u) {
                return g0.T1(this.O, this.M, Math.max(0.0f, Math.min(1.0f, x1Var.L1)));
            }
        }
        return this.M;
    }

    @Override
    public final void q(Canvas canvas) {
        Rect rect = this.f22444b;
        int i7 = rect.left;
        int i10 = rect.top;
        r41 r41Var = this.W;
        r41Var.setBounds(i7, i10, this.X + i7, this.Y + i10);
        r41Var.draw(canvas);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
