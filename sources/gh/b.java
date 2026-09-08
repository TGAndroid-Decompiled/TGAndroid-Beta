package gh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import dh.f;
public final class b implements a {
    public final Paint f10674a;
    public final Matrix f10675b;
    public BitmapShader f10676c;
    public Bitmap d;
    public final Matrix f10677e;
    public Bitmap f10678f;
    public int h;
    public int f10679n;

    public b() {
        Paint paint = new Paint(3);
        this.f10674a = paint;
        this.f10675b = new Matrix();
        this.f10677e = new Matrix();
        paint.setFilterBitmap(true);
    }

    public final void a(Bitmap bitmap) {
        if (this.d != bitmap) {
            this.d = bitmap;
            Paint paint = this.f10674a;
            paint.setShader(null);
            this.f10676c = null;
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f10676c = bitmapShader;
                paint.setShader(bitmapShader);
                c();
            }
        }
    }

    public final void b(int i10, int i11) {
        if (this.h == i10 && this.f10679n == i11) {
            return;
        }
        this.h = i10;
        this.f10679n = i11;
        c();
    }

    public final void c() {
        Bitmap bitmap = this.d;
        Matrix matrix = this.f10675b;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.d.getHeight();
        int i10 = this.h;
        int i11 = this.f10679n;
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
    public final dh.d k() {
        return new f(this);
    }

    @Override
    public final void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        Bitmap bitmap = this.d;
        if (bitmap != null && !bitmap.isRecycled() && this.f10676c != null) {
            Matrix matrix = this.f10677e;
            Matrix matrix2 = this.f10675b;
            matrix.set(matrix2);
            matrix.postTranslate(f7, f10);
            this.f10676c.setLocalMatrix(matrix2);
            canvas.drawRect(f7, f10, f11, f12, this.f10674a);
        }
    }

    @Override
    public final void e() {
    }
}
