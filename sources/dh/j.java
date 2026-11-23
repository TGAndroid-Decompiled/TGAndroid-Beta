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
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
public final class j extends Drawable {
    public gh.a f8474a;
    public int f8475b;
    public int f8476c;
    public int f8478f;
    public fh.h f8481j;
    public boolean f8483l;
    public float f8484m;
    public float d = 1.0f;
    public final RectF f8477e = new RectF();
    public final Paint f8479g = new Paint(1);
    public final l h = new l();
    public final float[] f8480i = new float[8];
    public int f8482k = t6.f30069b;

    public final void a() {
        this.f8482k = t6.f30069b;
        gh.a aVar = this.f8474a;
        if (aVar == null) {
            return;
        }
        this.f8475b = m6.r1(this.d, aVar.t0());
        this.f8476c = m6.r1(this.d, this.f8474a.U0());
        this.f8481j = new fh.h(g0.N(1.0f), this.f8475b, g0.N(0.6666667f), this.f8476c, 0.0f, 0, 0.0f, 0);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f8482k != t6.f30069b) {
            try {
                a();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f8478f;
        RectF rectF = this.f8477e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f8483l) {
            rectF.set(getBounds());
            min = this.f8484m;
        }
        Paint paint = this.f8479g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, min, paint);
        }
        if (this.f8481j != null) {
            Arrays.fill(this.f8480i, min);
            this.h.a(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.f8480i, this.f8481j, 1.0f);
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
