package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import java.lang.ref.WeakReference;
public final class dm0 extends pqd {
    public final Paint a;
    public final Paint b;
    public final Matrix c;
    public WeakReference d;
    public BitmapShader e;
    public final im0 f;

    public dm0(im0 im0Var) {
        this.f = im0Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Matrix();
        this.d = new WeakReference(null);
        paint.setFilterBitmap(true);
    }

    @Override
    public final void b(Canvas canvas, iz4 iz4Var) {
        jz4 jz4Var = (jz4) im0.v(iz4Var);
        im0 im0Var = this.f;
        hm0 hm0Var = im0Var.S;
        int i = im0Var.c;
        Bitmap bitmap = jz4Var.d;
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
        if (Color.alpha(im0Var.x) > 0) {
            im0Var.e0.c(canvas, 0);
        }
        if (this.e != null && bitmap != null && !bitmap.isRecycled() && i > 0) {
            Matrix matrix = jz4Var.b;
            Matrix matrix2 = this.c;
            matrix2.set(matrix);
            matrix2.postTranslate(-im0Var.d, -im0Var.e);
            this.e.setLocalMatrix(matrix2);
            paint.setAlpha(i);
            hm0Var.c(canvas, paint);
        }
        int p1 = cmb.p1(i / 255.0f, im0Var.y);
        if (Color.alpha(p1) > 0) {
            Paint paint2 = this.b;
            paint2.setColor(p1);
            hm0Var.c(canvas, paint2);
        }
    }
}
