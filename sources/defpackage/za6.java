package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public final class za6 extends Drawable {
    public final Bitmap a;
    public final Paint b = new Paint(2);
    public long c;
    public LinearGradient d;
    public final Matrix e;
    public float f;
    public float g;
    public final de0 h;
    public int i;
    public int j;

    public za6(de0 de0Var, String str, int i, int i2) {
        Bitmap bitmap;
        try {
            Path b = hgb.b(str);
            bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            canvas.scale(i / 512.0f, i2 / 512.0f);
            Paint paint = new Paint();
            paint.setColor(-1);
            canvas.drawPath(b, paint);
        } catch (Exception e) {
            cc4.g(e, true);
            bitmap = null;
        }
        this.a = bitmap;
        this.h = de0Var;
        this.e = new Matrix();
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return;
        }
        int i = aob.h5;
        int i2 = aob.i5;
        int w0 = aob.w0(null, i, false);
        int w02 = aob.w0(null, i2, false);
        int i3 = this.i;
        Paint paint = this.b;
        Matrix matrix = this.e;
        if (i3 != w0 || this.j != w02) {
            this.i = w0;
            this.j = w02;
            int w03 = hl.w0(w02, w0);
            paint.setColor(w02);
            float L = hl.L(500.0f);
            this.g = L;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{w02, w03, w02}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.c = elapsedRealtime;
        this.f = qu6.d((float) abs, this.g, 1800.0f, this.f);
        while (true) {
            float f = this.f;
            float f2 = this.g * 2.0f;
            if (f >= f2) {
                this.f = f - f2;
            } else {
                matrix.setTranslate(f, 0.0f);
                this.d.setLocalMatrix(matrix);
                this.h.invalidate();
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
