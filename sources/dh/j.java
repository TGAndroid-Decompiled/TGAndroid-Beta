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
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
public final class j extends Drawable {
    public gh.a f8771a;
    public int f8772b;
    public int f8773c;
    public int f8775f;
    public fh.h f8778j;
    public boolean f8780l;
    public float f8781m;
    public float d = 1.0f;
    public final RectF f8774e = new RectF();
    public final Paint f8776g = new Paint(1);
    public final l h = new l();
    public final float[] f8777i = new float[8];
    public int f8779k = s6.f28501b;

    public final void a() {
        this.f8779k = s6.f28501b;
        gh.a aVar = this.f8771a;
        if (aVar == null) {
            return;
        }
        this.f8772b = l6.r1(this.d, aVar.A());
        this.f8773c = l6.r1(this.d, this.f8771a.O());
        this.f8778j = new fh.h(g0.N(1.0f), this.f8772b, g0.N(0.6666667f), this.f8773c, 0.0f, 0, 0.0f, 0);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f8779k != s6.f28501b) {
            try {
                a();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f8775f;
        RectF rectF = this.f8774e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f8780l) {
            rectF.set(getBounds());
            min = this.f8781m;
        }
        Paint paint = this.f8776g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, min, paint);
        }
        if (this.f8778j != null) {
            Arrays.fill(this.f8777i, min);
            this.h.a(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.f8777i, this.f8778j, 1.0f);
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
