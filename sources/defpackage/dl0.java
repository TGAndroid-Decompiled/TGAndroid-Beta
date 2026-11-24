package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import java.lang.ref.WeakReference;
public final class dl0 extends mod {
    public final Paint a;
    public final Paint b;
    public final Matrix c;
    public WeakReference d;
    public BitmapShader e;
    public final il0 f;

    public dl0(il0 il0Var) {
        this.f = il0Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Matrix();
        this.d = new WeakReference(null);
        paint.setFilterBitmap(true);
    }

    @Override
    public final void b(Canvas canvas, gx4 gx4Var) {
        hx4 hx4Var = (hx4) il0.v(gx4Var);
        il0 il0Var = this.f;
        hl0 hl0Var = il0Var.S;
        int i = il0Var.c;
        Bitmap bitmap = hx4Var.d;
        Object obj = this.d.get();
        Paint paint = this.a;
        if (bitmap != obj) {
            this.d = new WeakReference(bitmap);
            if (bitmap != null && !bitmap.isRecycled()) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.e = bitmapShader;
                paint.setShader(bitmapShader);
            } else {
                this.e = null;
                paint.setShader(null);
            }
        }
        if (Color.alpha(il0Var.x) > 0) {
            il0Var.e0.c(canvas, 0);
        }
        if (this.e != null && bitmap != null && !bitmap.isRecycled() && i > 0) {
            Matrix matrix = hx4Var.b;
            Matrix matrix2 = this.c;
            matrix2.set(matrix);
            matrix2.postTranslate(-il0Var.d, -il0Var.e);
            this.e.setLocalMatrix(matrix2);
            paint.setAlpha(i);
            hl0Var.c(canvas, paint);
        }
        int p1 = bkb.p1(i / 255.0f, il0Var.y);
        if (Color.alpha(p1) > 0) {
            Paint paint2 = this.b;
            paint2.setColor(p1);
            hl0Var.c(canvas, paint2);
        }
    }
}
