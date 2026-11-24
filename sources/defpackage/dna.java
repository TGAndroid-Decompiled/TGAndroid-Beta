package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
public final class dna extends Drawable implements Drawable.Callback {
    public final ho a;
    public final Paint b;

    public dna() {
        ho hoVar = new ho(false, true, true);
        this.a = hoVar;
        hoVar.setCallback(this);
        hoVar.n(0.3f, 165L, d53.h);
        hoVar.b = 1;
        hoVar.x(gm.o());
        hoVar.w(gm.L(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = hoVar.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(gm.N(0.6f));
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
        ho hoVar = this.a;
        if (z && TextUtils.equals(hoVar.i, concat)) {
            return;
        }
        hoVar.a();
        hoVar.t(concat, z, true);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        ho hoVar = this.a;
        Paint paint = this.b;
        if (paint != null) {
            paint.setStrokeWidth(gm.N(1.6f));
            RectF rectF = gm.P;
            float L = ((gm.L(24.0f) - hoVar.c()) / 2.0f) - gm.N(3.0f);
            float N = gm.N(0.2f) + ((gm.L(24.0f) - hoVar.e) / 2.0f);
            float c = hoVar.c();
            rectF.set(L, N, gm.N(3.0f) + ((c + gm.L(24.0f)) / 2.0f), (gm.L(24.0f) + hoVar.e) / 2.0f);
            canvas.drawRoundRect(rectF, gm.N(3.0f), gm.N(3.0f), paint);
        }
        hoVar.a.setStrokeWidth(gm.N(0.3f));
        hoVar.setBounds(0, (int) ((gm.L(24.0f) - hoVar.e) / 2.0f), gm.L(24.0f), (int) ((gm.L(24.0f) + hoVar.e) / 2.0f));
        hoVar.draw(canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(24.0f);
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
