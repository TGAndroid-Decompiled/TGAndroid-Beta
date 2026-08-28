package ng;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import kg.f;
public final class b implements a {
    public final Paint f18594a;
    public final Matrix f18595b;
    public BitmapShader f18596c;
    public Bitmap d;
    public final Matrix f18597e;
    public Bitmap f18598f;
    public int h;
    public int f18599n;

    public b() {
        Paint paint = new Paint(3);
        this.f18594a = paint;
        this.f18595b = new Matrix();
        this.f18597e = new Matrix();
        paint.setFilterBitmap(true);
    }

    @Override
    public final void T0(Canvas canvas, float f10, float f11, float f12, float f13) {
        Bitmap bitmap = this.d;
        if (bitmap != null && !bitmap.isRecycled() && this.f18596c != null) {
            Matrix matrix = this.f18597e;
            Matrix matrix2 = this.f18595b;
            matrix.set(matrix2);
            matrix.postTranslate(f10, f11);
            this.f18596c.setLocalMatrix(matrix2);
            canvas.drawRect(f10, f11, f12, f13, this.f18594a);
        }
    }

    public final void a(Bitmap bitmap) {
        if (this.d != bitmap) {
            this.d = bitmap;
            Paint paint = this.f18594a;
            paint.setShader(null);
            this.f18596c = null;
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f18596c = bitmapShader;
                paint.setShader(bitmapShader);
                c();
            }
        }
    }

    public final void b(int i9, int i10) {
        if (this.h == i9 && this.f18599n == i10) {
            return;
        }
        this.h = i9;
        this.f18599n = i10;
        c();
    }

    public final void c() {
        Bitmap bitmap = this.d;
        Matrix matrix = this.f18595b;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.d.getHeight();
        int i9 = this.h;
        int i10 = this.f18599n;
        matrix.reset();
        if (width > 0 && height > 0 && i9 > 0 && i10 > 0) {
            float f10 = i9;
            float f11 = width;
            float f12 = i10;
            float f13 = height;
            float max = Math.max(f10 / f11, f12 / f13);
            matrix.setScale(max, max);
            matrix.postTranslate((f10 - (f11 * max)) * 0.5f, ((f12 - (f13 * max)) * 0.5f) + 0);
        }
    }

    @Override
    public final kg.d y() {
        return new f(this);
    }

    @Override
    public final void t() {
    }
}
