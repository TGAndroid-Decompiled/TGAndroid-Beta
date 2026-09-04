package bh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class j extends Drawable {
    public eh.a f2711a;
    public int f2712b;
    public int f2713c;
    public int f2715f;
    public boolean f2718j;
    public float f2719k;
    public float d = 1.0f;
    public final RectF f2714e = new RectF();
    public final Paint f2716g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f2717i = new Paint(1);

    public final void a(eh.a aVar) {
        this.f2711a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f2717i.setStyle(style);
        b();
    }

    public final void b() {
        eh.a aVar = this.f2711a;
        if (aVar == null) {
            return;
        }
        this.f2712b = j6.l1(this.d, aVar.p());
        this.f2713c = j6.l1(this.d, this.f2711a.G());
        int i10 = this.f2712b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f2713c;
        Paint paint2 = this.f2717i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f2715f;
        RectF rectF = this.f2714e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f2718j) {
            rectF.set(getBounds());
            min = this.f2719k;
        }
        float f7 = min;
        Paint paint = this.f2716g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f7, paint);
        }
        if (this.f2712b != 0) {
            canvas2 = canvas;
            dh.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f2713c != 0) {
            dh.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(0.6666667f), false, this.f2717i);
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
