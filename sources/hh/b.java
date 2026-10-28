package hh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import eh.f;
public final class b implements a {
    public final Paint f12830a;
    public final Matrix f12831b;
    public BitmapShader f12832c;
    public Bitmap d;
    public final Matrix e;
    public Bitmap f12833f;
    public int h;
    public int f12834n;

    public b() {
        Paint paint = new Paint(3);
        this.f12830a = paint;
        this.f12831b = new Matrix();
        this.e = new Matrix();
        paint.setFilterBitmap(true);
    }

    public final void a(Bitmap bitmap) {
        if (this.d != bitmap) {
            this.d = bitmap;
            Paint paint = this.f12830a;
            paint.setShader(null);
            this.f12832c = null;
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f12832c = bitmapShader;
                paint.setShader(bitmapShader);
                c();
            }
        }
    }

    public final void b(int i10, int i11) {
        if (this.h == i10 && this.f12834n == i11) {
            return;
        }
        this.h = i10;
        this.f12834n = i11;
        c();
    }

    public final void c() {
        Bitmap bitmap = this.d;
        Matrix matrix = this.f12831b;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.d.getHeight();
        int i10 = this.h;
        int i11 = this.f12834n;
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
    public final eh.d f() {
        return new f(this);
    }

    @Override
    public final void w(Canvas canvas, float f7, float f10, float f11, float f12) {
        Bitmap bitmap = this.d;
        if (bitmap != null && !bitmap.isRecycled() && this.f12832c != null) {
            Matrix matrix = this.e;
            Matrix matrix2 = this.f12831b;
            matrix.set(matrix2);
            matrix.postTranslate(f7, f10);
            this.f12832c.setLocalMatrix(matrix2);
            canvas.drawRect(f7, f10, f11, f12, this.f12830a);
        }
    }
}
