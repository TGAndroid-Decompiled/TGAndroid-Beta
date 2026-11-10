package bi;

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
import org.telegram.ui.Components.wq;
public final class z5 extends View {
    public final Paint f5156a;
    public final Paint f5157b;
    public final Paint f5158c;
    public final RadialGradient[] d;
    public final Matrix f5159e;
    public final org.telegram.ui.Components.v5 f5160f;
    public final RadialGradient h;
    public final Path f5161n;
    public int f5162r;
    public int f5163s;

    public z5(Context context) {
        super(context);
        this.f5156a = new Paint(1);
        this.f5157b = new Paint(1);
        Paint paint = new Paint(1);
        this.f5158c = paint;
        this.d = new RadialGradient[2];
        this.f5159e = new Matrix();
        this.f5160f = new org.telegram.ui.Components.v5(1.0f, this, 0L, 420L, wq.h);
        this.h = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{0, -1, -1, 0}, new float[]{0.15f, 0.35f, 0.65f, 0.88f}, Shader.TileMode.CLAMP);
        this.f5161n = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final void a(int i7, int i10) {
        if (this.f5162r == i7 && this.f5163s == i10) {
            return;
        }
        RadialGradient[] radialGradientArr = this.d;
        radialGradientArr[0] = radialGradientArr[1];
        this.f5162r = i7;
        this.f5163s = i10;
        radialGradientArr[1] = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f5160f.e(true, 0.0f);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = 1.0f;
        float e10 = this.f5160f.e(false, 1.0f);
        float currentTimeMillis = (((float) (System.currentTimeMillis() % 15000)) / 15000.0f) * 360.0f;
        if (getAlpha() > 0.0f) {
            invalidate();
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f5157b;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        Path path = this.f5161n;
        path.rewind();
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = Math.min(getWidth(), getHeight()) / 2.0f;
        for (int i7 = 0; i7 < 6; i7++) {
            float d = rf.b.d(i7, 60.0f, 12.5f, currentTimeMillis);
            path.moveTo(width, height);
            double d2 = ((d - 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d2)) * min) + width, (((float) Math.sin(d2)) * min) + height);
            double d10 = ((d + 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d10)) * min) + width, (((float) Math.sin(d10)) * min) + height);
            path.lineTo(width, height);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        int i10 = 0;
        while (true) {
            RadialGradient[] radialGradientArr = this.d;
            int length = radialGradientArr.length;
            Matrix matrix = this.f5159e;
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
                        Paint paint2 = this.f5156a;
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
                Paint paint3 = this.f5158c;
                paint3.setShader(radialGradient2);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint3);
                canvas.restore();
                return;
            }
        }
    }
}
