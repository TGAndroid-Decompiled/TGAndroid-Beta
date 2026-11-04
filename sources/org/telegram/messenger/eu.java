package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
public final class eu extends xt {
    public final Paint X;

    public eu(cv cvVar, Rect rect, int i3) {
        super(cvVar, rect, i3);
        this.X = new Paint(1);
    }

    @Override
    public final int I() {
        Rect rect = this.f26435b;
        return k5.C(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override
    public final int K() {
        Rect rect = this.f26435b;
        return g0.L(32.0f) + rect.left + rect.right;
    }

    @Override
    public final void W(Canvas canvas) {
        int i3;
        int i10;
        float f10;
        cv cvVar = this.f26434a;
        if (cvVar.E()) {
            i3 = org.telegram.ui.ActionBar.k6.ul;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.tl;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, cvVar.D);
        Paint paint = this.X;
        paint.setColor(w02);
        float f11 = -cvVar.S;
        int i11 = cvVar.C + cvVar.T;
        Rect rect = this.f26435b;
        float f12 = (i11 - rect.left) - rect.right;
        float f13 = 0.0f;
        if (cvVar.f22081s) {
            if (this.S) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (this.R) {
                f13 = 1.0f;
            }
            f13 = g0.T1(f10, f13, cvVar.f22082t);
        } else if (this.R) {
            f13 = 1.0f;
        }
        du duVar = this.M;
        if (duVar != null) {
            i10 = duVar.f26435b.bottom;
        } else {
            i10 = 0;
        }
        float T1 = g0.T1((-1.0f) - i10, g0.L(6.0f), f13);
        canvas.drawRect(f11, T1, f12, T1 + 1.0f, paint);
    }
}
