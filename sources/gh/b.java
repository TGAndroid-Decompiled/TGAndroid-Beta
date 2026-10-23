package gh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import dh.f;
public final class b implements a {
    public final Paint f11069a;
    public final Matrix f11070b;
    public BitmapShader f11071c;
    public Bitmap d;
    public final Matrix e;
    public Bitmap f11072f;
    public int h;
    public int f11073n;

    public b() {
        Paint paint = new Paint(3);
        this.f11069a = paint;
        this.f11070b = new Matrix();
        this.e = new Matrix();
        paint.setFilterBitmap(true);
    }

    public final void a(Bitmap bitmap) {
        if (this.d != bitmap) {
            this.d = bitmap;
            Paint paint = this.f11069a;
            paint.setShader(null);
            this.f11071c = null;
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f11071c = bitmapShader;
                paint.setShader(bitmapShader);
                e();
            }
        }
    }

    public final void c(int i10, int i11) {
        if (this.h == i10 && this.f11073n == i11) {
            return;
        }
        this.h = i10;
        this.f11073n = i11;
        e();
    }

    @Override
    public final dh.d d() {
        return new f(this);
    }

    public final void e() {
        Bitmap bitmap = this.d;
        Matrix matrix = this.f11070b;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.d.getHeight();
        int i10 = this.h;
        int i11 = this.f11073n;
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
    public final void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        Bitmap bitmap = this.d;
        if (bitmap != null && !bitmap.isRecycled() && this.f11071c != null) {
            Matrix matrix = this.e;
            Matrix matrix2 = this.f11070b;
            matrix.set(matrix2);
            matrix.postTranslate(f7, f10);
            this.f11071c.setLocalMatrix(matrix2);
            canvas.drawRect(f7, f10, f11, f12, this.f11069a);
        }
    }

    @Override
    public final void b() {
    }
}
