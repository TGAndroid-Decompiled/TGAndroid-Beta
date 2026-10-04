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
    public dh.a f521a;
    public int f522b;
    public int f523c;
    public int f525f;
    public boolean f528j;
    public float f529k;
    public float d = 1.0f;
    public final RectF f524e = new RectF();
    public final Paint f526g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f527i = new Paint(1);

    public final void a(dh.a aVar) {
        this.f521a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f527i.setStyle(style);
        b();
    }

    public final void b() {
        dh.a aVar = this.f521a;
        if (aVar == null) {
            return;
        }
        this.f522b = i6.l1(this.d, aVar.a());
        this.f523c = i6.l1(this.d, this.f521a.c());
        int i10 = this.f522b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f523c;
        Paint paint2 = this.f527i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f525f;
        RectF rectF = this.f524e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f528j) {
            rectF.set(getBounds());
            min = this.f529k;
        }
        float f7 = min;
        Paint paint = this.f526g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f7, paint);
        }
        if (this.f522b != 0) {
            canvas2 = canvas;
            ch.d.q(canvas2, rectF, f7, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f523c != 0) {
            ch.d.q(canvas2, rectF, f7, AndroidUtilities.dpf2(0.6666667f), false, this.f527i);
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
