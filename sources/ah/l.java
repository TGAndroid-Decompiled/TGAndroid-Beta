package ah;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
public final class l extends Drawable {
    public dh.a f476a;
    public int f477b;
    public int f478c;
    public int f479f;
    public boolean f482j;
    public float f483k;
    public float d = 1.0f;
    public final RectF e = new RectF();
    public final Paint f480g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f481i = new Paint(1);

    public final void a(dh.a aVar) {
        this.f476a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f481i.setStyle(style);
        b();
    }

    public final void b() {
        dh.a aVar = this.f476a;
        if (aVar == null) {
            return;
        }
        this.f477b = i6.l1(this.d, aVar.a());
        this.f478c = i6.l1(this.d, this.f476a.c());
        int i10 = this.f477b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f478c;
        Paint paint2 = this.f481i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f479f;
        RectF rectF = this.e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f482j) {
            rectF.set(getBounds());
            min = this.f483k;
        }
        float f7 = min;
        Paint paint = this.f480g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f7, paint);
        }
        if (this.f477b != 0) {
            canvas2 = canvas;
            ch.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f478c != 0) {
            ch.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(0.6666667f), false, this.f481i);
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
