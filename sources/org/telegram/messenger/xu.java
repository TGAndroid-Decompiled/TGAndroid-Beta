package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.j51;
public final class xu extends zt implements Drawable.Callback {
    public final j51 X;
    public final int Y;
    public final int Z;
    public final int f28118a0;
    public final int f28119b0;
    public w7.s f28120c0;
    public Bitmap f28121d0;

    public xu(ev evVar, Rect rect, int i7, int i10, int i11) {
        super(evVar, rect, i7);
        this.f28118a0 = i10;
        this.f28119b0 = i11;
        j51 j51Var = new j51();
        this.X = j51Var;
        j51Var.setCallback(this);
        j51Var.f36288n = gd.N0(2131743584, null);
        j51Var.f36289o = gd.N0(2131743585, null);
        j51Var.f36290p = gd.N0(2131743579, null);
        j51Var.f36284j = new xr(evVar, 7);
        int i12 = this.f28443c;
        this.Y = i12;
        this.Z = j51Var.a(i12);
    }

    @Override
    public final int I() {
        Rect rect = this.f28442b;
        return rect.top + this.Z + rect.bottom;
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view != null) {
            return this.X.f36283i.a(view, motionEvent);
        }
        return false;
    }

    public final float i0(org.telegram.ui.Cells.y1 y1Var) {
        int i7;
        if (y1Var != null) {
            ev evVar = this.f28441a;
            if (evVar.f23888s || evVar.f23890u) {
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
            ev evVar = this.f28441a;
            if (evVar.f23888s || evVar.f23890u) {
                return g0.T1(this.P, this.N, Math.max(0.0f, Math.min(1.0f, y1Var.L1)));
            }
        }
        return this.N;
    }

    @Override
    public final void q(Canvas canvas) {
        Rect rect = this.f28442b;
        int i7 = rect.left;
        int i10 = rect.top;
        j51 j51Var = this.X;
        j51Var.setBounds(i7, i10, this.Y + i7, this.Z + i10);
        j51Var.draw(canvas);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
