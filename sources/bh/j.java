package bh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
public final class j extends Drawable {
    public eh.a f4411a;
    public int f4412b;
    public int f4413c;
    public int f4414f;
    public boolean f4417j;
    public float f4418k;
    public float d = 1.0f;
    public final RectF e = new RectF();
    public final Paint f4415g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f4416i = new Paint(1);

    public final void a(eh.a aVar) {
        this.f4411a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f4416i.setStyle(style);
        b();
    }

    public final void b() {
        eh.a aVar = this.f4411a;
        if (aVar == null) {
            return;
        }
        this.f4412b = h6.m1(this.d, aVar.h());
        this.f4413c = h6.m1(this.d, this.f4411a.u());
        int i10 = this.f4412b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f4413c;
        Paint paint2 = this.f4416i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f4414f;
        RectF rectF = this.e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f4417j) {
            rectF.set(getBounds());
            min = this.f4418k;
        }
        float f7 = min;
        Paint paint = this.f4415g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f7, paint);
        }
        if (this.f4412b != 0) {
            canvas2 = canvas;
            dh.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f4413c != 0) {
            dh.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(0.6666667f), false, this.f4416i);
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
