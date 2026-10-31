package jg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t5;
public final class s2 {
    public boolean f10214b;
    public int f10215c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f10216f;
    public Bitmap f10217g;
    public float f10219j;
    public float f10220k;
    public int f10223n;
    public float[] f10224o;
    public final Paint f10227r;
    public final Paint f10228s;
    public final v2 f10229t;
    public final t5 f10213a = new t5(0.0f, (View) null, 0, 320, gr.h);
    public final RectF h = new RectF();
    public final RectF f10218i = new RectF();
    public final Path f10221l = new Path();
    public final Path f10222m = new Path();
    public final Paint f10225p = new Paint(1);
    public final Paint f10226q = new Paint(1);

    public s2(v2 v2Var) {
        this.f10229t = v2Var;
        new Paint(1);
        this.f10227r = new Paint(1);
        this.f10228s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f10217g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f10216f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.e;
        if (bitmap != null) {
            return bitmap;
        }
        return this.d;
    }

    public final Bitmap c() {
        Bitmap createBitmap = Bitmap.createBitmap(b().getWidth(), b().getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-16777216);
        Paint paint = new Paint(3);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawBitmap(b(), 0.0f, 0.0f, paint);
        return createBitmap;
    }
}
