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
    public gh.a f8436a;
    public int f8437b;
    public int f8438c;
    public int f8440f;
    public fh.h f8443j;
    public boolean f8445l;
    public float f8446m;
    public float d = 1.0f;
    public final RectF f8439e = new RectF();
    public final Paint f8441g = new Paint(1);
    public final l h = new l();
    public final float[] f8442i = new float[8];
    public int f8444k = u6.f30164b;

    public final void a() {
        this.f8444k = u6.f30164b;
        gh.a aVar = this.f8436a;
        if (aVar == null) {
            return;
        }
        this.f8437b = n6.r1(this.d, aVar.i0());
        this.f8438c = n6.r1(this.d, this.f8436a.Q0());
        this.f8443j = new fh.h(g0.N(1.0f), this.f8437b, g0.N(0.6666667f), this.f8438c, 0.0f, 0, 0.0f, 0);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f8444k != u6.f30164b) {
            try {
                a();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f8440f;
        RectF rectF = this.f8439e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f8445l) {
            rectF.set(getBounds());
            min = this.f8446m;
        }
        Paint paint = this.f8441g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, min, paint);
        }
        if (this.f8443j != null) {
            Arrays.fill(this.f8442i, min);
            this.h.a(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.f8442i, this.f8443j, 1.0f);
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
