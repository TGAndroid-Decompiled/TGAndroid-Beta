package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import java.util.Random;
public final class dfa extends View implements snb {
    public Random a;
    public Paint b;
    public Paint c;
    public Paint d;
    public Paint e;
    public float f;
    public float h;
    public float n;

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        Paint paint = this.c;
        Paint paint2 = this.b;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float f3 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - hl.L(3.0f);
        int L = hl.L(1.0f) + ((hl.L(1.0f) + measuredWidth) * 7);
        k43 k43Var = k43.g;
        float f4 = this.f;
        if (f4 > 0.4f) {
            f = (f4 - 0.4f) / 0.6f;
        } else {
            f = 0.0f;
        }
        float interpolation = k43Var.getInterpolation(f);
        float f5 = (this.n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-uh9.f(4.0f, getMeasuredHeight(), L)) * f5);
        int i = 0;
        for (int i2 = 7; i < i2; i2 = 7) {
            int L2 = ((hl.L(1.0f) + measuredWidth) * i) + hl.L(f3);
            RectF rectF = hl.P;
            float f6 = L2;
            float f7 = L2 + measuredWidth;
            rectF.set(0.0f, f6, measuredWidth, f7);
            canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), paint2);
            rectF.set(hl.L(1.0f) + measuredWidth, f6, uh9.w(1.0f, measuredWidth, measuredWidth), f7);
            canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), paint2);
            i++;
            f3 = f3;
        }
        float f8 = f3;
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), hl.L(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - hl.L(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), hl.L(4.0f), this.e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - hl.L(21.0f)) * f5) + hl.L(f8);
        RectF rectF2 = hl.P;
        rectF2.set(getMeasuredWidth() - hl.L(f8), measuredHeight, getMeasuredWidth(), hl.L(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, hl.L(1.5f), hl.L(1.5f), paint);
        float centerY = rectF2.centerY();
        float L3 = hl.L(0.5f) + measuredWidth;
        rectF2.set(L3 - hl.L(8.0f), centerY - hl.L(f8), L3 + hl.L(8.0f), centerY + hl.L(f8));
        canvas.drawRoundRect(rectF2, hl.L(f8), hl.L(f8), paint);
        float f9 = this.f + 0.016f;
        this.f = f9;
        if (f9 > 1.0f) {
            this.h = this.n;
            float abs = Math.abs(this.a.nextInt() % 1001) / 1000.0f;
            this.n = abs;
            if (abs > this.h) {
                f2 = abs + 0.3f;
                this.n = f2;
            } else {
                f2 = abs - 0.3f;
                this.n = f2;
            }
            this.n = Math.max(0.0f, Math.min(1.0f, f2));
            this.f = 0.0f;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.b;
            int i = aob.gg;
            paint.setColor(vm2.o(aob.w0(null, i, false), 76));
            this.c.setColor(aob.w0(null, i, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
