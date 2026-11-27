package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
public final class zoa extends Drawable implements Drawable.Callback {
    public final hn a;
    public final Paint b;

    public zoa() {
        hn hnVar = new hn(false, true, true);
        this.a = hnVar;
        hnVar.setCallback(this);
        hnVar.n(0.3f, 165L, k43.h);
        hnVar.b = 1;
        hnVar.x(hl.o());
        hnVar.w(hl.L(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = hnVar.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(hl.N(0.6f));
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public static String a(float f) {
        float round = Math.round(f * 10.0f) / 10.0f;
        long j = round;
        if (round == ((float) j)) {
            return String.valueOf(j);
        }
        return String.valueOf(round);
    }

    public final void b(boolean z, float f) {
        String concat = a(f).concat("X");
        hn hnVar = this.a;
        if (z && TextUtils.equals(hnVar.i, concat)) {
            return;
        }
        hnVar.a();
        hnVar.t(concat, z, true);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        hn hnVar = this.a;
        Paint paint = this.b;
        if (paint != null) {
            paint.setStrokeWidth(hl.N(1.6f));
            RectF rectF = hl.P;
            float L = ((hl.L(24.0f) - hnVar.c()) / 2.0f) - hl.N(3.0f);
            float N = hl.N(0.2f) + ((hl.L(24.0f) - hnVar.e) / 2.0f);
            float c = hnVar.c();
            rectF.set(L, N, hl.N(3.0f) + ((c + hl.L(24.0f)) / 2.0f), (hl.L(24.0f) + hnVar.e) / 2.0f);
            canvas.drawRoundRect(rectF, hl.N(3.0f), hl.N(3.0f), paint);
        }
        hnVar.a.setStrokeWidth(hl.N(0.3f));
        hnVar.setBounds(0, (int) ((hl.L(24.0f) - hnVar.e) / 2.0f), hl.L(24.0f), (int) ((hl.L(24.0f) + hnVar.e) / 2.0f));
        hnVar.draw(canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return hl.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return hl.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override
    public final void setAlpha(int i) {
        this.a.C = i;
        Paint paint = this.b;
        if (paint != null) {
            paint.setAlpha(i);
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
