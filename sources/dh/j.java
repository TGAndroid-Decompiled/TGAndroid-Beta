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
    public gh.a f8160a;
    public int f8161b;
    public int f8162c;
    public int f8164f;
    public fh.h f8167j;
    public boolean f8169l;
    public float f8170m;
    public float d = 1.0f;
    public final RectF f8163e = new RectF();
    public final Paint f8165g = new Paint(1);
    public final l h = new l();
    public final float[] f8166i = new float[8];
    public int f8168k = q6.f29535b;

    public final void a() {
        this.f8168k = q6.f29535b;
        gh.a aVar = this.f8160a;
        if (aVar == null) {
            return;
        }
        this.f8161b = j6.r1(this.d, aVar.t0());
        this.f8162c = j6.r1(this.d, this.f8160a.U0());
        this.f8167j = new fh.h(g0.N(1.0f), this.f8161b, g0.N(0.6666667f), this.f8162c, 0.0f, 0, 0.0f, 0);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f8168k != q6.f29535b) {
            try {
                a();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f8164f;
        RectF rectF = this.f8163e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f8169l) {
            rectF.set(getBounds());
            min = this.f8170m;
        }
        Paint paint = this.f8165g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, min, paint);
        }
        if (this.f8167j != null) {
            Arrays.fill(this.f8166i, min);
            this.h.a(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.f8166i, this.f8167j, 1.0f);
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
