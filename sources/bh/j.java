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
    public eh.a f2738a;
    public int f2739b;
    public int f2740c;
    public int f2742f;
    public boolean f2745j;
    public float f2746k;
    public float d = 1.0f;
    public final RectF f2741e = new RectF();
    public final Paint f2743g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f2744i = new Paint(1);

    public final void a(eh.a aVar) {
        this.f2738a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f2744i.setStyle(style);
        b();
    }

    public final void b() {
        eh.a aVar = this.f2738a;
        if (aVar == null) {
            return;
        }
        this.f2739b = j6.l1(this.d, aVar.p());
        this.f2740c = j6.l1(this.d, this.f2738a.G());
        int i10 = this.f2739b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f2740c;
        Paint paint2 = this.f2744i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f2742f;
        RectF rectF = this.f2741e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f2745j) {
            rectF.set(getBounds());
            min = this.f2746k;
        }
        float f7 = min;
        Paint paint = this.f2743g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f7, paint);
        }
        if (this.f2739b != 0) {
            canvas2 = canvas;
            dh.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f2740c != 0) {
            dh.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(0.6666667f), false, this.f2744i);
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
