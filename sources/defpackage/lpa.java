package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
public final class lpa extends Drawable {
    public final Paint a;
    public final LinearGradient[] b;
    public final Matrix c;
    public final lm d;
    public final Path e;
    public final vva f;
    public int g;
    public int h;

    public lpa() {
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        this.a = new Paint(1);
        this.b = new LinearGradient[2];
        this.c = new Matrix();
        this.d = new lm(1.0f, new z6a(this, (byte) 18), 0L, 420L, s33.h);
        this.e = new Path();
        this.f = new vva(1, 45);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(117440511);
        paint.setStrokeWidth(gl.N(1.0f));
        paint2.setStyle(style);
        paint2.setColor(301989887);
        paint2.setStrokeWidth(gl.N(0.6666667f));
    }

    public final void a(int i, int i2) {
        if (this.g == i && this.h == i2) {
            return;
        }
        LinearGradient[] linearGradientArr = this.b;
        linearGradientArr[0] = linearGradientArr[1];
        this.g = i;
        this.h = i2;
        linearGradientArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d.e(true, 0.0f);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        gl.P.set(getBounds());
        float L = gl.L(24.0f);
        int i = 0;
        float e = this.d.e(false, 1.0f);
        while (true) {
            LinearGradient[] linearGradientArr = this.b;
            if (i < linearGradientArr.length) {
                if (linearGradientArr[i] != null) {
                    float pow = (float) Math.pow(1.0f - Math.abs(i - e), 0.5d);
                    if (pow > 0.0f) {
                        Matrix matrix = this.c;
                        matrix.reset();
                        RectF rectF = gl.P;
                        matrix.postScale(rectF.width() / 100.0f, 1.0f);
                        linearGradientArr[i].setLocalMatrix(matrix);
                        LinearGradient linearGradient = linearGradientArr[i];
                        Paint paint = this.a;
                        paint.setShader(linearGradient);
                        paint.setAlpha((int) (pow * 255.0f));
                        canvas.drawRoundRect(rectF, L, L, paint);
                    }
                }
                i++;
            } else {
                Path path = this.e;
                path.rewind();
                RectF rectF2 = gl.P;
                path.addRoundRect(rectF2, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                vva vvaVar = this.f;
                vvaVar.g(rectF2);
                vvaVar.h = 30.0f;
                vvaVar.d();
                vvaVar.a(canvas, bkb.p1(0.6f, -1));
                invalidateSelf();
                canvas.restore();
                gl.P(canvas, rectF2, L);
                return;
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
