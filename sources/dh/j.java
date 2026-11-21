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
    public gh.a f8471a;
    public int f8472b;
    public int f8473c;
    public int f8475f;
    public fh.h f8478j;
    public boolean f8480l;
    public float f8481m;
    public float d = 1.0f;
    public final RectF f8474e = new RectF();
    public final Paint f8476g = new Paint(1);
    public final l h = new l();
    public final float[] f8477i = new float[8];
    public int f8479k = t6.f30066b;

    public final void a() {
        this.f8479k = t6.f30066b;
        gh.a aVar = this.f8471a;
        if (aVar == null) {
            return;
        }
        this.f8472b = m6.r1(this.d, aVar.t0());
        this.f8473c = m6.r1(this.d, this.f8471a.U0());
        this.f8478j = new fh.h(g0.N(1.0f), this.f8472b, g0.N(0.6666667f), this.f8473c, 0.0f, 0, 0.0f, 0);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f8479k != t6.f30066b) {
            try {
                a();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f8475f;
        RectF rectF = this.f8474e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f8480l) {
            rectF.set(getBounds());
            min = this.f8481m;
        }
        Paint paint = this.f8476g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, min, paint);
        }
        if (this.f8478j != null) {
            Arrays.fill(this.f8477i, min);
            this.h.a(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.f8477i, this.f8478j, 1.0f);
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
