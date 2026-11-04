package gh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import b8.mc;
import java.lang.ref.WeakReference;
import org.telegram.ui.ActionBar.k6;
public final class b extends mc {
    public final Paint f12276a;
    public final Paint f12277b;
    public final Matrix f12278c;
    public WeakReference d;
    public BitmapShader f12279e;
    public final g f12280f;

    public b(g gVar) {
        this.f12280f = gVar;
        Paint paint = new Paint(1);
        this.f12276a = paint;
        this.f12277b = new Paint(1);
        this.f12278c = new Matrix();
        this.d = new WeakReference(null);
        paint.setFilterBitmap(true);
    }

    @Override
    public final void b(Canvas canvas, si.a aVar) {
        si.b bVar = (si.b) g.v(aVar);
        g gVar = this.f12280f;
        int i3 = gVar.f53579c;
        Bitmap bitmap = bVar.d;
        Object obj = this.d.get();
        Paint paint = this.f12276a;
        if (bitmap != obj) {
            this.d = new WeakReference(bitmap);
            if (bitmap != null && !bitmap.isRecycled()) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f12279e = bitmapShader;
                paint.setShader(bitmapShader);
            } else {
                this.f12279e = null;
                paint.setShader(null);
            }
        }
        if (Color.alpha(gVar.f12335x) > 0) {
            gVar.f12326d0.c(canvas, 0);
        }
        if (this.f12279e != null && bitmap != null && !bitmap.isRecycled() && i3 > 0) {
            Matrix matrix = bVar.f54741b;
            Matrix matrix2 = this.f12278c;
            matrix2.set(matrix);
            matrix2.postTranslate(-gVar.d, -gVar.f53580e);
            this.f12279e.setLocalMatrix(matrix2);
            paint.setAlpha(i3);
            gVar.R.c(canvas, paint);
        }
        int r12 = k6.r1(i3 / 255.0f, gVar.f12336y);
        if (Color.alpha(r12) > 0) {
            Paint paint2 = this.f12277b;
            paint2.setColor(r12);
            gVar.R.c(canvas, paint2);
        }
    }
}
