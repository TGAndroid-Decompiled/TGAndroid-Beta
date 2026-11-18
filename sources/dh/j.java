package dh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import fh.l;
import java.util.Arrays;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
public final class j extends Drawable {
    public gh.a f8445a;
    public int f8446b;
    public int f8447c;
    public int f8449f;
    public fh.h f8452j;
    public boolean f8454l;
    public float f8455m;
    public float d = 1.0f;
    public final RectF f8448e = new RectF();
    public final Paint f8450g = new Paint(1);
    public final l h = new l();
    public final float[] f8451i = new float[8];
    public int f8453k = u6.f30085b;

    public final void a() {
        this.f8453k = u6.f30085b;
        gh.a aVar = this.f8445a;
        if (aVar == null) {
            return;
        }
        this.f8446b = n6.r1(this.d, aVar.t0());
        this.f8447c = n6.r1(this.d, this.f8445a.U0());
        this.f8452j = new fh.h(g0.N(1.0f), this.f8446b, g0.N(0.6666667f), this.f8447c, 0.0f, 0, 0.0f, 0);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f8453k != u6.f30085b) {
            try {
                a();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f8449f;
        RectF rectF = this.f8448e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f8454l) {
            rectF.set(getBounds());
            min = this.f8455m;
        }
        Paint paint = this.f8450g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, min, paint);
        }
        if (this.f8452j != null) {
            Arrays.fill(this.f8451i, min);
            this.h.a(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.f8451i, this.f8452j, 1.0f);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7 / 255.0f;
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
