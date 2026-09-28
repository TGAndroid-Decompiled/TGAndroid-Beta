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
    public dh.a f478a;
    public int f479b;
    public int f480c;
    public int f481f;
    public boolean f484j;
    public float f485k;
    public float d = 1.0f;
    public final RectF e = new RectF();
    public final Paint f482g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f483i = new Paint(1);

    public final void a(dh.a aVar) {
        this.f478a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.f483i.setStyle(style);
        b();
    }

    public final void b() {
        dh.a aVar = this.f478a;
        if (aVar == null) {
            return;
        }
        this.f479b = h6.l1(this.d, aVar.a());
        this.f480c = h6.l1(this.d, this.f478a.c());
        int i10 = this.f479b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.f480c;
        Paint paint2 = this.f483i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f481f;
        RectF rectF = this.e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.f484j) {
            rectF.set(getBounds());
            min = this.f485k;
        }
        float f7 = min;
        Paint paint = this.f482g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f7, paint);
        }
        if (this.f479b != 0) {
            canvas2 = canvas;
            ch.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.f480c != 0) {
            ch.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(0.6666667f), false, this.f483i);
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
