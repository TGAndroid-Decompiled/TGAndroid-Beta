package og;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import lg.f;

public final class b implements a {

    public final Paint f19443a;

    public final Matrix f19444b;

    public BitmapShader f19445c;
    public Bitmap d;

    public final Matrix f19446e;

    public Bitmap f19447f;
    public int h;

    public int f19448n;

    public b() {
        Paint paint = new Paint(3);
        this.f19443a = paint;
        this.f19444b = new Matrix();
        this.f19446e = new Matrix();
        paint.setFilterBitmap(true);
    }

    @Override
    public final void T0(Canvas canvas, float f10, float f11, float f12, float f13) {
        Bitmap bitmap = this.d;
        if (bitmap == null || bitmap.isRecycled() || this.f19445c == null) {
            return;
        }
        Matrix matrix = this.f19446e;
        Matrix matrix2 = this.f19444b;
        matrix.set(matrix2);
        matrix.postTranslate(f10, f11);
        this.f19445c.setLocalMatrix(matrix2);
        canvas.drawRect(f10, f11, f12, f13, this.f19443a);
    }

    public final void a(Bitmap bitmap) {
        if (this.d == bitmap) {
            return;
        }
        this.d = bitmap;
        Paint paint = this.f19443a;
        paint.setShader(null);
        this.f19445c = null;
        if (bitmap != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f19445c = bitmapShader;
            paint.setShader(bitmapShader);
            c();
        }
    }

    public final void b(int i10, int i11) {
        if (this.h == i10 && this.f19448n == i11) {
            return;
        }
        this.h = i10;
        this.f19448n = i11;
        c();
    }

    public final void c() {
        Bitmap bitmap = this.d;
        Matrix matrix = this.f19444b;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.d.getHeight();
        int i10 = this.h;
        int i11 = this.f19448n;
        matrix.reset();
        if (width <= 0 || height <= 0 || i10 <= 0 || i11 <= 0) {
            return;
        }
        float f10 = i10;
        float f11 = width;
        float f12 = i11;
        float f13 = height;
        float fMax = Math.max(f10 / f11, f12 / f13);
        matrix.setScale(fMax, fMax);
        matrix.postTranslate((f10 - (f11 * fMax)) * 0.5f, ((f12 - (f13 * fMax)) * 0.5f) + 0);
    }

    @Override
    public final lg.d w() {
        return new f(this);
    }

    @Override
    public final void r() {
    }
}
