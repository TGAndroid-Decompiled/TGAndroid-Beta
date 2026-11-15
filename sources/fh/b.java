package fh;

import a8.ca;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import java.lang.ref.WeakReference;
import org.telegram.ui.ActionBar.j6;
public final class b extends ca {
    public final Paint f11296a;
    public final Paint f11297b;
    public final Matrix f11298c;
    public WeakReference d;
    public BitmapShader f11299e;
    public final g f11300f;

    public b(g gVar) {
        this.f11300f = gVar;
        Paint paint = new Paint(1);
        this.f11296a = paint;
        this.f11297b = new Paint(1);
        this.f11298c = new Matrix();
        this.d = new WeakReference(null);
        paint.setFilterBitmap(true);
    }

    @Override
    public final void b(Canvas canvas, ui.a aVar) {
        ui.b bVar = (ui.b) g.v(aVar);
        g gVar = this.f11300f;
        int i7 = gVar.f56097c;
        Bitmap bitmap = bVar.d;
        Object obj = this.d.get();
        Paint paint = this.f11296a;
        if (bitmap != obj) {
            this.d = new WeakReference(bitmap);
            if (bitmap != null && !bitmap.isRecycled()) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f11299e = bitmapShader;
                paint.setShader(bitmapShader);
            } else {
                this.f11299e = null;
                paint.setShader(null);
            }
        }
        if (Color.alpha(gVar.f11355x) > 0) {
            gVar.f11346d0.c(canvas, 0);
        }
        if (this.f11299e != null && bitmap != null && !bitmap.isRecycled() && i7 > 0) {
            Matrix matrix = bVar.f58425b;
            Matrix matrix2 = this.f11298c;
            matrix2.set(matrix);
            matrix2.postTranslate(-gVar.d, -gVar.f56098e);
            this.f11299e.setLocalMatrix(matrix2);
            paint.setAlpha(i7);
            gVar.R.c(canvas, paint);
        }
        int r12 = j6.r1(i7 / 255.0f, gVar.f11356y);
        if (Color.alpha(r12) > 0) {
            Paint paint2 = this.f11297b;
            paint2.setColor(r12);
            gVar.R.c(canvas, paint2);
        }
    }
}
