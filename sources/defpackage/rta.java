package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
public final class rta extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final RadialGradient[] d;
    public final Matrix e;
    public final mm f;
    public final RadialGradient h;
    public final Path n;
    public int r;
    public int s;

    public rta(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new RadialGradient[2];
        this.e = new Matrix();
        this.f = new mm(1.0f, this, 0L, 420L, k43.h);
        this.h = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{0, -1, -1, 0}, new float[]{0.15f, 0.35f, 0.65f, 0.88f}, Shader.TileMode.CLAMP);
        this.n = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final void a(int i, int i2) {
        if (this.r == i && this.s == i2) {
            return;
        }
        RadialGradient[] radialGradientArr = this.d;
        radialGradientArr[0] = radialGradientArr[1];
        this.r = i;
        this.s = i2;
        radialGradientArr[1] = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f.e(true, 0.0f);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2 = 1.0f;
        float e = this.f.e(false, 1.0f);
        float currentTimeMillis = (((float) (System.currentTimeMillis() % 15000)) / 15000.0f) * 360.0f;
        if (getAlpha() > 0.0f) {
            invalidate();
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.b;
        paint.setStyle(style);
        paint.setStrokeWidth(hl.L(2.0f));
        Path path = this.n;
        path.rewind();
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = Math.min(getWidth(), getHeight()) / 2.0f;
        for (int i = 0; i < 6; i++) {
            float i2 = bs2.i(i, 60.0f, 12.5f, currentTimeMillis);
            path.moveTo(width, height);
            double d = ((i2 - 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d)) * min) + width, (((float) Math.sin(d)) * min) + height);
            double d2 = ((i2 + 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d2)) * min) + width, (((float) Math.sin(d2)) * min) + height);
            path.lineTo(width, height);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        int i3 = 0;
        while (true) {
            RadialGradient[] radialGradientArr = this.d;
            int length = radialGradientArr.length;
            Matrix matrix = this.e;
            if (i3 < length) {
                if (radialGradientArr[i3] == null) {
                    f = e;
                } else {
                    f = e;
                    float pow = (float) Math.pow(f2 - Math.abs(i3 - e), 0.5d);
                    if (pow > 0.0f) {
                        matrix.reset();
                        float f3 = min / 100.0f;
                        matrix.postScale(f3, f3);
                        matrix.postTranslate(width, height);
                        radialGradientArr[i3].setLocalMatrix(matrix);
                        RadialGradient radialGradient = radialGradientArr[i3];
                        Paint paint2 = this.a;
                        paint2.setShader(radialGradient);
                        float f4 = pow * 255.0f;
                        paint2.setAlpha((int) (0.3f * f4));
                        paint.setShader(radialGradientArr[i3]);
                        paint.setAlpha((int) f4);
                        canvas.drawPath(path, paint2);
                        canvas.drawPath(path, paint);
                    }
                }
                i3++;
                e = f;
                f2 = 1.0f;
            } else {
                matrix.reset();
                float f5 = min / 100.0f;
                matrix.postScale(f5, f5);
                matrix.postTranslate(width, height);
                RadialGradient radialGradient2 = this.h;
                radialGradient2.setLocalMatrix(matrix);
                Paint paint3 = this.c;
                paint3.setShader(radialGradient2);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint3);
                canvas.restore();
                return;
            }
        }
    }
}
