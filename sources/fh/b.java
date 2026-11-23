package fh;

import a8.fa;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import java.lang.ref.WeakReference;
import org.telegram.ui.ActionBar.m6;
public final class b extends fa {
    public final Paint f11608a;
    public final Paint f11609b;
    public final Matrix f11610c;
    public WeakReference d;
    public BitmapShader f11611e;
    public final g f11612f;

    public b(g gVar) {
        this.f11612f = gVar;
        Paint paint = new Paint(1);
        this.f11608a = paint;
        this.f11609b = new Paint(1);
        this.f11610c = new Matrix();
        this.d = new WeakReference(null);
        paint.setFilterBitmap(true);
    }

    @Override
    public final void b(Canvas canvas, ui.a aVar) {
        ui.b bVar = (ui.b) g.v(aVar);
        g gVar = this.f11612f;
        int i7 = gVar.f56681c;
        Bitmap bitmap = bVar.d;
        Object obj = this.d.get();
        Paint paint = this.f11608a;
        if (bitmap != obj) {
            this.d = new WeakReference(bitmap);
            if (bitmap != null && !bitmap.isRecycled()) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f11611e = bitmapShader;
                paint.setShader(bitmapShader);
            } else {
                this.f11611e = null;
                paint.setShader(null);
            }
        }
        if (Color.alpha(gVar.f11667x) > 0) {
            gVar.f11658d0.c(canvas, 0);
        }
        if (this.f11611e != null && bitmap != null && !bitmap.isRecycled() && i7 > 0) {
            Matrix matrix = bVar.f59000b;
            Matrix matrix2 = this.f11610c;
            matrix2.set(matrix);
            matrix2.postTranslate(-gVar.d, -gVar.f56682e);
            this.f11611e.setLocalMatrix(matrix2);
            paint.setAlpha(i7);
            gVar.R.c(canvas, paint);
        }
        int r12 = m6.r1(i7 / 255.0f, gVar.f11668y);
        if (Color.alpha(r12) > 0) {
            Paint paint2 = this.f11609b;
            paint2.setColor(r12);
            gVar.R.c(canvas, paint2);
        }
    }
}
