package ci;

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
import org.telegram.ui.Components.xq;
public final class d5 extends View {
    public final Paint f4965a;
    public final Paint f4966b;
    public final Paint f4967c;
    public final RadialGradient[] d;
    public final Matrix f4968e;
    public final org.telegram.ui.Components.u5 f4969f;
    public final RadialGradient h;
    public final Path f4970n;
    public int f4971r;
    public int f4972s;

    public d5(Context context) {
        super(context);
        this.f4965a = new Paint(1);
        this.f4966b = new Paint(1);
        Paint paint = new Paint(1);
        this.f4967c = paint;
        this.d = new RadialGradient[2];
        this.f4968e = new Matrix();
        this.f4969f = new org.telegram.ui.Components.u5(1.0f, this, 0L, 420L, xq.h);
        this.h = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{0, -1, -1, 0}, new float[]{0.15f, 0.35f, 0.65f, 0.88f}, Shader.TileMode.CLAMP);
        this.f4970n = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final void a(int i3, int i10) {
        if (this.f4971r == i3 && this.f4972s == i10) {
            return;
        }
        RadialGradient[] radialGradientArr = this.d;
        radialGradientArr[0] = radialGradientArr[1];
        this.f4971r = i3;
        this.f4972s = i10;
        radialGradientArr[1] = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{i3, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f4969f.e(true, 0.0f);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = 1.0f;
        float e10 = this.f4969f.e(false, 1.0f);
        float currentTimeMillis = (((float) (System.currentTimeMillis() % 15000)) / 15000.0f) * 360.0f;
        if (getAlpha() > 0.0f) {
            invalidate();
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f4966b;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        Path path = this.f4970n;
        path.rewind();
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = Math.min(getWidth(), getHeight()) / 2.0f;
        for (int i3 = 0; i3 < 6; i3++) {
            float c2 = t4.c.c(i3, 60.0f, 12.5f, currentTimeMillis);
            path.moveTo(width, height);
            double d = ((c2 - 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d)) * min) + width, (((float) Math.sin(d)) * min) + height);
            double d10 = ((c2 + 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d10)) * min) + width, (((float) Math.sin(d10)) * min) + height);
            path.lineTo(width, height);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        int i10 = 0;
        while (true) {
            RadialGradient[] radialGradientArr = this.d;
            int length = radialGradientArr.length;
            Matrix matrix = this.f4968e;
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
                        Paint paint2 = this.f4965a;
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
                Paint paint3 = this.f4967c;
                paint3.setShader(radialGradient2);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint3);
                canvas.restore();
                return;
            }
        }
    }
}
