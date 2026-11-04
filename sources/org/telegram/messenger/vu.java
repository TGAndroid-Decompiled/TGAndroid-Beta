package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.o41;
public final class vu extends xt implements Drawable.Callback {
    public final o41 X;
    public final int Y;
    public final int Z;
    public final int f26108a0;
    public final int f26109b0;
    public nb.a f26110c0;
    public Bitmap f26111d0;

    public vu(cv cvVar, Rect rect, int i3, int i10, int i11) {
        super(cvVar, rect, i3);
        this.f26108a0 = i10;
        this.f26109b0 = i11;
        o41 o41Var = new o41();
        this.X = o41Var;
        o41Var.setCallback(this);
        o41Var.f36702n = bd.M0(2131743841, null);
        o41Var.f36703o = bd.M0(2131743842, null);
        o41Var.f36704p = bd.M0(2131743836, null);
        o41Var.f36698j = new vs(cvVar, 7);
        int i12 = this.f26436c;
        this.Y = i12;
        this.Z = o41Var.a(i12);
    }

    @Override
    public final int I() {
        Rect rect = this.f26435b;
        return rect.top + this.Z + rect.bottom;
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view != null) {
            return this.X.f36697i.a(view, motionEvent);
        }
        return false;
    }

    public final float i0(org.telegram.ui.Cells.x1 x1Var) {
        int i3;
        if (x1Var != null) {
            cv cvVar = this.f26434a;
            if (cvVar.f22081s || cvVar.f22083u) {
                i3 = g0.W1(Math.max(0.0f, Math.min(1.0f, x1Var.L1)), this.Q, this.O);
                return i3;
            }
        }
        i3 = this.O;
        return i3;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    public final float j0(org.telegram.ui.Cells.x1 x1Var) {
        if (x1Var != null) {
            cv cvVar = this.f26434a;
            if (cvVar.f22081s || cvVar.f22083u) {
                return g0.T1(this.P, this.N, Math.max(0.0f, Math.min(1.0f, x1Var.L1)));
            }
        }
        return this.N;
    }

    @Override
    public final void q(Canvas canvas) {
        Rect rect = this.f26435b;
        int i3 = rect.left;
        int i10 = rect.top;
        o41 o41Var = this.X;
        o41Var.setBounds(i3, i10, this.Y + i3, this.Z + i10);
        o41Var.draw(canvas);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
