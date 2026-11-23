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
    public gh.a f8437a;
    public int f8438b;
    public int f8439c;
    public int f8441f;
    public fh.h f8444j;
    public boolean f8446l;
    public float f8447m;
    public float d = 1.0f;
    public final RectF f8440e = new RectF();
    public final Paint f8442g = new Paint(1);
    public final l h = new l();
    public final float[] f8443i = new float[8];
    public int f8445k = t6.f30035b;

    public final void a() {
        this.f8445k = t6.f30035b;
        gh.a aVar = this.f8437a;
        if (aVar == null) {
            return;
        }
        this.f8438b = m6.r1(this.d, aVar.t0());
        this.f8439c = m6.r1(this.d, this.f8437a.U0());
        this.f8444j = new fh.h(g0.N(1.0f), this.f8438b, g0.N(0.6666667f), this.f8439c, 0.0f, 0, 0.0f, 0);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f8445k != t6.f30035b) {
            try {
                a();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f8441f;
        RectF rectF = this.f8440e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f8446l) {
            rectF.set(getBounds());
            min = this.f8447m;
        }
        Paint paint = this.f8442g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, min, paint);
        }
        if (this.f8444j != null) {
            Arrays.fill(this.f8443i, min);
            this.h.a(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.f8443i, this.f8444j, 1.0f);
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
