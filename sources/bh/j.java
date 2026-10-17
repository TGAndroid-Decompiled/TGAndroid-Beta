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
    public eh.a f4414a;
    public int f4415b;
    public int f4416c;
    public int f4417f;
    public boolean f4420j;
    public float f4421k;
    public float d = 1.0f;
    public final RectF e = new RectF();
    public final Paint f4418g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f4419i = new Paint(1);

    public final void a(eh.a aVar) {
        this.f4414a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f4419i.setStyle(style);
        b();
    }

    public final void b() {
        eh.a aVar = this.f4414a;
        if (aVar == null) {
            return;
        }
        this.f4415b = h6.m1(this.d, aVar.h());
        this.f4416c = h6.m1(this.d, this.f4414a.u());
        int i10 = this.f4415b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f4416c;
        Paint paint2 = this.f4419i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f4417f;
        RectF rectF = this.e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f4420j) {
            rectF.set(getBounds());
            min = this.f4421k;
        }
        float f7 = min;
        Paint paint = this.f4418g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f7, paint);
        }
        if (this.f4415b != 0) {
            canvas2 = canvas;
            dh.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f4416c != 0) {
            dh.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(0.6666667f), false, this.f4419i);
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
