package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
public final class ku extends cu {
    public final Paint X;

    public ku(iv ivVar, Rect rect, int i7) {
        super(ivVar, rect, i7);
        this.X = new Paint(1);
    }

    @Override
    public final int I() {
        Rect rect = this.f22942b;
        return g0.L(12.0f) + rect.top + rect.bottom;
    }

    @Override
    public final int K() {
        return g0.L(32.0f);
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        iv ivVar = this.f22941a;
        int i10 = ivVar.C;
        int i11 = ivVar.S;
        int i12 = i10 + i11 + ivVar.T;
        Rect rect = this.f22942b;
        int i13 = rect.left;
        int i14 = (i12 - i13) - rect.right;
        int i15 = i14 / 2;
        float f10 = (((i14 - i15) / 2.0f) - i11) + i13;
        float L = (g0.L(12.0f) - g0.L(1.0f)) / 2.0f;
        if (ivVar.E()) {
            i7 = org.telegram.ui.ActionBar.j6.nl;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.ml;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, ivVar.D);
        Paint paint = this.X;
        paint.setColor(w02);
        RectF rectF = g0.P;
        rectF.set(f10, L, i15 + f10, g0.L(1.0f) + L);
        canvas.drawRoundRect(rectF, g0.L(0.5f), g0.L(0.5f), paint);
    }
}
