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
    public boolean f10215b;
    public int f10216c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f10217f;
    public Bitmap f10218g;
    public float f10220j;
    public float f10221k;
    public int f10224n;
    public float[] f10225o;
    public final Paint f10228r;
    public final Paint f10229s;
    public final v2 f10230t;
    public final t5 f10214a = new t5(0.0f, (View) null, 0, 320, gr.h);
    public final RectF h = new RectF();
    public final RectF f10219i = new RectF();
    public final Path f10222l = new Path();
    public final Path f10223m = new Path();
    public final Paint f10226p = new Paint(1);
    public final Paint f10227q = new Paint(1);

    public s2(v2 v2Var) {
        this.f10230t = v2Var;
        new Paint(1);
        this.f10228r = new Paint(1);
        this.f10229s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f10218g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f10217f;
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
