package dg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.z5;
public final class n3 {
    public boolean f4669b;
    public int f4670c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f4671f;
    public Bitmap f4672g;
    public float f4674j;
    public float f4675k;
    public int f4678n;
    public float[] f4679o;
    public final Paint f4682r;
    public final Paint f4683s;
    public final q3 f4684t;
    public final z5 f4668a = new z5(0.0f, (View) null, 0, 320, nr.h);
    public final RectF h = new RectF();
    public final RectF f4673i = new RectF();
    public final Path f4676l = new Path();
    public final Path f4677m = new Path();
    public final Paint f4680p = new Paint(1);
    public final Paint f4681q = new Paint(1);

    public n3(q3 q3Var) {
        this.f4684t = q3Var;
        new Paint(1);
        this.f4682r = new Paint(1);
        this.f4683s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f4672g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f4671f;
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
