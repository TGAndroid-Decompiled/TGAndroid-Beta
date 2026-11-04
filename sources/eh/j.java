package eh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import gh.l;
import java.util.Arrays;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class j extends Drawable {
    public hh.a f10051a;
    public int f10052b;
    public int f10053c;
    public int f10055f;
    public gh.h f10058j;
    public boolean f10060l;
    public float f10061m;
    public float d = 1.0f;
    public final RectF f10054e = new RectF();
    public final Paint f10056g = new Paint(1);
    public final l h = new l();
    public final float[] f10057i = new float[8];
    public int f10059k = r6.f28515b;

    public final void a() {
        this.f10059k = r6.f28515b;
        hh.a aVar = this.f10051a;
        if (aVar == null) {
            return;
        }
        this.f10052b = k6.r1(this.d, aVar.x());
        this.f10053c = k6.r1(this.d, this.f10051a.M());
        this.f10058j = new gh.h(g0.N(1.0f), this.f10052b, g0.N(0.6666667f), this.f10053c, 0.0f, 0, 0.0f, 0);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f10059k != r6.f28515b) {
            try {
                a();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f10055f;
        RectF rectF = this.f10054e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f10060l) {
            rectF.set(getBounds());
            min = this.f10061m;
        }
        Paint paint = this.f10056g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, min, paint);
        }
        if (this.f10058j != null) {
            Arrays.fill(this.f10057i, min);
            this.h.a(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.f10057i, this.f10058j, 1.0f);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.d = i3 / 255.0f;
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
