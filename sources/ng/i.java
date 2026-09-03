package ng;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class i extends Drawable {
    public qg.a f15003a;
    public int f15004b;
    public int f15005c;
    public int f15006f;
    public boolean f15009j;
    public float f15010k;
    public float d = 1.0f;
    public final RectF e = new RectF();
    public final Paint f15007g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f15008i = new Paint(1);

    public final void a(qg.a aVar) {
        this.f15003a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f15008i.setStyle(style);
        b();
    }

    public final void b() {
        qg.a aVar = this.f15003a;
        if (aVar == null) {
            return;
        }
        this.f15004b = j6.l1(this.d, aVar.x());
        this.f15005c = j6.l1(this.d, this.f15003a.D());
        int i10 = this.f15004b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f15005c;
        Paint paint2 = this.f15008i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f15006f;
        RectF rectF = this.e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f15009j) {
            rectF.set(getBounds());
            min = this.f15010k;
        }
        float f10 = min;
        Paint paint = this.f15007g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f10, paint);
        }
        if (this.f15004b != 0) {
            canvas2 = canvas;
            pg.b.f(canvas2, rectF, f10, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f15005c != 0) {
            pg.b.f(canvas2, rectF, f10, AndroidUtilities.dpf2(0.6666667f), false, this.f15008i);
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
