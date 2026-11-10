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
    public gh.a f8776a;
    public int f8777b;
    public int f8778c;
    public int f8780f;
    public fh.h f8783j;
    public boolean f8785l;
    public float f8786m;
    public float d = 1.0f;
    public final RectF f8779e = new RectF();
    public final Paint f8781g = new Paint(1);
    public final l h = new l();
    public final float[] f8782i = new float[8];
    public int f8784k = t6.f28531b;

    public final void a() {
        this.f8784k = t6.f28531b;
        gh.a aVar = this.f8776a;
        if (aVar == null) {
            return;
        }
        this.f8777b = m6.r1(this.d, aVar.A());
        this.f8778c = m6.r1(this.d, this.f8776a.O());
        this.f8783j = new fh.h(g0.N(1.0f), this.f8777b, g0.N(0.6666667f), this.f8778c, 0.0f, 0, 0.0f, 0);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f8784k != t6.f28531b) {
            try {
                a();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f8780f;
        RectF rectF = this.f8779e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f8785l) {
            rectF.set(getBounds());
            min = this.f8786m;
        }
        Paint paint = this.f8781g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, min, paint);
        }
        if (this.f8783j != null) {
            Arrays.fill(this.f8782i, min);
            this.h.a(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.f8782i, this.f8783j, 1.0f);
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
