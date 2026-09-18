package ah;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class m extends Drawable {
    public dh.a f481a;
    public int f482b;
    public int f483c;
    public int f484f;
    public boolean f487j;
    public float f488k;
    public float d = 1.0f;
    public final RectF e = new RectF();
    public final Paint f485g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f486i = new Paint(1);

    public final void a(dh.a aVar) {
        this.f481a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f486i.setStyle(style);
        b();
    }

    public final void b() {
        dh.a aVar = this.f481a;
        if (aVar == null) {
            return;
        }
        this.f482b = j6.l1(this.d, aVar.a());
        this.f483c = j6.l1(this.d, this.f481a.c());
        int i10 = this.f482b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f483c;
        Paint paint2 = this.f486i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f484f;
        RectF rectF = this.e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f487j) {
            rectF.set(getBounds());
            min = this.f488k;
        }
        float f7 = min;
        Paint paint = this.f485g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f7, paint);
        }
        if (this.f482b != 0) {
            canvas2 = canvas;
            ch.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f483c != 0) {
            ch.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(0.6666667f), false, this.f486i);
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
