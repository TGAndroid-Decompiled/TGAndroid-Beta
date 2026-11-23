package di;

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
import org.telegram.ui.Components.kr;
public final class x4 extends View {
    public final Paint f9995a;
    public final Paint f9996b;
    public final Paint f9997c;
    public final RadialGradient[] d;
    public final Matrix f9998e;
    public final org.telegram.ui.Components.c6 f9999f;
    public final RadialGradient h;
    public final Path f10000n;
    public int f10001r;
    public int f10002s;

    public x4(Context context) {
        super(context);
        this.f9995a = new Paint(1);
        this.f9996b = new Paint(1);
        Paint paint = new Paint(1);
        this.f9997c = paint;
        this.d = new RadialGradient[2];
        this.f9998e = new Matrix();
        this.f9999f = new org.telegram.ui.Components.c6(1.0f, this, 0L, 420L, kr.h);
        this.h = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{0, -1, -1, 0}, new float[]{0.15f, 0.35f, 0.65f, 0.88f}, Shader.TileMode.CLAMP);
        this.f10000n = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final void a(int i7, int i10) {
        if (this.f10001r == i7 && this.f10002s == i10) {
            return;
        }
        RadialGradient[] radialGradientArr = this.d;
        radialGradientArr[0] = radialGradientArr[1];
        this.f10001r = i7;
        this.f10002s = i10;
        radialGradientArr[1] = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f9999f.e(true, 0.0f);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = 1.0f;
        float e10 = this.f9999f.e(false, 1.0f);
        float currentTimeMillis = (((float) (System.currentTimeMillis() % 15000)) / 15000.0f) * 360.0f;
        if (getAlpha() > 0.0f) {
            invalidate();
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f9996b;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        Path path = this.f10000n;
        path.rewind();
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = Math.min(getWidth(), getHeight()) / 2.0f;
        for (int i7 = 0; i7 < 6; i7++) {
            float e11 = p5.c.e(i7, 60.0f, 12.5f, currentTimeMillis);
            path.moveTo(width, height);
            double d = ((e11 - 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d)) * min) + width, (((float) Math.sin(d)) * min) + height);
            double d2 = ((e11 + 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d2)) * min) + width, (((float) Math.sin(d2)) * min) + height);
            path.lineTo(width, height);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        int i10 = 0;
        while (true) {
            RadialGradient[] radialGradientArr = this.d;
            int length = radialGradientArr.length;
            Matrix matrix = this.f9998e;
            if (i10 < length) {
                if (radialGradientArr[i10] == null) {
                    f10 = e10;
                } else {
                    f10 = e10;
                    float pow = (float) Math.pow(f11 - Math.abs(i10 - e10), 0.5d);
                    if (pow > 0.0f) {
                        matrix.reset();
                        float f12 = min / 100.0f;
                        matrix.postScale(f12, f12);
                        matrix.postTranslate(width, height);
                        radialGradientArr[i10].setLocalMatrix(matrix);
                        RadialGradient radialGradient = radialGradientArr[i10];
                        Paint paint2 = this.f9995a;
                        paint2.setShader(radialGradient);
                        float f13 = pow * 255.0f;
                        paint2.setAlpha((int) (0.3f * f13));
                        paint.setShader(radialGradientArr[i10]);
                        paint.setAlpha((int) f13);
                        canvas.drawPath(path, paint2);
                        canvas.drawPath(path, paint);
                    }
                }
                i10++;
                e10 = f10;
                f11 = 1.0f;
            } else {
                matrix.reset();
                float f14 = min / 100.0f;
                matrix.postScale(f14, f14);
                matrix.postTranslate(width, height);
                RadialGradient radialGradient2 = this.h;
                radialGradient2.setLocalMatrix(matrix);
                Paint paint3 = this.f9997c;
                paint3.setShader(radialGradient2);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint3);
                canvas.restore();
                return;
            }
        }
    }
}
