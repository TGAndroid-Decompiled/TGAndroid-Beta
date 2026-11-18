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
    public gh.a f8442a;
    public int f8443b;
    public int f8444c;
    public int f8446f;
    public fh.h f8449j;
    public boolean f8451l;
    public float f8452m;
    public float d = 1.0f;
    public final RectF f8445e = new RectF();
    public final Paint f8447g = new Paint(1);
    public final l h = new l();
    public final float[] f8448i = new float[8];
    public int f8450k = u6.f30083b;

    public final void a() {
        this.f8450k = u6.f30083b;
        gh.a aVar = this.f8442a;
        if (aVar == null) {
            return;
        }
        this.f8443b = n6.r1(this.d, aVar.t0());
        this.f8444c = n6.r1(this.d, this.f8442a.U0());
        this.f8449j = new fh.h(g0.N(1.0f), this.f8443b, g0.N(0.6666667f), this.f8444c, 0.0f, 0, 0.0f, 0);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f8450k != u6.f30083b) {
            try {
                a();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f8446f;
        RectF rectF = this.f8445e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f8451l) {
            rectF.set(getBounds());
            min = this.f8452m;
        }
        Paint paint = this.f8447g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, min, paint);
        }
        if (this.f8449j != null) {
            Arrays.fill(this.f8448i, min);
            this.h.a(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.f8448i, this.f8449j, 1.0f);
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
