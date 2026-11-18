package fh;

import a8.ea;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import java.lang.ref.WeakReference;
import org.telegram.ui.ActionBar.n6;
public final class b extends ea {
    public final Paint f11616a;
    public final Paint f11617b;
    public final Matrix f11618c;
    public WeakReference d;
    public BitmapShader f11619e;
    public final g f11620f;

    public b(g gVar) {
        this.f11620f = gVar;
        Paint paint = new Paint(1);
        this.f11616a = paint;
        this.f11617b = new Paint(1);
        this.f11618c = new Matrix();
        this.d = new WeakReference(null);
        paint.setFilterBitmap(true);
    }

    @Override
    public final void b(Canvas canvas, ui.a aVar) {
        ui.b bVar = (ui.b) g.v(aVar);
        g gVar = this.f11620f;
        int i7 = gVar.f56671c;
        Bitmap bitmap = bVar.d;
        Object obj = this.d.get();
        Paint paint = this.f11616a;
        if (bitmap != obj) {
            this.d = new WeakReference(bitmap);
            if (bitmap != null && !bitmap.isRecycled()) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f11619e = bitmapShader;
                paint.setShader(bitmapShader);
            } else {
                this.f11619e = null;
                paint.setShader(null);
            }
        }
        if (Color.alpha(gVar.f11675x) > 0) {
            gVar.f11666d0.c(canvas, 0);
        }
        if (this.f11619e != null && bitmap != null && !bitmap.isRecycled() && i7 > 0) {
            Matrix matrix = bVar.f58992b;
            Matrix matrix2 = this.f11618c;
            matrix2.set(matrix);
            matrix2.postTranslate(-gVar.d, -gVar.f56672e);
            this.f11619e.setLocalMatrix(matrix2);
            paint.setAlpha(i7);
            gVar.R.c(canvas, paint);
        }
        int r12 = n6.r1(i7 / 255.0f, gVar.f11676y);
        if (Color.alpha(r12) > 0) {
            Paint paint2 = this.f11617b;
            paint2.setColor(r12);
            gVar.R.c(canvas, paint2);
        }
    }
}
