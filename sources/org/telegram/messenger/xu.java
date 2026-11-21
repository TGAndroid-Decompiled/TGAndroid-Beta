package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.k51;
public final class xu extends zt implements Drawable.Callback {
    public final k51 X;
    public final int Y;
    public final int Z;
    public final int f28030a0;
    public final int f28031b0;
    public w7.s f28032c0;
    public Bitmap f28033d0;

    public xu(ev evVar, Rect rect, int i7, int i10, int i11) {
        super(evVar, rect, i7);
        this.f28030a0 = i10;
        this.f28031b0 = i11;
        k51 k51Var = new k51();
        this.X = k51Var;
        k51Var.setCallback(this);
        k51Var.f36795n = gd.N0(2131743588, null);
        k51Var.f36796o = gd.N0(2131743589, null);
        k51Var.f36797p = gd.N0(2131743583, null);
        k51Var.f36791j = new xr(evVar, 7);
        int i12 = this.f28379c;
        this.Y = i12;
        this.Z = k51Var.a(i12);
    }

    @Override
    public final int I() {
        Rect rect = this.f28378b;
        return rect.top + this.Z + rect.bottom;
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view != null) {
            return this.X.f36790i.a(view, motionEvent);
        }
        return false;
    }

    public final float i0(org.telegram.ui.Cells.y1 y1Var) {
        int i7;
        if (y1Var != null) {
            ev evVar = this.f28377a;
            if (evVar.f23811s || evVar.f23813u) {
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
            ev evVar = this.f28377a;
            if (evVar.f23811s || evVar.f23813u) {
                return g0.T1(this.P, this.N, Math.max(0.0f, Math.min(1.0f, y1Var.L1)));
            }
        }
        return this.N;
    }

    @Override
    public final void q(Canvas canvas) {
        Rect rect = this.f28378b;
        int i7 = rect.left;
        int i10 = rect.top;
        k51 k51Var = this.X;
        k51Var.setBounds(i7, i10, this.Y + i7, this.Z + i10);
        k51Var.draw(canvas);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
