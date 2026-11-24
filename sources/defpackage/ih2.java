package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public class ih2 extends Drawable {
    public static final c84 h = new c84();
    public float a;
    public final float b;
    public long c;
    public final float[] d;
    public final Paint e;
    public float f;
    public final RectF g;

    public ih2(float f, float f2, int i) {
        this.a = gl.L(18.0f);
        this.b = gl.L(2.25f);
        this.c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.g = new RectF();
        this.a = f;
        this.b = f2;
        b(i);
    }

    public static void a(float f, float[] fArr) {
        int i;
        float f2 = (1520.0f * f) / 5400.0f;
        fArr[0] = Math.max(0.0f, f2 - 20.0f);
        fArr[1] = f2;
        for (int i2 = 0; i2 < 4; i2++) {
            c84 c84Var = h;
            fArr[1] = (c84Var.getInterpolation((f - (i2 * 1350)) / 667.0f) * 250.0f) + fArr[1];
            fArr[0] = (c84Var.getInterpolation((f - (i + 667)) / 667.0f) * 250.0f) + fArr[0];
        }
    }

    public final void b(int i) {
        this.e.setColor(i);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.c < 0) {
            this.c = SystemClock.elapsedRealtime();
        }
        float[] fArr = this.d;
        a((float) ((SystemClock.elapsedRealtime() - this.c) % 5400), fArr);
        float f = this.f;
        float f2 = fArr[0];
        Paint paint = this.e;
        canvas.drawArc(this.g, f + f2, fArr[1] - f2, false, paint);
        invalidateSelf();
    }

    @Override
    public int getIntrinsicHeight() {
        return (int) (this.a + this.b);
    }

    @Override
    public int getIntrinsicWidth() {
        return (int) (this.a + this.b);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.e.setAlpha(i);
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        float f = i;
        float f2 = i3 - i;
        float f3 = this.b;
        float f4 = this.a;
        float f5 = i2;
        float f6 = i4 - i2;
        this.g.set(oo1.z(f2 - (f3 / 2.0f), f4, 2.0f, f), (((f6 - (f3 / 2.0f)) - f4) / 2.0f) + f5, ((((f3 / 2.0f) + f2) + f4) / 2.0f) + f, ((((f3 / 2.0f) + f6) + f4) / 2.0f) + f5);
        super.setBounds(i, i2, i3, i4);
        this.e.setStrokeWidth(f3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public ih2(int i) {
        this.a = gl.L(18.0f);
        this.b = gl.L(2.25f);
        this.c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.g = new RectF();
        b(i);
    }
}
