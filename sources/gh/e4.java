package gh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
public final class e4 extends View {
    public final Paint f8010a;
    public final Paint f8011b;
    public final Paint f8012c;
    public final RadialGradient[] d;
    public final Matrix f8013e;
    public final org.telegram.ui.Components.y5 f8014f;
    public final RadialGradient h;
    public final Path f8015n;
    public int f8016r;
    public int f8017s;

    public e4(Context context) {
        super(context);
        this.f8010a = new Paint(1);
        this.f8011b = new Paint(1);
        Paint paint = new Paint(1);
        this.f8012c = paint;
        this.d = new RadialGradient[2];
        this.f8013e = new Matrix();
        this.f8014f = new org.telegram.ui.Components.y5(1.0f, this, 0L, 420L, gr.h);
        this.h = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{0, -1, -1, 0}, new float[]{0.15f, 0.35f, 0.65f, 0.88f}, Shader.TileMode.CLAMP);
        this.f8015n = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final void a(int i9, int i10) {
        if (this.f8016r == i9 && this.f8017s == i10) {
            return;
        }
        RadialGradient[] radialGradientArr = this.d;
        radialGradientArr[0] = radialGradientArr[1];
        this.f8016r = i9;
        this.f8017s = i10;
        radialGradientArr[1] = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{i9, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f8014f.d(0.0f, true);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i9 = 0;
        float d = this.f8014f.d(1.0f, false);
        float currentTimeMillis = (((float) (System.currentTimeMillis() % 15000)) / 15000.0f) * 360.0f;
        if (getAlpha() > 0.0f) {
            invalidate();
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint2 = this.f8011b;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Path path = this.f8015n;
        path.rewind();
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = Math.min(getWidth(), getHeight()) / 2.0f;
        for (int i10 = 0; i10 < 6; i10++) {
            float w8 = aa.d.w(i10, 60.0f, 12.5f, currentTimeMillis);
            path.moveTo(width, height);
            double d9 = ((w8 - 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d9)) * min) + width, (((float) Math.sin(d9)) * min) + height);
            double d10 = ((w8 + 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d10)) * min) + width, (((float) Math.sin(d10)) * min) + height);
            path.lineTo(width, height);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        while (true) {
            RadialGradient[] radialGradientArr = this.d;
            int length = radialGradientArr.length;
            Matrix matrix = this.f8013e;
            if (i9 < length) {
                if (radialGradientArr[i9] == null) {
                    paint = paint2;
                } else {
                    paint = paint2;
                    float pow = (float) Math.pow(1.0f - Math.abs(i9 - d), 0.5d);
                    if (pow > 0.0f) {
                        matrix.reset();
                        float f10 = min / 100.0f;
                        matrix.postScale(f10, f10);
                        matrix.postTranslate(width, height);
                        radialGradientArr[i9].setLocalMatrix(matrix);
                        RadialGradient radialGradient = radialGradientArr[i9];
                        Paint paint3 = this.f8010a;
                        paint3.setShader(radialGradient);
                        float f11 = pow * 255.0f;
                        paint3.setAlpha((int) (0.3f * f11));
                        paint.setShader(radialGradientArr[i9]);
                        paint.setAlpha((int) f11);
                        canvas.drawPath(path, paint3);
                        canvas.drawPath(path, paint);
                    }
                }
                i9++;
                paint2 = paint;
            } else {
                matrix.reset();
                float f12 = min / 100.0f;
                matrix.postScale(f12, f12);
                matrix.postTranslate(width, height);
                RadialGradient radialGradient2 = this.h;
                radialGradient2.setLocalMatrix(matrix);
                Paint paint4 = this.f8012c;
                paint4.setShader(radialGradient2);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint4);
                canvas.restore();
                return;
            }
        }
    }
}
