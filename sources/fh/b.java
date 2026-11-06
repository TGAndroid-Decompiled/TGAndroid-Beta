package fh;

import a8.aa;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import java.lang.ref.WeakReference;
import org.telegram.ui.ActionBar.k6;
public final class b extends aa {
    public final Paint f11482a;
    public final Paint f11483b;
    public final Matrix f11484c;
    public WeakReference d;
    public BitmapShader f11485e;
    public final g f11486f;

    public b(g gVar) {
        this.f11486f = gVar;
        Paint paint = new Paint(1);
        this.f11482a = paint;
        this.f11483b = new Paint(1);
        this.f11484c = new Matrix();
        this.d = new WeakReference(null);
        paint.setFilterBitmap(true);
    }

    @Override
    public final void b(Canvas canvas, ri.a aVar) {
        ri.b bVar = (ri.b) g.v(aVar);
        g gVar = this.f11486f;
        int i7 = gVar.f21073c;
        Bitmap bitmap = bVar.d;
        Object obj = this.d.get();
        Paint paint = this.f11482a;
        if (bitmap != obj) {
            this.d = new WeakReference(bitmap);
            if (bitmap != null && !bitmap.isRecycled()) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f11485e = bitmapShader;
                paint.setShader(bitmapShader);
            } else {
                this.f11485e = null;
                paint.setShader(null);
            }
        }
        if (Color.alpha(gVar.f11540x) > 0) {
            gVar.f11531c0.c(canvas, 0);
        }
        if (this.f11485e != null && bitmap != null && !bitmap.isRecycled() && i7 > 0) {
            Matrix matrix = bVar.f54441b;
            Matrix matrix2 = this.f11484c;
            matrix2.set(matrix);
            matrix2.postTranslate(-gVar.d, -gVar.f21074e);
            this.f11485e.setLocalMatrix(matrix2);
            paint.setAlpha(i7);
            gVar.Q.c(canvas, paint);
        }
        int r12 = k6.r1(i7 / 255.0f, gVar.f11541y);
        if (Color.alpha(r12) > 0) {
            Paint paint2 = this.f11483b;
            paint2.setColor(r12);
            gVar.Q.c(canvas, paint2);
        }
    }
}
