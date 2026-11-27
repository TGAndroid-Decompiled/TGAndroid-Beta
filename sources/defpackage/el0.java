package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import java.lang.ref.WeakReference;
public final class el0 extends ctd {
    public final Paint a;
    public final Paint b;
    public final Matrix c;
    public WeakReference d;
    public BitmapShader e;
    public final jl0 f;

    public el0(jl0 jl0Var) {
        this.f = jl0Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Matrix();
        this.d = new WeakReference(null);
        paint.setFilterBitmap(true);
    }

    @Override
    public final void b(Canvas canvas, mz4 mz4Var) {
        nz4 nz4Var = (nz4) jl0.v(mz4Var);
        jl0 jl0Var = this.f;
        il0 il0Var = jl0Var.S;
        int i = jl0Var.c;
        Bitmap bitmap = nz4Var.d;
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
        if (Color.alpha(jl0Var.x) > 0) {
            jl0Var.e0.c(canvas, 0);
        }
        if (this.e != null && bitmap != null && !bitmap.isRecycled() && i > 0) {
            Matrix matrix = nz4Var.b;
            Matrix matrix2 = this.c;
            matrix2.set(matrix);
            matrix2.postTranslate(-jl0Var.d, -jl0Var.e);
            this.e.setLocalMatrix(matrix2);
            paint.setAlpha(i);
            il0Var.c(canvas, paint);
        }
        int p1 = aob.p1(i / 255.0f, jl0Var.y);
        if (Color.alpha(p1) > 0) {
            Paint paint2 = this.b;
            paint2.setColor(p1);
            il0Var.c(canvas, paint2);
        }
    }
}
