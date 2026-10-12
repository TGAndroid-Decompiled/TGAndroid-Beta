package ah;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
public final class l extends Drawable {
    public dh.a f606a;
    public int f607b;
    public int f608c;
    public int f610f;
    public boolean f613j;
    public float f614k;
    public float d = 1.0f;
    public final RectF f609e = new RectF();
    public final Paint f611g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f612i = new Paint(1);

    public final void a(dh.a aVar) {
        this.f606a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f612i.setStyle(style);
        b();
    }

    public final void b() {
        dh.a aVar = this.f606a;
        if (aVar == null) {
            return;
        }
        this.f607b = h6.m1(this.d, aVar.b());
        this.f608c = h6.m1(this.d, this.f606a.d());
        int i10 = this.f607b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f608c;
        Paint paint2 = this.f612i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f610f;
        RectF rectF = this.f609e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f613j) {
            rectF.set(getBounds());
            min = this.f614k;
        }
        float f7 = min;
        Paint paint = this.f611g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f7, paint);
        }
        if (this.f607b != 0) {
            canvas2 = canvas;
            ch.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f608c != 0) {
            ch.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(0.6666667f), false, this.f612i);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10 / 255.0f;
        b();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
