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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
public final class j extends Drawable {
    public gh.a f8163a;
    public int f8164b;
    public int f8165c;
    public int f8167f;
    public fh.h f8170j;
    public boolean f8172l;
    public float f8173m;
    public float d = 1.0f;
    public final RectF f8166e = new RectF();
    public final Paint f8168g = new Paint(1);
    public final l h = new l();
    public final float[] f8169i = new float[8];
    public int f8171k = q6.f29535b;

    public final void a() {
        this.f8171k = q6.f29535b;
        gh.a aVar = this.f8163a;
        if (aVar == null) {
            return;
        }
        this.f8164b = j6.r1(this.d, aVar.t0());
        this.f8165c = j6.r1(this.d, this.f8163a.U0());
        this.f8170j = new fh.h(g0.N(1.0f), this.f8164b, g0.N(0.6666667f), this.f8165c, 0.0f, 0, 0.0f, 0);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f8171k != q6.f29535b) {
            try {
                a();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f8167f;
        RectF rectF = this.f8166e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f8172l) {
            rectF.set(getBounds());
            min = this.f8173m;
        }
        Paint paint = this.f8168g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, min, paint);
        }
        if (this.f8170j != null) {
            Arrays.fill(this.f8169i, min);
            this.h.a(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.f8169i, this.f8170j, 1.0f);
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
