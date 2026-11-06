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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class j extends Drawable {
    public gh.a f8773a;
    public int f8774b;
    public int f8775c;
    public int f8777f;
    public fh.h f8780j;
    public boolean f8782l;
    public float f8783m;
    public float d = 1.0f;
    public final RectF f8776e = new RectF();
    public final Paint f8778g = new Paint(1);
    public final l h = new l();
    public final float[] f8779i = new float[8];
    public int f8781k = r6.f28475b;

    public final void a() {
        this.f8781k = r6.f28475b;
        gh.a aVar = this.f8773a;
        if (aVar == null) {
            return;
        }
        this.f8774b = k6.r1(this.d, aVar.A());
        this.f8775c = k6.r1(this.d, this.f8773a.O());
        this.f8780j = new fh.h(g0.N(1.0f), this.f8774b, g0.N(0.6666667f), this.f8775c, 0.0f, 0, 0.0f, 0);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f8781k != r6.f28475b) {
            try {
                a();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f8777f;
        RectF rectF = this.f8776e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f8782l) {
            rectF.set(getBounds());
            min = this.f8783m;
        }
        Paint paint = this.f8778g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, min, paint);
        }
        if (this.f8780j != null) {
            Arrays.fill(this.f8779i, min);
            this.h.a(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.f8779i, this.f8780j, 1.0f);
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
