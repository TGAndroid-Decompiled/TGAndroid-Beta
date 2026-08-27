package hh;

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
import org.telegram.ui.Components.er;

public final class c4 extends View {

    public final Paint f9070a;

    public final Paint f9071b;

    public final Paint f9072c;
    public final RadialGradient[] d;

    public final Matrix f9073e;

    public final org.telegram.ui.Components.y5 f9074f;
    public final RadialGradient h;

    public final Path f9075n;

    public int f9076r;

    public int f9077s;

    public c4(Context context) {
        super(context);
        this.f9070a = new Paint(1);
        this.f9071b = new Paint(1);
        Paint paint = new Paint(1);
        this.f9072c = paint;
        this.d = new RadialGradient[2];
        this.f9073e = new Matrix();
        this.f9074f = new org.telegram.ui.Components.y5(1.0f, this, 0L, 420L, er.h);
        this.h = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{0, -1, -1, 0}, new float[]{0.15f, 0.35f, 0.65f, 0.88f}, Shader.TileMode.CLAMP);
        this.f9075n = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final void a(int i10, int i11) {
        if (this.f9076r == i10 && this.f9077s == i11) {
            return;
        }
        RadialGradient[] radialGradientArr = this.d;
        radialGradientArr[0] = radialGradientArr[1];
        this.f9076r = i10;
        this.f9077s = i11;
        radialGradientArr[1] = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f9074f.d(0.0f, true);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i10 = 0;
        float fD = this.f9074f.d(1.0f, false);
        float fCurrentTimeMillis = ((System.currentTimeMillis() % 15000) / 15000.0f) * 360.0f;
        if (getAlpha() > 0.0f) {
            invalidate();
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint2 = this.f9071b;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Path path = this.f9075n;
        path.rewind();
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float fMin = Math.min(getWidth(), getHeight()) / 2.0f;
        for (int i11 = 0; i11 < 6; i11++) {
            float fD2 = com.google.android.recaptcha.internal.a.d(i11, 60.0f, 12.5f, fCurrentTimeMillis);
            path.moveTo(width, height);
            double d = ((double) ((fD2 - 12.5f) / 180.0f)) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d)) * fMin) + width, (((float) Math.sin(d)) * fMin) + height);
            double d10 = ((double) ((fD2 + 12.5f) / 180.0f)) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d10)) * fMin) + width, (((float) Math.sin(d10)) * fMin) + height);
            path.lineTo(width, height);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        while (true) {
            RadialGradient[] radialGradientArr = this.d;
            int length = radialGradientArr.length;
            Matrix matrix = this.f9073e;
            if (i10 >= length) {
                matrix.reset();
                float f10 = fMin / 100.0f;
                matrix.postScale(f10, f10);
                matrix.postTranslate(width, height);
                RadialGradient radialGradient = this.h;
                radialGradient.setLocalMatrix(matrix);
                Paint paint3 = this.f9072c;
                paint3.setShader(radialGradient);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint3);
                canvas.restore();
                return;
            }
            if (radialGradientArr[i10] == null) {
                paint = paint2;
            } else {
                paint = paint2;
                float fPow = (float) Math.pow(1.0f - Math.abs(i10 - fD), 0.5d);
                if (fPow > 0.0f) {
                    matrix.reset();
                    float f11 = fMin / 100.0f;
                    matrix.postScale(f11, f11);
                    matrix.postTranslate(width, height);
                    radialGradientArr[i10].setLocalMatrix(matrix);
                    RadialGradient radialGradient2 = radialGradientArr[i10];
                    Paint paint4 = this.f9070a;
                    paint4.setShader(radialGradient2);
                    float f12 = fPow * 255.0f;
                    paint4.setAlpha((int) (0.3f * f12));
                    paint.setShader(radialGradientArr[i10]);
                    paint.setAlpha((int) f12);
                    canvas.drawPath(path, paint4);
                    canvas.drawPath(path, paint);
                }
            }
            i10++;
            paint2 = paint;
        }
    }
}
