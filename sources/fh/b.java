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
import org.telegram.ui.ActionBar.m6;
public final class b extends ea {
    public final Paint f11645a;
    public final Paint f11646b;
    public final Matrix f11647c;
    public WeakReference d;
    public BitmapShader f11648e;
    public final g f11649f;

    public b(g gVar) {
        this.f11649f = gVar;
        Paint paint = new Paint(1);
        this.f11645a = paint;
        this.f11646b = new Paint(1);
        this.f11647c = new Matrix();
        this.d = new WeakReference(null);
        paint.setFilterBitmap(true);
    }

    @Override
    public final void b(Canvas canvas, ui.a aVar) {
        ui.b bVar = (ui.b) g.v(aVar);
        g gVar = this.f11649f;
        int i7 = gVar.f56716c;
        Bitmap bitmap = bVar.d;
        Object obj = this.d.get();
        Paint paint = this.f11645a;
        if (bitmap != obj) {
            this.d = new WeakReference(bitmap);
            if (bitmap != null && !bitmap.isRecycled()) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f11648e = bitmapShader;
                paint.setShader(bitmapShader);
            } else {
                this.f11648e = null;
                paint.setShader(null);
            }
        }
        if (Color.alpha(gVar.f11704x) > 0) {
            gVar.f11695d0.c(canvas, 0);
        }
        if (this.f11648e != null && bitmap != null && !bitmap.isRecycled() && i7 > 0) {
            Matrix matrix = bVar.f59035b;
            Matrix matrix2 = this.f11647c;
            matrix2.set(matrix);
            matrix2.postTranslate(-gVar.d, -gVar.f56717e);
            this.f11648e.setLocalMatrix(matrix2);
            paint.setAlpha(i7);
            gVar.R.c(canvas, paint);
        }
        int r12 = m6.r1(i7 / 255.0f, gVar.f11705y);
        if (Color.alpha(r12) > 0) {
            Paint paint2 = this.f11646b;
            paint2.setColor(r12);
            gVar.R.c(canvas, paint2);
        }
    }
}
