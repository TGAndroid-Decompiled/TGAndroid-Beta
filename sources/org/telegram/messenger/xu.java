package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.h51;
public final class xu extends zt implements Drawable.Callback {
    public final h51 X;
    public final int Y;
    public final int Z;
    public final int f28002a0;
    public final int f28003b0;
    public w7.s f28004c0;
    public Bitmap f28005d0;

    public xu(ev evVar, Rect rect, int i7, int i10, int i11) {
        super(evVar, rect, i7);
        this.f28002a0 = i10;
        this.f28003b0 = i11;
        h51 h51Var = new h51();
        this.X = h51Var;
        h51Var.setCallback(this);
        h51Var.f35744n = gd.M0(2131743594, null);
        h51Var.f35745o = gd.M0(2131743595, null);
        h51Var.f35746p = gd.M0(2131743589, null);
        h51Var.f35740j = new xr(evVar, 7);
        int i12 = this.f28351c;
        this.Y = i12;
        this.Z = h51Var.a(i12);
    }

    @Override
    public final int I() {
        Rect rect = this.f28350b;
        return rect.top + this.Z + rect.bottom;
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view != null) {
            return this.X.f35739i.a(view, motionEvent);
        }
        return false;
    }

    public final float i0(org.telegram.ui.Cells.y1 y1Var) {
        int i7;
        if (y1Var != null) {
            ev evVar = this.f28349a;
            if (evVar.f23783s || evVar.f23785u) {
                i7 = g0.W1(Math.max(0.0f, Math.min(1.0f, y1Var.L1)), this.Q, this.O);
                return i7;
            }
        }
        i7 = this.O;
        return i7;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    public final float j0(org.telegram.ui.Cells.y1 y1Var) {
        if (y1Var != null) {
            ev evVar = this.f28349a;
            if (evVar.f23783s || evVar.f23785u) {
                return g0.T1(this.P, this.N, Math.max(0.0f, Math.min(1.0f, y1Var.L1)));
            }
        }
        return this.N;
    }

    @Override
    public final void q(Canvas canvas) {
        Rect rect = this.f28350b;
        int i7 = rect.left;
        int i10 = rect.top;
        h51 h51Var = this.X;
        h51Var.setBounds(i7, i10, this.Y + i7, this.Z + i10);
        h51Var.draw(canvas);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
