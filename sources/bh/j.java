package bh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class j extends Drawable {
    public eh.a f2802a;
    public int f2803b;
    public int f2804c;
    public int f2805f;
    public boolean f2808j;
    public float f2809k;
    public float d = 1.0f;
    public final RectF e = new RectF();
    public final Paint f2806g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f2807i = new Paint(1);

    public final void a(eh.a aVar) {
        this.f2802a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f2807i.setStyle(style);
        b();
    }

    public final void b() {
        eh.a aVar = this.f2802a;
        if (aVar == null) {
            return;
        }
        this.f2803b = g6.m1(this.d, aVar.k());
        this.f2804c = g6.m1(this.d, this.f2802a.w());
        int i10 = this.f2803b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f2804c;
        Paint paint2 = this.f2807i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f2805f;
        RectF rectF = this.e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f2808j) {
            rectF.set(getBounds());
            min = this.f2809k;
        }
        float f7 = min;
        Paint paint = this.f2806g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f7, paint);
        }
        if (this.f2803b != 0) {
            canvas2 = canvas;
            dh.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f2804c != 0) {
            dh.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(0.6666667f), false, this.f2807i);
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
