package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.x51;
public final class ov extends qu implements Drawable.Callback {
    public final x51 W;
    public final int X;
    public final int Y;
    public final int Z;
    public final int f17343a0;
    public hb.a f17344b0;
    public Bitmap f17345c0;

    public ov(vv vvVar, Rect rect, int i10, int i11, int i12) {
        super(vvVar, rect, i10);
        this.Z = i11;
        this.f17343a0 = i12;
        x51 x51Var = new x51();
        this.W = x51Var;
        x51Var.setCallback(this);
        x51Var.f32367n = cd.L0(2131743856, null);
        x51Var.f32368o = cd.L0(2131743857, null);
        x51Var.f32369p = cd.L0(2131743852, null);
        x51Var.f32363j = new ms(vvVar, 8);
        int i13 = this.f17623c;
        this.X = i13;
        this.Y = x51Var.a(i13);
    }

    @Override
    public final int H() {
        Rect rect = this.f17622b;
        return rect.top + this.Y + rect.bottom;
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        View view = this.V;
        if (view != null) {
            return this.W.f32362i.a(view, motionEvent);
        }
        return false;
    }

    public final float h0(org.telegram.ui.Cells.x1 x1Var) {
        int i10;
        if (x1Var != null) {
            vv vvVar = this.f17621a;
            if (vvVar.f19001s || vvVar.f19003u) {
                i10 = i0.W1(Math.max(0.0f, Math.min(1.0f, x1Var.L1)), this.P, this.N);
                return i10;
            }
        }
        i10 = this.N;
        return i10;
    }

    public final float i0(org.telegram.ui.Cells.x1 x1Var) {
        if (x1Var != null) {
            vv vvVar = this.f17621a;
            if (vvVar.f19001s || vvVar.f19003u) {
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
        Rect rect = this.f17622b;
        int i10 = rect.left;
        int i11 = rect.top;
        x51 x51Var = this.W;
        x51Var.setBounds(i10, i11, this.X + i10, this.Y + i11);
        x51Var.draw(canvas);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
