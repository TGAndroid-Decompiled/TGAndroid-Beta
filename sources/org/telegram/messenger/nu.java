package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
public final class nu extends fu {
    public final Paint W;

    public nu(kv kvVar, Rect rect, int i7) {
        super(kvVar, rect, i7);
        this.W = new Paint(1);
    }

    @Override
    public final int I() {
        Rect rect = this.f22470b;
        return g0.L(12.0f) + rect.top + rect.bottom;
    }

    @Override
    public final int K() {
        return g0.L(32.0f);
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        kv kvVar = this.f22469a;
        int i10 = kvVar.C;
        int i11 = kvVar.S;
        int i12 = i10 + i11 + kvVar.T;
        Rect rect = this.f22470b;
        int i13 = rect.left;
        int i14 = (i12 - i13) - rect.right;
        int i15 = i14 / 2;
        float f10 = (((i14 - i15) / 2.0f) - i11) + i13;
        float L = (g0.L(12.0f) - g0.L(1.0f)) / 2.0f;
        if (kvVar.E()) {
            i7 = org.telegram.ui.ActionBar.k6.kl;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.jl;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, kvVar.D);
        Paint paint = this.W;
        paint.setColor(w02);
        RectF rectF = g0.P;
        rectF.set(f10, L, i15 + f10, g0.L(1.0f) + L);
        canvas.drawRoundRect(rectF, g0.L(0.5f), g0.L(0.5f), paint);
    }
}
