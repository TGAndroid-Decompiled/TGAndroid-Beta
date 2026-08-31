package eg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.z5;
public final class l3 {
    public boolean f5327b;
    public int f5328c;
    public Bitmap d;
    public Bitmap f5329e;
    public Bitmap f5330f;
    public Bitmap f5331g;
    public float f5333j;
    public float f5334k;
    public int f5337n;
    public float[] f5338o;
    public final Paint f5341r;
    public final Paint f5342s;
    public final o3 f5343t;
    public final z5 f5326a = new z5(0.0f, (View) null, 0, 320, pr.h);
    public final RectF h = new RectF();
    public final RectF f5332i = new RectF();
    public final Path f5335l = new Path();
    public final Path f5336m = new Path();
    public final Paint f5339p = new Paint(1);
    public final Paint f5340q = new Paint(1);

    public l3(o3 o3Var) {
        this.f5343t = o3Var;
        new Paint(1);
        this.f5341r = new Paint(1);
        this.f5342s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f5331g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f5330f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f5329e;
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
