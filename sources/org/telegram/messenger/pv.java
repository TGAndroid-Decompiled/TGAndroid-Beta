package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.y51;
public final class pv extends ru implements Drawable.Callback {
    public final y51 W;
    public final int X;
    public final int Y;
    public final int Z;
    public final int f17676a0;
    public hb.a f17677b0;
    public Bitmap f17678c0;

    public pv(wv wvVar, Rect rect, int i10, int i11, int i12) {
        super(wvVar, rect, i10);
        this.Z = i11;
        this.f17676a0 = i12;
        y51 y51Var = new y51();
        this.W = y51Var;
        y51Var.setCallback(this);
        y51Var.f32736n = dd.L0(2131743856, null);
        y51Var.f32737o = dd.L0(2131743857, null);
        y51Var.f32738p = dd.L0(2131743852, null);
        y51Var.f32732j = new ns(wvVar, 8);
        int i13 = this.f17969c;
        this.X = i13;
        this.Y = y51Var.a(i13);
    }

    @Override
    public final int H() {
        Rect rect = this.f17968b;
        return rect.top + this.Y + rect.bottom;
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        View view = this.V;
        if (view != null) {
            return this.W.f32731i.a(view, motionEvent);
        }
        return false;
    }

    public final float h0(org.telegram.ui.Cells.x1 x1Var) {
        int i10;
        if (x1Var != null) {
            wv wvVar = this.f17967a;
            if (wvVar.f19344s || wvVar.f19346u) {
                i10 = i0.W1(Math.max(0.0f, Math.min(1.0f, x1Var.L1)), this.P, this.N);
                return i10;
            }
        }
        i10 = this.N;
        return i10;
    }

    public final float i0(org.telegram.ui.Cells.x1 x1Var) {
        if (x1Var != null) {
            wv wvVar = this.f17967a;
            if (wvVar.f19344s || wvVar.f19346u) {
                return i0.T1(this.O, this.M, Math.max(0.0f, Math.min(1.0f, x1Var.L1)));
            }
        }
        return this.M;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void q(Canvas canvas) {
        Rect rect = this.f17968b;
        int i10 = rect.left;
        int i11 = rect.top;
        y51 y51Var = this.W;
        y51Var.setBounds(i10, i11, this.X + i10, this.Y + i11);
        y51Var.draw(canvas);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
