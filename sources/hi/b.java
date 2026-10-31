package hi;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
public final class b implements a {
    public final Paint f7705a;
    public final Matrix f7706b;
    public BitmapShader f7707c;
    public Bitmap d;
    public final Matrix e;
    public Bitmap f7708f;
    public int h;
    public int f7709n;

    public b() {
        Paint paint = new Paint(3);
        this.f7705a = paint;
        this.f7706b = new Matrix();
        this.e = new Matrix();
        paint.setFilterBitmap(true);
    }

    public final void a(Bitmap bitmap) {
        if (this.d != bitmap) {
            this.d = bitmap;
            Paint paint = this.f7705a;
            paint.setShader(null);
            this.f7707c = null;
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f7707c = bitmapShader;
                paint.setShader(bitmapShader);
                c();
            }
        }
    }

    public final void b(int i10, int i11) {
        if (this.h == i10 && this.f7709n == i11) {
            return;
        }
        this.h = i10;
        this.f7709n = i11;
        c();
    }

    public final void c() {
        Bitmap bitmap = this.d;
        Matrix matrix = this.f7706b;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.d.getHeight();
        int i10 = this.h;
        int i11 = this.f7709n;
        matrix.reset();
        if (width > 0 && height > 0 && i10 > 0 && i11 > 0) {
            float f7 = i10;
            float f10 = width;
            float f11 = i11;
            float f12 = height;
            float max = Math.max(f7 / f10, f11 / f12);
            matrix.setScale(max, max);
            matrix.postTranslate((f7 - (f10 * max)) * 0.5f, ((f11 - (f12 * max)) * 0.5f) + 0);
        }
    }

    @Override
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        Bitmap bitmap = this.d;
        if (bitmap != null && !bitmap.isRecycled() && this.f7707c != null) {
            Matrix matrix = this.e;
            Matrix matrix2 = this.f7706b;
            matrix.set(matrix2);
            matrix.postTranslate(f7, f10);
            this.f7707c.setLocalMatrix(matrix2);
            canvas.drawRect(f7, f10, f11, f12, this.f7705a);
        }
    }
}
