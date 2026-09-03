package dg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.z5;
public final class n3 {
    public boolean f4675b;
    public int f4676c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f4677f;
    public Bitmap f4678g;
    public float f4680j;
    public float f4681k;
    public int f4684n;
    public float[] f4685o;
    public final Paint f4688r;
    public final Paint f4689s;
    public final q3 f4690t;
    public final z5 f4674a = new z5(0.0f, (View) null, 0, 320, mr.h);
    public final RectF h = new RectF();
    public final RectF f4679i = new RectF();
    public final Path f4682l = new Path();
    public final Path f4683m = new Path();
    public final Paint f4686p = new Paint(1);
    public final Paint f4687q = new Paint(1);

    public n3(q3 q3Var) {
        this.f4690t = q3Var;
        new Paint(1);
        this.f4688r = new Paint(1);
        this.f4689s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f4678g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f4677f;
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
