package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
public final class gu extends zt {
    public final Paint X;

    public gu(ev evVar, Rect rect, int i7) {
        super(evVar, rect, i7);
        this.X = new Paint(1);
    }

    @Override
    public final int I() {
        Rect rect = this.f28378b;
        return f3.C(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override
    public final int K() {
        Rect rect = this.f28378b;
        return g0.L(32.0f) + rect.left + rect.right;
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        int i10;
        float f10;
        ev evVar = this.f28377a;
        if (evVar.E()) {
            i7 = org.telegram.ui.ActionBar.m6.xl;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.wl;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, evVar.D);
        Paint paint = this.X;
        paint.setColor(w02);
        float f11 = -evVar.S;
        int i11 = evVar.C + evVar.T;
        Rect rect = this.f28378b;
        float f12 = (i11 - rect.left) - rect.right;
        float f13 = 0.0f;
        if (evVar.f23811s) {
            if (this.S) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (this.R) {
                f13 = 1.0f;
            }
            f13 = g0.T1(f10, f13, evVar.f23812t);
        } else if (this.R) {
            f13 = 1.0f;
        }
        fu fuVar = this.M;
        if (fuVar != null) {
            i10 = fuVar.f28378b.bottom;
        } else {
            i10 = 0;
        }
        float T1 = g0.T1((-1.0f) - i10, g0.L(6.0f), f13);
        canvas.drawRect(f11, T1, f12, T1 + 1.0f, paint);
    }
}
