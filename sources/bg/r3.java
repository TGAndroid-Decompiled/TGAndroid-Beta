package bg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
public final class r3 {
    public boolean f2478b;
    public int f2479c;
    public Bitmap d;
    public Bitmap f2480e;
    public Bitmap f2481f;
    public Bitmap f2482g;
    public float f2484j;
    public float f2485k;
    public int f2488n;
    public float[] f2489o;
    public final Paint f2492r;
    public final Paint f2493s;
    public final u3 f2494t;
    public final d6 f2477a = new d6(0.0f, (View) null, 0, 320, jr.h);
    public final RectF h = new RectF();
    public final RectF f2483i = new RectF();
    public final Path f2486l = new Path();
    public final Path f2487m = new Path();
    public final Paint f2490p = new Paint(1);
    public final Paint f2491q = new Paint(1);

    public r3(u3 u3Var) {
        this.f2494t = u3Var;
        new Paint(1);
        this.f2492r = new Paint(1);
        this.f2493s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f2482g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f2481f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f2480e;
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
