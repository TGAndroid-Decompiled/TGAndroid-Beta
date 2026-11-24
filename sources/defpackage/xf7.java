package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class xf7 extends Drawable {
    public wf7 a;
    public final Paint b;
    public int c;
    public int d;
    public final long e;
    public int f;

    public xf7() {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = 255;
        this.d = 255;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(gl.L(1.0f));
        this.e = System.currentTimeMillis();
    }

    public final void a(int i) {
        if (i != this.f) {
            int alpha = Color.alpha(i);
            this.d = alpha;
            this.b.setColor(bm2.o(i, (int) ((alpha / 255.0f) * this.c)));
        }
        this.f = i;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int min = Math.min(bounds.width(), bounds.height());
        Paint paint = this.b;
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), (min >> 1) - gl.L(0.5f), paint);
        long currentTimeMillis = System.currentTimeMillis();
        canvas.save();
        long j = this.e;
        canvas.rotate(((((float) (currentTimeMillis - j)) % 1500.0f) * 360.0f) / 1500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), bounds.centerX(), bounds.centerY() - gl.L(3.0f), paint);
        canvas.restore();
        canvas.save();
        canvas.rotate(((((float) (currentTimeMillis - j)) % 4500.0f) * 360.0f) / 4500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), gl.L(2.3f) + bounds.centerX(), bounds.centerY(), paint);
        canvas.restore();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        wf7 wf7Var = this.a;
        if (wf7Var == null) {
            ?? constantState = new Drawable.ConstantState();
            this.a = constantState;
            return constantState;
        }
        return wf7Var;
    }

    @Override
    public final int getIntrinsicHeight() {
        return gl.L(12.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gl.L(12.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        if (this.c != i) {
            this.c = i;
            float f = this.d / 255.0f;
            this.b.setAlpha((int) (f * i));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
