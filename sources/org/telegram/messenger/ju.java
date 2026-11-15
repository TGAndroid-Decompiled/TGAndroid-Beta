package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
public final class ju extends cu {
    public final Paint X;

    public ju(iv ivVar, Rect rect, int i7) {
        super(ivVar, rect, i7);
        this.X = new Paint(1);
    }

    @Override
    public final int I() {
        Rect rect = this.f22934b;
        return k5.C(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override
    public final int K() {
        Rect rect = this.f22934b;
        return g0.L(32.0f) + rect.left + rect.right;
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        int i10;
        float f10;
        iv ivVar = this.f22933a;
        if (ivVar.E()) {
            i7 = org.telegram.ui.ActionBar.j6.xl;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.wl;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, ivVar.D);
        Paint paint = this.X;
        paint.setColor(w02);
        float f11 = -ivVar.S;
        int i11 = ivVar.C + ivVar.T;
        Rect rect = this.f22934b;
        float f12 = (i11 - rect.left) - rect.right;
        float f13 = 0.0f;
        if (ivVar.f24456s) {
            if (this.S) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (this.R) {
                f13 = 1.0f;
            }
            f13 = g0.T1(f10, f13, ivVar.f24457t);
        } else if (this.R) {
            f13 = 1.0f;
        }
        iu iuVar = this.M;
        if (iuVar != null) {
            i10 = iuVar.f22934b.bottom;
        } else {
            i10 = 0;
        }
        float T1 = g0.T1((-1.0f) - i10, g0.L(6.0f), f13);
        canvas.drawRect(f11, T1, f12, T1 + 1.0f, paint);
    }
}
