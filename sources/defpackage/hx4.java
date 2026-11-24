package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
public final class hx4 implements gx4 {
    public final Paint a;
    public final Matrix b;
    public BitmapShader c;
    public Bitmap d;
    public final Matrix e;
    public Bitmap f;
    public int h;
    public int n;

    public hx4() {
        Paint paint = new Paint(3);
        this.a = paint;
        this.b = new Matrix();
        this.e = new Matrix();
        paint.setFilterBitmap(true);
    }

    public final void a(Bitmap bitmap) {
        if (this.d != bitmap) {
            this.d = bitmap;
            Paint paint = this.a;
            paint.setShader(null);
            this.c = null;
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.c = bitmapShader;
                paint.setShader(bitmapShader);
                c();
            }
        }
    }

    public final void b(int i, int i2) {
        if (this.h == i && this.n == i2) {
            return;
        }
        this.h = i;
        this.n = i2;
        c();
    }

    public final void c() {
        Bitmap bitmap = this.d;
        Matrix matrix = this.b;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.d.getHeight();
        int i = this.h;
        int i2 = this.n;
        matrix.reset();
        if (width > 0 && height > 0 && i > 0 && i2 > 0) {
            float f = i;
            float f2 = width;
            float f3 = i2;
            float f4 = height;
            float max = Math.max(f / f2, f3 / f4);
            matrix.setScale(max, max);
            matrix.postTranslate((f - (f2 * max)) * 0.5f, ((f3 - (f4 * max)) * 0.5f) + 0.0f);
        }
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        Bitmap bitmap = this.d;
        if (bitmap != null && !bitmap.isRecycled() && this.c != null) {
            Matrix matrix = this.e;
            Matrix matrix2 = this.b;
            matrix.set(matrix2);
            matrix.postTranslate(f, f2);
            this.c.setLocalMatrix(matrix2);
            canvas.drawRect(f, f2, f3, f4, this.a);
        }
    }
}
