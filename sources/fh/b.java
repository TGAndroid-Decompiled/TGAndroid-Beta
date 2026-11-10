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
import org.telegram.ui.ActionBar.m6;
public final class b extends aa {
    public final Paint f11487a;
    public final Paint f11488b;
    public final Matrix f11489c;
    public WeakReference d;
    public BitmapShader f11490e;
    public final g f11491f;

    public b(g gVar) {
        this.f11491f = gVar;
        Paint paint = new Paint(1);
        this.f11487a = paint;
        this.f11488b = new Paint(1);
        this.f11489c = new Matrix();
        this.d = new WeakReference(null);
        paint.setFilterBitmap(true);
    }

    @Override
    public final void b(Canvas canvas, ri.a aVar) {
        ri.b bVar = (ri.b) g.v(aVar);
        g gVar = this.f11491f;
        int i7 = gVar.f21081c;
        Bitmap bitmap = bVar.d;
        Object obj = this.d.get();
        Paint paint = this.f11487a;
        if (bitmap != obj) {
            this.d = new WeakReference(bitmap);
            if (bitmap != null && !bitmap.isRecycled()) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f11490e = bitmapShader;
                paint.setShader(bitmapShader);
            } else {
                this.f11490e = null;
                paint.setShader(null);
            }
        }
        if (Color.alpha(gVar.f11545x) > 0) {
            gVar.f11536c0.c(canvas, 0);
        }
        if (this.f11490e != null && bitmap != null && !bitmap.isRecycled() && i7 > 0) {
            Matrix matrix = bVar.f54569b;
            Matrix matrix2 = this.f11489c;
            matrix2.set(matrix);
            matrix2.postTranslate(-gVar.d, -gVar.f21082e);
            this.f11490e.setLocalMatrix(matrix2);
            paint.setAlpha(i7);
            gVar.Q.c(canvas, paint);
        }
        int r12 = m6.r1(i7 / 255.0f, gVar.f11546y);
        if (Color.alpha(r12) > 0) {
            Paint paint2 = this.f11488b;
            paint2.setColor(r12);
            gVar.Q.c(canvas, paint2);
        }
    }
}
